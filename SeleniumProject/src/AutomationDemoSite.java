import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationDemoSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	http://executeautomation.com/demosite/Login.html
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Files\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://executeautomation.com/demosite/Login.html");


		//driver.findElement(By.name("UserName")).sendKeys("renju");
		driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("renju");;
		
		driver.findElement(By.name("Password")).sendKeys("pass");
		driver.findElement(By.name("Login")).submit();
		
		Select initial = new Select(driver.findElement(By.id("TitleId")));
		initial.selectByVisibleText("Ms.");
		WebElement elem = driver.findElement(By.id("Initial"));
		elem.sendKeys("S");
		
		System.out.println(driver.findElement(By.id("Initial")).getAttribute("id"));
		System.out.println(driver.findElement(By.id("Initial")).getCssValue("color"));
		Dimension d = elem.getSize();
		System.out.println("Height is "+ d.height);
		System.out.println("Width is "+d.width);
		Point p = elem.getLocation();
		System.out.println("x cordinate is "+p.x);
		System.out.println("y cordinate is "+p.y);
		
	 
		driver.findElement(By.id("FirstName")).sendKeys("Renju");
		driver.findElement(By.id("MiddleName")).sendKeys("Sunil");
		
	     List<WebElement> ele = driver.findElements(By.id("TitleId"));
	     for(WebElement el : ele)
	     {
		   if (el.getText().equals("Mr."))
		   {
			 driver.findElement(By.name("Male")).click();
		   
		   }
		   else
		   {
			 driver.findElement(By.name("Female")).click();
		   }
	     }
	
			
	driver.findElement(By.name("Hindi")).click();
	 driver.findElement(By.name("Save")).submit();
	   driver.findElement(By.partialLinkText("HtmlPop")).click();
	}

}

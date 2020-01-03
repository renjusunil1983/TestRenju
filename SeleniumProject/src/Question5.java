import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Files\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		//driver.navigate().to("http://www.javatpoint.com/"); 
		
		  driver.get("https://www.toolsqa.com/automation-practice-form/");
		  
		  
		  driver.findElement(By.name("firstname")).sendKeys("Renju");
		  driver.findElement(By.id("lastname")).sendKeys("Sunil");
		  
		 // driver.findElement(By.id("submit")).click();
		  
		  
		  List<WebElement> element = driver.findElements(By.name("sex"));
		  
		  for(WebElement ele : element)
		  {
			  if(ele.getAttribute("value").equals("Female"))
			  {
				  ele.click();
			  }
		  }
		  
		  driver.findElement(By.id("exp-4")).click();
		  driver.findElement(By.id("datepicker")).sendKeys("1Dec2018");
		  
		  
		//  driver.findElement(By.linkText(""))

	}

}

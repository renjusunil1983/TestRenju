import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Files\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		//driver.navigate().to("http://www.javatpoint.com/"); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("http://www.newtours.demoaut.com/");
		  driver.findElement(By.name("userName")).sendKeys("tutorial");
		  driver.findElement(By.name("password")).sendKeys("tutorial");
		  
		  WebElement ele = driver.findElement(By.name("login"));
		  Actions action = new Actions(driver);
		  action.moveToElement(ele).build().perform();
		  ele.click();
		  
		  WebElement signoff = driver.findElement(By.linkText("SIGN-OFF"));
		 action.contextClick(signoff).build().perform();
		  
		  
	}

}

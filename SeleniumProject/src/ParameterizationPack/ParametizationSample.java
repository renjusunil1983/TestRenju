package ParameterizationPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ParametizationSample {
	WebDriver driver;
  @Test
  @Parameters({"username","password"})
  
  public void f(String username,String password) {
	  
	  driver.findElement(By.name("userName")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("login")).click();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Files\\selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}

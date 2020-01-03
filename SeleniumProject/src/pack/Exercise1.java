package pack;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Exercise1 {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	
	  driver.findElement(By.name("cusid")).sendKeys("g112");
	  driver.findElement(By.name("submit")).click();
	  Alert alert=driver.switchTo().alert();
	  System.out.println("KKKKKKKKKKK"+alert.getText());
	  Thread.sleep(2000);
	  alert.accept();
	  Thread.sleep(3000);
	  System.out.println("LLLLLLLLLLLL"+alert.getText());
	  Thread.sleep(3000);
	  alert.accept();
	
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Files\\selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/delete_customer.php");
  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

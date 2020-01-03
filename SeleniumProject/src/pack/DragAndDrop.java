package pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class DragAndDrop {
	WebDriver driver;
  @Test
  public void f() {
	  WebDriverWait wait = new WebDriverWait(driver,10) ;
	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.className("demo-frame"))));
	  WebElement dragElement = driver.findElement(By.xpath("//div[@id='draggable']"));
	  WebElement dropElement = driver.findElement(By.xpath("//div[@id='droppable']"));
	 
	  Actions actions = new Actions(driver);
	 actions.dragAndDrop(dragElement, dropElement).build().perform();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Files\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver(); 
		
		driver.get("http://jqueryui.com/droppable");
  }

  @AfterMethod
  public void afterMethod() {
  }

}

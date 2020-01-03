
package pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SampleTest1 {
	WebDriver driver;
  @Test
  public void f() {
	  String t= driver.getTitle();
	  String currenturl = driver.getCurrentUrl(); 
	  System.out.println("The title is :"+t);
	  
	  System.out.println("The current url is : "+currenturl);
	  if( t.equals(currenturl))
	  {
		  System.out.println("Title and Url same");
	  }
	  else
	  {
		  System.out.println("Title and Url different");
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Files\\selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
		 driver.get("http://www.opesmount.in/grocerystore1/");
		 
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

package pack;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	 WebDriver driver;
	 SoftAssert sassert = new SoftAssert();
  @Test(priority=0)
  public void getTitle() {
	  String title = "Title";
	  String t= driver.getTitle();
	
	  //Assert.assertEquals(t, currenturl);
	//  sassert.assertEquals(cotittle, currenturl);
	  sassert.assertEquals(title, t,"++++++++++++");
	  System.out.println("GGGGGGGGGGGGGG");
	 sassert.assertAll();
	 // System.out.println("++++++++++++++++++");
  }
  @Test(priority=1)
  public void checkDriver()
  {
	  String currenturl = driver.getCurrentUrl();  
		String cotittle = "http://www.opesmount.in/grocerystore1/";
		sassert.assertNotEquals(cotittle, currenturl);
		System.out.println("HHHHHHHHHHHHHHHHHHH");
		sassert.assertAll();
 //sassert.assertNotNull(driver); 
  }
  @BeforeTest
  public void startTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Files\\selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
		 driver.get("http://www.opesmount.in/grocerystore1/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

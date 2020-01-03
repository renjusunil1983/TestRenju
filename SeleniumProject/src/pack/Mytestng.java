package pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Mytestng {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("Ths is @ ************Test**********");
  }
  
  @Test 
  void sampleTest() {
	  System.out.println("************This is sampeTest");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is @BeforeMethod");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is @AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This s @Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is @After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is @Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is @afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is @BefreSuite");
  }
  

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This sis afterSuite");
  }

}

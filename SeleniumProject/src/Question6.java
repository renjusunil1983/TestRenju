import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Files\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); 
	
	
	  driver.get("https://www.toolsqa.com/automation-practice-form/");
	  
	  List<WebElement> element = driver.findElements(By.name("tool"));
	  
	  for(WebElement ele : element)
	  {
		  if(ele.isSelected())
		  {
			  System.out.println(ele.getAttribute("value")+" is selected");
		  }
		  else
		  {
			  System.out.println(ele.getAttribute("value")+" is  not selected");
		  }
	  }
	  
List<WebElement> element1 = driver.findElements(By.name("tool"));
	  
	  for(WebElement ele2 : element1)
	  {
		  if(ele2.getAttribute("value").equals("Selenium Webdriver"))
		  {
			  System.out.println("Hhhhhhhh");
			  ele2.click();
		  }
		 
	  }
	  driver.close();
	  
	  
	//  driver.findElement(By.)
}
}
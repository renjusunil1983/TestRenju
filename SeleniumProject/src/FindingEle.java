import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindingEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	http://www.newtours.demoaut.com/
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Files\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		//driver.navigate().to("http://www.javatpoint.com/"); 
		
		  driver.get("http://www.newtours.demoaut.com/");
		  driver.findElement(By.name("userName")).sendKeys("tutorial");
		  driver.findElement(By.name("password")).sendKeys("tutorial");
		  driver.findElement(By.name("login")).click();
		  
		  List<WebElement> radiobuttons = driver.findElements(By.name("tripType"));
		    for(WebElement radiobutton: radiobuttons) { 

		    if(radiobutton.getAttribute("value").equals("oneway"))
		        radiobutton.click();
		    if(radiobuttons.get(0).isSelected())
		    {
		    	System.out.println("Round trip is selected");
		    }
		    else
		    {
		    	System.out.println("One way is selected");
		    }
		    
		    List<WebElement> radiobuttons1 = driver.findElements(By.name("servClass"));
		    for(WebElement radiobutton1: radiobuttons1) { 
		    	System.out.println(radiobutton1.getText());
		    	if(radiobutton1.isSelected())
System.out.println(radiobutton1.getAttribute("value")+" is selected ");
		    	WebElement name1 = driver.findElement(By.name("passCount"));
		    	Select sel = new Select(name1);
		    	sel.selectByIndex(1);
		    	WebElement name2 = driver.findElement(By.name("fromPort"));
		        Select sel1 = new Select(name2);
		    	sel1.selectByVisibleText("Portland");
		    	
		    	WebElement name3 = driver.findElement(By.name("toPort"));
		    	WebDriverWait wait = new WebDriverWait(driver,10);
		    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("toPort")));
		    	Select sel2 = new Select(name3);
		    	sel2.selectByValue("London");
		    	
		    	WebElement w = sel2.getFirstSelectedOption();
		    	String s = w.getText();
		    	System.out.println("the default selected  text is :"+s);
		    	List<WebElement> list = sel1.getOptions();
		     int isize = list.size();
		     for(int i=0;i<isize;i++)
		     {
		    	 String svalue = list.get(i).getText();
		    	 System.out.println(svalue);
		     }
		     
		    
		     }
		   
		}
		    
		    }
	}
	
	



import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;  

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Files\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		//driver.navigate().to("http://www.javatpoint.com/"); 
		
		  driver.get("http://www.opesmount.in/grocerystore1/");
		  //driver.manage().window().maximize(); 
		  String t= driver.getTitle();
		  System.out.println("The title is :"+t);
		  String currenturl = driver.getCurrentUrl(); 
		  System.out.println("The current url is : "+currenturl);
		  if( t.equals(currenturl))
		  {
			  System.out.println("Title and Url same");
		  }
		  else
		  {
			  System.out.println("Title and Url different");
		  }
		  driver.close();
		
		
		
	 

	    	}

}

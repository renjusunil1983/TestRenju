import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Files\\selenium\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
       capabilities.setCapability("marionette",true);  
        WebDriver driver= new FirefoxDriver(capabilities);  
		driver.navigate().to("http://www.javatpoint.com/"); 
		driver.manage().window().maximize();  
		
	}

}

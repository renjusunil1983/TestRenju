import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Files\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa"); 
		
		//List<WebElement> list = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//td[1]"));
		//int size = list.size();
		//for(WebElement ele:list)
		//{
		//	System.out.println(ele.getText());
		//}
	}

}

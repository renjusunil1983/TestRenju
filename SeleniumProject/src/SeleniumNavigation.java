
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;  

public class SeleniumNavigation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Files\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
	
	
		//List<WebElement> l = driver.findElements(By.xpath("//table[@class='dataTable']//th"));
		//System.out.println("The number of rows is : "+l.size());
		List<WebElement> l1 = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr"));
		int rowsize = l1.size();
		System.out.println("The number of rows is : "+l1.size());
		WebElement l2 = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[2]//td[3]"));
		System.out.println("The data : "+l2.getText());
		
		
		for(int i=0;i<rowsize;i++) 
		{
			
			List<WebElement> rowList = l1.get(i).findElements(By.tagName("td"));
			
			 for(int j=0;j<rowList.size();j++)
			 {
				 String data = rowList.get(j).getText();
				 System.out.print(data+"\t"); 
				 
			 }
			 System.out.println("");
		}
		
		
		
		/*
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File("F:\\image\\screenimage6.png"));
		  
		
		driver.findElement(By.linkText("Register")).click();*/
		
		
		
	 

	    	}

}

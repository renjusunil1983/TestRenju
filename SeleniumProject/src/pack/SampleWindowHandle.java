package pack;





import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWindowHandle {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Files\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
		Thread.sleep(200);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> winhandles = driver.getWindowHandles();
		System.out.println( winhandles);
		Iterator<String> iterator = winhandles.iterator();
		
		while(iterator.hasNext())
		{
			String child = iterator.next();
			System.out.println(child);
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				driver.get("https://www.seleniumeasy.com/test/");
				driver.switchTo().window(parent);
				driver.get("http://www.newtours.demoaut.com/");
								
			}
		}
		
		
		
		
	}

}

package ParameterizationPack;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class ExcelReadSample {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void login(String n, String s) {
	  WebElement username =  driver.findElement(By.name("userName"));
	  WebElement password = driver.findElement(By.name("password"));
	  username.sendKeys(n);
	  password.sendKeys(s);
	  driver.findElement(By.name("login")).click();
	  
	  
  }
  @BeforeMethod
  public void f() {
  System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Files\\selenium\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");
  }
  @DataProvider
  public Object[][] dp() throws JXLException, IOException {
	  
	  
	   
	  FileInputStream f = new FileInputStream("F:\\excel\\test.xls");
	  Workbook w = Workbook.getWorkbook(f);
	  Sheet s = w.getSheet("Sheet1");
	  int r =s.getRows();
	  int c= s.getColumns();
	  String input[][]=new String[r][c];
	  for(int i=0;i<r;i++)
	  {
		  for(int j=0;j<c;j++)
		  {
			  Cell cc = s.getCell(j, i);
			  input[i][j]=cc.getContents();
			  
		  }
	  }
	  
	  return input;
   
  }
}

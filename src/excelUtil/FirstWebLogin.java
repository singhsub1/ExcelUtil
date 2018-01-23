package excelUtil;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstWebLogin   {
	
	
	
	
	public static void main(String[] args) throws Exception {
		ExcelUtils.setExcelFile("C:/Users/Sunmeet/eclipse-workspace/ExcelUtil/src/excelUtil/TestData.xlsx", "Sheet1");
		String sUserName = ExcelUtils.getCellData(1, 0);
		 
		String sPassword = ExcelUtils.getCellData(1, 1);
		System.out.println(sUserName);
		System.out.println(sPassword);
	Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
    System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe");
    WebDriver driver = new ChromeDriver();


    driver.manage().window().maximize();
   // goes to google.com web site
   driver.get("https://gmail.com");
   driver.findElement(By.id("identifierId")).click();
   driver.findElement(By.id("identifierId")).clear();
//   driver.findElement(By.id("identifierId")).sendKeys("webdriverlogin");
   driver.findElement(By.id("identifierId")).sendKeys(sUserName);
   driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
   Thread.sleep(3000);
   driver.findElement(By.name("password")).clear();
   driver.findElement(By.name("password")).click();
   driver.findElement(By.name("password")).clear();
//   driver.findElement(By.name("password")).sendKeys("Tekstrom@123");
   driver.findElement(By.name("password")).sendKeys(sPassword);
   driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
   Thread.sleep(3000);
//   String tag = driver.findElement(By.id(":2o")).getTagName(); 
//   if(driver.findElement(By.id(":2o")).isDisplayed())
//   { System.out.println("Test Passed");
//   }
//   else
//   {
//	   System.out.println("Test Failed");
//   }
//   
   
//   System.out.println("text:" + text +  "tag :" + tag);
   Thread.sleep(5000);
   driver.close();
	}
}

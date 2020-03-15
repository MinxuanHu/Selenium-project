import org.junit.Test;
import org.junit.Before;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Test;
import org.junit.Before;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;



public class positivereg {

 ExtentHtmlReporter htmlReporter;
 ExtentReports extent;
  private WebDriver driver;
  

  @Before
  public void setUp() {
  System.setProperty("webdriver.gecko.driver","/Users/huminxuan/Desktop/geckodriver");
  htmlReporter = new ExtentHtmlReporter("extent.html");

 // create ExtentReports and attach reporter(s)
 extent = new ExtentReports();
 extent.attachReporter(htmlReporter);

    driver = new FirefoxDriver();
    }
  @After
  //public void tearDown() {
   // driver.quit();
  //}
  @Test
  public void test() throws InvalidFormatException, IOException {
		  
		  File fis = new File("/Users/huminxuan/Desktop/data.xlsx");
		    FileInputStream f = new FileInputStream(fis);
		    Workbook workbook = WorkbookFactory.create(f);
		    Sheet sheet1 = workbook.getSheetAt(0);
		    
		    
		    Row row1= sheet1.getRow(3);
		    Cell login1 = row1.getCell(0);
		    String r1 = login1.toString();
		    
		    Cell login2 = row1.getCell(1);
		    String r2 = login2.toString();
		    
		    Cell login3 = row1.getCell(2);
		    String r3 = login3.toString();
	  
   ExtentTest test = extent.createTest("111", "Description");//?
    driver.get("https://www.amazon.com/");
    driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/a[2]/span[1]")).click();
    File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screenshot, new File("Positive", "positive.jpg"));
    
    
    driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
    File screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screenshot2, new File("Positive", "positive2.jpg"));
   driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys(r1);
    driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(r2);
   driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(r3);
   driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys(r3);
   
   File screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   FileUtils.copyFile(screenshot3, new File("Positive", "positive3.jpg"));
   
   try {
   driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
  // String screenshotPath = ScreenShots.takeScreenshot(driver,"Test1NegativeDetails");
   File screenshot4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   FileUtils.copyFile(screenshot4, new File("Positive", "positive4.jpg"));
   test.pass("Positive");
   
   }
   
   catch(Exception e) {
    File screenshot4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screenshot4, new File("Positive", "positive4.jpg"));
    test.fail("positive");
    
   }
//   driver.quit();
  }
 public void tearDown() {
  // calling flush writes everything to the log file
  
  extent.flush();
 }

 
}
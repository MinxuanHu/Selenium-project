

import org.testng.annotations.Test;


import org.junit.Before;
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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class AddToCartTest {
	private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  @Before
	  public void setUp() {
	 System.setProperty("webdriver.gecko.driver","/Users/huminxuan/Desktop/geckodriver");
	    driver = new FirefoxDriver();
	    //js = (JavascriptExecutor) driver;
	   // vars = new HashMap<String, Object>();
	  }
	  @Test
	 public static void main( String[] args ) throws IOException
	    {
	     System.setProperty("webdriver.gecko.driver","/Users/huminxuan/Desktop/geckodriver");
	     WebDriver driver= new FirefoxDriver();
	     driver.get("https://www.amazon.com/");
	     
	     WebElement element1= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	     element1.sendKeys("soaps");
	     WebElement element2 = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input"));
	     element2.click();
	     WebElement element3 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[2]/div/span/div/div/div/div/div[2]/div[3]/div/div[1]/h2/a/span"));
	     element3.click();
	     WebElement element4 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
	     element4.click();
	     WebElement element5 = driver.findElement(By.xpath("//*[@id=\"hlb-view-cart-announce\"]"));
	     element5.click();
	     WebElement element6 =  driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[5]/div/div[1]/div[2]/form/div/div[3]/div/span/span/input"));
	     element6.click();
	     WebElement element7 = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[5]/div/div[1]/div[2]/form/div/div/div/span/span/input"));
	     element7.click();
	  
	     driver.close();
	     
	      
	    }
	    @After
	    public void tearDown() {
	      driver.quit();  
	      
	    
	  
	  }
	}
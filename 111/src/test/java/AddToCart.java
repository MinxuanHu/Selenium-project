import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddToCart {
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
   public void test() throws InvalidFormatException, IOException {
    
    File fis = new File("/Users/huminxuan/Desktop/data.xlsx");
      FileInputStream f = new FileInputStream(fis);
      Workbook workbook = WorkbookFactory.create(f);
      Sheet sheet1 = workbook.getSheetAt(0);
      
      
      Row row1= sheet1.getRow(1);
      Cell login1 = row1.getCell(0);
      String r1 = login1.toString();
      
      Cell login2 = row1.getCell(1);
      String r2 = login2.toString();
      
      Cell login3 = row1.getCell(2);
      String r3 = login3.toString();
      
      
      
      
      
     driver.get("https://www.amazon.com/");
   
//        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(screenshot, new File("Positive", "positive.jpg"));
     

     
//     File screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //18519151225@163.com
//     FileUtils.copyFile(screenshot2, new File("Positive", "positive2.jpg"));
     
     
      

     
     driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("soaps");
      driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
      File screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screenshot3, new File("login", "login1.jpg"));
      
      driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[2]/div/span/div/div/div/div/div[2]/div[3]/div/div[1]/h2/a/span")).click();
      File screenshot5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screenshot5, new File("login1", "login1.jpg"));
      
      driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
      File screenshot4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screenshot4, new File("login2", "login2.jpg"));
      
      driver.findElement(By.xpath("//*[@id=\"hlb-view-cart-announce\"]")).click();
      File screenshot6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screenshot6, new File("login3", "login3.jpg"));
      
      driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[5]/div/div[1]/div[2]/form/div/div[3]/div/span/span/input")).click();
      File screenshot7 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screenshot7, new File("login4", "login4.jpg"));
      


      driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(r2);
      driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
      driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(r3);
      driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
      
      
//      driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/a/i")).click();
      
//      driver.findElement(By.xpath("/html/body/div[5]/div[2]/form/div/div[1]/div[2]/span/a")).click();
      
      //driver.findElement(By.xpath(" //*[@id=\"enterAddressFullName\"]")).sendKeys("apt22");
   
//      driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(r2);
//      driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
//      driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(r3);
//      driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
//      driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/a/i")).click();
      //driver.close();
   }
     @After
     public void tearDown() {
       //driver.quit();  
   
     }
   
}
package baitapOOB3.common;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseTest {
  public WebDriver driver;

  public void createDrive (){
      if (Constants.browser.equalsIgnoreCase("Chrome")){
          ChromeOption options  = new ChromeOption();
      }
      if (Constants.headless){
          options.addArguments("--headless");
      }
       driver = new ChromeDriver(options);
       driver.manage().window().maximize();
       driver.get("https://crm.anhtester.com/admin/authentication");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       System.out.println("Browser: " + Constants.browser);
       System.out.println("Report: " + Constants.report);
       System.out.println("Headless: " + Constants.headless);

  }

  public void closeDriver(){
      if (driver != null){
          driver.quit();
      }
  }

}

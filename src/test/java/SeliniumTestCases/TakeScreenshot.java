package SeliniumTestCases;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {
	
	WebDriver driver;
	
  @Test
  public void f() throws IOException, InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("http://www.google.com");
	  
	  File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(srcFile, new File("C:\\Users\\puvva\\eclipse-workspace\\Selenium\\Screenshots\\NewFile.jpg"));
	  
	  Thread.sleep(2000);
	  driver.quit();
  }
}

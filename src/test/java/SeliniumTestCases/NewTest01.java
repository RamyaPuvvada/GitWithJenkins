package SeliniumTestCases;

import static org.testng.Assert.assertTrue;
import java.awt.Color;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest01 {
	@Test
	public void f() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='header-text'][contains(text(), 'Elements')]"));
		Thread.sleep(5000);
		String colorValue = ele.getCssValue("color");
		//Use Color class to convert the value from rgba() to Hex code and store in a variable
        String hexColorValue = Color.fromString(colorValue).asHex();
        
        //Verify if actual and expected color values are equal?
        Assert.assertEquals(hexColorValue, "fromString");

		driver.close();
	}
}
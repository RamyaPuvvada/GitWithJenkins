package SeliniumTestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {
	static WebDriver driver;
	
	@Test
	public void f() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("userName"));
		ele.sendKeys("Ramya Puvvada");
		Thread.sleep(5000);
		System.out.println(ele.getAttribute("value"));
	}
	
}

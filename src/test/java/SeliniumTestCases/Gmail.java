package SeliniumTestCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {

	public static WebDriver driver;
	public static WebDriverWait wait;

	@Test
	public void f() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[contains(text(), 'Gmail')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[contains(text(), 'Sign in')])[2]")).click();
		Thread.sleep(3000);

		String mainWindow = driver.getWindowHandle();
		Set<String> handle = driver.getWindowHandles();
		
		java.util.Iterator<String> itr= handle.iterator();
		 while(itr.hasNext()){
		 String childWindow=itr.next();

		if (!mainWindow.equals(childWindow)) {
			driver.switchTo().window(childWindow);
			System.out.println(driver.switchTo().window(childWindow).getTitle());
			
			driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("puvvadaramya532");
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("RamyaSri@099");
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			Thread.sleep(3000);
		}


			
		 }
	}
}
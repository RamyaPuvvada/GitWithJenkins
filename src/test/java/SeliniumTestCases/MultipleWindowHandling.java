package SeliniumTestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandling {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);

		String mainWindow = driver.getWindowHandle();
		Set<String> handle = driver.getWindowHandles();
		System.out.println(handle.size());
		Iterator<String> itr = handle.iterator();
		
		while (itr.hasNext()) {
			
			String childWindow = itr.next();
			if (!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				
				if(driver.switchTo().window(childWindow).getTitle().equals("HSBC"))
				{
					Thread.sleep(1000);
					driver.manage().window().maximize();
					driver.findElement(By.xpath("//img[@alt=\"HSBC\"]")).click();
					System.out.println("Title is: "+ driver.getTitle());
					driver.close();
				}
				driver.switchTo().window(mainWindow);
				System.out.println("Main Windiw Title is: "+ driver.getTitle());
			}
		}
	}
}
package SeliniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	WebDriver driver;

	@Test
	public void DragnDrop() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement sourceElement = driver.findElement(By.xpath("//*[@id='credit2']"));
		Thread.sleep(2000);
		WebElement targetElement = driver.findElement(By.xpath("//*[@id='bank']/li"));
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceElement, targetElement).build().perform();
	}
}
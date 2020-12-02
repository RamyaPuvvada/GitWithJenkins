package SeliniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AprilthClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//tagname[@attribute='value']
		//input[@class='_2zrpKA _1dBPDZ']

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("puvvadaramya532@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("RamyaSri@099");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
}
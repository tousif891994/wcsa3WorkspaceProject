package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coursera {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coursera.org/login");
		driver.findElement(By.id("email")).sendKeys("Hello@123");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("World");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-e2e='login-form-submit-button']")).click();
		
	}

}
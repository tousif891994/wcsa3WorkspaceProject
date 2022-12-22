package operationalMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/User/Desktop/SELENIUMDATA/HTML/dropdown_multiselect.html");
		Thread.sleep(1000);
		WebElement element=driver.findElement(By.id("menu"));
		Select sel=new Select(element);
		WebElement ops = sel.getWrappedElement();
		String allOps = ops.getText();
		System.out.println(allOps);
	}

}
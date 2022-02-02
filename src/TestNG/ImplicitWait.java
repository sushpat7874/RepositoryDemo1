package TestNG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import excel_.ClassForCalling;

public class ImplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ClassForCalling.JustCalling("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		firstname.sendKeys("Sushant");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		lastname.sendKeys("Patil");
		
	}
}
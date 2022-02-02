package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import excel_.ClassForCalling;

public class ExplicitWaits {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ClassForCalling.JustCalling("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		WebElement firstname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"firstname\"]")));
		firstname.sendKeys("Sushant");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		lastname.sendKeys("Patil");
		
	}
	
}
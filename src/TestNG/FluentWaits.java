package TestNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import excel_.ClassForCalling;

public class FluentWaits {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ClassForCalling.JustCalling("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		
		FluentWait<WebDriver> Fwait = new FluentWait<WebDriver>(driver);
		Fwait.withTimeout(Duration.ofMillis(5000));		//**
		Fwait.pollingEvery(Duration.ofMillis(6000)); 	//**	
		Fwait.ignoring(Exception.class);				//**
		WebElement firstname = Fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"firstname\"]")));
		
		firstname.sendKeys("Sushant");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		lastname.sendKeys("Patil");
		
	}
}
package excel_;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Auto.CallToBrowser;

public class Actions1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = CallToBrowser.CallingB("http://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action = new Actions(driver);
		WebElement rightclick1 = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		action.moveToElement(rightclick1);
		Thread.sleep(2000);
		action.contextClick();
		action.build().perform();
		
		driver.findElement(By.xpath("//li[@class=\"context-menu-item context-menu-icon context-menu-icon-cut\"]")).click();
		
		Thread.sleep(2000);
		Alert Pop = driver.switchTo().alert();
		Pop.accept();
		
		Thread.sleep(2000);
		
		WebElement doubleClick1 = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		action.moveToElement(doubleClick1);
		action.doubleClick();
		action.build().perform();
	
		Thread.sleep(2000);
		Alert Pop2 = driver.switchTo().alert();
		Pop2.accept();
	}

}
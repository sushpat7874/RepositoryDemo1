package excel_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Auto.CallToBrowser;

public class Actions2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = CallToBrowser.CallingB("https://www.globalsqa.com/demo-site/draganddrop/");
		Actions action = new Actions(driver);

		WebElement F1 = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		driver.switchTo().frame(F1);
		Thread.sleep(2000);
		
		WebElement I1 = driver.findElement(By.xpath("(//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"])[1]"));
		WebElement Trash = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		action.dragAndDrop(I1, Trash);
		action.perform();
		
		Thread.sleep(2000);
		WebElement restore = driver.findElement(By.xpath("//a[@title=\"Recycle this image\"]"));
		action.moveToElement(restore);
		action.click();
		action.build().perform();
		
		List<WebElement> AllI= driver.findElements(By.xpath("(//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"])[1]"));
	
**		
//		List<WebElement> AllI = driver.findElements(By.xpath(""));
//		WebElement Trash1 = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
//		for(int i=0; i<AllI.size(); i++) {
//			
//			
//			action.dragAndDrop(AllI.get(i), Trash1);
//			action.perform();
//			
//		}

		
	}
}
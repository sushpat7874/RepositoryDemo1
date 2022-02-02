package excel_;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions3Copy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ClassForCalling.JustCalling("https://demoqa.com/text-box");
		
		WebElement FullName = driver.findElement(By.xpath("//input[@placeholder=\"Full Name\"]"));
		FullName.sendKeys("ABC");
		
		WebElement Email = driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]"));
		Email.sendKeys("name@ex.com");	
		
		WebElement Add = driver.findElement(By.xpath("//textarea[@placeholder=\"Current Address\"]"));
		Add.sendKeys("At post Kisrul");
		
		
		Actions action = new Actions(driver);
//select
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
//		action.keyUp(Keys.CONTROL);
//		action.build().perform();
//		
////Copy
//		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
//Tab	
		action.sendKeys(Keys.TAB);
		action.build().perform();
		
//Paste		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
	}
}
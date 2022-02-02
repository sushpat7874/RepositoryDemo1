package excel_;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ClassForCalling.JustCalling("https://demoqa.com/text-box");
		
//		WebElement Links = driver.findElement(By.xpath("//span[text()='Links']"));
		JavascriptExecutor Exe = (JavascriptExecutor)driver;
//		Exe.executeScript("arguments[0].scrollIntoView(true)", Links);
		
		Exe.executeScript("window.scrollBy(300, 500)");
		
	}
}
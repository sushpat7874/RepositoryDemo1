package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iFrame2multipleF {

	public static void main(String[] args) {
		WebDriver driver = CallToBrowser.CallingB("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[@href=\"#Multiple\"]")).click();
		
		WebElement Mb = driver.findElement(By.xpath("//iframe[@style=\"float: left;height: 300px;width:600px\"]"));
		driver.switchTo().frame(Mb);	
		WebElement Ms = driver.findElement(By.xpath("//iframe[@style=\"float: left;height: 250px;width: 400px\"]"));
		driver.switchTo().frame(Ms);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("123");
		
//		driver.switchTo().parentFrame();		//Switch Selenium focus from current iFrame to parent iFrame.
		
		driver.switchTo().defaultContent();		//Switch Selenium focus from current iFrmae to main web page.
		
		driver.findElement(By.xpath("//a[@href=\"#Single\"]")).click(); 
		
			
	}

}
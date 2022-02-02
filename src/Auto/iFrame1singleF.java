package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iFrame1singleF {

	public static void main(String[] args) {
		WebDriver driver = CallToBrowser.CallingB("https://demoqa.com/frames");

		WebElement i = driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
		driver.switchTo().frame(i);

		WebElement text = driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]"));
		System.out.println(text.getText());
		
		driver.switchTo().parentFrame();
		
		WebElement i2 = driver.findElement(By.xpath("//iframe[@id=\"frame2\"]"));
		driver.switchTo().frame(i2);
		
		WebElement ii2 = driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]"));
		System.out.println(ii2.getText());
	}
}
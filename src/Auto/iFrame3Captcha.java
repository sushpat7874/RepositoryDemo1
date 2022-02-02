package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iFrame3Captcha {

	public static void main(String[] args) {
		WebDriver driver = CallToBrowser.CallingB("https://phptravels.org/login");

		WebElement i = driver.findElement(By.xpath("//iframe[@title=\"reCAPTCHA\"]"));
		driver.switchTo().frame(i);

		WebElement text = driver.findElement(By.xpath("//div[@class=\"recaptcha-checkbox-border\"]"));
		text.click();
	
		//click on audio symbol
		//click on play
		//*****************************************(listen audio & save)
		//repass with sendKeys in i/p field
		
	}
}
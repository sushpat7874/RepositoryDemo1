package excel_;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExcelDataFetching2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException{
		WebDriver driver = ClassForCalling.JustCalling("https://www.facebook.com/");		//browser calling(can call with url or without url)
		
		String EmailID = ExcelClass.getData(0,1);											//ExcelClass = class name where we added the excel details.
																					//			 = fetching values from excel sheet.
		WebElement Email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		Email.sendKeys(EmailID);
		
		String Password = ExcelClass.getData(1, 1);
		WebElement Pass = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		Pass.sendKeys(Password);

	}
}
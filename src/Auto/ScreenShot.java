package Auto;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = CallToBrowser.CallingB("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("F:\\z_Sushant Class Data\\Class\\Automation Testing\\Selenium\\2bD//SS.png");
		
		FileHandler.copy(Source, Destination);
		
	}
}
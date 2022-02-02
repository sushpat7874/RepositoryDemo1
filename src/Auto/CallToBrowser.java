package Auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallToBrowser {
	
	public static void main(String[] args) {

	}

	public static WebDriver CallingB(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	 	driver.get(url);
		driver.manage().window().maximize();
		
		return driver;
		
	}

}
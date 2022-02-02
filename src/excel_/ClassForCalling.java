package excel_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ClassForCalling {
	public static WebDriver JustCalling(String url) throws InterruptedException {
		
		
//Chrome*
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
//		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		return driver;
	
//IE
//		System.setProperty("webdriver.ie.driver","C:\\Selenium\\IE\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
//		driver.get(url);
////	driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		
//		return driver;	
		
	}
}
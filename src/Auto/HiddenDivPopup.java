package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivPopup {

		public static void main(String arg[]) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://www.facebook.com/");
			driver.manage().window().maximize();  
			Thread.sleep(3000);
			
			WebElement CreateNewAcc = driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
			CreateNewAcc.click();
			Thread.sleep(3000);
			
			WebElement Name = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
			Name.sendKeys("A");
			
			WebElement LName = driver.findElement(By.xpath("//body//input[@name=\"lastname\"]"));
			LName.sendKeys("B");
			
			
		}

	}
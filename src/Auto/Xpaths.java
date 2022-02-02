package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.youtube.com/results?search_query=how+to+change+mic+sensitivity+on+windows+10+");
		driver.manage().window().maximize();
		Thread.sleep(2000);
				
//		WebElement email = driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]"));
//		email.sendKeys("sushantpatil@gmail.com");
//		
//		WebElement pass = driver.findElement(By.xpath("//input[contains(@data-testid,\"royal_pass\")]"));
//		pass.sendKeys("1234");
//		
//		WebElement login = driver.findElement(By.xpath("//button"));
//		WebElement login = driver.findElement(By.xpath("//button[text()='Log In']"));
//		login.click();
//		
//	
//		WebElement ID = driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/div/form/div[2]/input"));
//		ID.sendKeys("Sush");
//		
//		WebElement pass = driver.findElement(By.xpath("(//body//input)[2]"));
//		pass.sendKeys("10023");
//		
//		WebElement ID = driver.findElement(By.partialLinkText("Create"));
//		ID.click();
//		
		WebElement V = driver.findElement(By.xpath("//body//div[3]//h3//a[@title=\"How to Change Microphone Volume/Sensitivity on a Windows 10 PC\"]"));
		V.click();
		Thread.sleep(5000);
		
		WebElement P = driver.findElement(By.xpath("//body//span//button/div"));
		P.click();
		
		WebElement Button = driver.findElement(By.xpath("(//body//ytd-toggle-button-renderer//yt-icon-button//button)[1]"));
		Button.click();
		
	}
}

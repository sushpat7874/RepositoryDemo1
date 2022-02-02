package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsImp1 {
	public static void main(String args[]) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

//**WebDriver Methods>>	
	driver.navigate().to("https://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);

	driver.navigate().back();
	Thread.sleep(2000);

	driver.navigate().forward();
	Thread.sleep(2000);

	driver.navigate().refresh();
	Thread.sleep(2000);

	String Title = driver.getTitle();
	System.out.println(Title);

	String URL = driver.getCurrentUrl();
	System.out.println(URL);

	Dimension 	D = new Dimension(500, 500);
	driver.manage().window().setSize(D);

	Point P = new Point(500,500);
	driver.manage().window().setPosition(P);
	
	
//**WebElements Methods>>	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("sushant333@gmail.com");
	
	WebElement pass = driver.findElement(By.name("pass"));
	pass.sendKeys("sush");
	
	WebElement login = driver.findElement(By.tagName("button"));
	login.click();
	
   }
}
package Auto;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsImp2{
	public static void main(String args[]) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	 	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
	
		Dimension D= new Dimension(200, 300);
		driver.manage().window().setSize(D);
		
		Thread.sleep(2000);
		Point P = new Point(1000, 20);
		driver.manage().window().setPosition(P);

	}
}
package Auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsImp3 {

			public static void xyz() throws InterruptedException  {
				System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				
				driver.get("https://kite.zerodha.com/");
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
	}

}

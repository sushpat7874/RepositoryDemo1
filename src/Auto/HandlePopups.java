package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class HandlePopups {						//Child Browser Pop-up

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> itr = handle.iterator();
		
		while(itr.hasNext()==true)
		{
			String handles = itr.next();
			driver.switchTo().window(handles);
			String url = driver.getCurrentUrl();
			String Actualurl = "https://company.naukri.com/popups/techmahindra/9dec2021/index.html";
		
		if(Actualurl.equals(url))
			 {
			WebElement X = driver.findElement(By.xpath("//img[@src=\"http://company.naukri.com/popups/techmahindra/9dec2021/tm-vk-250x250-9dec2021.gif\"]"));
			X.click();
			 }
		else {
			driver.close();
			 }
		}

	}
}
package Auto;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlesAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = CallToBrowser.CallingB("https://www.naukri.com/");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Later']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//body//button)[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"http://www.naukri.com/tieups/tieups.php?othersrcp=38046\"]")).click();
		
		Set<String> ClosePU = driver.getWindowHandles();  		
		Iterator<String> Itr = ClosePU.iterator();
		
		while(Itr.hasNext()==true)
		{
			driver.switchTo().window(Itr.next());
			String ExpectedURL = "https://companies.naukri.com/course5i/jobs/?othersrcp=38046&wExp=N";
			String ActualURL = driver.getCurrentUrl();
			System.out.println(ActualURL);
			
			if(ExpectedURL.equals(ActualURL))
			  { 	
				Thread.sleep(3000);
				WebElement KeySkills = driver.findElement(By.xpath("//input[@placeholder=\"Keyskills, Designation\"]"));
				KeySkills.sendKeys("Automation Tester, ");
				
				driver.findElement(By.xpath("//input[@placeholder=\"Desired Location\"]")).sendKeys("Goa, ");
				
				WebElement Exp = driver.findElement(By.xpath("(//span[@class=\"arw DDarwDwn\"])[1]"));
				Exp.click();
				driver.findElement(By.xpath("(//a[@data-id=\"experience_3\"])[1]")).click();
				
				driver.findElement(By.xpath("(//span[@class=\"arw DDarwDwn\"])[2]")).click();
				driver.findElement(By.xpath("//a[@data-id=\"minSalary_6\"]")).click();
				
				driver.findElement(By.xpath("(//span[@class=\"arw DDarwDwn\"])[3]")).click();
				driver.findElement(By.xpath("//a[@data-id=\"maxSalary_8\"]")).click();
				
				driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
				
			  }
			else {
				driver.close();
				 }
		}
	
	
	}
}
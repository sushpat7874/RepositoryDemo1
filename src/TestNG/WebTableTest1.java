package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.grid.Main;
import org.testng.annotations.Test;
import excel_.ClassForCalling;

public class WebTableTest1 {
	
//	@Test
//	public void ABC() throws InterruptedException {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ClassForCalling.JustCalling("https://demgjo.guru99.com/test/write-xpath-table.html");
		WebElement data = driver.findElement(By.xpath("//table//tr[2]/td[1]"));
		System.out.println(data.getText());
		
	}
}
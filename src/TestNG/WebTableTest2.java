package TestNG;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import excel_.ClassForCalling;

public class WebTableTest2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ClassForCalling.JustCalling("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Total rows= "+row.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		System.out.println("Total columns= "+columns.size());
		
//print all headers>>		
		List<WebElement> Headers = driver.findElements(By.xpath("//table/thead/tr/th"));
		for(int i=0; i<Headers.size(); i++) {
			System.out.println(Headers.get(i).getText());
			}
		
//max value
		double m=0;
		String company = null;
		for(int i=1; i<=row.size(); i++) {
			WebElement Column4value = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]"));
			String Value = Column4value.getText();
			double TableValue = Double.parseDouble(Value);		//string converted into double
			WebElement companyName = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]"));

			if(TableValue>m) {
				m=TableValue;
				company = companyName.getText();
				}
		}
		System.out.println("maxValue= "+m);		//must to write outside of loop
		System.out.println("Company Name = "+company);
		
//min value
		double n=500;
		String company2 = null;
		for(int i=1; i<=row.size(); i++) {
			WebElement Column4value = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]"));
			String Value = Column4value.getText();
			double TableValue = Double.parseDouble(Value);		//string converted into double
			WebElement companyName = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]"));
			
			if(TableValue<n) {
				n=TableValue;
				company2 = companyName.getText();
				}
		}
		System.out.println("minValue= "+n+" & Company Name = "+company2);
//		System.out.println("Company Name = "+company2);
	}
}
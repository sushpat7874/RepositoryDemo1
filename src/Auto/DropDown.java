package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = CallToBrowser.CallingB("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
//**Products
		WebElement Product = driver.findElement(By.xpath("//select[@id=\"first\"]"));
		Select sel = new Select(Product);
		sel.selectByIndex(3);
		Thread.sleep(1500);
		sel.selectByValue("Apple");
		Thread.sleep(1500);
		sel.selectByVisibleText("Google");
		
//**Animals
		WebElement Animals = driver.findElement(By.xpath("//select[@id=\"animals\"]"));
	//	Animals.click();
		Select Animal = new Select(Animals);
		Animal.selectByIndex(3);
		
//**Custom Dropdown
		WebElement CustomDropdown = driver.findElement(By.xpath("//button[@class=\"btn btn-success dropdown-toggle\"]"));
		CustomDropdown.click();
		Select CustomSel = new Select(CustomDropdown);
		CustomSel.selectByIndex(1);
		Thread.sleep(500);	
		CustomSel.selectByValue("td");
		
//**Multi Value Dropdown		
		WebElement MultiSel = driver.findElement(By.xpath(""));
		Select MultiSel01 = new Select(MultiSel);
		MultiSel01.selectByIndex(1);
		MultiSel01.selectByValue("Pizza");
		
	}

}
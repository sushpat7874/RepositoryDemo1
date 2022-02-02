package Auto;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) {
		WebDriver driver = CallToBrowser.CallingB("https://demoqa.com/select-menu");
		
		WebElement dd = driver.findElement(By.xpath("//select[@id=\"oldSelectMenu\"]"));
		Select toSelect = new Select(dd);
//		toSelect.getOptions().size();
		List<WebElement> List1= toSelect.getOptions();
		System.out.println(List1.size());
		
		Boolean b = toSelect.isMultiple();
		System.out.println(b);
		
		toSelect.selectByIndex(10);
		System.out.println(dd.getText());
		
	}
}
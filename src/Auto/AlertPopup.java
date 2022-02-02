package Auto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = CallToBrowser.CallingB("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(2000);
		
//**
		driver.findElement(By.xpath("//button[@name=\"alertbox\"]")).click();
		Alert Box1 = driver.switchTo().alert();
		Thread.sleep(2000);
		Box1.accept();
		Thread.sleep(2000);

//**		
		driver.findElement(By.xpath("//button[@name=\"confirmalertbox\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

//**		
		driver.findElement(By.xpath("//button[@name=\"promptalertbox1234\"]")).click();
		Thread.sleep(2000);
		Alert Box3 = driver.switchTo().alert();
		Box3.sendKeys("Yes");
		Thread.sleep(2000);
		System.out.println(Box3.getText());
		Box3.accept();
				
	}
}
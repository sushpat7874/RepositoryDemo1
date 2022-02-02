package TestNG;

import org.openqa.selenium.WebDriver;
import excel_.ClassForCalling;

public class POMtest2 {
		
	public void LoginWithValidCreds() throws InterruptedException {
		WebDriver driver = ClassForCalling.JustCalling("https://www.facebook.com/");
		POMtest pom = new POMtest(driver);
		pom.enteruserName("sushadsfa@gmail.com");
		pom.enterPassword("001200");
		pom.clickOnLogin();	
	}

	public void LoginWithInvalidUserName() throws InterruptedException {
		WebDriver driver = ClassForCalling.JustCalling("https://www.facebook.com/");
		POMtest pom = new POMtest(driver);
		pom.enteruserName("Sush.com");
		pom.enterPassword("00146200");
		pom.clickOnLogin();
	}

	public void LoginWithInvalidPass() throws InterruptedException {
		WebDriver driver = ClassForCalling.JustCalling("https://www.facebook.com/");
		POMtest pom = new POMtest(driver);
		pom.enteruserName("sushant7874@gmail.com");
		pom.enterPassword("123");
		pom.clickOnLogin();
	}

	public void LoginWithInvalidCreds() throws InterruptedException {
		WebDriver driver = ClassForCalling.JustCalling("https://www.facebook.com/");
		POMtest pom = new POMtest(driver);
		pom.enteruserName("Sush");
		pom.enterPassword("123");
		pom.clickOnLogin();
	}

	public static void main(String[] args) throws InterruptedException {
		POMtest2 test2 = new POMtest2();
		test2.LoginWithValidCreds();
		test2.LoginWithInvalidUserName();
		test2.LoginWithInvalidPass();
		test2.LoginWithInvalidCreds();
	}

}
package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import excel_.ClassForCalling;

public class SoftAssertion {
	WebDriver driver;
	
	@BeforeMethod
	public void ClassForCallig() throws InterruptedException {
		driver = ClassForCalling.JustCalling("https://www.facebook.com/");
	}
	 
	public void LoginChecking() {
		POMtest pom = new POMtest(driver);
		pom.enteruserName("SushantPatil");
		pom.enterPassword("1234");
		
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(pom.isLoginDisplayed(), false);		//fail
//		assertion.assertEquals(pom.isLoginDisplayed(), true);		//pass

		pom.clickOnLogin();											//soft assertion will be pass or fail; system execute the below 2 lines.
		System.out.println("Test is OK");
		assertion.assertAll();										///to get all exceptions in consol in case lines throws exceptions
	}

}
package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import excel_.ClassForCalling;

public class HardAssertion {
	WebDriver driver;
	
	@BeforeMethod
	public void ClassForCalling() throws InterruptedException {
		driver = ClassForCalling.JustCalling("https://www.facebook.com/");	
		}
	
	@AfterMethod
	public void ClickOnLogin() {
		POMtest pom = new POMtest(driver);
		pom.clickOnLogin();
	}
	
	@Test
	public void loginFacebook() {
		POMtest pom = new POMtest(driver);
		pom.enteruserName("Sushant");
		pom.enterPassword("1234");
//		Assert.assertEquals(pom.isLoginDisplayed(), false);		//fail
		Assert.assertEquals(pom.isLoginDisplayed(), true);		//pass

//hard assertion get pass then system execute the below 2 lines otherwise not.		
//		pom.clickOnLogin();
		System.out.println("Test is OKK");
	}
	
	@Test
	public void loginFacebook2() {
		POMtest pom = new POMtest(driver);
		pom.enteruserName("Sushant");
		pom.enterPassword("1234");

		Assert.assertEquals(pom.isLoginDisplayed(), false);		//fail
//		Assert.assertEquals(pom.isLoginDisplayed(), true);		//pass

//hard assertion get pass then system execute the below 2 lines otherwise not.		
//		pom.clickOnLogin();
		System.out.println("Test is OKK2");

	}
}
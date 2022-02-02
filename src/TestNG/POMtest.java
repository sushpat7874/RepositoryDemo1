package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMtest {
	
	@FindBy(xpath = "//input[@id=\"email\"]") private WebElement userName;
	@FindBy(xpath = "//input[@type=\"password\"]") private WebElement password;
	@FindBy(xpath = "//button[@name=\"login\"]") private WebElement login;
//	@FindBy(xpath = "//a[text()='Forgotten password?']") private WebElement forgottenPassword;
//	@FindBy(xpath = "//a[text()='Create New Account']") private WebElement createNewAcc;
//	@FindBy(xpath = "//h2[@class=\"_8eso\"]") private WebElement text;
	
	public POMtest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enteruserName(String name) {
		userName.sendKeys(name);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
//	public void clickOnForgottenPassword() {
//		forgottenPassword.click();
//	}
//	
//	public void clickOnCreateNewAcc() {
//		createNewAcc.click();
//	}
//	
//	public void checkText() {
//		String t = text.getText();
//		if(t.equals("Facebook helps you connect and share with the people in your life.")) {
//			System.out.println("Text check test is passed");
//			}
//		else {
//			System.out.println("Text check test is fail");
//			}
//		}
	
	public boolean isLoginDisplayed() {				//for assertion code
	 return login.isDisplayed();
	}

}
package com.craftsvilla.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.utilities.BasePage;

public class SignInPage extends BasePage
{
	@FindBy(id="emailid")
	private WebElement email;
	
	@FindBy(id="continueBtn")
	private WebElement continueBtn;
	
	@FindBy(id="facebookSignInBtn")
	private WebElement facebookSignInBtn;
	
	@FindBy(id="set=password")
	private WebElement setPassword;
	
	@FindBy(id="userRegister")
	private WebElement registerBtn;
	
	@FindBy(id="userPassword")
	private WebElement password;
	
	@FindBy(id="loginCheck")
	private WebElement loginBtn;
	
	public SignInPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setEmailAddress(String emailAddress)
	{
		verifyElementPresent(email);
		email.sendKeys(emailAddress);
		
	}
	
	public void clickContinue()
	{
		verifyElementPresent(continueBtn);
		continueBtn.click();
	}
	
	public void setNewPassword(String newPass)
	{
		verifyElementPresent(setPassword);
		setPassword.sendKeys(newPass);
		
	}
	
	public void clickRegister()
	{
		verifyElementPresent(registerBtn);;
		registerBtn.click();
	}
	
	public void setPassword(String pwd)
	{
		verifyElementPresent(password);
		password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		verifyElementPresent(loginBtn);
		loginBtn.click();
	}
}

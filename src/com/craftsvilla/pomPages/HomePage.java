package com.craftsvilla.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.utilities.BasePage;

public class HomePage extends BasePage
{
	
	@FindBy(xpath="//span[text()='Sign In']")
	private WebElement SignIn;
	
	@FindBy(xpath="//*[@id=\"cartCount\"]/span")
	private WebElement cart;
	
	@FindBy(xpath="//*[@id=\"mega-menu\"]/div/ul/li[2]/a")
	private WebElement sarees;
	
	@FindBy(xpath="//*[@id=\"mega-menu\"]/div/ul/li[6]/a")
	private WebElement lehengas;
	
	@FindBy(xpath="//a[@href='#' and @data-toggle='dropdown']")
	private WebElement userAccount;
	
	@FindBy(xpath="//a[contains[@href,'account/logout']")
	private WebElement logoutBtn;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnSignIn()
	{
		verifyElementPresent(SignIn);
		SignIn.click();
		
	}
	
	public void clickOnCart()
	{
		verifyElementPresent(cart);
		cart.click();
	}
	
	
	public void goToSarees()
	{
		verifyElementPresent(sarees);
		mouseHover(driver, sarees);
	}

	public void goToLehengas()
	{
		verifyElementPresent(lehengas);
		mouseHover(driver, lehengas);
	}
	
	public void goToAccount()
	{
		verifyElementPresent(userAccount);
		mouseHover(driver, userAccount);
	}
	
	public void clickLogout()
	{
		verifyElementPresent(logoutBtn);
		logoutBtn.click();
	}
	
//	public void waitForTitle()
//	{
//		verifyTitle("Ethnic Wear - Buy Ethnic Wear in Latest Designs Online at Craftsvilla");
//	}
}
 
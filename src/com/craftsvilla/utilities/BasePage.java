package com.craftsvilla.utilities;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {

	public WebDriver driver=null;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyTitle(String exp_title)
	{
		WebDriverWait w=new WebDriverWait(driver, 10);
		try
		{
			w.until(ExpectedConditions.titleContains(exp_title));
			String act_title=driver.getTitle();
			Assert.assertEquals(act_title, exp_title);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Reporter.log("Fail, title mismatch");
			
		}
	}
		
		public void verifyElementPresent(WebElement ele)
		{

			WebDriverWait w=new WebDriverWait(driver, 10);
			try
			{
				w.until(ExpectedConditions.visibilityOf(ele));
				Reporter.log(ele+"found");
		}
			catch(Exception e)
			{
				e.printStackTrace();
				Reporter.log(ele+"not found");
			}
	}
		
		public void mouseHover(WebDriver driver,WebElement ele)
		{
			try
			{
				Actions action=new Actions(driver);
				action.moveToElement(ele).perform();	
				Reporter.log("mouse hovered on"+ele);
				}
			catch(Exception e)
			{
				e.printStackTrace();
				Reporter.log("unable to mouse hover on:"+ele);
			}
		}
		
		
		public void handleDropdown(WebElement ele,String option)
		{
			
		}
		
		
		public void alerts()
		{
			
		}
		
}

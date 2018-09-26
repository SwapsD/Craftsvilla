package com.craftsvilla.testScripts;

import org.testng.annotations.Test;

import com.craftsvilla.pomPages.HomePage;
import com.craftsvilla.pomPages.SignInPage;
import com.craftsvilla.utilities.BaseTest;
import com.craftsvilla.utilities.ReadExcel;

public class SignUpScripts extends BaseTest
{
	HomePage homepage=null;
	SignInPage signinpage=null;

	@Test
	public void SignUp()
	{
		homepage=new HomePage(driver);
		signinpage=new SignInPage(driver);
		
		String[][] credentials=ReadExcel.getData(filePath, "userSignUp");
		
		for(int i=1;i<credentials.length;i++)
		{
			String email=credentials[i][0];
			String password=credentials[i][1];
			
			homepage.clickOnSignIn();
			signinpage.setEmailAddress(email);
			signinpage.clickContinue();
			signinpage.setNewPassword(password);
			signinpage.clickRegister();
			homepage.goToAccount();
			homepage.clickLogout();
			homepage.verifyTitle("Ethnic Wear - Buy Ethnic Wear in Latest Designs Online at Craftsvilla");
			
		}
	}
}

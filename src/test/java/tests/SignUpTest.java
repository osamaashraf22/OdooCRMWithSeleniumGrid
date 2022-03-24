package tests;

import org.testng.annotations.Test;

import pages.DataBasesPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;

public class SignUpTest extends TestBase
{
	HomePage homeObject;
	LoginPage loginObject;
	SignUpPage signUpObject; 
	DataBasesPage dataBasesObject;
	
	@Test(priority = 1)
	public void userCanSignUpSuccesffuly()
	{
		homeObject=new HomePage(driver);
		loginObject=new LoginPage(driver);
		homeObject.openSignInPage();
		loginObject.userDontHaveAccount();
		
		signUpObject=new SignUpPage(driver);
		signUpObject.regsiterFunction("4l0bi6zsd@disbox.org", "osama", "123456789");
	}
	
	@Test(priority = 2)
	public void userCanOpenHomePageFromLogo()
	{
		dataBasesObject=new DataBasesPage(driver);
		dataBasesObject.userOpenHomePageFromLogoInDataBase();
	}
	
	@Test(priority = 3)
	public void userCanLogOut() 
	{
		homeObject=new HomePage(driver);
		homeObject.logOutAccout();
	}

}

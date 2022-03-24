package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DataBasesPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase
{
	LoginPage loginObject;
	HomePage homeObject;
	DataBasesPage dataBasesObject;
	
	@Test (priority = 1)
	public void userCanLoginSuccessfully()
	{
		homeObject=new HomePage(driver);
		homeObject.openSignInPage();
	
		loginObject=new LoginPage(driver);
		loginObject.signInFunction("4l0bi6zsd@disbox.org", "123456789");
		
		dataBasesObject=new DataBasesPage(driver);
		
		Assert.assertTrue(dataBasesObject.headLineMessage.getText().contains("Your Databases"));
		
	}
	
	@Test(priority = 2)
	public void userCanLogOut() 
	{
		homeObject=new HomePage(driver);
		homeObject.logOutAccout();
	}

}

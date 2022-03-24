package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DataBasesPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginParallelTest extends TestBaseParallel
{
	LoginPage loginObject;
	HomePage homeObject;
	DataBasesPage dataBasesObject;
	
	@Test (priority = 1)
	public void userCanLoginSuccessfully() throws InterruptedException
	{
		homeObject=new HomePage(getDriver());
		homeObject.openSignInPage();
	
		loginObject=new LoginPage(getDriver());
		loginObject.signInFunction("4l0bi6zsd@disbox.org", "123456789");
		
		dataBasesObject=new DataBasesPage(getDriver());
		Assert.assertTrue(dataBasesObject.headLineMessage.getText().contains("Your Databases"));
		
	}
	
	@Test(priority = 2)
	public void userCanLogOut() 
	{
		homeObject=new HomePage(getDriver());
		homeObject.logOutAccout();
	}

}

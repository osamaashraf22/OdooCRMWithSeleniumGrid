package tests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.DataBasesPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;

public class SignUpParallelTest extends TestBaseParallel
{
	HomePage homeObject;
	LoginPage loginObject;
	SignUpPage signUpObject; 
	DataBasesPage dataBasesObject;
	
	Faker fakeData=new Faker();
	String email=fakeData.internet().emailAddress();
	String name=fakeData.name().fullName();
	String password=fakeData.number().digits(8).toString();
	
	
	@Test(priority = 1)
	public void userCanSignUpSuccesffuly()
	{
		homeObject=new HomePage(getDriver());
		loginObject=new LoginPage(getDriver());
		homeObject.openSignInPage();
		loginObject.userDontHaveAccount();
		
		signUpObject=new SignUpPage(getDriver());
		signUpObject.regsiterFunction(email, name, password);
	}
	
	@Test(priority = 2)
	public void userCanOpenHomePageFromLogo()
	{
		dataBasesObject=new DataBasesPage(getDriver());
		dataBasesObject.userOpenHomePageFromLogoInDataBase();
	}
	
	@Test(priority = 3)
	public void userCanLogOut() 
	{
		homeObject=new HomePage(getDriver());
		homeObject.logOutAccout();
	}

}

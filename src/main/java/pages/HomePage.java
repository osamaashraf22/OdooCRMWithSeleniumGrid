package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase
{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css = "a.nav-link")
	WebElement signInLink;
	
	@FindBy(css = "a.dropdown-toggle.nav-link")
	WebElement dropDwonBtn;
	
	@FindBy(id = "o_logout")
	WebElement logoutBtn;
	
	@FindBy(linkText = "Tutorials")
	WebElement TutorialsLink;
	
	public void openSignInPage() 
	{
		ClickButton(signInLink);
	}
	
	public void logOutAccout()
	{
		ClickButton(dropDwonBtn);
		ClickButton(logoutBtn);
	}
	
	public void userOpenTutorialsLink() 
	{
		ClickButton(TutorialsLink);
	}
	
	

}

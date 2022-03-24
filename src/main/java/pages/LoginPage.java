package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText = "Don't have an account?")
	WebElement DontHaveAccountLink;
	
	@FindBy(id = "login")
	WebElement emailText;
	
	@FindBy(id = "password")
	WebElement passwordText;
	
	@FindBy(css = "button.btn.btn-primary.float-left")
	WebElement signInBtn;
	
	public void userDontHaveAccount()
	{
		ClickButton(DontHaveAccountLink);
	}
	
	public void signInFunction(String Email , String password) 
	{
		setTextElementText(emailText, Email);
		setTextElementText(passwordText, password);
		ClickButton(signInBtn);
	}

}

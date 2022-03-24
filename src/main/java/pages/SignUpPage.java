package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends PageBase{

	public SignUpPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "login")
	 WebElement emailText;
	
	@FindBy(id = "name")
	WebElement nameText;
	
	@FindBy(id="password")
	WebElement passwordText;
	
	@FindBy(css = "button.btn.btn-primary.float-left")
	WebElement signUpBtn;
	
	public void regsiterFunction(String email , String name , String password)
	{
		setTextElementText(emailText, email);
		setTextElementText(nameText, name);
		setTextElementText(passwordText, password);
		ClickButton(signUpBtn);
		
	}

}

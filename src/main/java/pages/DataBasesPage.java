package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataBasesPage extends PageBase{

	public DataBasesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css="a.float-left.o_logo")
	WebElement logobtn;
	
	@FindBy(css = "h3.mt-2")
	public WebElement headLineMessage;
	
	public void userOpenHomePageFromLogoInDataBase() 
	{
		ClickButton(logobtn);
	}
	
	

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessCasesPage  extends PageBase{

	public BusinessCasesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css = "h1.text-white")
	public WebElement messageHeadLine;
	
	
	@FindBy(css = "span.cta-title.text_small_caps")
	WebElement joinCourseBtn;
	
	@FindBy(css="h6.d-flex.flex-grow-1 my-0")
	public WebElement messageUserEnrolled;
	
	public void UserjoinCourse() 
	{
		ClickButton(joinCourseBtn);
	}

}

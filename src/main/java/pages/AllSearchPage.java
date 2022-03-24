package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllSearchPage extends PageBase{

	public AllSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css = "a.card-title.h5.mb-2.o_wslides_desc_truncate_2")
	WebElement cardItem;
	
	public void userOpenItem() 
	{
		ClickButton(cardItem);
	}

}

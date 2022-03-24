package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TutorialsPageSearchPage extends PageBase{

	public TutorialsPageSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css = "input.search-query.form-control.oe_search_box.None")
	WebElement searchTxt;
	
	@FindBy(css = "i.fa.fa-search")
	WebElement searchBtn;
	
	@FindBy(css = "input.search-query.form-control.oe_search_box.None")
	List<WebElement> productList;
	
	public void userClicKSearch(String searchText) 
	{
		setTextElementText(searchTxt, searchText);
		ClickButton(searchBtn);
	}
	
	public void userSearchWithAutoSuggest(String searchText) 
	{
		setTextElementText(searchTxt, searchText);
		productList.get(0).click();
	}

}

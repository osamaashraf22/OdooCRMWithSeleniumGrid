package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
	public WebDriver driver;
	JavascriptExecutor js;
	//Constructor
	public  PageBase(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickButton(WebElement button)
	{
		button.click();
	}
	
	public void setTextElementText(WebElement textElement,String value)
	{
		textElement.sendKeys(value);
	}
	
	public void scrollToBottom() 
	{
		 js.executeScript("scrollBy(0,4300)");
		
	}

}

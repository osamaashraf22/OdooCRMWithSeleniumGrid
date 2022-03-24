package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BusinessCasesPage;
import pages.HomePage;
import pages.TutorialsPageSearchPage;

public class TutorialsPageWithAutoSuggestTest extends TestBase
{
	HomePage homeObject;
	TutorialsPageSearchPage tutObject;
	BusinessCasesPage businessObject;
	
	
	@Test
	public void userCanSearchWithAutoSuggest()
	{
		homeObject=new HomePage(driver);
		homeObject.userOpenTutorialsLink();
		
		tutObject=new TutorialsPageSearchPage(driver);
		tutObject.userSearchWithAutoSuggest("business cases");
		
		businessObject=new BusinessCasesPage(driver);
		
		//Assert.assertTrue(businessObject.messageHeadLine.getText().contains("Business Cases"));
	}

}

 
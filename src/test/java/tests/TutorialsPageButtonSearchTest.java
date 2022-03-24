package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AllSearchPage;
import pages.BusinessCasesPage;
import pages.HomePage;
import pages.TutorialsPageSearchPage;

public class TutorialsPageButtonSearchTest extends TestBase
{
	HomePage homeObject;
	TutorialsPageSearchPage tutObject;
	AllSearchPage allSearchObject;
	BusinessCasesPage businessObject;
	
	
	@Test
	public void userCanSearchWithClickButton()
	{
		homeObject=new HomePage(driver);
		homeObject.userOpenTutorialsLink();
		
		tutObject=new TutorialsPageSearchPage(driver);
		tutObject.userClicKSearch("business cases");
		
		allSearchObject=new AllSearchPage(driver);
		allSearchObject.userOpenItem();
		
		businessObject=new BusinessCasesPage(driver);
		
		Assert.assertTrue(businessObject.messageHeadLine.getText().contains("Business Cases"));
	}
	
	@Test (dependsOnMethods = {"userCanSearchWithClickButton"})
	public void userCanJoinCourseSuccesfully()
	{
		businessObject=new BusinessCasesPage(driver);
		businessObject.UserjoinCourse();
		Assert.assertTrue(businessObject.messageUserEnrolled.getText().contains("enrolled"));
		
	}

}

 
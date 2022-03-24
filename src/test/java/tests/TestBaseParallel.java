package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.Helper;

public class TestBaseParallel 
{
	Helper helper=new Helper();
	public static String BaseURL="https://www.odoo.com/";
	
	protected ThreadLocal<RemoteWebDriver> driver =null;
	
	
	@BeforeClass
	@Parameters(value = {"browser"})
	public void setup( String browser) throws MalformedURLException 
	{
		driver=new ThreadLocal<>();
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName(browser);
		//caps.setCapability("BrowserName", browser);
		driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().manage().window().maximize();
		getDriver().navigate().to(BaseURL);
	}
	
	public WebDriver getDriver() 
	{
		return driver.get();
		
	}
	
	@AfterClass
	public void stopDriver()
	{
		getDriver().quit();
		driver.remove();
	}
	
	//take screenshot when test case pass and add it in screenshot folder 
	@AfterMethod
	public void screenShotOnFailure(ITestResult result)
	{
		if (result.getStatus() ==ITestResult.FAILURE)
		{
			helper.captureScreenShot(getDriver(), result.getName());
		
	}}

}

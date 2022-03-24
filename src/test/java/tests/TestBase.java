package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {
	
	public static WebDriver driver;
	
	@BeforeSuite
	@Parameters({"browser"})
	public void startDriver(@Optional("chrome") String browserName) {
		
		if (browserName.equalsIgnoreCase("chrome"))
		{
			String chromePath=System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromePath);
			driver=new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("fireFox"))
		{
			String fireFoxPath=System.getProperty("user.dir") + "\\drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", fireFoxPath);
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.odoo.com/");
		
	}
	
	@AfterSuite
	public void stopDriver() {
		driver.quit();
		
	}

}

package utilities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper 
{
	//method to take screen shot when test cases pass
	
	public static void captureScreenShot(WebDriver driver , String screenshotName)
	{		
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			 
			File source=ts.getScreenshotAs(OutputType.FILE);
			 
			FileHandler.copy(source, new File("./ScreenShots/"+screenshotName+".png"));
			 
			System.out.println("Screenshot taken");
		} catch (IOException e) {
			System.out.println("Exception while taking screenshot "+e.getMessage());
		}
		
		
		
	}

}

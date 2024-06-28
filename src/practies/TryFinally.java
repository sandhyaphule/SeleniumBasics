package practies;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import basic.BaseTest;
import utility.ScreenShot;

public class TryFinally 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver;
		
		BaseTest.launchBrowser("https://facebook.com/signup");
		
		//ScreenShot.getScreenshotWithFilename(driver, "abc");
		
	}
	

}

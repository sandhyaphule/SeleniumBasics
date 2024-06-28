package practies;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import basic.BaseTest;

public class ScreenShotes 
{
	
	////	WAP to capture the screenshot using a method that ask the filename from user.
	
     public static void main(String[] args) throws IOException 
	{
		WebDriver driver= BaseTest.launchBrowser("https://www.facebook.com/login/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String path ="C:\\Users\\Administrator\\eclipse-workspace\\SeleniumBasics\\ScreenShots\\facebookScreenshot.jpg";
		
		File file = new File(path);//file class cha object banvacha lagnar

		FileHandler.copy(source, file);

	
		
	}

}

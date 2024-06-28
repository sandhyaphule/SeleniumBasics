package utility;

import java.io.File;



import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import basic.BaseTest;



public class screenshotusingmethodaskfilenamefromuser 
{
	public static void getScreenshotWithFilename(WebDriver driver, String filename) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
//		String path = "F:\\Desktop\\VimanNagar\\May 21\\Jan7SeleniumBasics\\Screenshots\\google.jpg";

		String path = System.getProperty("user.dir")+"\\Screenshots\\"+filename+".jpg";

		File file = new File(path);

		FileHandler.copy(source, file);
		
		
		//C:\Users\Administrator\Desktop

	}
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = BaseTest.launchBrowser("https://www.makemytrip.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
//		String path = "F:\\Desktop\\VimanNagar\\May 21\\Jan7SeleniumBasics\\Screenshots\\google.jpg";
		
		String path = System.getProperty("user.dir")+"\\Screenshots\\makemytrip.jpg";
		
		File file = new File(path);
		
		FileHandler.copy(source, file);
	
	
	}
}

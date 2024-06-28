package utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import basic.BaseTest;

public class ScreenShot 
{
	public static void main(String[] args) throws IOException 
	{
		
		WebDriver driver = BaseTest.launchBrowser("https://www.google.com/");
		
		

		TakesScreenshot ts = (TakesScreenshot) driver;//driver kade tackscreenshot chi method nahi manun driver type cast kele ek class madhun
		
		File source = ts.getScreenshotAs(OutputType.FILE);//argument pass kela
		
		//optional way
		//String path ="C:\\Users\\Administrator\\eclipse-workspace\\SeleniumBasics\\ScreenShots\\googleScreenshot.jpg";
		
		//proper way
        String path=System.getProperty("user dir")+"\\ScreenShots\\googleScreenshot.jpg";//project cha path milnar
        		
		File file = new File(path);//file class cha object banvacha lagnar

		FileHandler.copy(source, file);//destination save karto

	
//	WAP to capture the screenshot using a method that ask the filename from user





	


		}
	

}

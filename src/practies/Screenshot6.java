package practies;

import java.io.File;


import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import basic.BaseTest;

public class Screenshot6 
{
	public static void main(String[] args) throws IOException 
	{
	//WebDriver Driver=BaseTest.launchBrowser("https://www.naukri.com/");short cut 
		
	WebDriver Driver=new ChromeDriver();
	
	Driver.get("https://www.naukri.com");

	TakesScreenshot ts = (TakesScreenshot) Driver;//driver kade tackscreenshot chi method nahi manun driver type cast kele ek class madhun
	//takescreenshot is an interface 
	File source= ts.getScreenshotAs(OutputType.FILE);
	//get screen shot is method 
	String path=System.getProperty("user.dir")+"\\ScreenShots\\naukri.jpg";//
	
	//String path = "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumBasics\\ScreenShots\\naukri.jpg";
	
	File file= new File(path);
	
	FileHandler.copy(source, file);//destination save karto
		
		
	}

}

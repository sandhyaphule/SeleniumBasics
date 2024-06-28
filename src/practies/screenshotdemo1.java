package practies;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import basic.BaseTest;

public class screenshotdemo1 
{
public static void main(String[] args) throws IOException 
{
	WebDriver driver = BaseTest.launchBrowser("https://www.meesho.com/");
	
	//typecasting karyche atta manje object
	
	TakesScreenshot ts = (TakesScreenshot) driver;//driver kade tackscreenshot chi method nahi manun driver type cast kele ek class madhun
	
	File source = ts.getScreenshotAs(OutputType.FILE);//argument pass kela
	
    String path=System.getProperty("user.dir" )+"\\ScreenShots\\meesho.jpg";//project cha path milnar
    
	File file = new File(path);//file class cha object banvacha lagnar

	FileHandler.copy(source, file);//destination save karto

//user.dir ni project cha path milato
	//screenshotfloder cha path ag
}
}

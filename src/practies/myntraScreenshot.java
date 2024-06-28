package practies;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class myntraScreenshot 
{
	public static void main(String[] args) throws IOException 
	{
		ChromeDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("https://www.myntra.com/login");
		
		chromeDriver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot) chromeDriver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);//argument pass kela
		
	    String path=System.getProperty("user dir")+"\\ScreenShots\\myntraScreenshot.jpg";//project cha path milnar
		
		File file = new File(path);//file class cha object banvacha lagnar

		FileHandler.copy(source, file);//destination save karto

		
	}

}

package practies;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A_CaptureScreenshot 
{
	public static void main(String[] args) throws IOException 
	{
		 WebDriver driver = new ChromeDriver(); 
		 
		 driver.get("https://www.amazon.in/");
		 
		TakesScreenshot ts = (TakesScreenshot) driver;//driver kade tackscreenshot chi method nahi manun driver type cast kele ek class madhun

			File source= ts.getScreenshotAs(OutputType.FILE);

			String path=System.getProperty("user.dir")+"\\ScreenShots\\amazon.jpg";//
			
			File file= new File(path);

			FileHandler.copy(source, file);//destination save karto





		
	}

}

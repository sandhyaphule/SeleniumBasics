package inter;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotA 
{
	public static void main(String[] args) throws IOException 
	{
		
		WebDriver driver = new ChromeDriver();//chorme open kele
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions cop = new ChromeOptions();
		
		cop.setBinary("C:\\Users\\Administrator\\Desktop\\chrome-win64\\chrome-win64\\chrome.exe");
		
        driver = new ChromeDriver(cop);
		
				driver.get("https://amazon.in/");
				
		        TakesScreenshot ts = (TakesScreenshot) driver;//
		        
		        File source = ts.getScreenshotAs(OutputType.FILE);//
		        
		        String path=System.getProperty("user dir")+"\\SeleniumBasics\\ScreenShots.jpg";//project cha path milnar
				
				File file = new File(path);//file class cha object banvacha lagnar

				FileHandler.copy(source, file);//destination save karto

				
	}

}

package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest 
{
	public static WebDriver driver;

	public static WebDriver launchBrowser(String url)
	{
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions cop = new ChromeOptions();
		cop.setBinary("C:\\Users\\Administrator\\Desktop\\chrome-win64\\chrome-win64\\chrome.exe");
        driver = new ChromeDriver(cop);
		
		// driver = new ChromeDriver();//run time obj 
		 
		 driver.manage().window().maximize();

		driver.get(url);

		return driver;
		
	}

}

package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import basic.BaseTest;

public class SendKeysUsingJS 
{
	public static void main(String[] args) 
	{
		ChromeDriver chrome_driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions cop = new ChromeOptions();
		cop.setBinary("C:\\Users\\Administrator\\Documents\\chrome-win64\\chrome-win64\\chrome.exe");
		chrome_driver = new ChromeDriver(cop);
		
		
		
		
		WebDriver driver = BaseTest.launchBrowser("https://www.spotify.com/in-en/signup");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));

		js.executeScript("arguments[0].value='velocity@pune.com'", email);

	}

}



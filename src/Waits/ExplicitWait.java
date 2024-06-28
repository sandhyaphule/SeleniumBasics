package Waits;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basic.BaseTest;

public class ExplicitWait 
{
	@Test
	public void explicitTest()
	{
		
	//WebDriver driver = BaseTest.launchBrowser("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		ChromeDriver chrome_driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions cop = new ChromeOptions();
		cop.setBinary("C:\\Users\\Administrator\\Documents\\chrome-win64\\chrome-win64\\chrome.exe");
		chrome_driver = new ChromeDriver(cop);	
		chrome_driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");


	chrome_driver.findElement(By.xpath("//*[@id='enable-button']")).click();
    
     WebDriverWait wait = new WebDriverWait(chrome_driver, Duration.ofSeconds(120));
     
     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']")));
     
     WebDriverWait wait1 = new WebDriverWait(chrome_driver, Duration.ofSeconds(120));

     chrome_driver.findElement(By.xpath("//*[@id='enable-button']")).click();
     
     chrome_driver.findElement(By.xpath("//*[@id='alert']")).click();
     
     WebDriverWait wait2 = new WebDriverWait(chrome_driver, Duration.ofSeconds(140));

     
     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='alert']")));
     
     chrome_driver.findElement(By.xpath("//*[@id='populate-text']")).click();
     
     WebDriverWait wait3 = new WebDriverWait(chrome_driver, Duration.ofSeconds(170));

     
     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='populate-text']")));

     chrome_driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
     
     
     WebDriverWait wait4 = new WebDriverWait(chrome_driver, Duration.ofSeconds(200));

     
     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='display-other-button']")));

     chrome_driver.findElement(By.xpath("//*[@id='checkbox']")).click();
     
     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='checkbox']")));
     
     WebDriverWait wait5 = new WebDriverWait(chrome_driver, Duration.ofSeconds(250));


     chrome_driver.findElement(By.xpath("//*[@id='ch']")).click();
     
	 wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='ch']"), true));
		
		


 	
 	
	}

	
	}






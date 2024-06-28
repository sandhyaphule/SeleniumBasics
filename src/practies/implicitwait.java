package practies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basic.BaseTest;

public class implicitwait 
{
	@Test
	public void setup() throws InterruptedException
	{
		WebDriver driver = BaseTest.launchBrowser("https://demoqa.com");
		
		
	//	driver.findElement(By.xpath("//*[@name='q']")).sendKeys("India");
		
	//	driver.findElement(By.id("visibleAfter")).click();

		Thread.sleep(1000);
		
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//*[@class='banner-image']")).click();
		
		
		
		

		

		
	}

}

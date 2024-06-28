package testngdiscussion;

import org.openqa.selenium.By;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class IphoneAmazon extends LoginAmazon
{
	WebDriver driver = new ChromeDriver();
	Actions bb = new Actions(driver);

	@Test(priority=1)
	public void Browser()
	{
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}

	@Test(priority=2)
	public void SignIN()
	{
		WebElement hover = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		bb.moveToElement(hover).perform();
		driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']")).click();
	}

	@Test(priority=3)
	public void UserName()
	{
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("7066187807");
		driver.findElement(By.xpath("//[@class='a-button-inner']//[@id='continue']")).click();
	}

	@Test(priority = 4)
	public void Password()
	{
	   driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("Amol@123");
	   driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
	}

	@Test(priority=5)
	public void SearchFor()
	{
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iphone 14 pro max");
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	}

	@Test(priority=6)
	public void SelectPhone() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[text()='Apple iPhone 14 Pro Max (256 GB) - Gold']")).click();
		
		Thread.sleep(10000);
		
		String parentid = driver.getWindowHandle();
		
		driver.switchTo().window(parentid);
		
		Reporter.log("GOING GOOD. KEEP IT UP", false);
		
		
	}

	@Test(priority=7)
	public void selectOtherPhone()
	{
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).click();
		
		bb.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("x").keyUp(Keys.CONTROL).sendKeys("samsung s23 ultra 5g").build().perform();
		
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	}

	@Test(priority=8)
	public void selectSamsung()
	{
	driver.findElement(By.xpath("(//[@class='a-section a-spacing-small a-spacing-top-small']//[text()='Samsung Galaxy S23 Ultra 5G (Green, 12GB, 256GB Storage)'])[1]")).click();	
	}
}

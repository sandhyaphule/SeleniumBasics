package testngdiscussion;


import org.openqa.selenium.By;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;


import basic.BaseTest;

public class LoginAmazon 
{
	ChromeDriver driver = new ChromeDriver();

	@Test(priority=1,invocationCount=1)
	public void Browser()
	{
	driver.manage().window().maximize();
	}
			@Test(priority=2,invocationCount=1)
			public void signin()
			{
			WebElement hover = driver.findElement(By.xpath("//*(id='nav_link_accountlist')"));
			}
			
			
			
			@Test(priority=3,invocationCount=1)
			public void username()
			{
		    driver.findElement(By.xpath("//*(@id='nav_Flyout_ya_sigin')")).sendKeys("7066187807");

			

			
					

			}


		
	}



package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basic.BaseTest;

public class FlipcartTestCase 
{
	@Test(priority = 1)
	public void navToUrl()
	{
		BaseTest.launchBrowser("https://www.flipkart.com");
	}
	
	@Test(priority = 2)
	public void loginToApp()
	{
		
		//WebElement hoverelement = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));

	}
}
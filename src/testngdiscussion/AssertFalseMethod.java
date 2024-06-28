package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basic.BaseTest;

public class AssertFalseMethod 
{
	public class AmazonTestCases {
		WebDriver driver;
		
		
		@Test(priority = 1)
		public void navToUrl()
		{
			driver = BaseTest.launchBrowser("https://www.amazon.in/");
		}
		@Test(priority = 2)
		public void loginToApp()
		{
			WebElement hoverelement = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
			Actions act = new Actions(driver);
			
			act.moveToElement(hoverelement).perform();





}
}
}
package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.Search;
import pages.Spirit;
import pages.AddToCart;

public class BaseTest 
{
	static WebDriver driver;
	
	AddToCart addtocart;

	Search search;
	Spirit spirit;

		@BeforeSuite
		public void initBrowser()
		{
			 driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://livingliquidz.com/");
		}
		
		
		@BeforeClass
		public void createObject()
		{
			search = new Search(driver);

			spirit = new Spirit(driver);

			addtocart = new AddToCart(driver);
		}


		
//		@AfterSuite
//		public void tearDown()
//		{
//			driver.close();
//		}
}

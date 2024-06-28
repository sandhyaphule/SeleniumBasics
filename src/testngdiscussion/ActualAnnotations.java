package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActualAnnotations 
{
	@BeforeSuite//1st execute 
	public void initBrowser()//it is use to lunch browser
	{
		System.out.println("Opening the browser");
	}


	@AfterSuite
	public void tearDown()//last execute quik the browser close shutdown everything module ko reprent karata hai
	{
		System.out.println("Quit the browser");
	}

	@BeforeTest
	public void navToElectronics()//specific test tag 
	{
		System.out.println("Navigating to Electronics module");
	}

	@AfterTest
	public void navBackToHome()//return to home page
	{
		System.out.println("navigating to home page");
	}

	@BeforeClass
	public void navToMobile()
	{
		System.out.println("Navigating to mobile");
	}

	@AfterClass
	public void navBackToElectronics()
	{
		System.out.println("Navigating back to electronics");
	}


	@BeforeMethod
	public void navToProductPage()
	{
		System.out.println("Navigating to product page");
	}

	@AfterMethod
	public void navBackToListPage()
	{
		System.out.println("Navigating back to list of product page");
	}

	@Test
	public void addToCart() 
	{
		System.out.println("add to cart test case");
	}

	@Test
	public void addToCart2() 
	{
		System.out.println("add to cart test case2");


}
}
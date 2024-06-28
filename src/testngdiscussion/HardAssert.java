package testngdiscussion;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import basic.BaseTest;

public class HardAssert 
{
	@Test(priority = 1, enabled = false)
	public void loginTest()
	{
     WebDriver driver=BaseTest.launchBrowser("https://www.amazon.in/");
     
     driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Mobile");
		
	 driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	 
		String titleofpage= driver.getTitle();
		
		System.out.println(titleofpage);
		
		boolean ispresent = titleofpage.contains("Mobiile");
		
		System.out.println(ispresent);
		
//		applying assertion
		System.out.println("Before assertion code");//actual and accepted value check karychi ahe


		Assert.assertEquals(titleofpage, "Amazon.in : Mobiile");//actual not matching with accepted


		System.out.println("After assertion code");
	}
	
		
		
		//Assert.assertEquals(ispresent, true);
        
		
		
		
//Output: Here the line System.out.println("After assertion code"); will not execute as the assertion condition gets fail and due to which it won’t execute the code further
	//Output: Here the line System.out.println("After assertion code"); will not execute as the assertion condition gets fail and due to which it won’t execute the code further

	
	
}


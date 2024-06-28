package testngdiscussion;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization 
{
	@Parameters("browser")
	@Test(priority = 6)
	public void getDetails(String browsername)
	{
		System.out.println("value from xml is "+browsername);
		
		System.out.println("Get details test case");
	}
	@Parameters("browser")      
	@Test(priority = 8)
	public void launchBrowser(String browsername)
   {
		WebDriver driver;
		if(browsername.equals("Chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(browsername.equals("Edge"))
		{
			 driver = new EdgeDriver();
		

	
	}
}
}
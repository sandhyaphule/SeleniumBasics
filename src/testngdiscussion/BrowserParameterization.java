package testngdiscussion;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserParameterization 
{
	@Parameters("browser")
	@Test
	public void launchBrowser(String browsername)
	{

		WebDriver driver;
		if(browsername.equals("Chrome"))
		{
			 driver = new ChromeDriver();
			 driver.get("https://www.makemytrip.com");
		}
		else if(browsername.equals("Edge"))
		{
			 driver = new EdgeDriver();
			 driver.get("https://www.makemytrip.com");


}
	}
}


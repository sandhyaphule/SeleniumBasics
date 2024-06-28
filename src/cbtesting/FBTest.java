package cbtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FBTest 
{
  @Parameters("browsername")//chrome/firefox
  @Test
  public void f(String bname) //bname firefox
  {
	  WebDriver driver;//method madhe jehva variable write karto tehva initilize must ahe
	  
	  if(bname.equals("chrome"))
			  {
			       driver = new ChromeDriver();
			      }
	  else if(bname.equals("Firefox"))
	  {
		  driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");

  }
}
}
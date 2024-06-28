package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_SwichTo_MainPage_from_iframe 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver = new ChromeDriver(); 
		 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(500);
		
		
		//switch to frame 
		 driver.switchTo().frame("iframeResult"); 
		 
		 //ckick on date & time btn
		 driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();
		 
		 //switch to main page
		 //driver.switchTo().parentFrame();
		 driver.switchTo().defaultContent();//1st window switch  
		 
		 //click on home Icon
		 driver.findElement(By.xpath("//a[@id='tryhome']")).click(); 

		
	}

}

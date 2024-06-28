package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	
	public static void main(String[] args) 
	{
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver  ();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String title= driver.getTitle();
		
		System.out.println("Page title" + " = " + title);
		
		String pageurl = driver.getCurrentUrl();
		
		System.out.println("Page URL" +  " = " + pageurl);
		
		WebElement createtaccount = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
		
		createtaccount.click();
		
		//WebElement signup = driver.findElement(By.xpath("//button[contains(@name,'websubmit')]"));
		
		//signup.click();
		
		WebElement loginbutton = driver.findElement(By.id("login"));

		loginbutton.click();
		
	}
	

}

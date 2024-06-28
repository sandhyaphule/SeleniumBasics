package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator 

{
	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.myntra./");
		
		driver.manage().window().maximize();//use the maximize window 
		
	    WebElement carticon = driver.findElement(By.id("nav-cart"));
	
		carticon.click();

		
		
		
		
	}
	

}
//1. id: This is a method inside By class 
//which is representing inside the node using id attribute.
//
//
//
package actionsclassdisc;

import org.openqa.selenium.By;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste 
{
	public static void main(String[] args) 
	{
	   WebDriver driver= new ChromeDriver();
		
		driver.manage().window().minimize();
		
		driver.get("https://www.facebook.com/signup");
		
		 WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
           
		 
		 
		 Actions act = new Actions(driver);

		 act.click(firstname).perform();
//		performing control + a
		 act.sendKeys("Jan Batch")
		 	.keyDown(Keys.CONTROL)
		 	.sendKeys("a")
		 	.keyUp(Keys.CONTROL)
		 	.build().perform();

//			performing control + c		 
		 act.keyDown(Keys.CONTROL)
		 	.sendKeys("c")
		 	.keyUp(Keys.CONTROL)
		 	.build().perform();

//		 Performing control + v
		 act
		 .sendKeys(Keys.TAB)
		 .keyDown(Keys.CONTROL)
		 .sendKeys("v")
		 .keyUp(Keys.CONTROL)
		 .build().perform();


		
	}

}

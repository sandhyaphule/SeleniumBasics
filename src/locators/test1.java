package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//open browser
		ChromeDriver driver = new ChromeDriver();
		WebElement username = driver.findElement(By.id("userEmail"));
		username.sendKeys("gouravjawale28@gmail.com");

		
		
		//set time
		Thread.sleep(2000);
		
		// To go back tab
		driver.navigate().back();
						
		//set time
		Thread.sleep(2000);
						
		// To go forward tab
		driver.navigate().forward();
		
		//maximize chrome window
		driver.manage().window().maximize();
		
		//set time
		Thread.sleep(2000);
		
		//open URL
		driver.get("https://www.facebook.com/");
		
		//set
		// Refresh window
		driver.navigate().refresh();
				
				//set time
				Thread.sleep(2000);
				//close window
				driver.close();



	}

}

package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameByClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		
		
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement username = driver.findElement(By.name("username"));
		
		username.sendKeys("typing username by selenium");



		
		


		
		
	}

}

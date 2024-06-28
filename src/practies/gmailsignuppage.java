package practies;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailsignuppage 
{
	public static void main(String[] args) 
	{
		ChromeDriver chromeDriver = new ChromeDriver();//open chrome kele 
		
		chromeDriver.get("https://accounts.google.com/signup");//url enter keli


        WebElement element1 = chromeDriver.findElement(By.id("email"));//email find kela 
        
        element1.sendKeys("sandyladkat19@gmail.com");//email enter keli value

        WebElement element2 = chromeDriver.findElement(By.id("pass"));
        element2.sendKeys("pa$$word123");

        WebElement element3 = chromeDriver.findElement(By.id("u_0_q"));
        
        element3.click();

        System.out.println("Login");









    
		
	}

}

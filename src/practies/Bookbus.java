package practies;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import basic.BaseTest;

public class Bookbus 
{
public static void main(String[] args) throws InterruptedException  
	{

	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();//window maximize karnyati 
        driver.get("https://www.redbus.in/");

        Thread.sleep(1000);
	    
	    
	    WebElement From = driver.findElement(By.xpath("//*[@id='src']"));
		
		From.click();
		From.sendKeys("Pune");
        Thread.sleep(1000);
	    
	    
	    WebElement To = driver.findElement(By.xpath("//*[@id='dest']"));
	    
	    To.click();
	    To.sendKeys("Manali");
        Thread.sleep(1000);
        
        
	   // WebElement Day = driver.findElement(By.xpath("//*[@class='current day']"));
	   // Day.click();
	    //Thread.sleep(1000);
        WebElement Day = driver.findElement(By.xpath("//*[@class='current day']"));//ya madhe current date click hoil
	    driver.findElement(By.xpath("//*[@id='onward_cal']")).click();//past date chi booking nahi hot so current date or next date click karaychi	  

	    WebElement Date = driver.findElement(By.xpath("//*[text()='25']"));//past date chi booking nahi hot so current date or next date click karaychi	  
	    Date.click();
	    Thread.sleep(1000);	  
    
	   WebElement searchbutton = driver.findElement(By.xpath("//*[@id='search_btn']"));
	   searchbutton.click();
	   Thread.sleep(1000);

//	   driver.switchTo().alert().accept();//alert yet nahi so yachi garaj nahi
	   driver.close();
	}

	   
	    
	    
	}


		


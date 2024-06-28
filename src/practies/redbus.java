package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		WebElement from_place = driver.findElement(By.xpath("//*[@id='src']"));
		from_place.click();
		from_place.sendKeys("Pune");
	    Thread.sleep(1000);	    
	    
	    WebElement to_place = driver.findElement(By.xpath("//*[@id='dest']"));
	    to_place.click();
	    to_place.sendKeys("Manali");
	    Thread.sleep(1000);	    
	    ////*[@id='onward_cal']
//	    WebElement Day = driver.findElement(By.xpath("//*[@class='current day']"));//ya madhe current date click hoil
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

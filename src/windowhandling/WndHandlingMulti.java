package windowhandling;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import basic.BaseTest;

public class WndHandlingMulti 
{
	public static void main(String[] args) 
	{
		WebDriver driver=BaseTest.launchBrowser("https://demoqa.com/");
		
		String parentid = driver.getWindowHandle();// parent id
        
		System.out.println("parent id is :"+parentid);

		driver.findElement(By.xpath("//*[@class='banner-image']")).click();
		
		driver.findElement(By.xpath("//*[@class='banner-image']")).click();
		
		driver.findElement(By.xpath("//*[@class='banner-image']")).click();

		driver.findElement(By.xpath("//*[@class='banner-image']")).click();
		
		driver.findElement(By.xpath("//*[@class='banner-image']")).click();

		driver.findElement(By.xpath("//*[@class='banner-image']")).click();


		Set<String> allwindow = driver.getWindowHandles();//3

		int	numberofwindow = allwindow.size();

         System.out.println(numberofwindow);//3window

         String [] winarray = new String [numberofwindow];
         
         int i = 0;
         
			for(String winid :allwindow)
			{
				winarray[i] = winid;

				i++;
			}


			driver.switchTo().window(winarray[2]);
			
			driver.findElement(By.xpath("//*[@class='btn btn-primary-shadow btn-block']")).click();

			driver.get("https://www.google.com/");
			
			driver.close();







}


	}

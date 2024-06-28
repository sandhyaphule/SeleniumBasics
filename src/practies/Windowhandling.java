package practies;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import basic.BaseTest;

public class Windowhandling 
{
	public static void main(String[] args) //multiple window handling
	{

       WebDriver driver = BaseTest.launchBrowser("https://www.myntra.com/");

       String parentid = driver.getWindowHandle();// parent id

       System.out.println("parent id is :"+parentid);
       
        //driver.findElement(By.xpath("")).click();
        //driver.findElement(By.xpath("")).click();
        //driver.findElement(By.xpath("")).click();
        
		Set<String> allwindow = driver.getWindowHandles();

		int	numberofwindow = allwindow.size();

       System.out.println(numberofwindow);

       String [] winarray = new String [numberofwindow];

        int i = 0;

		String[] allwindow1 = null;
		
		for(String winid :allwindow1)
	    {
		winarray[i] = winid;

		i++;
	}

	driver.switchTo().window(winarray[1]);

	driver.get("https://www.makemytrip.com/");

	driver.close();//particuler window close 




}

}



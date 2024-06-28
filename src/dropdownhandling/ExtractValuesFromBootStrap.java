package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtractValuesFromBootStrap 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://paytm.com/recharge");//eka xpath warun  5 elment deto tar find element method use keli phije

		driver.findElement(By.xpath("//*[@tabindex='1']//*[@type='text']")).click();

		driver.findElement(By.xpath("//div[@class='_3xI1']//*[text()= 'BSNL']")).click();
		
		List<WebElement> x = driver.findElements(By.xpath("//div[@class='_3xI1']//span"));//multiple

		 WebElement y = driver.findElement(By.xpath("//div[@class='_3xI1']"));//1 element

	   }
		public void printAllValues(String xpath, WebDriver driver)
		{
			driver.findElement(By.xpath("//*[@tabindex='1']//*[@type='text']")).click();
			
			List<WebElement> allvalues = driver.findElements(By.xpath(xpath));
			
			int countofvalues = allvalues.size();
			
			for(int i = 0; i<countofvalues; i++)
			{
				String text = allvalues.get(i).getText();
				
				System.out.println(text);
		
	}

}
}

//Output:
//Airtel
//BSNL
//Jio
//MTNL
//Vi


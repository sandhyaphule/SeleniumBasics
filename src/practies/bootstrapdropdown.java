package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapdropdown 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://paytm.com/recharge");
		
		driver.findElement(By.xpath("//*[@tabindex='1']//*[@type='text']")).click();
		
		List<WebElement> allvalues = driver.findElements(By.xpath("//div[@class='_3xI1']//span"));
		
		int countofvalues = allvalues.size();
		
		for(int i = 0; i<countofvalues; i++)
		{
			String text = allvalues.get(i).getText();
			
			System.out.println(text);
		}
		
		
	}


}

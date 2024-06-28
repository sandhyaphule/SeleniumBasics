package interviewProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PromotAlertHandle 
{

	public static void main(String[] args) throws InterruptedException 
	{
	     WebDriver wd = new EdgeDriver();
	     
	     wd.get("https://letcode.in/alert");
			
//			wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			WebElement Simple_alert_button = wd.findElement(By.xpath("//*[@id='accept']"));
				
//	 		1st way to refresh
			Simple_alert_button.click();
			
			Thread.sleep(3000);

			wd.switchTo().alert().accept();

			wd.navigate().refresh();
//			act.keyDown(Keys.CONTROL).sendKeys("R").keyUp(Keys.CONTROL).build().perform();
//			act.sendKeys(Keys.F5).perform();		
			System.out.println("1st way to refresh.");
			
			Thread.sleep(3000);
			
//			2nd way to refresh
			WebElement Confirm_alert_button = wd.findElement(By.xpath("//*[@class='button is-link is-outlined']"));
			
			Confirm_alert_button.click();
			
			Thread.sleep(3000);
			
			wd.switchTo().alert().accept();
//			Actions act = new Actions(wd);
//			act.keyDown(Keys.CONTROL).sendKeys("R").keyUp(Keys.CONTROL).build().perform();
//			act.keyDown("Fn").sendKeys("F5").keyUp("Fn").build().perform();		
//			act.sendKeys(Keys.F5).perform();
			wd.navigate().refresh();

			System.out.println("2nd way to refresh.");
			
			Thread.sleep(3000);
			
//			3rd way to refresh
//			WebElement Prompt_alert_button = wd.findElement(By.xpath("//*[text()='Prompt Alert']"));//locator using xpath
			WebElement Prompt_alert_button = wd.findElement(By.cssSelector("button#prompt"));//locator using CSS Selector method
			Prompt_alert_button.click();
			
			Thread.sleep(3000);
			
			wd.switchTo().alert().sendKeys("sandhya");

			wd.switchTo().alert().accept();
					
			System.out.println("3rd way to refresh.");
			
			Thread.sleep(3000);
//			Actions act1 = new Actions(wd);
//			act.sendKeys(Keys.F5).perform();		
//			act1.keyDown(Keys.CONTROL).sendKeys("R").keyUp(Keys.CONTROL).build().perform();
			wd.navigate().refresh();

			Thread.sleep(3000);
	}
}



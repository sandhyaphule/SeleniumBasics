package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import basic.BaseTest;

public class LumaProject 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//ChromeOptions cop = new ChromeOptions();
		//cop.setBinary("C:\\Users\\Administrator\\Desktop\\chrome-win64\\chrome-win64\\chrome.exe");
        //driver = new ChromeDriver(cop);
		WebDriver driver = BaseTest.launchBrowser("https://magento.softwaretestingboard.com");
		WebElement Women = driver.findElement(By.xpath("(//*[@href='https://magento.softwaretestingboard.com/women.html'])[1]"));
        Thread.sleep(2000);
        WebElement top=driver.findElement(By.xpath("//*[@id='ui-id-9']"));
		WebElement jacket=driver.findElement(By.xpath("//*[@id='ui-id-11']"));

		Actions act =new Actions(driver);
        act.moveToElement(Women).build().perform();
        Thread.sleep(2000);
		act.moveToElement(top).build().perform();
		act.moveToElement(jacket).click().build().perform();
		
		WebElement select_Jacket=driver.findElement(By.xpath("(//*[@class='product-image-container'])[1]"));
		select_Jacket.click();
		
		WebElement Jacket_size=driver.findElement(By.xpath("//*[@id='option-label-size-143-item-167']"));
		Jacket_size.click();
	
		WebElement Jacket_color=driver.findElement(By.xpath("//*[@id='option-label-color-93-item-57']"));
		Jacket_color.click();
		
		WebElement Jacket_quantity=driver.findElement(By.xpath("//*[@id='qty']"));
		Jacket_quantity.clear();
		Jacket_quantity.sendKeys("2");
	   
		WebElement Add_to_cart=driver.findElement(By.xpath("//*[@id='product-addtocart-button']"));
		Add_to_cart.click();
	}
}

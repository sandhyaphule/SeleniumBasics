package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookAssigment 
{
  public static void main(String[] args) throws InterruptedException 
  {
    WebDriver driver= new ChromeDriver();
     
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
    Thread.sleep(1000);
    
    WebElement fname = driver.findElement(By.name("firstname"));
	fname.click();
	fname.sendKeys("Sandhya");
    Thread.sleep(1000);
    
    WebElement lname = driver.findElement(By.xpath("//*[@name='lastname']"));    
    lname.click();
    Thread.sleep(1000);
    lname.sendKeys("phule");

    
    
    WebElement email = driver.findElement(By.name("reg_email__"));    
    email.click();
    Thread.sleep(1000);

	email.sendKeys("7066187807");
    Thread.sleep(1000);
    
    
    WebElement pswd = driver.findElement(By.name("reg_passwd__"));    
    pswd.click();
    Thread.sleep(1000);
    pswd.sendKeys("123456");
    Thread.sleep(1000);
    
    WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
    day.click();
    Thread.sleep(1000);
    
    Select selday= new Select(day);
	//Select.selday = new Select (day);
    selday.selectByIndex(18);
    Thread.sleep(1000);

    
    WebElement mon = driver.findElement(By.xpath("//*[@id='month']"));
    mon.click();
    Thread.sleep(1000);
    
    Select selmon= new Select(mon);
    selmon.selectByValue("2");
    Thread.sleep(1000);
    
    
    WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
    year.click();
    Thread.sleep(1000);
    
    Select selyear= new Select(year);
    selyear.selectByVisibleText("1991");
    Thread.sleep(1000);

    WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));   
    gender.click();
    Thread.sleep(1000);
    
    WebElement singup = driver.findElement(By.xpath("//*[@type='submit']"));    
    singup.click();
    Thread.sleep(1000);

    driver.close();

    
	
	}

}


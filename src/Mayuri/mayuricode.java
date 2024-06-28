package Mayuri;
import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mayuricode 
{
	WebDriver driver = null;
	Properties prop = null;
	@BeforeMethod
	public void setup() throws IOException
	{
		prop = new Properties();
		File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\SeleniumBasics\\src\\Mayuri\\config.properties");
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(prop.getProperty("url"));
		WebElement myAccountOption = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountOption.click();
		WebElement loginOption  = driver.findElement(By.xpath("//a[text()='Login']"));
		loginOption.click();
	}
	 @AfterMethod
	public void tearDown() 
	 {
		if(driver!=null) 
		{
			driver.quit();
		}
	}
	@Test (priority = 1)
	public void loginWithValidCredentials()
	{
		WebElement emailId = driver.findElement(By.xpath("//input[@id='input-email']"));
		emailId.sendKeys(prop.getProperty("emailIdField"));
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.sendKeys(prop.getProperty("passwordField"));
		WebElement loginButton = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		loginButton.click();
		String actual = driver.findElement(By.xpath("//a[text() ='Edit your account information']")).getText();
		String expected = "Edit your account information";
		Assert.assertEquals(actual, expected, "Login Failed ");
		String expectedTitle = "My Account";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Login Failed");
	}
	@Test(priority = 2)
	public void loginWithInvalidCredentials()
	{
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(prop.getProperty("invalidEmailId"));
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(prop.getProperty("invalidPassword"));
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		String actual = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		System.out.println("Actual String :" + actual + "Length : " + actual.length());
		String expected = "Warning: No match for E-Mail Address and/or Password.";
		System.out.println("Expected String :" + expected + "Length : " + expected.length());
		Assert.assertEquals(actual ,expected," Invalid Email ID  or Password");
	}
	@Test(priority =3)
	public void loginWithoutAnyCredentials()
	{
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(" ");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(" ");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		String actual = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		System.out.println("Actual String :" + actual + "Length : " + actual.length());
		String expected = "Warning: No match for E-Mail Address and/or Password.";
		System.out.println("Expected String :" + expected + "Length : " + expected.length());
		Assert.assertEquals(actual ,expected," Invalid Email ID  or Password");
	}


}

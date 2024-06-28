package Mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import basic.BaseTest;

public class LivingLiquidzAscPrice 
{
		WebDriver driver;
	     @Test (priority = 1)
	     
		public void launchChromeBrowser() throws InterruptedException
		{
			driver =BaseTest.launchBrowser("https://livingliquidz.com/");
			driver.findElement(By.xpath("//*[@id='onesignal-slidedown-cancel-button']")).click();
			WebElement spirit = driver.findElement(By.xpath("(//*[normalize-space(text())='SPIRITS'])[2]"));
			spirit.click();
			WebElement singlemalt = driver.findElement(By.xpath("//*[@href='/products/single-malts/single-malt/368']"));
			singlemalt.click();
			WebElement sort = driver.findElement(By.xpath("//*[@id='ddlProductSortyBy']"));
			sort.click();
			
			Select sel_l2hA = new Select(sort);
			sel_l2hA.selectByVisibleText("Name A - Z");
			List<WebElement> list_AtoZ= driver.findElements(By.xpath("//*[@class='fw-500 m-0 text-dark ll-product-title']"));
			Thread.sleep(10000);
			
			String AtoZ =null;
			
			
			for(int i=0; i<list_AtoZ.size(); i++)
			{
				 AtoZ = list_AtoZ.get(i).getText(); 
	    			  System.out.println(AtoZ );
//				  System.out.println(" *****8");// A-Z
			}
			
			WebElement sort1 = driver.findElement(By.xpath("//*[@id='ddlProductSortyBy']"));
			sort1.click();
			
			Select sel_l2h = new Select(sort1);
			sel_l2h.selectByVisibleText("Name Z - A");
			List<WebElement> list_ZtoA= driver.findElements(By.xpath("//*[@class='card-title fs-16 m-0 d-block']"));
			Thread.sleep(5000); //j=list_ZtoA.size()-1  j--
			String ZtoA =null;
			System.out.println();
			for(int i=list_ZtoA.size()-1; i>=0; i--)
			{
				ZtoA= list_ZtoA.get(i).getText(); 
	     		System.out.println(ZtoA );
			}
		for(int i=0;i<list_ZtoA.size(); i++)
		{
			if(AtoZ.equals(ZtoA))
			{
				System.out.println("Sorted Properly");
			}
			else
			{
				System.out.println("Not properly sorted");
			}
					
		}	
				
				// 
				
			
				                 // R//P//P//P//P//p//p//L//I//G//G//C
			//	String details_1 = list_.get(j).getText();
				//System.out.println(details);
				

				//			String details1 = list_.get(j).getText();
				//			 //System.out.println(details1);
				//			String intDet = details.replaceAll("[^0-9.]", "");
				//			String intDet1 = details1.replaceAll("[^0-9.]", "");
				//
				//			dbDet = Double.parseDouble(intDet);
				//			dbDet1 = Double.parseDouble(intDet1);
				//			if(dbDet <= dbDet1)
				//			{
				//				continue;
				//			}
				//			else
				//			{
				//				System.out.println("Items are not in low to high order.");
				//			}
			}
			
			//---------------------------------------------------------------------------------
			//		sel_l2h.selectByVisibleText("Price Low to High");		//*[text()='Price Low to High']
			//		List<WebElement> list = driver.findElements(By.xpath("//*[@class='row my-1 fs-16']"));
			//		Double dbDet=0.0;
			//		Double dbDet1=0.0;
			//		for(int i=0, j=i+1; i<list.size()-1; i++,j++)
			//		{
			//			String details = list.get(i).getText();
			//			//System.out.println(details);
			//			String details1 = list.get(j).getText();
			//			//System.out.println(details1);
			//			String intDet = details.replaceAll("[^0-9.]", "");
			//			String intDet1 = details1.replaceAll("[^0-9.]", "");
			//
			//			dbDet = Double.parseDouble(intDet);
			//			dbDet1 = Double.parseDouble(intDet1);
			//			if(dbDet <= dbDet1)
			//			{
			//				continue;
			//			}
			//			else
			//			{
			//				System.out.println("Items are not in low to high order.");
			//			}
			//		}
			//
			//		Thread.sleep(5000);
			//		driver.close()

	}


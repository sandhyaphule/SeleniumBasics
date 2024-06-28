package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicTable2 
	{

		public static void main(String[] args)
		{
			//To verify the country name of "Sanghai city"  /// China
		
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
			
		      List<WebElement> tr = driver.findElements(By.xpath("//*[@class='tsc_table_s13']//tbody//tr[4]//td"));
				System.out.println(tr.size()); // 6
				
				
				// header is country
				
				//*[@class='tsc_table_s13']//thead//th[2]
				
				
				for(int i=1; i<=tr.size(); i++)
				{
					WebElement getelement = driver.findElement(By.xpath("//*[@class='tsc_table_s13']//tbody//tr[4]//td["+i+"]"));
					if(getelement.getText().equals("Shanghai")) 
					{
						WebElement countryname = driver.findElement(By.xpath("//*[@class='tsc_table_s13']//tbody//tr[4]//td[1]"));
					System.out.println(countryname.getText());
					}
				
				}
				
				

		}


}

package practies;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization 
{
	@Parameters("Browser")
	@Test(priority = 6)//jaychi value sarvat kami te phile excute honar
	public void getDetails(String browsername)
	{
		System.out.println("Value from xml is"+ browsername);
		System.out.println("Get details test case");
	}

    @Test (priority = 8)
	public void setDetails()
	{
		System.out.println("set Details test case");
	}
	//6 ahe agother c yeto tynater s yeto tya alphabhtical order
	@Test(priority = 10)
	public void login()
	{
		System.out.println("login test case");
	}
	
}
//suite chya atta suit testtag asto multiple test tag astat
	
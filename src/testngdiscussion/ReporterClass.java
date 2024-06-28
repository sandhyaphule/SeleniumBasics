package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterClass 
{
	@Test(priority = 1)
	public void login()
	{
		System.out.println("login test case");

		Reporter.log("Login test case for report", true);//console and repor ya doni madhe disnar message 
	}


	@Test (priority = 2)
	public void home()
	{
		System.out.println("home test case");//overloding method
		Reporter.log("home test case for report", true);//jar report phaycha asel he method use karychi 
	}


	@Test(priority = -3)
	public void profile()
	{
		System.out.println("profile test case");

		Reporter.log("profile test case for report", false);//only console madhe ha message disanar 


}
}

//It is a class which is used to print messages inside the report – emailable-report.html














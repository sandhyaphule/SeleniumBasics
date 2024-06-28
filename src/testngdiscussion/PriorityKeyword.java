package testngdiscussion;

import org.testng.annotations.Test;

public class PriorityKeyword 
{
	@Test(priority = 1)//jaychi value sarvat kami te phile excute honar
	public void login()
	{
		System.out.println("login test case");
	}


	@Test (priority = 2)
	public void home()
	{
		System.out.println("home test case");
	}


	@Test(priority = -3)//priority define nahi keli tar 0 honar 
	public void profile()
	{
		System.out.println("profile test case");//priority -,+,boolean
	}


	@Test(priority = 4)
	public void logout()
	{
		System.out.println("Logout test case");
	}

}
 
package testngdiscussion;

import org.testng.annotations.Test;

public class duplicatepriority 
{
	@Test(priority = 6)//jaychi value sarvat kami te phile excute honar
	public void getDetails()
	{
		System.out.println("Get details test case");
	}

    @Test (priority = 6)
	public void setDetails()
	{
		System.out.println("set Details test case");
	}
	//6 ahe agother c yeto tynater s yeto tya alphabhtical order
	@Test(priority = 1)
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

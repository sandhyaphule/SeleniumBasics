package testngdiscussion;

import org.testng.Assert;

import org.testng.annotations.Test;

public class AssertTrueMethod 
{
	@Test(priority = 2)
	public void getVerify()
	{
		String actual = "Shopping";
		
		String expected = "Shoppingg";
		
		
		boolean isequal = actual.equals(expected);
		
		
         Assert.assertTrue(isequal);//method 
         
		Assert.assertTrue(isequal, "Test case is failed please raise a bug");

	}
		
		

}

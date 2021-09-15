package RetryLogicUsingTestNG.TestNGRetry;

import org.testng.annotations.Test;
import org.testng.Assert;


public class RetryTest {

	
	
	@Test
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
}

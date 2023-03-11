package listenerPack;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerPack.Listener.class)
public class TestClass 
{
	@Test
	public void testA()
	{
		System.out.println("TEST-A");
		Assert.assertTrue(true);   //test case true
	}
	
	@Test
	public void testB()
	{
		System.out.println("TEST-B");
		Assert.assertTrue(false);  //test case fail
	}

}

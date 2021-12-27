package testcodey;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mav.sourcecodey;

public class mavtest {
	
	@Test
	
	public void testlogin()
	{
		sourcecodey result = new sourcecodey();
		Assert.assertEquals(0, result.userLogin("abc", "nothing"));
	}
	
	@Test
	
	public void testlogin2()
	{
		sourcecodey result = new sourcecodey();
		Assert.assertEquals(1, result.userLogin("abc", "abc@123"));
	}

}

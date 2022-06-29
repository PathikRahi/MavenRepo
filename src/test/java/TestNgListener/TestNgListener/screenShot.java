package TestNgListener;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class screenShot extends Base {
	
	@BeforeMethod
	public void setup() {
		initialization();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	@Test
	public void takeScreenShotTest() {
		Assert.assertEquals(false, true);
		
	}
}

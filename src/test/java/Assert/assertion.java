package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertion {
	SoftAssert softAssert=new SoftAssert();
	@Test
 /*void demoTest() {
        Assert.assertEquals("welcome", "welcome");
        Assert.assertTrue(true);
        Assert.assertFalse(false, "Null");
}*/

	void demoTest1() {
		softAssert.assertEquals("welcome", "Welcom");
		softAssert.assertTrue(true);
		softAssert.assertFalse(false);
    System.out.println("Passed");
    softAssert.assertAll();
}
}

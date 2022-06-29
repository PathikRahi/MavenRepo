package TestNG;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	/*@Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class)
	public void infinitLoopTest() {
		int i=1;
		while (i==1) {
			System.out.println(i);
		}
		
	}*/
	@Test(expectedExceptions=NumberFormatException.class)//to avoid try and catch method
	public void test1() {
		String x="1000A";
		Integer.parseInt(x);
	}
}

package TestNG;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount=10) //to run test multiple time
	public void sum() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

}

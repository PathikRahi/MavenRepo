package TestNG;

import org.testng.annotations.Test;

public class TestNgFeatures {

	@Test
	public void loginTest() {
		System.out.println("loginTest");
			int i=9/0;
	}
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest() {
		System.out.println("HomePageTest");
	}
	/*@Test
	public void SearchPageTest() {
		System.out.println("SearchPageTest");
	}*/
	
	
	
	
	
}

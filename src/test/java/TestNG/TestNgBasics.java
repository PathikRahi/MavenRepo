package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNgBasics {
	//pre-condition annotations--starting with @Before
	@BeforeSuite
	public void setUp() {
		System.err.println("Setup System Property for chrome");
	}
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launchBrowser method");
	}
	@BeforeClass
	public void login() {
		System.out.println("log in");
		
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("Enter URL");
		
	}
	//test cases start with test
	@Test
	public void googleTest() {
		System.out.println("Google Title Test");
	}
	@Test
	public void searchTest(){
		System.out.println("Search Test");
	}
	@Test
	public void googleLogoTest() {
		System.out.println("Google Logo Test");
	}
	//post condition-start with @After
	@AfterMethod
	public void logout() {
		System.out.println("logout method");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("Delete All Cookies");
	}
	
	/*@AfterSuite
	public void generateTestReport() {
		System.out.println("Generate Test Report");
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

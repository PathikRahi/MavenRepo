package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\BrowserDriver\\\\chromedriver.exe");
	     driver= new ChromeDriver();
	     driver.get("https://www.google.com/");
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Test(priority=1,groups="Logo")
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2,groups="Title")
	public void googleLogoTest() {
		boolean b=driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).isDisplayed();
	    System.out.println(b);
	}
	@Test(priority=3,groups="Title")
	public void mailLinkTest() {
		driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	@Test(priority=5,groups="Title")
	public  void test1() {
		System.out.println("test1");
	}
	@Test(priority=4,groups="Logo")
	public  void test2() {
		System.out.println("test2");
	}
	@Test(priority=6,groups="Logo")
	public  void test3() {
		System.out.println("test3");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

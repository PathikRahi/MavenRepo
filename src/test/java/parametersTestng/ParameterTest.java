package parametersTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	@Test
	@Parameters({"url","emailid"})
	public void yahooLoginTestMethod(String url, String emailid) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\BrowserDriver\\\\chromedriver.exe");
	     driver= new ChromeDriver();
	     driver.get("https://login.yahoo.com/?.intl=ca");
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.xpath("//input[@id='login-username']")).clear();
	     driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailid);
	     driver.findElement(By.xpath(" //input[@id='login-signin']")).click();	     
	}

}

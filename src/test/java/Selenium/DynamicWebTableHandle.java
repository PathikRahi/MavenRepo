package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\BrowserDriver\\\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     
	     //dynamic wait
	     driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	     
	     driver.get("http://demo.guru99.com/test/web-table-element.php");
	}

}

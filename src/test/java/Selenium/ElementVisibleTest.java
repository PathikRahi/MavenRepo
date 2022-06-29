package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\BrowserDriver\\\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     
	     //dynamic wait
	     driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	     
	     driver.get("https://api.freecrm.com/register/");
	     
	     //1. isdisplayed() method:applicable for all elements
	     boolean b1=driver.findElement(By.name("action")).isDisplayed();//for signup button
	    System.out.println(b1);
	    
	    //2.isenabled():
	    boolean b2=driver.findElement(By.name("action")).isEnabled();
	    System.out.println(b2);
	    
	  
	     driver.findElement(By.name("terms")).click();
	    //System.out.println(b3);
	    //

	     //driver.findElement(By.name("action")).click();
	     //3. isSelected() method: only applicable for checkbox, radiobutton, drop down menu
	     boolean b3=driver.findElement(By.name("terms")).isSelected();
	     System.out.println(b3);
	     driver.quit();
	     
	}

}

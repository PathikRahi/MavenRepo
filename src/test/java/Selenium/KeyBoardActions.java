package Selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\BrowserDriver\\\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	   // driver.get("https://the-internet.herokuapp.com/key_presses");
	     driver.get("https://the-internet.herokuapp.com/key_presses");
	     driver.manage().window().maximize();
	     
	     Actions action=new Actions(driver);
	     
	     
	     
	     
	     
	     /*action.sendKeys(Keys.ENTER).perform();
	     Thread.sleep(5000);
	     action.sendKeys(Keys.BACK_SPACE).perform();
	     Thread.sleep(5000);
	     action.sendKeys(Keys.SPACE).perform();
	     Thread.sleep(5000);
	     action.sendKeys(Keys.SHIFT).perform();*/
	     Thread.sleep(5000);
	     driver.quit();
	}

}

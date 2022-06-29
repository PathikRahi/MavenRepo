package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {
	//add action class object
	//add moveToElement method
	//add build and perform method

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\BrowserDriver\\\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.spicejet.com/");
	     driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	     WebElement link_Electronics=driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/div[1]"));
	     WebElement ExtraSeat=driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[7]/div/a[1]/div/div"));
	     
	     
	     Actions action=new Actions(driver);
	     action.moveToElement(link_Electronics).build().perform();
	     action.moveToElement(ExtraSeat).click().build().perform();
	 
	     
	}

}

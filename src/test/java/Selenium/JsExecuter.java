package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecuter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\BrowserDriver\\\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://accounts.google.com/");
	    
	     //Next button element
	     WebElement nextBtn = driver.findElement(By.id("identifierNext"));
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     //code to enter value in the email textbox
	     js.executeScript("document.getElementById('identifierId').value='testemail'");
	     //code to click on next button
	     //js.executeScript("arguments[0].click();", nextBtn);
	}

}

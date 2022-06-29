package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionMultipleAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\BrowserDriver\\\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	
	     driver.get("https://text-compare.com/");
	     driver.manage().window().maximize();
	     
	     WebElement input1=driver.findElement(By.id("inputText1"));
	     WebElement input2=driver.findElement(By.id("inputText2"));
	     
	     input1.sendKeys("Welcome to Selenium");
	     
	     Actions act=new Actions(driver);
	      
	     //CTRL+A
	     act.keyDown(Keys.CONTROL);
	     act.sendKeys("a");
	     act.keyUp(Keys.CONTROL);
	     act.perform();
	     
	     //CTRL+C
	     act.keyDown(Keys.CONTROL);
	     act.sendKeys("c");
	     act.keyUp(Keys.CONTROL);
	     act.perform();
	     
	     //tab keys
	     act.sendKeys(Keys.TAB);
	     act.perform();
	     
	     //CTRL+V
	     act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	     
	     //compare text
	     if(input1.getAttribute("value").equals(input2.getAttribute("value")))
	     {
	    	 System.out.println("Text are Same");
	     }
	     else
	     {
	    	 System.out.println("Text are not same");
	     }
	     


	}

}

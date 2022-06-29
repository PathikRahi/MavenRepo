package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\BrowserDriver\\\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("http://demo.guru99.com/popup.php");
	    
	     driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
	     
	     Thread.sleep(2000);
	     Set<String> handler=driver.getWindowHandles();
	     
	     Iterator<String> it=handler.iterator();  //iterator=to get/fetch the value from Set object
	     //for ex. Array, arraylist- we use for loop
	     String parentWindowId=it.next();
	     System.out.println("parent window id" +parentWindowId);
	     
	     String childWindowId=it.next();
	     System.out.println("Child Window Id" +childWindowId);
	     
	     driver.switchTo().window(childWindowId);
	     Thread.sleep(2000);
	     System.out.println("child window popup title" +driver.getTitle());
	     
	     driver.close();//driver.quit()-it close all windows
	     driver.switchTo().window(parentWindowId);
	     Thread.sleep(2000);
	     System.out.println("parent window title" +driver.getTitle());
	     
	}

}

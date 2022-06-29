package Selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementOperation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\BrowserDriver\\\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	
	     //driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html"); //for right click
	     driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html"); //for drag and drop
	     driver.manage().window().maximize();
	     
	     WebElement rome=driver.findElement(By.id("box6"));
	     WebElement italy=driver.findElement(By.id("box106"));
	     
	     Actions act=new Actions(driver);
	     
	     //to perform right click by mouse
	     //act.contextClick(button).build().perform();
	
	     //to perform drag and drop
	     act.dragAndDrop(rome, italy).perform();
	}
		
}

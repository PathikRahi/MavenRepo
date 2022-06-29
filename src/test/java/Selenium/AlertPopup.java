package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\BrowserDriver\\\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	     driver.manage().window().maximize();

	     driver.findElement(By.name("proceed")).click();//click on go button
	     
	     Thread.sleep(5000);
	     
	     Alert alert=driver.switchTo().alert();//switch to alert text window
	     alert.getText();
	     System.out.println(alert.getText());
	     String text= alert.getText();
	     
	     if(text.equals("Please enter a valid user name")) {
	    	 System.out.println("Correct alert msg");
	     }
	     else
	     {System.out.println("Incorrect alert msg");
	     }
	     alert.accept() ;//click on ok button
	     //alert.dismiss();//click on dismiss
	     
	
	}

}

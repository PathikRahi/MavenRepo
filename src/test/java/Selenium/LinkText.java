package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\BrowserDriver\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("http://www.mercury-tours.com/Contact_Us.html");
		
		driver.findElement(By.linkText("Home")).click();
		//System.out.println(b1);
		driver.findElement(By.linkText("Our Coaches")).click();
		driver.findElement(By.xpath("//*[@id=\"Pic_Bar_Van\"]/a[1]/img")).click();
		driver.quit();
		
	}

}

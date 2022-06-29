package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUplodPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\BrowserDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("\"C:\\Users\\pathi\\OneDrive\\Desktop\\Dose_Admin_Pathik_Patel_1.pdf\"");

	}

}

package TestNgListener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\BrowserDriver\\\\chromedriver.exe");
	     driver= new ChromeDriver();
	     driver.get("https://www.google.com/");
	}
	
	public void failed() {
		File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File DestFile=new File("C:\\Users\\pathi\\Downloads\\abcd\\dsfd.jpg");
        try {
			FileUtils.copyFile(scrFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
   
package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		//how to read properties file?
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\pathi\\eclipse-workspace\\"
				+ "myMavenProject\\src\\test\\java\\TestNG\\config.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\\\BrowserDriver\\\\chromedriver.exe");
		     driver= new ChromeDriver();
		}
		else if(browserName.equals("FF"))
		{
			driver=new FirefoxDriver();
			
		}
		else if(browserName.equals("Safari")) {
			driver=new SafariDriver();
		}
		else {
			System.out.println("no browser value is given");
		}
		//driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[1]/a")).click();		driver.get(prop.getProperty("url"));
		driver.findElement(By.name("email")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();	}

}

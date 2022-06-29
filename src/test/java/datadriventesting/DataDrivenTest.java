package datadriventesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\BrowserDriver\\\\chromedriver.exe");
	     driver= new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
		
	}

	@Test(dataProvider="LoginData")
	public void loginTest(String user, String pwd, String exp) {
		//System.out.println(user +pwd+exp);
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement txtEmail=driver.findElement(By.id("Email"));
		txtEmail.clear();
		txtEmail.sendKeys(user);
		
		WebElement txtPassword=driver.findElement(By.id("Password"));
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		String exp_Title="Dashboard / nopCommerce administration";
		String act_Title=driver.getTitle();
		
		if(exp.equals("valid")) {
			if(exp_Title.equals(act_Title)) {
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
			
		}
		else if(exp.equals("invalid")){
			if(exp_Title.equals(act_Title)) {
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		}
	
	
	
	
	}
	@DataProvider(name="LoginData")
	public String[][] getData() {
		String loginData[][]= {
				{"admin@yourstore.com","admin","valid"},
				{"admin@yourstore.com","adm","invalid"},
				{"adm@yourstore.com","admin","invalid"},
		};
		return loginData;
		
	}
	@AfterClass
	void tearDown() {
		driver.close();
	}
	
	
	
	
	
	
}

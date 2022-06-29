package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\BrowserDriver\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/newtours/");
		 List<WebElement> links = driver.findElements(By.tagName("a"));
	      System.out.println("The number of links is " + links.size());
	      
	      for (int i=0; i<links.size();i++) {
	    	  //by using href attribute we can get URL of required link
	    	  WebElement element=links.get(i);
	    	  String url=element.getAttribute("href");
	    	  
	    	  URL link=new URL(url);
	    	  
	    	  //create a connection using url object 'link'
	    	  HttpURLConnection httpConn=(HttpURLConnection) link.openConnection();
	    	  Thread.sleep(2000);
	    	  httpConn.connect();
	    	  
	    	  int rescode=httpConn.getResponseCode();
	    	  
	    	  if(rescode>=400)
	    	  {
	    		  System.out.println(url +"-" + "is broken link");
	    	  }
	    	  else
	    	  {
	    		  System.out.println(url +"-" + "is valid link");
	    	  }
	    	  
	      }
	}

}

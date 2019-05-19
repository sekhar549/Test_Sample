package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	
	public static WebDriver openWebpage(WebDriver driver, String browsername, String url){
		
		switch(browsername){
		
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\browserdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			return driver;
			
			
		case "IE":
			System.setProperty("webdriver.ie.driver", ".\\src\\test\\resources\\browserdrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(url);
			return driver;
			
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", ".\\src\\test\\resources\\browserdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			return driver;
			
		default:
			return null;
			
			
			
		}
	}

}

package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	public static WebDriver driver;
	
	public Properties prop;
	
	public WebDriver init_Browser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.chromedriver().setup();
			
			driver=new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("ie")) {
			
			WebDriverManager.iedriver().setup();
			
			driver=new InternetExplorerDriver();
		}
		
		else if(browserName.equalsIgnoreCase("safari")) {
			
			WebDriverManager.safaridriver().setup();
			
			driver=new SafariDriver();
		}
		
		else {
			
			System.out.println("please select correct browser");
		}
		
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public Properties init_Properties() {
		
		String path="C:\\Users\\LENOVO\\eclipse-workspace\\PomSeries\\src\\main\\java\\configproperties\\config.properties";
		
		prop=new Properties();
		
		try {
			
			FileInputStream fi=new FileInputStream(path);
			
			prop.load(fi);
		}
		
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return prop;
		
	}

}

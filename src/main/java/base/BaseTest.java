package base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.EditHomePage;
import pages.HomePage;
import pages.ManagerHomePage;
import pages.NewCustomerPage;

public class BaseTest {
	
	public WebDriver driver;
	
	public BasePage base;
	
	public Properties prop;
	
	public HomePage home;
	
	public ManagerHomePage managerhome;
	
	public NewCustomerPage newcustomer;
	
	public EditHomePage editCustomer;
	
	@BeforeMethod
	public void setup() {
		
		base= new BasePage();
		
		prop=base.init_Properties();
		
		driver=base.init_Browser(prop.getProperty("browser"));
		
		home=new HomePage(driver);
		
		managerhome=new ManagerHomePage(driver);
		
		newcustomer=new NewCustomerPage(driver);
		
		editCustomer=new EditHomePage(driver);
		
		driver.get(prop.getProperty("url"));	
		
		
		
	}
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.quit();
	}
	

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import utilities.Constants;
import utilities.ElementUtilities;

public class NewCustomerPage extends BasePage {
	
	WebDriver driver;
	
	ElementUtilities utils;
	
	public NewCustomerPage(WebDriver driver) {
		
		this.driver=driver;
		
		utils=new ElementUtilities(driver);
	}
	
	By CustomerName=By.name("name");
	
	By GenderMale=By.xpath("//input[@value='m']");
	
	By GenderFemale=By.xpath("//input[@value='f']");
	
	By DOB=By.id("dob");
	
	By Addr=By.name("addr");
	
	By City=By.name("city");
	
	By State=By.name("state");
	
	By Pin=By.name("pinno");
	
	By PhNum=By.name("telephoneno");
	
	By Email=By.name("emailid");
	
	By Pwd=By.name("password");
	
	By Submit=By.name("sub");
	
	By Reset=By.name("res");
	
	
	
	public String getNewCustomerPageTitle() {
		
		utils.doNavigatePage(Constants.NewCustomerPageURL);
		
		return utils.dogetTitle();
	}
	
	public void doNewCustomerRegistration(String name, String gender, String dob, 
			String Address, String city, String state, String pincode, String mobilenum, String email, 
			String password) {
		
		utils.doNavigatePage(Constants.NewCustomerPageURL);
		
		utils.doSendkeys(CustomerName, name);
		
		if(gender.equalsIgnoreCase("male")) {
			
			utils.doClick(GenderMale);
		}
		
		else {
			
			utils.doClick(GenderFemale);
		}
		
		utils.doSendkeys(DOB, dob);
		
		utils.doSendkeys(Addr, Address);
		
		utils.doSendkeys(City, city);
		
		utils.doSendkeys(State, state);
		
		utils.doSendkeys(Pin, pincode);
		
		utils.doSendkeys(PhNum, mobilenum);
		
		utils.doSendkeys(Email, email);
		
		utils.doSendkeys(Pwd, password);
		
		utils.doClick(Submit);
	}

}

package testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.Constants;
import utilities.ExcelUtilities;

public class NewCustomerTest extends BaseTest {
	
	@DataProvider
	public Object[][] getTextData() {
		
		 Object[][] Testdata= ExcelUtilities.getTextData("Sheet1");
		 
		 return Testdata;
	}
	
	@Test 
	public void validateNewCustomerPageTitle() {
		
		home.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		String title= newcustomer.getNewCustomerPageTitle();
		
		Assert.assertEquals(title, Constants.NewCustomerPageTitle);
	}
	
	@Test(dataProvider = "getTextData")
	public void validateNewCustomerRegistrationTest(String Name, String Gender, String DOB, 
			String Address, String City, String State, String Pincode, String Telephone,
			String Email, String Pwd) {
		
		home.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		newcustomer.doNewCustomerRegistration(Name, Gender, DOB, Address, City, State, Pincode, Telephone,
				Email, Pwd);
		
		
		
		
	}

}

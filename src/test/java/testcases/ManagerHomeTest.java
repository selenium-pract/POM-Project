package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.Constants;

public class ManagerHomeTest extends BaseTest {
	
	@Test
	public void validatePageHeaderTest() {
		
		home.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		Assert.assertTrue(managerhome.headerDisplay());
	}
	
	@Test
	public void validateManagerId() {
		
		home.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		String id= managerhome.getManagerId();
		
		Assert.assertTrue(id.contains(Constants.ManagerId));
	}
	
	@Test
	public void validateNewCustomerIsDisplayTest() {
		
		home.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		Assert.assertTrue(managerhome.newCustomerIsDiaplay());
	}

}

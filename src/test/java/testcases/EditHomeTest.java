package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import bsh.org.objectweb.asm.Constants;

public class EditHomeTest extends BaseTest {
	
	@Test
	public void validatePageTitle() {
		
		home.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		String heading=editCustomer.getEditCustomerPageTitle();	
		
		Assert.assertEquals(heading, utilities.Constants.EditNewCustomerPageTitle);
		
		
	}

}

package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ManagerHomePage;
import utilities.Constants;

public class HomeTest extends BaseTest {
	
	@Test
	public void verifyLoginPageTitleTest() {
		
		String title=home.getLoginPageTitle();
		
		Assert.assertEquals(title, Constants.LoginPageTitle);
	}
	
	
	@Test
	public void verifyLoginPageHeader() {
		
		Assert.assertTrue(home.loginPageHeaderIsDisplay());
	}
	
	@Test
	public void verifyBasicElementsTest() {
		
		Assert.assertTrue(home.basicElementsIsDisplay());
	}
	
	@Test
	public void verifyLoginWithValidCrendentials() {
		
		home.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		String title=managerhome.getManagerHomePageTitle();
		
		Assert.assertEquals(title, Constants.ManagerHomePageTitle);
	}
	
	
	
	

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import utilities.ElementUtilities;

public class HomePage extends BasePage {
	
	WebDriver driver;
	
	ElementUtilities utils;
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		
		utils=new ElementUtilities(driver); 
	}
	
	By header=By.xpath("//h2[@class='barone']");
	
	By UserId=By.xpath("//input[@name='uid']");
	
	By Password=By.xpath("//input[@name='password']");
	
	By Loginbtn=By.xpath("//input[@name='btnLogin']");
	
	By Resetbtn=By.xpath("//input[@name='btnReset']");
	
	public String getLoginPageTitle() {
		
		return utils.dogetTitle();
	}
	
	public boolean loginPageHeaderIsDisplay() {
		
		return utils.doIsDisplay(header);
		
	}
	
	public boolean basicElementsIsDisplay() {
		
		utils.doIsDisplay(Loginbtn);
		
		utils.doIsDisplay(Password);
		
		utils.doIsDisplay(Resetbtn);
		
		return utils.doIsDisplay(UserId);
	}
	
	public ManagerHomePage doLogin(String username, String password) {
		
		utils.doSendkeys(UserId, username);
		
		utils.doSendkeys(Password, password);
		
		utils.doClick(Loginbtn);
		
		return new ManagerHomePage(driver);
	}

}

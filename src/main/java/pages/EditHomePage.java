package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import utilities.ElementUtilities;

public class EditHomePage extends BasePage {
	
	WebDriver driver;
	
	ElementUtilities utils;
	
	public EditHomePage(WebDriver driver) {
		
		this.driver=driver;
		
		utils=new ElementUtilities(driver);
	}
	
	By pageHeader=By.xpath("//p[@class='heading3']");
	
	By custIdTextBox=By.xpath("//input[@name='cusid']");
	
	By submit=By.xpath("//input[@type='submit']");
	
	By reset=By.xpath("//input[@name='res']");
	
	public String getEditCustomerPageTitle() {
		
		return utils.dogetTitle();
	}
	
	public boolean pageHeaderIsDisplay() {
		
		return utils.doIsDisplay(pageHeader);
	}
	
	public boolean verifyBasicElementsDisplay() {
		
		utils.doIsDisplay(custIdTextBox);
		
		utils.doIsDisplay(submit);
		
		return utils.doIsDisplay(reset);
	}

}

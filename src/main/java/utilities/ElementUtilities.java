package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.xml.sax.Locator;

public class ElementUtilities {
	
	WebDriver driver;
	
	public ElementUtilities(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public WebElement getWebElement(By Locator) {
		
		WebElement element= driver.findElement(Locator);
		
		return element;		
	}
	
	public void doClick(By Locator) {
		
		getWebElement(Locator).click();
	}
	
	public void doSendkeys(By Locator, String value) {
		
		getWebElement(Locator).sendKeys(value);
	}
	
	public String dogetTitle() {
		
		return driver.getTitle();
	}
	
	public boolean doIsDisplay(By Locator) {
		
		return getWebElement(Locator).isDisplayed();
		
	}
	
	public String doGetText(By Locator) {
		
		return getWebElement(Locator).getText();
	}
	
	public void doNavigatePage(String URL) {
		
		driver.navigate().to(URL);
		
		
	}


}

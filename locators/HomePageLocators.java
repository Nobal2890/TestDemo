package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	@FindBy(xpath="//input[@placeholder='First']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@placeholder='Last']")
	public WebElement lastName;

}

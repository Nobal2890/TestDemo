package actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.HomePageLocators;
import test.BaseClass;
import utilities.VisibilityOfElement;

public class HomePageActions {
	
	WebDriver driver;
	
	HomePageLocators homePageLocators=null;
	
	public HomePageActions() {
		homePageLocators = new HomePageLocators();
		PageFactory.initElements(BaseClass.getDriver(), homePageLocators);
		
	}
	
	public void provideInfo() throws InterruptedException {
		VisibilityOfElement.visibilityOfEle(homePageLocators.firstName);
		
		homePageLocators.firstName.clear();
		homePageLocators.firstName.sendKeys("Nobal");
		VisibilityOfElement.visibilityOfEle(homePageLocators.firstName);
		homePageLocators.lastName.clear();
		homePageLocators.lastName.sendKeys("Ahmed");
		
	}

	
	
		
	}



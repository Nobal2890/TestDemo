package test;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import actions.HomePageActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Propertie;

public class BaseClass {
	
	public static WebDriver driver;
	
	 public static HomePageActions homePageActions;
	
	 
	 public static HomePageActions homePageObject() {
		 return new HomePageActions();
	 }
	
	
	@BeforeSuite(alwaysRun=true)
	//@Parameters("baseUrl") // This @Parameters also used to pass parameterization from testng.xml file
	// Also have to use Parameter in method declaration Example : launchBrowser(String baseUrl)
	public void launchBrowser() throws IOException {
		//Below line is used to achieve parameterization using Properties file 
		String url =Propertie.propertiesFile(Propertie.filePath).getProperty("baseUrl").toString();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get(url);
		BaseClass.homePageActions= BaseClass.homePageObject();
	}
	
	@AfterSuite(alwaysRun=true)
	public void closeBrowser() {
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		return BaseClass.driver;
	}


}

package utilities;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.BaseClass;

public class VisibilityOfElement {
	
	public static void visibilityOfEle(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}

}

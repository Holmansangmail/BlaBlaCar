package MyOrganization.MyProject.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import MyOrganization.MyProject.Tests.LoginTests;
import Utils.Waits;

public class Cookies {
	
	static String cookieLocator = "didomi-notice-agree-button";
	
	public static void AcceptCookies() {
		Waits.IdExplicitWait(cookieLocator);
    	WebElement acceptCookies = LoginTests.driver.findElement(By.id(cookieLocator));
    	acceptCookies.click();
    }

}

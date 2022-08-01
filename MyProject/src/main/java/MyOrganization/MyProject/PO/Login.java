package MyOrganization.MyProject.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import MyOrganization.MyProject.Inputs.Dataset;
import MyOrganization.MyProject.Tests.LoginTests;
import Utils.Waits;

public class Login {

	static String userLocator = "login";
	static String passwordLocator = "password";
	static String loginLocator = "//*[@id='MainContent']/div/div/div/div/div/div/div/div/div/div/div/div/form/div[2]/div/button/span";
	static String continueEmailLocator = "//*[@id='MainContent']/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/nav/ul/li[2]/a/span[1]/span/span";
	
	public static void PerformLogin() {
		Waits.NameExplicitWait(userLocator);
		WebElement user = LoginTests.driver.findElement(By.name(userLocator));
    	WebElement password = LoginTests.driver.findElement(By.name(passwordLocator));
    	WebElement login = LoginTests.driver.findElement(By.xpath(loginLocator));
    	
    	String userValue = Dataset.user;
    	String passwordValue = Dataset.password;
    	
    	user.sendKeys(userValue);
    	password.sendKeys(passwordValue);
    	login.click();
    }
	
	public static void ContinueEmail() {
		Waits.XPathExplicitWait(continueEmailLocator);
    	WebElement continueEmail = LoginTests.driver.findElement(By.xpath(continueEmailLocator));
    	continueEmail.click();
    }
	
}

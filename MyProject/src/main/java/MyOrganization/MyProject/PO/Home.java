package MyOrganization.MyProject.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import MyOrganization.MyProject.Tests.LoginTests;
import Utils.Waits;

public class Home {
	
	static String expandLoginLocator = "//*[@id='root']/header/div/div[3]/div/button/div";
	static String openLoginLocator = "//*[@id='connect-menu']/ul/li[1]/a/span[1]/span/span";
	
    public static void OpenLogin() {  	
    	Waits.XPathExplicitWait(expandLoginLocator);
    	WebElement expandLogin = LoginTests.driver.findElement(By.xpath(expandLoginLocator));
    	expandLogin.click();
    	
    	Waits.XPathExplicitWait(openLoginLocator);
        WebElement openLogin = LoginTests.driver.findElement(By.xpath(openLoginLocator));
    	openLogin.click();
    }
}

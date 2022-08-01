package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import MyOrganization.MyProject.Tests.LoginTests;

public class Waits {

	public static void IdExplicitWait(String locator){
		LoginTests.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
	}
	
	public static void NameExplicitWait(String locator){
		LoginTests.wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locator)));
	}
	
	public static void XPathExplicitWait(String locator){
		LoginTests.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}
	
}

package MyOrganization.MyProject.Asserts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import MyOrganization.MyProject.Inputs.Dataset;
import MyOrganization.MyProject.Tests.LoginTests;
import Utils.Waits;

public class LoginAssertion {
	
	static String errorMessageLocator = "/html/body/div[3]/div/div/span/span";
	
	public static void ValidateErrorMessage() {
		Waits.XPathExplicitWait(errorMessageLocator);
		WebElement errorMessage = LoginTests.driver.findElement(By.xpath(errorMessageLocator));
		String obtainedMessage = errorMessage.getText();
		String expectedMessage = Dataset.expected_message;
		
    	Assert.assertEquals(obtainedMessage, expectedMessage);
    }

}

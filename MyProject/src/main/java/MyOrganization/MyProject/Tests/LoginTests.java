package MyOrganization.MyProject.Tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import MyOrganization.MyProject.Asserts.LoginAssertion;
import MyOrganization.MyProject.Inputs.Dataset;
import MyOrganization.MyProject.PO.Cookies;
import MyOrganization.MyProject.PO.Home;
import MyOrganization.MyProject.PO.Login;

import java.time.Duration;

public class LoginTests {
	
	public static WebDriver driver;
	public static WebDriverWait wait;

    @Test
    public void InvalidUser() {

    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        String url = Dataset.url;
        driver.get(url);
        Cookies.AcceptCookies();
        Home.OpenLogin();
        Login.ContinueEmail();
        Login.PerformLogin();
        LoginAssertion.ValidateErrorMessage();
        
        driver.quit();
    }
}

package stepDefination;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import pageObjects.PageFactoryLogin;

public class FacebookLogin {

	@Given("^Enter username and password$")
	public void Enter_username_and_password(DataTable dealData) throws Throwable {
		
		for (Map<String, String> data:dealData.asMaps(String.class, String.class)) {
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.facebook.com/");
		PageFactoryLogin LoginPageObj = PageFactory.initElements(driver, PageFactoryLogin.class);
		LoginPageObj.loginpage(data.get("username"), data.get("password"));
		BrowserFactory.tearDown();
	}

}
}
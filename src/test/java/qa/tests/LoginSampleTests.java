package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class LoginSampleTests extends BaseTest{
	
	
	ElementFetch ele =new ElementFetch();
	HomePageEvents homePage =new HomePageEvents();
	LoginPageEvents loginPage=new LoginPageEvents();
	
	@Test
	public void enterLoginCredentials() {
		logger.info("sign into crm");
		homePage.logInButton();
		logger.info("verify login text is present");
		loginPage.verifyIfLoginPageIsLoaded();
		logger.info("enter login credentials");
		loginPage.enterCredentials();
	
		
	}

}

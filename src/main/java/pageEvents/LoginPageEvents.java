package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {

	ElementFetch ele = new ElementFetch();

	public void verifyIfLoginPageIsLoaded() {

		Assert.assertTrue(ele.getAllWebElement("XPATH", LoginPageElements.loginText).size() < 0, "Element not present");

	}

	public void enterCredentials() {

		ele.getWebElement("NAME", LoginPageElements.emailTxtBox).sendKeys("sijaanu2010@gmail.com");
		ele.getWebElement("NAME", LoginPageElements.passwordTxtBox).sendKeys("sijaanu12010");

	}

}

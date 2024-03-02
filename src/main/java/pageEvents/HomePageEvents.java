package pageEvents;

import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents {
	
ElementFetch ele =new ElementFetch();
	
	public void logInButton() {
		
		ele.getWebElement("XPATH", HomePageElements.loginBtnElement).click();
	}

}

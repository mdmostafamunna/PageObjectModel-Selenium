package testCase;

import org.testng.annotations.Test;

import pages.DriverSetup;
import pages.LoginPage;

public class VerifyLogin extends DriverSetup {
	
	@Test
	public void verifiedLogin() {
		driver.get(baseUrl);
		LoginPage login = new LoginPage();
		
		login.emailLocator("superadmin@gmail.com");
		login.passowrdLocator("superadmin");
		login.clickLoginBtnLocator();
		
		//login with one method from LoginPage
//		login.loginToEasyAsk("superadmin@gmail.com", "superadmin");
		
	}
	

}

package testCase;

import org.testng.annotations.Test;

import pages.DriverSetup;
import pages.LoginPage;

public class InvalidLogin extends DriverSetup {
	
	@Test
	public void invalidLogin() {
		
		driver.get(baseUrl);
		LoginPage login = new LoginPage();
		
		login.emailLocator("munna.mediusware@gmail.com");
		login.passowrdLocator("332211");
		login.clickLoginBtnLocator();
	}
	
	

}

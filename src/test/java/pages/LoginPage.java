package pages;

import org.openqa.selenium.By;


public class LoginPage extends DriverSetup{
	
	
	// elements in login page
	By email = By.id("email");
	By password = By.id("password");
	By loginBtn = By.xpath("/html/body/div/div/div/div[1]/div/form/div[4]/div/button");
	
	
	
	
//	// login module in one method
//	public void loginToEasyAsk(String sendEmail, String sendPassword)
//	{
//		driver.findElement(email).sendKeys(sendEmail);
//		driver.findElement(password).sendKeys(sendPassword);
//		driver.findElement(loginBtn).click();
//		
//	}

	
	
	
	// login module in separated method.
	public void emailLocator(String sendEmail)
	{
		driver.findElement(email).sendKeys(sendEmail);
	}
	
	public void passowrdLocator(String sendPassword)
	{
		driver.findElement(password).sendKeys(sendPassword);
	}
	
	
	public void clickLoginBtnLocator()
	{
		driver.findElement(loginBtn).click();
	}
	
	
	

}

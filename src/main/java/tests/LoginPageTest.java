package tests;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.built.io.automationframework.BaseTest;
import com.built.io.automationframework.MailingReports;
import com.relevantcodes.extentreports.LogStatus;

import page.actions.LoginPageActions;




public class LoginPageTest extends LoginPageActions {


	/*@Test(priority = 1, groups = "LoginPage", description = "login contentstack")
	public void verifyLoginPage()  {
		
		verifyLoginPageAction();
		
	}
*/
	@Parameters({ "username", "password" })
	@Test(priority = 2, groups = "LoginPage", description = "login contentstack")
	public void loginContentstack(String username,String password ) throws AddressException, MessagingException {
		
		//MailingReports.mailReport();
		login(username, password);
	}
	
	
	
}

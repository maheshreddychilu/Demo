package page.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import page.objects.LoginPageObjects;
import page.objects.UsersObjects;

import com.built.io.automationframework.BasePageActions;
import com.built.io.automationframework.Reports;

public class LoginPageActions extends BasePageActions {


	public static void login(String usernameValue, String passwordValue) {
	
		System.out.println(LoginPageObjects.username);
		sendkeys(LoginPageObjects.username, usernameValue, "Enter username", "tc-1");
		sendkeys(LoginPageObjects.password, passwordValue, "Enter password", "tc-2");
		click(LoginPageObjects.signin, "click on signin button", "tc-3");
	}
	
   public static void Logout() {
		
		verifyText(UsersObjects.identifyCurrentUser, "Abhinav K", "verify text is present or not", "image114");
		click(UsersObjects.identifyCurrentUser, "click on Current user", "image115");
		verifyText(UsersObjects.currentUserSignOut, "Sign Out", "verify text is present or not", "image116");
		click(UsersObjects.currentUserSignOut, "click on Sign out button", "image117");
		
		
	
   }
   
   
   public static void verifyLoginPageAction() {
		
		verifyText(LoginPageObjects.learnMore, "LEARN MORE", "verify learn more text", "image114");
		click(LoginPageObjects.learnMore, "click on learn more link", "tc-3");
		//learn more link
		getWindowhandles(LoginPageObjects.learnMore ,"https://www.built.io/products/contentstack/overview","https://stag-manage.contentstack.io/#!/login") ;
		
	/*	click(LoginPageObjects.signUp, "click on singn up link", "21");
		verifyCurrentUrl("https://stag-manage.contentstack.io/#!/sign-up","verify control successfully  navigated signup page or not" ,"23") ;
 
		
		//terms and condition
		getWindowhandles(LoginPageObjects.termAndCondition ,"https://www.built.io/terms-of-service","https://stag-manage.contentstack.io/#!/sign-up") ;
		
		//privicy policy
		getWindowhandles(LoginPageObjects.privacy ,"https://www.built.io/privacy-policy","https://stag-manage.contentstack.io/#!/sign-up") ;
		
		click(LoginPageObjects.signin, "click on singnin  link", "21");*/
   }
   
   
   
}
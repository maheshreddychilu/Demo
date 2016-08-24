package page.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.built.io.automationframework.BasePageActions;

import data.VerificationData;
import page.objects.AssetObjects;
import page.objects.DashboardObjects;
import page.objects.LoginPageObjects;
import page.objects.RolesObjects;
import page.objects.SettingsPageObjects;
import page.objects.UsersObjects;

public class SettingPageActions extends BasePageActions {

	public static void verifySettingMenuActions()  {
		
		mousehover(SettingsPageObjects.settingsMenu,
				"mouse hover on setting menu", "hs-1");
		verifyText(SettingsPageObjects.stackLink,
				VerificationData.Header.stack, "verify stack link text", "hs-2");
		verifyText(SettingsPageObjects.environmentsLink,
				VerificationData.Header.environment,
				"verify environment link text", "hs-3");
		verifyText(SettingsPageObjects.languagesLink,
				VerificationData.Header.languages,
				"verify languages link text", "hs-4");
		verifyText(SettingsPageObjects.usersLink,
				VerificationData.Header.users, "verify users link text", "hs-5");
		verifyText(SettingsPageObjects.rolesLink,
				VerificationData.Header.roles, "verify roles link text", "hs-6");
		verifyText(SettingsPageObjects.webhookLink,
				VerificationData.Header.webhook, "verify webhook link text",
				"hs-7");
	}

	// Stacks

	public static void clickOnStackTab()  {

		mousehover(SettingsPageObjects.settingsMenu,
				"mouse hover on setting menu", "hs-1");
		click(SettingsPageObjects.stackLink, "click on aclick on stacks link",
				"Al-1");

	}

	public static void verifyDefaultStackPageActions()  {

		verifyText(SettingsPageObjects.stackHeading,
				VerificationData.Stack.stack,
				"verify heading of stack name text", "s-1");
		verifyText(SettingsPageObjects.general, VerificationData.Stack.general,
				"verify general heading text", "s-2");
		valueOfIputbox(SettingsPageObjects.stackName,
				xlsUtil.readCell(1, xlsUtil.getCell("sitename")),
				"verify site name", "s-3");
		valueOfIputbox(SettingsPageObjects.stakDescription,
				xlsUtil.readCell(1, xlsUtil.getCell("site.description")),
				"verify site description", "s-4");

		valueOfIputbox(SettingsPageObjects.adminEmail,
				VerificationData.Stack.adminEmail, "verify email of admin",
				"s-5");

		verifyText(SettingsPageObjects.save, VerificationData.Stack.save,
				"verify text of save button", "s-6");

		verifyText(SettingsPageObjects.deleteStack,
				VerificationData.Stack.delete,
				"verify text of delete stack button", "s-7");

		verifyText(SettingsPageObjects.transferOwnership,
				VerificationData.Stack.transferOwner,
				"verify text of transfer ownership button text", "s-8");

	}

	public static void updateStackActions(String stackName,
			String roleDescription)  {

		mousehover(SettingsPageObjects.settingsMenu,
				"mouse hover on setting menu", "hs-1");

		click(SettingsPageObjects.stackLink, "clickstack option", "Es-1");

		clear(SettingsPageObjects.stackName, "remove the name of stack", "Es-2");

		//waitForSometime(3000) ;
		sendkeys(SettingsPageObjects.stackName, stackName,
				"enter new name of the stack", "es-3");

		clear(SettingsPageObjects.stakDescription,
				"remove the Description of stack", "Es-2");

		sendkeys(SettingsPageObjects.stakDescription, roleDescription,
				"enter new Description of stack ", "ed-7");

		click(SettingsPageObjects.save, "click on save button", "es-2");
		//verifyTextByindex(SettingsPageObjects.successMessage,
		//		VerificationData.Stack.siteUpdateuccessMessage,
		//		"verify role successfully added or not ", "ed-6");

	}

	public static void deleteStackActions()  {

		   waitForSometime(1000) ;
		mousehover(SettingsPageObjects.settingsMenu,
				"mouse hover on setting menu", "hs-1");
		waitForSometime(1000) ;
      waitForSometime(1000) ;
		click(SettingsPageObjects.stackLink, "clickstack option", "Es-1");

		click(SettingsPageObjects.deleteStack, "click on delete button", "es-2");

		click(SettingsPageObjects.deleteOnwarningbox, "click on delete button",
				"es-2");

	}

	// Languages Actions
	public static void clickOnLanguageTab()  {

		   waitForSometime(1000) ;	
		mousehover(SettingsPageObjects.settingsMenu,
				"mouse hover on setting menu", "hs-1");
		click(SettingsPageObjects.languagesLink,
				"click on add new language button", "Al-1");

	}

	public static void verifyDefaultLanguageActions()  {

		verifyText(SettingsPageObjects.languageTextOnDefaultPage,
				VerificationData.Setting.defaultLanguageText,
				"verify language name text", "dl-1");
		verifyText(SettingsPageObjects.defualtLangName,
				VerificationData.Setting.defaultLanguage,
				"verify defaultLanguage text", "dl-2");
		verifyText(SettingsPageObjects.code,
				VerificationData.Setting.languageCode,
				"verify languageCode text", "dl-3");
		verifyText(SettingsPageObjects.defaultLanguagecode,
				VerificationData.Setting.defaultLanguageCode,
				"verify defaultLanguageCode text", "dl-4");
	}

	public static void addNewLanguage(String langugeName)  {

		  waitForSometime(3000) ;
		click(SettingsPageObjects.add, "click on add new language button",
				"Al-1");
		click(SettingsPageObjects.languageName,
				"click on language list dropdown", "Al-2");
		sendkeys(
				SettingsPageObjects.searchlanguage,
				langugeName,
				"enter language name in search input box which you want to search",
				"al-3");
		click(SettingsPageObjects.selectLanguage,
				"click on language list dropdown", "Al-4");
		click(SettingsPageObjects.addLanguage, "click on add button", "Al-4");
		verifyTextByindex(SettingsPageObjects.successMessage,
				VerificationData.Setting.lunguageAddsuccessMessage,
				"verify langauage successfully added or not ", "al-5");
	}

	public static void searchLanguageActions(String value)  {

		// jsForEnableElemenet(SettingsPageObjects.searchAllLanguages,"eneble seacrh iputbox by using js")
		// ;
				//  waitForSometime(2000);
		sendkeys(SettingsPageObjects.searchAllLanguages, value,
				"Enter asset name which you want to search", "a111");
		keys(SettingsPageObjects.searchAllLanguages, "press enter key", "a125");
		verifyText(SettingsPageObjects.searchedLanguage, "English (Australia)",
				"verify searched asset display or not", "tc-2.4");
		click(SettingsPageObjects.searchCloseButton,
				"click on close button of search", "a124");

	}

	public static void deleteLanguageActions()  {

		mousehover(SettingsPageObjects.addedLanguges,
				"mouse hover on language which you want to delete", "dl-1");
		click(SettingsPageObjects.ellipsisOflan,
				"click on ellipsis of language which you want to delete", "dl2");
		clickByindex(SettingsPageObjects.deletelan1,2, "click on delete link", "dl3");
		click(SettingsPageObjects.deleteButtonOfWarningDailogboxforlang,
				"click on yes button", "d3");
	   waitForSometime(1000);
	   
	   
		verifyTextByindex(SettingsPageObjects.successMessage,
				VerificationData.Setting.lunguagedeletedsuccessMessage,
				"verify delete language suuccess message", "d4");
	
	}

	// Roles


	public static void addNewUser() {
		
		click(UsersObjects.addNewUserButton, "click on add new user button", "image24");
		verifyText(UsersObjects.inviteUserText, "Invite User", "verify the text Invite User", "image25");
		verifyText(UsersObjects.emailText, "Email*", "verify Email text", "image26"); 
		click(UsersObjects.emailTextField, "click on text field", "image28");
		verifyText(UsersObjects.emailMessageText, "Please enter email(s)", "verify the alert text for email", "image28");
		sendkeys(UsersObjects.emailField, "abhinav.bajpai@raweng.com", "enter email id", "image29");
		verifyText(UsersObjects.selectRolesText, "Roles*", "Verify text", "image30");
		click(UsersObjects.selectRole, "click on roles drop down", "image32");
	//	verifyText(UsersObjects.contentManagerCheckBox, "Content Manager", "Check whether the option is available or not", "image33");
		click(UsersObjects.newRole, "click on Contenmanager check box", "image34");
		verifyText(UsersObjects.messageText, "Message", "verify text is visible or not ", "image35");
		verifyText(UsersObjects.canceltext, "Cancel", "verify the text present or not", "image37");
		verifyText(UsersObjects.invite, "Invite", "verify text present or not", "image38");
		click(UsersObjects.invite, "Click on invite button", "image39");	
	}
	
	
	public static void currentUserLogout() {
		verifyText(UsersObjects.identifyCurrentUser, "Mahesh", "Identify current user", "image45");
		click(UsersObjects.identifyCurrentUser, "Click on current user settings", "image46");
		verifyText(UsersObjects.currentUserSignOut, "Sign Out", "Verify sign out link in current user", "image47");
		click(UsersObjects.currentUserSignOut, "Click on sign out button for current user", "image48");
	}
	
	public static void newUserLogin() {
		
		sendkeys(LoginPageObjects.username, "abhinav.bajpai@raweng.com", "Enter new username", "image49");
		sendkeys(LoginPageObjects.password, "test123", "Enter password", "image50");
		click(LoginPageObjects.signin, "click on signin button", "image51");
		click(LoginPageObjects.sinteName, "open shared site", "image51");
		elementIsPresent(LoginPageObjects.formICON, "verify create form icon", "image51");
		
	}
	

	// Enivironment
	
	public static void clickOnEnvironmentTab()  {

				 waitForSometime(3000);
		mousehover(SettingsPageObjects.settingsMenu,
				"mouse hover on setting menu", "e-1");
		waitForSometime(2000);
		click(SettingsPageObjects.environmentsLink,
				"click on Environment link", "E2");
		waitForSometime(500);
		
	}
	
	
	public static void addNewEnvironment(WebElement locator,String envName, String url)  {

		 waitForSometime(500);
		click(locator, "click on add new language button",
				"AE-1");
		sendkeys(SettingsPageObjects.envName,envName,"enter Environment name in name inputbox",
				"Ae-2");
		sendkeys(SettingsPageObjects.envUrl,url,"enter Environment name in name inputbox",
				"Ae-2");
		click(SettingsPageObjects.create,
				"click add button", "Al-4");
		verifyTextByindex(SettingsPageObjects.successMessage,VerificationData.Setting.envCreatedSuccessmsz,
				"verify environment successfully added or not ", "al-5");
	}
	
	
	public static void searchEnvActions(String value)  {

				
		sendkeys(SettingsPageObjects.seachEnv, value,
				"Enter environment name which you want to search", "es1");
		keys(SettingsPageObjects.seachEnv, "press enter key", "es2");
		verifyText(SettingsPageObjects.stagEnv, value,
				"verify searched asset display or not", "es2");
		click(SettingsPageObjects.searchCloseButton,
				"click on close button of search", "es3");

	}
	
	public static void deleteEnvActions()  {

		mousehover(SettingsPageObjects.prod,
				"mouse hover on enivironment which you want to delete", "dE-1");
		 waitForSometime(3000);
		click(SettingsPageObjects.ellipsisOfEnv,
				"click on ellipsis of enironment which you want to delete", "dEl2");
				 
				  click(SettingsPageObjects.deleteEnv1, "click on delete link", "dl3");
		
		click(SettingsPageObjects.deleteButtonOfWarningDailogbox,
				"click on yes button", "d3");
				 
		verifyTextByindex(SettingsPageObjects.successMessage,
				VerificationData.Setting.deleteMSz,
				"verify delete enivironment suuccess message", "dE4");
	}
	
	public static void updateEnivironmentActions(WebElement element, String enVName)
			 {

				  //waitForSometime(2000);
		click(SettingsPageObjects.stagEnv, "click enivironment which one you want to update", "Ed-1");
				//  waitForSometime(2000);
		clear(SettingsPageObjects.envName, "remove the old enivronment name", "Ed-2");
		sendkeys(SettingsPageObjects.envName, enVName,
				"enter new role name in rolename inputbox", "ed-3");
		click(SettingsPageObjects.create, "select create form option",
				"ed-4");
	
	}
	
	public static void createBlankEnv(WebElement locator,String envName)  {

		
		click(locator, "click on add new language button",
				"AE-1");
		sendkeys(SettingsPageObjects.envName,envName,"enter Environment name in name inputbox",
				"Ae-2");
		click(SettingsPageObjects.advced,"click add button", "Al-4");
		click(SettingsPageObjects.serversCheckBox,"click add button", "Al-4");
		click(SettingsPageObjects.create,
				"click add button", "Al-4");
	
		//verifyTextByindex(SettingsPageObjects.successMessage,VerificationData.Setting.envCreatedSuccessmsz,
		//		"verify environment successfully added or not ", "al-5");

	}


}

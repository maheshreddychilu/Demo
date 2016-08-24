package page.actions;

import org.openqa.selenium.WebElement;

import com.built.io.automationframework.BasePageActions;
import com.built.io.automationframework.ExcelUtils;

import data.VerificationData;
import page.objects.ContentObjects;
import page.objects.DashboardObjects;
import page.objects.HeaderAndFooterObjects;
import page.objects.LoginPageObjects;
import page.objects.SettingsPageObjects;
import page.objects.UsersObjects;

public class UsersActions extends BasePageActions{
	
	public static void initApp() {
		
		System.out.println("Hi");
		
				//  waitForSometime(2000);
		
		//click(UsersObjects.popup, "close the popup", "tc");
			//	  waitForSometime(2000);
		mousehover(UsersObjects.testingApp, "mousehover to the testing app", "tc-1");
		click(UsersObjects.openTestingApp, "Open testing ap", "tc-2");
		elementIsPresent(UsersObjects.headerSettingIcon, "verify the image beside setting in the header", "image1");
		verifyText(UsersObjects.headerSettingText, "SETTINGS", "Verify setting text in the header", "image2");
		mousehover(UsersObjects.headerSettingText, "Mouse hover to the drop down","image3");
	}
	
	public static void settingDropDown() {
		
		System.out.println("we r in " + "settingDropDown");
		verifyText(UsersObjects.stackDropdown, "Stack", "verify text present in the drop down", "image4");
		verifyText(UsersObjects.environmentDropdown, "Environments", "verify text present in the drop down", "image5");
		verifyText(UsersObjects.languagesDropdown, "Languages", "verify text present in the drop down", "image6");
		verifyText(UsersObjects.usersDropdown, "Users", "verify text present in the drop down", "image7");
		verifyText(UsersObjects.rolesDropdown, "Roles", "verify text present in the drop down", "image8");
		verifyText(UsersObjects.webhooksDropdown, "Webhooks", "verify text present in the drop down", "image9");
		
	}
	
	public static void usersBreadcrum() {
		
		waitForSometime(5000);
		mousehover(UsersObjects.settingsMenu, "click on user drop down", "image10");
		waitForSometime(1000);
		click(UsersObjects.usersLink, "click on user drop down", "image10");
		waitForSometime(1000);
		verifyText(UsersObjects.usersText, "Users", "verify text users in the user settings page", "image10");
	//	verifyText(UsersObjects.stacksTextBreadcrumb, "STACKS", "verify text present in the breadcrum", "image11");
		verifyText(UsersObjects.stacksTextBreadcrumb, "TEST SITE", "verify text present in the breadcrum", "image12");
		verifyText(UsersObjects.settingsTextBreadcrumb, "SETTINGS", "verify text present in the breadcrum", "image13");
		verifyText(UsersObjects.usersTextBreadcrumb, "USERS", "verify text present in the breadcrum", "image14");
		//elementIsPresent(UsersObjects.addNewUserButton, "verify add new button is present  or not", "image15");
	}
	
	public static void usersTable() {
		
		verifyText(UsersObjects.emailAddHeader, "EMAIL ADDRESS", "verify text", "image16");
		verifyText(UsersObjects.rolesHeader, "ROLES", "verify text", "image17");
		verifyText(UsersObjects.invitedByHeader, "INVITED BY", "verify text", "image18");
		verifyText(UsersObjects.statusHeader, "STATUS", "verify text", "image19");
		verifyText(UsersObjects.emailValue, "mahesh.chilumula@raweng.com", "verify email address", "image20");
		verifyText(UsersObjects.rolesValue, "Owner", "verify roles", "image21");
		verifyText(UsersObjects.statusValue, "Accepted", "verify status", "image22");
		
	}
	
public static void usersTable1() {
		
		verifyText(UsersObjects.emailAddHeader, "EMAIL ADDRESS", "verify text", "image16");
		verifyText(UsersObjects.rolesHeader, "ROLES", "verify text", "image17");
		verifyText(UsersObjects.invitedByHeader, "INVITED BY", "verify text", "image18");
		verifyText(UsersObjects.statusHeader, "STATUS", "verify text", "image19");
		//verifyText(UsersObjects.emailValue, "abhinav.bajpai@raweng.com", "verify email address", "image20");
		verifyText(UsersObjects.contentManager, "Content Manager", "verify roles", "image21");
		verifyText(UsersObjects.statusValue, "Accepted", "verify status", "image22");
		
	}
	/*
	 * User with Content manager access
	 */
	
	public static void addNewUser(WebElement locator,WebElement locator1,String description) {
	
		click(UsersObjects.addNewUserButton, "click on add new user button", "image24");
		verifyText(UsersObjects.inviteUserText, "Invite User", "verify the text Invite User", "image25");
		verifyText(UsersObjects.emailText, "Email*", "verify Email text", "image26"); 
		click(UsersObjects.emailTextField, "click on text field", "image28");
		sendkeys(UsersObjects.emailField, "abhinav.bajpai@raweng.com", "enter email id", "image29");
		verifyText(UsersObjects.selectRolesText, "Roles*", "Verify text", "image30");
		click(locator, "click on roles drop down", "image32");
		verifyText(UsersObjects.contentManagerCheckBox, "Content Manager", "Check whether the option is available or not", "image33");
		click(locator1, "click on Contenmanager check box", "image34");
		//verifyText(UsersObjects.messageText, "Message", "verify text is visible or not ", "image35");
		verifyText(UsersObjects.canceltext, "Cancel", "verify the text present or not", "image37");
	//	waitForSometime(3000) ;
		click(UsersObjects.invite, "Click on invite button", "image39");	
	}
	
	public static void newUserAddedTable(String roleName) {
				//  waitForSometime(2000);
		//verifyText(UsersObjects.contentManagerUser, "abhinav.bajpai@raweng.com", "verify email address", "image40");
		//verifyText(UsersObjects.rolesName, roleName, "verify Roles value", "image41");
		
		
		//verifyText(UsersObjects.contentManagerStatus, "Accepted", "verify status text", "image42");
	
		
	}
	
	public static void currentUserLogout() {
		verifyText(UsersObjects.identifyCurrentUser, "Mahesh", "Identify current user", "image45");
		click(UsersObjects.identifyCurrentUser, "Click on current user settings", "image46");
		verifyText(UsersObjects.currentUserSignOut, "Sign Out", "Verify sign out link in current user", "image47");
		click(UsersObjects.currentUserSignOut, "Click on sign out button for current user", "image48");
	}
	
	public static void roleUserLogout() {
		verifyText(UsersObjects.identifyCurrentUser, "Ab", "Identify current user", "image45");
		click(UsersObjects.identifyCurrentUser, "Click on current user settings", "image46");
		verifyText(UsersObjects.currentUserSignOut, "Sign Out", "Verify sign out link in current user", "image47");
		click(UsersObjects.currentUserSignOut, "Click on sign out button for current user", "image48");
	}
	
	public static void newUserLogin() {
		
		sendkeys(LoginPageObjects.username, "abhinav.bajpai@raweng.com", "Enter new username", "image49");
		sendkeys(LoginPageObjects.password, "test123", "Enter password", "image50");
		click(LoginPageObjects.signin, "click on signin button", "image51");
	}
	
	public static void checkNewUserApp() {
		waitForSometime(800);
		mousehover(UsersObjects.currentUserApp, "Mouse hover to new user app", "image53");
		waitForSometime(800);
		click(UsersObjects.openCurrentUserApp, "Open current user app", "image54");
	}
	
	public static void verifyContentManagerSettings() {
	
		verifyText(UsersObjects.currentUserAppSettingsText, "SETTINGS", "verify setting text in the header", "image56");
		mousehover(UsersObjects.currentUserAppSettingsText, "Mousehover to drop down options", "image57");
		verifyText(UsersObjects.currentUserAppSettingsStack, "Stack", "Verify text'stack' is present", "image58");
		verifyText(UsersObjects.environmentDropdown, "Environments", "verify text present in the drop down", "image86") ;
		verifyText(UsersObjects.languagesDropdown, "Languages", "Verify Text present in the drop down", "image102");
		verifyText(UsersObjects.currentUserAppSettingsStack, "Stack", "Verify text'stack' is present", "image58");
		click(UsersObjects.currentUserAppSettingsStack, "Click on stack link in the drop down", "image59");	
	}
	
	public static void newUserStackPage() {
		
		
		System.out.println("new user stack page");
		verifyText(UsersObjects.stackText, "Stack", "verify Text", "image60");
		//verifyText(UsersObjects.stacksBreadcrum, "STACKS", "Verify Text Stacks", "image61");
		verifyText(UsersObjects.rajBreadcrum, "TEST SITE", "Verify Text stack", "image62");
		verifyText(UsersObjects.settingsBreadcrum, "SETTINGS", "Verify settings Text ", "image63");
		verifyText(UsersObjects.stackPageBreadcrum, "STACK", "Verify Stacks Text in breadcrumb", "image64");
		verifyText(UsersObjects.generalText, "GENERAL", "verify Text general", "image65");
		verifyText(UsersObjects.generalName, "Name *", "verify Texxt Name", "image66");
		UsersObjects.generalNameValue.isEnabled();
		verifyText(UsersObjects.generalDesc, "Description", "verify text desc", "image67");
		UsersObjects.generalDescValue.isEnabled();
		verifyText(UsersObjects.generalSiteAdmin, "Stack Admin Email", "verify text site admin", "image68");

		verifyText(UsersObjects.apiDetailsText, "API CREDENTIALS","verify Text present", "image73");
		verifyText(UsersObjects.apiKeyText, "API Key","verify Text present", "image74");
		UsersObjects.apiKeyValue.isEnabled();
		verifyText(UsersObjects.accessTokenText, "Access Token","verify Text present", "image75");
		UsersObjects.accessTokenValue.isEnabled();
		elementIsPresent(UsersObjects.leaveStack, "Leave Stack button is visible", "image76");
		verifyText(UsersObjects.leaveStack, "Leave Stack", "verify Text present", "image81");
		click(UsersObjects.leaveStack, "click on leave stack button", "image77");
		verifyText(UsersObjects.cofirmActionText, "Confirm action", "verify Text present", "image78");
		verifyText(UsersObjects.cofirmActionDesc, "Are You sure you want to leave this stack?", "verify desc present", "image79");
		verifyText(UsersObjects.cancel, "Cancel", "verify Text present", "image80");
		verifyText(UsersObjects.leave, "Leave", "verify Text present", "image81");
		click(UsersObjects.cancel, "click on cancel button to exit the popup", "image82");
	
	}
	
	public static void newUserEnvironmentPage() {
		
		System.out.println("new user env page");
		mousehover(UsersObjects.headerSettingText, "Mouse hove to header setting tab", "image85");
		waitForSometime(3000) ;
		//verifyText(UsersObjects.environmentDropdown, "Environments", "verify text present in the drop down", "image86");
		waitForSometime(3000) ;
		sendkeys(UsersObjects.environmentDropdown, "Keys.Enter", "Click on environment text in the drop down", "image87");
	//	waitForSometime(2000) ;
		verifyText(UsersObjects.environmentText, "Environments", "Verify text is present or not", "image88");
		verifyText(UsersObjects.stacksBreadcrum, "STACKS", "verify text present or not", "image89");
		verifyText(UsersObjects.rajBreadcrum, "TEST SITE", "verify text present or not", "image90");
		verifyText(UsersObjects.settingsBreadcrum, "SETTINGS", "verify text present or not", "image91");
		verifyText(UsersObjects.environmentBreadcrum, "ENVIRONMENTS", "verify text present or not", "image92");
		elementNotPresent(UsersObjects.addNewEnv, "verify text field is present or not", "image93");
		//verifyText(UsersObjects.addNewEnv, "New Environment", "Verify text is present or not", "image94");
		
	}
	
	public static void newUserLanguagesPage() {
			
		waitForSometime(4000) ;
		System.out.println("new user stack page");
		mousehover(UsersObjects.headerSettingText, "Mouse hove to header setting tab", "image101");
			waitForSometime(1000) ;
			verifyText(UsersObjects.languagesDropdown, "Languages", "Verify Text present in the drop down", "image102");
			click(UsersObjects.languagesDropdown, "click on lanugages dropdown", "image103");
			waitForSometime(3000) ;
			verifyText(UsersObjects.languagesText, "Languages", "Verify Text present or not", "image104");
			//verifyText(UsersObjects.stacksBreadcrum, "STACKS", "verify text present or not", "image105");
			verifyText(UsersObjects.rajBreadcrum, "TEST SITE", "verify text present or not", "image106");
			verifyText(UsersObjects.settingsBreadcrum, "SETTINGS", "verify text present or not", "image107");
			verifyText(UsersObjects.languagesBreadcrum, "LANGUAGES", "verify text present or not", "image108");
		
			verifyText(UsersObjects.languagesNameText, "NAME", "Verify text is present or not", "image110");
			verifyText(UsersObjects.languagesCodeText, "CODE", "Verify text is present or not", "image111");
			verifyText(UsersObjects.languagesNameValue, "Japanese (Japan)", "verify text is present or not", "image112");
			verifyText(UsersObjects.languagesCodeValue, "ja-jp", "verify text is present or not", "image113");
			elementNotPresent(UsersObjects.addNewlanguage, "verify text field is present or not", "image93");
	}

	
	public static void verifyCustomRoleWithCreateRight() {
		
		verifyText(UsersObjects.currentUserAppSettingsText, "SETTINGS", "verify setting text in the header", "image56");
		mousehover(UsersObjects.currentUserAppSettingsText, "Mousehover to drop down options", "image57");
		verifyText(UsersObjects.currentUserAppSettingsStack, "Stack", "Verify text'stack' is present", "image58");
		verifyText(UsersObjects.environmentDropdown, "Environments", "verify text present in the drop down", "image86") ;
		verifyText(UsersObjects.languagesDropdown, "Languages", "Verify Text present in the drop down", "image102");
		verifyText(UsersObjects.currentUserAppSettingsStack, "Stack", "Verify text'stack' is present", "image58");
		click(UsersObjects.currentUserAppSettingsStack, "Click on stack link in the drop down", "image59");	
	}

	
	
	
	
	
	public static void verifyEntryForcustomrolewithcreateRight() {
		
		click(UsersObjects.contentType, "click on conetent type menu", "image103");
		verifyText(UsersObjects.languagesText, "CONTENT TYPES", "Verify Text present or not", "image104");
		verifyText(UsersObjects.stacksBreadcrum, "STACKS", "verify text present or not", "image105");
		verifyText(UsersObjects.rajBreadcrum, "TEST SITE", "verify text present or not", "image106");
		verifyText(UsersObjects.languagesBreadcrum, "Content types", "verify text present or not", "image108");
		elementIsPresent(UsersObjects.importedForm, "verify imported form present or not", "image109");
		verifyText(UsersObjects.importedForm, "Empty form", "Verify text is present or not", "image110");
		click(UsersObjects.importedForm, "click on lanugages dropdown", "image103");
		elementIsPresent(UsersObjects.create, "verify create entry button is present or not", "image109");
		
    }
	
   public static void verifyEntryForcustomrolewithupdateAndDeleteRight() {
		
		click(UsersObjects.contentType, "click on lanugages dropdown", "image103");
		verifyText(UsersObjects.languagesText, "Content Types", "Verify Text present or not", "image104");
		verifyText(UsersObjects.stacksBreadcrum, "STACKS", "verify text present or not", "image105");
		verifyText(UsersObjects.rajBreadcrum, "TEST SITE", "verify text present or not", "image106");
		verifyText(UsersObjects.languagesBreadcrum, "Content types", "verify text present or not", "image108");
		elementIsPresent(UsersObjects.importedForm, "verify imported form present or not", "image109");
		verifyText(UsersObjects.importedForm, "Imported Form", "Verify text is present or not", "image110");
		click(UsersObjects.importedForm, "click on lanugages dropdown", "image103");
		mousehover(UsersObjects.importEntry, "Mouse hove to importetd entry", "image101");
		elementIsPresent(UsersObjects.ellopsisIcon, "verify ellopsisIcon icon is present or not", "image109");
		click(UsersObjects.ellopsisIcon, "click on ellopsisIcon", "image103");
		elementIsPresent(UsersObjects.export, "verify export link is present or not", "image109");
		elementIsPresent(UsersObjects.delete, "verify export link is present or not", "image109");
    
   }
	
   public static void verifyEntryForcustomrolewithDleteAndPublishRight() {
		
		click(UsersObjects.contentType, "click on lanugages dropdown", "image103");
		verifyText(UsersObjects.languagesText, "Content Types", "Verify Text present or not", "image104");
		verifyText(UsersObjects.stacksBreadcrum, "STACKS", "verify text present or not", "image105");
		verifyText(UsersObjects.rajBreadcrum, "TEST SITE", "verify text present or not", "image106");
		verifyText(UsersObjects.languagesBreadcrum, "Content types", "verify text present or not", "image108");
		elementIsPresent(UsersObjects.importedForm, "verify imported form present or not", "image109");
		verifyText(UsersObjects.importedForm, "Imported Form", "Verify text is present or not", "image110");
		click(UsersObjects.importedForm, "click on lanugages dropdown", "image103");
		mousehover(UsersObjects.importEntry, "Mouse hove to importetd entry", "image101");
		elementIsPresent(UsersObjects.ellopsisIcon, "verify ellopsisIcon icon is present or not", "image109");
		click(UsersObjects.ellopsisIcon, "click on ellopsisIcon", "image103");
		elementIsPresent(UsersObjects.export, "verify export link is present or not", "image109");
		elementIsPresent(UsersObjects.delete, "verify export link is present or not", "image109");
		elementIsPresent(UsersObjects.publish, "verify export link is present or not", "image109");
   
  }
	
	
	
	
	/*
		 * User with Developer action
		 */
		/*
		 * New User Logout
		 */
	
	
	
	public static void oldUserLogin() {
		
		sendkeys(LoginPageObjects.username, "mahesh.chilumula@raweng.com", "Enter new username", "image118");
		sendkeys(LoginPageObjects.password, "test123", "Enter password", "image119");
		click(LoginPageObjects.signin, "click on signin button", "image120");
		
	}
	
	public static void testingApp() {
		
		waitForSometime(700) ;
		elementIsPresent(UsersObjects.testingApp, "verify testing app is present or not", "image121");
		mousehover(UsersObjects.testingApp, "mouse hover to the testing app", "image122");
		waitForSometime(700) ;
		click(UsersObjects.openTestingApp, "Open testing app", "image123");
		elementIsPresent(UsersObjects.headerSettingIcon, "verify setting icon", "image124");
		verifyText(UsersObjects.headerSettingText, "SETTINGS", "verify text present", "image125");
		mousehover(UsersObjects.headerSettingText, "click on setting drop down", "image126");
		verifyText(UsersObjects.usersDropdown, "Users", "verify text present in the drop down", "image127");
		click(UsersObjects.usersDropdown, "verify text present in the drop down", "image128");
		
		
	}
	
	public static void editTestingApp() {
		
		//verifyText(UsersObjects.contentManagerUser, "abhinav.bajpai@raweng.com", "verify text present", "image132");
		click(UsersObjects.contentManagerUser, "click on new user to edit", "image133");
		verifyText(UsersObjects.updateUser, "Update User", "verify update user text ", "image134");
		verifyText(UsersObjects.updateUserEmailText, "Email*", "verify email text for update user", "image135");
		elementIsPresent(UsersObjects.updateUserEmailValue, "verify element present", "image136");
		verifyText(UsersObjects.updateUserRolesText, "Roles*", "verify text present", "image137");
		//elementIsPresent(UsersObjects.updateUserRolesDropDown, "verify drop down element present", "image138");
		click(UsersObjects.updateUserRolesDropDown, "click on drop down", "image139");
		//waitForSometime(5000) ;
		
	
		clickByindex(UsersObjects.contentManagerCheckBoxIndropDown,3, "click on content manager check box to uncheck", "image140");
		click(UsersObjects.developerCheckBox, "click on developer check box to select", "image141");
		click(UsersObjects.updateUserUpdateButton, "click on update button", "image142");
			//	  waitForSometime(2000);
		verifyText(UsersObjects.updateSuccessfullyMsg,"The roles were applied successfully.", "verify update successfully msg", "image143");
	//	verifyText(UsersObjects.devloper, "Developer", "verify developer roles is applied", "image144");
		}
	
	
      public static void customRole(WebElement locator, int a, int b) {
		
 
		click(locator, "click on new user to edit", "image133");
		verifyText(UsersObjects.updateUser, "Update User", "verify update user text ", "image134");
		verifyText(UsersObjects.updateUserEmailText, "Email*", "verify email text for update user", "image135");
		elementIsPresent(UsersObjects.updateUserEmailValue, "verify element present", "image136");
		verifyText(UsersObjects.updateUserRolesText, "Roles*", "verify text present", "image137");
		click(UsersObjects.updateUserRolesDropDown, "click on drop down", "image139");
	
		//waitForSometime(5000) ;
		
	
		clickByindex(UsersObjects.contentManagerCheckBoxIndropDown,a, "click on content manager check box to uncheck", "image140");
		clickByindex(UsersObjects.contentManagerCheckBoxIndropDown,b, "click on content manager check box to uncheck", "image140");
		click(UsersObjects.updateUserUpdateButton, "click on update button", "image142");
				//  waitForSometime(2000);
		verifyText(UsersObjects.updateSuccessfullyMsg,"The roles were applied successfully.", "verify update successfully msg", "image143");
	//	verifyText(UsersObjects.rolesName, "Developer", "verify developer roles is applied", "image144");
		}
	
	
		public static void verifyDeveloperSettings() {
			
		elementIsPresent(UsersObjects.currentUserAppSettingsIcon, "verify setting icon", "image145");
		verifyText(UsersObjects.currentUserAppSettingsText, "SETTINGS", "verify setting text in the header", "image146");
		mousehover(UsersObjects.currentUserAppSettingsText, "Mousehover to drop down options", "image147");
		verifyText(UsersObjects.currentUserAppSettingsStack, "Stack", "Verify text'stack' is present", "image148");
		click(UsersObjects.currentUserAppSettingsStack, "Click on stack link in the drop down", "image149");	
		}
		
		public static void stackDeveloperSettings() {
			
		verifyText(UsersObjects.stackText, "Stack", "verify Text", "image150");
	//	verifyText(UsersObjects.stacksBreadcrum, "STACKS", "Verify Text Stacks", "image151");
		verifyText(UsersObjects.rajBreadcrum, "TEST SITE", "Verify stack name Text in breadcrumb", "image152");
		verifyText(UsersObjects.settingsBreadcrum, "SETTINGS", "Verify settings Text in breadcrumb", "image153");
		verifyText(UsersObjects.stackPageBreadcrum, "STACK", "Verify Text Stacks page", "image154");
		
		verifyText(UsersObjects.generalText, "GENERAL", "verify Text general", "image155");
		verifyText(UsersObjects.generalName, "Name *", "verify Texxt Name", "image156");
		
		UsersObjects.generalNameValue.isEnabled();
		
		verifyText(UsersObjects.generalDesc, "Description", "verify text desc", "image157");
		UsersObjects.generalDescValue.isEnabled();
		
		verifyText(UsersObjects.generalSiteAdmin, "Stack Admin Email", "verify text site admin", "image158");
		UsersObjects.generalSiteAdminValue.isEnabled();
	
		verifyText(UsersObjects.apiDetailsText, "API CREDENTIALS","verify Text present", "image164");
		
		verifyText(UsersObjects.apiKeyText, "API Key","verify Text present", "image165");
		UsersObjects.apiKeyValue.isEnabled();
		
		verifyText(UsersObjects.accessTokenText, "Access Token","verify Text present", "image166");
		UsersObjects.accessTokenValue.isEnabled();
		
		elementIsPresent(UsersObjects.resetAccessToken, "verify button to reset access token", "image167");

		elementIsPresent(UsersObjects.leaveStack, "Leave Stack button is visible", "image168");
		click(UsersObjects.leaveStack, "click on leave stack button", "image169");
		
		verifyText(UsersObjects.cofirmActionText, "Confirm action", "verify Text present", "image170");
		verifyText(UsersObjects.cofirmActionDesc, "Are You sure you want to leave this stack?", "verify desc present", "image171");
		
		verifyText(UsersObjects.cancel, "Cancel", "verify Text present", "image172");
		verifyText(UsersObjects.leave, "Leave", "verify Text present", "image173");
		click(UsersObjects.cancel, "click on cancel button to exit the popup", "image174");
		
		
	}
		
		public static void evironmentDeveloperSettings() {
	
		
	//	waitForSometime(4000) ;
		elementIsPresent(UsersObjects.headerSettingIcon, "Setting icon is visible", "image175");
		verifyText(UsersObjects.headerSettingText, "SETTINGS", "setting text is visible", "image176");
		
		mousehover(UsersObjects.headerSettingText, "Mouse hove to header setting tab", "image177");
		verifyText(UsersObjects.environmentDropdown, "Environments", "verify text present in the drop down", "image178");
		click(UsersObjects.environmentDropdown, "Click on environment text in the drop down", "image179");
		
		verifyText(UsersObjects.environmentText, "Environments", "Verify text is present or not", "image180");
		verifyText(UsersObjects.stacksBreadcrum, "STACKS", "verify text present or not", "image181");
		verifyText(UsersObjects.rajBreadcrum, "TEST SITE ", "verify text present or not", "image182");
		verifyText(UsersObjects.settingsBreadcrum, "SETTINGS", "verify text present or not", "image183");
		verifyText(UsersObjects.environmentBreadcrum, "ENVIRONMENTS", "verify text present or not", "image184");
		
	
	
		elementIsPresent(UsersObjects.addNewEnvironment, "verify add new environment button is visible", "image191");
		
	}
		
		public static void languagesDeveloperSettings() {
			waitForSometime(1000) ;
			elementIsPresent(UsersObjects.headerSettingIcon, "Setting icon is visible", "image192");
			waitForSometime(1000) ;
			verifyText(UsersObjects.headerSettingText, "SETTINGS", "setting text is visible", "image193");
			
			mousehover(UsersObjects.headerSettingText, "Mouse hove to header setting tab", "image194");
			verifyText(UsersObjects.languagesDropdown, "Languages", "Verify Text present in the drop down", "image195");
			
			click(UsersObjects.languagesDropdown, "click on lanugages dropdown", "image196");
			verifyText(UsersObjects.languagesText, "Languages", "Verify Text present or not", "image197");
			
			verifyText(UsersObjects.stacksBreadcrum, "STACKS", "verify text present or not", "image198");
			verifyText(UsersObjects.rajBreadcrum, "TEST SITE", "verify text present or not", "image199");
			verifyText(UsersObjects.settingsBreadcrum, "SETTINGS", "verify text present or not", "image200");
			verifyText(UsersObjects.languagesBreadcrum, "NAME", "verify text present or not", "image201");
			
			//elementIsPresent(UsersObjects.languagesTextField, "verify Text field present or not", "image202");
			
			verifyText(UsersObjects.languagesNameText, "LANGUAGE", "Verify text is present or not", "image203");
			verifyText(UsersObjects.languagesCodeText, "CODE", "Verify text is present or not", "image204");
			
			verifyText(UsersObjects.languagesNameValue, "Japanese (Japan)", "verify text is present or not", "image205");
			verifyText(UsersObjects.languagesCodeValue, "ja-jp", "verify text is present or not", "image206");
			
			elementIsPresent(UsersObjects.addNewLanguages, "verify add new languages button is visible", "image207");
		}
		
		public static void usersDeveloperSettings() {
			
			elementIsPresent(UsersObjects.headerSettingIcon, "Setting icon is visible", "image208");
			verifyText(UsersObjects.headerSettingText, "SETTINGS", "setting text is visible", "image209");
			
			mousehover(UsersObjects.headerSettingText, "Mouse hove to header setting tab", "image210");
			verifyText(UsersObjects.usersDropdown, "Users", "Verify Text present in the drop down", "image211");
			
			click(UsersObjects.usersDropdown, "click on lanugages dropdown", "image212");
			
			verifyText(UsersObjects.usersText, "Users", "verify text users in the user settings page", "image213");
			verifyText(UsersObjects.stacksTextBreadcrumb, "STACKS", "verify text present in the breadcrum", "image214");
			verifyText(UsersObjects.rajTextBreadcrumb, "TEST SITE", "verify text present in the breadcrum", "image215");
			verifyText(UsersObjects.settingsTextBreadcrumb, "SETTINGS", "verify text present in the breadcrum", "image216");
			verifyText(UsersObjects.usersTextBreadcrumb, "USERS", "verify text present in the breadcrum", "image217");
			elementIsPresent(UsersObjects.addNewUserButton, "verify add new button is present  or not", "image218");
		
			verifyText(UsersObjects.emailAddHeader, "EMAIL ADDRESS", "verify text", "image219");
			verifyText(UsersObjects.rolesHeader, "ROLES", "verify text", "image220");
			verifyText(UsersObjects.invitedByHeader, "INVITED BY", "verify text", "image221");
			verifyText(UsersObjects.statusHeader, "STATUS", "verify text", "image222");
			
			verifyText(UsersObjects.contentManagerUser,  "abhinav.bajpai@raweng.com", "verify email address", "image223");
			verifyText(UsersObjects.rolesValue, "Developer", "verify roles", "image224");
			verifyText(UsersObjects.statusValue, "Accepted", "verify status", "image225");
			verifyText(UsersObjects.ownerEmailID, "mahesh.chilumula@raweng.com", "verify email address", "image226");
			verifyText(UsersObjects.ownerRoles, "Owner", "verify roles", "image227");
			verifyText(UsersObjects.ownerStatus, "Accepted", "verify status", "image228");
			
		}
}

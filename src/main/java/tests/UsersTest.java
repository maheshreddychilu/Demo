package tests;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.annotations.Test;

import com.built.io.automationframework.BaseTest;
import com.built.io.automationframework.ExcelUtils;
import com.built.io.automationframework.MailingReports;
import com.built.io.automationframework.Reports;


import com.built.io.automationframework.SendingReportsToSalck;

import page.actions.DashboardPageActions;
import page.actions.LoginPageActions;
import page.actions.SettingPageActions;
import page.actions.UsersActions;
import page.objects.UsersObjects;

public class UsersTest extends UsersActions {

	@Test(priority = 1, groups = "Users")
	public void verifyUserDefault()  {

		usersBreadcrum();
		usersTable();
	}
	
	@Test(priority = 2, groups = "Users")
	public void assignUserAsContentManager()  {

		addNewUser(UsersObjects.selectRole,UsersObjects.contentManagerCheckBox,"select content manager role");
		usersTable1();
		newUserAddedTable("Content Manager");
		currentUserLogout();
		newUserLogin();
		checkNewUserApp();
		verifyContentManagerSettings();
		newUserStackPage();
		//newUserEnvironmentPage();
		newUserLanguagesPage();
		LoginPageActions.Logout();
		oldUserLogin();
	}
	
	
	@Test(priority = 3, groups = "Users")
	public void assignUserDevoloper()  {

		testingApp();
		editTestingApp();
		currentUserLogout();
		newUserLogin();
		checkNewUserApp();
		verifyDeveloperSettings();
		stackDeveloperSettings();
		//evironmentDeveloperSettings();
		//languagesDeveloperSettings();
		LoginPageActions.Logout();
		oldUserLogin();
	}
	
	@Test(priority = 4, groups = "Users")
	public void assignCustomRoleWithCreateRight()  {

		testingApp();
		customRole(UsersObjects.devloper,4,2) ;
		newUserAddedTable("create custom role with create conteten type right");
		currentUserLogout();
		newUserLogin();
		checkNewUserApp();
		verifyContentManagerSettings();
		newUserStackPage();
	//	newUserEnvironmentPage();
		newUserLanguagesPage();
		//verifyEntryForcustomrolewithcreateRight();
		LoginPageActions.Logout();
		oldUserLogin();
	}
	
	@Test(priority = 5, groups = "Users")
	public void assignCustomRoleWithUpdateAndDeleteRight()  {

		testingApp();
		customRole(UsersObjects.role,2,1) ;
		newUserAddedTable("create custom role with update and delete contetent type right");
		currentUserLogout();
		newUserLogin();
		checkNewUserApp();
		verifyContentManagerSettings();
		newUserStackPage();
		//newUserEnvironmentPage();
		newUserLanguagesPage();
		//verifyEntryForcustomrolewithupdateAndDeleteRight();
		LoginPageActions.Logout();
		oldUserLogin();
	}
	
	@Test(priority = 6, groups = "Users")
	public void assignCustomRoleWithDeleteAndpublish()  {

		testingApp();
		customRole(UsersObjects.role,1,0) ;
		newUserAddedTable("create custom role with delete and publish contetent type right");
		currentUserLogout();
		newUserLogin();
		checkNewUserApp();
		verifyContentManagerSettings();
		newUserStackPage();
	//	newUserEnvironmentPage();
		newUserLanguagesPage();
		//verifyEntryForcustomrolewithDleteAndPublishRight();
		LoginPageActions.Logout();
		oldUserLogin();
		checkNewUserApp() ;
	}

	@Test(priority = 7, groups = "Stacks")
	public void updateStack()  {

		SettingPageActions.updateStackActions(ExcelUtils.readCell(1, ExcelUtils.getCell("stack.Name")),
				ExcelUtils.readCell(1, ExcelUtils.getCell("stack.description")));
	}

	@Test(priority = 8, groups = "Stacks")
	public void deleteStack()  {

		SettingPageActions.deleteStackActions();

	}
	
 /*  @Test(priority = 9, groups = "Stacks")
	public void emailReport() throws AddressException, MessagingException, IOException  {
		waitForSometime(2000);
		driver.get("https://contentstack.built.io/");
		LoginPageActions.login("mahesh.chilumula@raweng.com", "test123");
		DashboardPageActions.publishReport();
		System.out.println("mailing report");
     	MailingReports.mailReport();
		System.out.println("mail sent successfully ");
		SendingReportsToSalck.massege("contentstack-dev-qa");
		System.out.println("message sent successfully ");
	   
	}*/
}

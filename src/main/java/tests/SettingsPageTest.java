package tests;

import org.testng.annotations.Test;

import com.built.io.automationframework.ExcelUtils;

import page.actions.AuditLogActions;
import page.actions.SettingPageActions;
import page.objects.SettingsPageObjects;

public class SettingsPageTest extends SettingPageActions {

	// Setting menu

	@Test(priority = 1, groups = "Stacks")
	public void verifySettingsMenu()  {
		verifySettingMenuActions();
	}

	// Stacks
	@Test(priority = 2, groups = "Stacks")
	public void verifyStacksPage()  {

		clickOnStackTab();
		verifyDefaultStackPageActions();
	}


	// Languages

  @Test(priority = 5, groups = "Languages")
	public void addLanguage()  {

		clickOnLanguageTab();
		//verifyDefaultLanguageActions();

		addNewLanguage(ExcelUtils.readCell(1,ExcelUtils.getCell("language.name.first")));
//		 waitForSometime(2000);
		addNewLanguage(ExcelUtils.readCell(1,
				ExcelUtils.getCell("second.language.name")));

//		 waitForSometime(2000);
		addNewLanguage(ExcelUtils.readCell(1,
				ExcelUtils.getCell("third.language.name")));

	}

	@Test(priority = 6, groups = "Languages")
	public void searchLanguage()  {


		searchLanguageActions("English");
	}

	@Test(priority = 7, groups = "Languages")
	public void deleteLanguage()  {

	     waitForSometime(1000);
		deleteLanguageActions();
	}

	//Environment
	@Test(priority = 8, groups = "Environment")
	public void createEnvironment()  {

		clickOnEnvironmentTab();
		addNewEnvironment(SettingsPageObjects.addNewEnvBlankEnvPage,ExcelUtils.readCell(1,
				ExcelUtils.getCell("env.name.stag")),ExcelUtils.readCell(1,
						ExcelUtils.getCell("env.url.stag")));
		 waitForSometime(1000);
		addNewEnvironment(SettingsPageObjects.addNewEnvOnEnvPage,ExcelUtils.readCell(1,
				ExcelUtils.getCell("env.name.prod")),ExcelUtils.readCell(1,
						ExcelUtils.getCell("env.url.prod")));
		 waitForSometime(1000);
		createBlankEnv(SettingsPageObjects.addNewEnvOnEnvPage,ExcelUtils.readCell(1,
				ExcelUtils.getCell("env.name.blank"))) ;
	}
	
	@Test(priority = 9, groups = "Environment")
	public void searchEnvironment()  {

		searchEnvActions("stag");
	}
	
	
	@Test(priority = 10, groups = "Environment")
	public void updateEnvironment()  {

		updateEnivironmentActions(SettingsPageObjects.stagEnv, "updatedEnv");
	}

	@Test(priority = 11, groups = "Environment")
	public void deleteEnvironment()  {

		deleteEnvActions();
	}
	
	
	
	@Test(priority = 12, groups = "Audit log")
	public void verifyAuditLogsOfEnvironments()  {

		AuditLogActions.verifyAuditLogsForEnviromentActions();
	}
	
	@Test(priority = 13, groups = "Audit log")
	public void verifyAuditLogsOfLanguage()  {

		AuditLogActions.verifyAuditlogsForLanguagesActions();
	}

	


}

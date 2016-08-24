package tests;

import java.awt.AWTException;
import java.io.File;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.built.io.automationframework.ExcelUtils;

import page.actions.EntryPageAction;
import page.actions.WebHookActions;
import page.objects.ContentObjects;
import page.objects.EntryPageObjects;

public class EntryPageTest extends EntryPageAction {

	@Test(priority = 1, groups = "Entry")
	public void importEntryInImportedContentType()  {

		switchToFormView() ;
		String importedEntry = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("Imported.entry")))
		.getAbsolutePath();
		System.out.println("path of entry :" + importedEntry );
		importEntry(importedEntry);
	}

	@Test(priority = 2, groups = "Entry")
	public void verifyExportEntry() throws AWTException  {

		exportEntryActions();

	}

	@Test(priority = 3, groups = "Entry")
	public void verifyCopyiedEntry()  {
//textarea[@class='cs-text-box ng-untouched ng-isolate-scope ng-dirty ng-valid-
		copyEntry();
		verifyCopiedEntryActions();
	}
	
	/*@Test(priority = 4, groups = "Entry")
	public void createWebhookForAspecificEntry()  {

		// WebHookActions.clickOnWebhookTab();
		// WebHookActions.createWebhookForAspecificEntry();
		
	}*/

	@Test(priority = 5, groups = "Entry")
	public void verifyEditEntry()  {

		editEntry();
	}

	@Test(priority = 6, groups = "Entry")
	public void createEntryInImportedContentType()  {

		 waitForSometime(3000);
		createEntryInImportedForm();
	}

	@Test(priority = 7, groups = "Entry")
	public void verifySearchEntry()  {

		searchEntryActions();
	}
	@Test(priority = 8, groups = "Entry")
	public void verifyDeleteEntry()  {

		deleteEntry();
	}
	@Test(priority = 9, groups = "Entry")
	public void createEntry()  {

		createEntryAction(EntryPageObjects.sanityForm);
	}
	
	/*@Test(priority = 9, groups = "Entry")
	public void createEntryIncreateMultiplecontentBlockContentBlock()  {

		createEntryAction(EntryPageObjects.setContentBlock);
	}
	
	@Test(priority = 9, groups = "Entry")
	public void createEntryInSsingleContentBlock()  {

		createEntryAction(EntryPageObjects.setContentBlock);
	}
	
  /* @Test(priority = 10, groups = "Entry")
	public void compareVersionOfEntry()  {

		 editEntryForCompare();
		 verifyCompareVersionOfEntry() ;
	}
	*/
	/*@Test(priority = 11, groups = "Entry")
	public void LocaliseEntry()  {
		
		LocaliseActions() ;

	}*/
	
	
}

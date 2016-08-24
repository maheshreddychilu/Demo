package page.actions;

import org.openqa.selenium.WebElement;

import com.built.io.automationframework.BasePageActions;
import com.built.io.automationframework.ExcelUtils;

import page.objects.ContentObjects;
import page.objects.EntryPageObjects;
import page.objects.ReferenceObjects;
import page.objects.ReferenceObjects;
import page.objects.ReferenceObjects;
import page.objects.ReferenceObjects;
import data.VerificationData;

public class ReferenceActions extends BasePageActions{

	
	public static void importContentType(WebElement locator, String path) {

		click(ReferenceObjects.contentType, "click on contenttype link", "tc-3");
		waitForSometime(2000);
		click(ReferenceObjects.importIcon, "click on import icon", "i-1");
		sendkeys(locator, path, "browse the form which u want import", "if1");
		click(ReferenceObjects.importedIconOnWarningBox,
				"click on import button", "i3");
		verifyText(ReferenceObjects.importedForm,
				VerificationData.SanitycontentType.importedForm,
				"verify contentType successfully imported or not ", "ed-6");

	}
	
	
	public static void createEntriesInImportedForm(int a) {

		click(ReferenceObjects.imported, "click on imported entry", "e1-1");
		
		click(ReferenceObjects.addNewEntry, "click on sanity contentType",
				"e1-1");
		sendkeys(
				ReferenceObjects.title,"entry" + a ,"Enter entry title", "e2");
		waitForSometime(2000);
		sendkeys(ReferenceObjects.url,
				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.url")),
				"Enter entry url", "e3");

		sendkeys(
				ReferenceObjects.text1,
				ExcelUtils.readCell(1, ExcelUtils.getCell("webhook.any.entry")),
				"Enter value in text1 field", "e3");

		sendkeys(
				ReferenceObjects.text2,
				ExcelUtils.readCell(1,
						ExcelUtils.getCell("webhook.specific.asset")),
				"Enter in text2 field", "e3");

		click(ReferenceObjects.saveEntry, "click on save button", "e16");
		//waitForSometime(3000);
		verifyText(ReferenceObjects.successMessage1,
				VerificationData.Entry.entryCreatedSuccesmsz,
				"verify contentType successfully imported or not ", "ed-6");
		waitForSometime(2000);
		click(ReferenceObjects.cancel, "click on cancel button", "e16");

	}
	
	public static void addContentTypeForSingle(String formName,
			String description, String tc) throws InterruptedException {

		click(ReferenceObjects.contentType,
				"click on content type button which is placed on header", tc);
		waitForSometime(3000);
		click(ReferenceObjects.addNewForm,
				"click on add new content type button", tc);
		sendkeys(ReferenceObjects.enterName, formName, "Enter form name", tc);
		click(ReferenceObjects.createMultiple,
				"click on add new content type button", tc);
		click(ReferenceObjects.createAndAddFields,
				"click on add new form button", tc);
	     waitForSometime(1000);
		verifyTextByindex(
				ReferenceObjects.successMessage,
				VerificationData.SanitycontentType.contentTypeCreatedSuccessMsz,
				"verify content type successfully added or not ", "ed-6");

	}
	
	
	
	
	public void createContentType() throws InterruptedException  {

		//	addContentTypeForSingle(ExcelUtils.readCell(1, ExcelUtils.getCell("form.name")),ExcelUtils.readCell(1, ExcelUtils.getCell("form.description")),"af1") ;
			 waitForSometime(1000);
			addField(ReferenceObjects.singleLine,ReferenceObjects.singleLineLabel,"add single line field","f1") ;
			addField(ReferenceObjects.multipleFieled,ReferenceObjects.multipleFieledLabel,"add muliline field","f2") ;
			addField(ReferenceObjects.number,ReferenceObjects.numberLabel,"add number field","f6") ;
			BasePageActions.dragAndDrop(ReferenceObjects.booleanfield, ReferenceObjects.dropfield, "add boolean field", "7");
			BasePageActions.dragAndDrop(ReferenceObjects.dateCt, ReferenceObjects.dropfield, "add boolean field", "7");
			addField(ReferenceObjects.link,ReferenceObjects.linkLabel,"add link field","f10") ;
			addField(ReferenceObjects.reference,ReferenceObjects.referenceLabel,"add refrerence field","f6") ;
			click(ReferenceObjects.selectCtForreference, "click on select content type dropdown", "12");
			click(ReferenceObjects.refrenceCt, "click on inported Ct for refence", "13");
			saveSchemaActions("f13") ;
		
	 }
	
	 public static void addField(WebElement locator, WebElement locator1,
				String description, String tc) {
			dragAndDrop(locator, ReferenceObjects.dropfield, description, tc);
			//waitForSometime(2000);
			click(locator1, "click on label of fiele", tc);
			waitForSometime(700);
			click(ReferenceObjects.multiple, "select muliple option", tc);
			click(ReferenceObjects.mandatory, "select mandatory option", tc);
			click(ReferenceObjects.labelcloseButton, "click on close button", tc);

		}
	 
	 public static void saveSchemaActions(String tc) {
	 		click(ReferenceObjects.save,
	 				"click on save button of contenttype", tc);
	 		waitForSometime(500);
	 		verifyTextByindex(ReferenceObjects.successMessage,
	 				VerificationData.SanitycontentType.contentTypeSuccessMsz,
	 				"verify contentType successfully updated or not ", "ed-6");
	 	}

	 public static void createEntryAction(WebElement contenttype) {

			waitForSometime(300);
			click(ReferenceObjects.contentType, "click on contentType link", "e1-1");
			click(contenttype, "click on sanity contentType",
				"e1-1");
			
			click(ReferenceObjects.addNewForm,
					"click on add new content type button", "12");
			
			  // boolean
		    click(ReferenceObjects.booleanField,"click on label of field which you want to delete", "e12");
			// Date
			click(ReferenceObjects.dateEntry, "click on date field", "e21");
			click(ReferenceObjects.now, "click on now button", "e21");
		    click(ReferenceObjects.done, "click on now button", "e21");
			// Link
			sendkeys(ReferenceObjects.linkTitleEntry,ExcelUtils.readCell(1, ExcelUtils.getCell("entry.link")),"Enter entry url", "e14");
			sendkeys(ReferenceObjects.linkValue,ExcelUtils.readCell(1, ExcelUtils.getCell("entry.linkurl")),"Enter entry url", "e15");
			// Title & url
			sendkeys(ReferenceObjects.title,ExcelUtils.readCell(1, ExcelUtils.getCell("entry.title")),"Enter entry title", "e2");
			// single line
			sendkeys(ReferenceObjects.singleLineEntry,	"builtio","Enter vlaue in single line field", "e4");
			// number
			sendkeys(ReferenceObjects.numberEntry,ExcelUtils.readCell(1, ExcelUtils.getCell("entry.number")),"Enter number in number field", "e13");

	       // multi line
			waitForSometime(1000);
			sendkeys(ReferenceObjects.multilineEntry,ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),"Enter vlaue in single line field", "e4");
			
			
			//reference
			
			click(ReferenceObjects.clickToSelect,"click on on the reference list box to select entry", "12");
			click(ReferenceObjects.entry1,"select entry", "12");
			click(ReferenceObjects.entry2,"select entry2", "12");
			
			click(ReferenceObjects.saveEntry, "click on save button", "e16");
			waitForSometime(1000);
			//click(ReferenceObjects.entryCancel, "click on save button", "e16");

		}
	
	
}

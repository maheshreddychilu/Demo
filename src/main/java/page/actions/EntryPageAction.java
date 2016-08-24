package page.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.built.io.automationframework.BasePageActions;
import com.built.io.automationframework.ExcelUtils;
import com.relevantcodes.extentreports.LogStatus;

import data.VerificationData;
import page.objects.AssetObjects;
import page.objects.ContentObjects;
import page.objects.EntryPageObjects;
import page.objects.EntryPageObjects;

public class EntryPageAction extends BasePageActions {
	


	public static void switchToFormView() {

		click(ContentObjects.contentType, "click contentType link", "e1");
		waitForSometime(800) ;
		click(ContentObjects.alphabetical, "click onlabel view dropdown", "e1");

		click(ContentObjects.alphabeticalview,
				"select alphabetical option from dropdown", "e1");
	}

	public static void uploadFile(String path, String description,
			String testcase1d) {

		sendkeys(AssetObjects.browseAsset, path, description, testcase1d);

	}

	public static void entryTitleAndUrl(String title, String url) {

		click(EntryPageObjects.addNewEntry, "click on add new entry button",
				"e1");
		sendkeys(EntryPageObjects.title, title, "enter title of entry", "e2");
		sendkeys(EntryPageObjects.url, url, "enter url of entry", "e3");

	}

	public static void singleLineTextBox(String value) {

		sendkeys(EntryPageObjects.singleLine, value,
				"enter title single line textbox", "es1");
	}

	public static void rteWithImg(String value, String path) {

		sendkeys(EntryPageObjects.rte, value, "enter text in rte", "rt1");
		click(EntryPageObjects.rteImg, "click on add new entry button", "rt2");
		sendkeys(EntryPageObjects.browse, path, "upload image in rte", "rt3");
	}

	public static void markdownWithImg(String value, String path) {

		sendkeys(EntryPageObjects.markDown, value, "enter text in markdown",
				"mrk1");
		click(EntryPageObjects.markDown, "click on add new entry button",
				"mrk2");
		sendkeys(EntryPageObjects.browse, path, "upload image in rte", "mrk3");
	}

	public static void number(String value) {

		sendkeys(EntryPageObjects.number, value,
				"enter vlaue in number textbox", "n1");
	}

	public static void uploadField(String path) {

		sendkeys(EntryPageObjects.upLoadFile, path, "upload a file", "u1");

	}

	public static void chooseFromUploads() {

		click(EntryPageObjects.markDown, "click on add new entry button", "cu1");
		click(EntryPageObjects.selectImg, "click on add new entry button",
				"cu2");
		click(EntryPageObjects.done, "click on add new entry button", "cu3");
	}

	public static void linkField(String title, String value) {

		sendkeys(EntryPageObjects.linkTitle, title,
				"Enter title in link filed", "l1");
		sendkeys(EntryPageObjects.linkValue, value,
				"Enter value in link filed", "l2");

	}

	public static void editEntryActions(WebElement locator) {

		click(locator, "click on entry which you want to edit", "ee11");
		clear(EntryPageObjects.title, "remove the title of entry", "ee2");
		clear(EntryPageObjects.url, "remove the url of entry", "ee3");

	}

	public static void updateButton() {

		click(EntryPageObjects.save, "click on entry which you want to edit",
				"ee11");
		verifyText(EntryPageObjects.successmessage,
				VerificationData.Entry.successMsz,
				"verify entry is updated or not", "ee3");

	}

	public static void createEntryAction(WebElement contenttype) {

		
		waitForSometime(300);
		click(EntryPageObjects.contentType, "click on contentType link", "e1-1");
		click(contenttype, "click on sanity contentType",
				"e1-1");

		// Title & url
		sendkeys(EntryPageObjects.title,
				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.title")),
				"Enter entry title", "e2");
		sendkeys(EntryPageObjects.url,
				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.url")),
				"Enter entry url", "e3");

		// single line
		sendkeys(EntryPageObjects.singleLine,
				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
				"Enter vlaue in single line field", "e4");

		// number
		sendkeys(EntryPageObjects.number,
				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.number")),
				"Enter number in number field", "e13");

		// boolean
		click(EntryPageObjects.booleanField,
				"click on label of field which you want to delete", "e12");

		// Date

		click(EntryPageObjects.date, "click on date field", "e21");
		click(EntryPageObjects.now, "click on now button", "e21");

		// Link
		sendkeys(EntryPageObjects.linkTitle,
				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.link")),
				"Enter entry url", "e14");

		sendkeys(EntryPageObjects.linkValue,
				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.linkurl")),
				"Enter entry url", "e15");

		// Reference

		/*	click(EntryPageObjects.searchReference, "select searched entry", "e7");

		sendkeys(EntryPageObjects.searchedEntry1, "import",
				"click on searched reference box", "e7");

		click(EntryPageObjects.searchedEntry, "select searched entry", "e7");*/

		// upload file
	
		String rteImage = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("entry.rte.img")))
		.getAbsolutePath();

		sendkeys(EntryPageObjects.upLoadFile,rteImage,"upload a file by using upload button", "e11");

		
	/*	// choose from upload

		click(EntryPageObjects.upLoadFilePlusIcon,
				"click on file plus symbol icon", "e7");


		clickByindex(EntryPageObjects.chooseFromUpload,1,"click on choose from upload link", "e7") ;
		
		sendkeys(EntryPageObjects.searchOnChooseUploadpopUp, "mahi",
				"Enter asset name which you want to insert", "e5");

		click(EntryPageObjects.selectIMg, "select searched assetk", "e7");

		click(EntryPageObjects.done, "click on done button", "e7");*/

		// markdown
		sendkeys(EntryPageObjects.markDown,
				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.markdown")),
				"Enter vlaue in markdown field", "e5");
		waitForSometime(4000);
		clickByindex(EntryPageObjects.mardownImg,5, "click on markdown inage", "e7");
		
		String markDownImg = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("entry.markdown.img")))
		.getAbsolutePath();
		
		System.out.println("path of markdown image :" +markDownImg);
		sendkeys(EntryPageObjects.browse,markDownImg,"upload image in markdown field", "e6");
		waitForSometime(2000);
		click(EntryPageObjects.preview, "click on preview button", "e7");
		waitForSometime(2000);
		elementIsPresent(EntryPageObjects.imgverify,
				"verify image is present or not", "e123");

		// RTE
		waitForSometime(2000);
		sendkeysForRTE(EntryPageObjects.rte,
				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.rte")),
				"Enter value in rte field", "e8");
		waitForSometime(2000);
		click(EntryPageObjects.rteImg, "click on rte image link", "e9");
	
		waitForSometime(700);
		
		String rteImge = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("entry.rte.img")))
		.getAbsolutePath();
		waitForSometime(4000);
		sendkeys(EntryPageObjects.browse,rteImge,"upload image in rte field", "e10");

		waitForSometime(4000);
		// multi line
		waitForSometime(1000);
		sendkeys(EntryPageObjects.multiline,
				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
				"Enter vlaue in single line field", "e4");
		//waitForSometime(5000);
		click(EntryPageObjects.save, "click on save button", "e16");
		
		waitForSometime(5000);

	}
	
	public static void sendkeysForRTE(WebElement locator, String val,
			String description, String tc) {
		try {

			higlightElement(locator);
			locator.sendKeys(val);
			extentTest.log(LogStatus.PASS, description);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.PASS, description);
			takeScreenshot(tc);
		}
	}
	

	public static void createEntryInImportedForm() {

		click(EntryPageObjects.addNewEntry, "click on sanity contentType",
				"e1-1");

		sendkeys(
				EntryPageObjects.title,
				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.import.name")),
				"Enter entry title", "e2");
		waitForSometime(2000);
		sendkeys(EntryPageObjects.url,
				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.url")),
				"Enter entry url", "e3");

		sendkeys(
				EntryPageObjects.text1,
				ExcelUtils.readCell(1, ExcelUtils.getCell("webhook.any.entry")),
				"Enter value in text1 field", "e3");

		sendkeys(
				EntryPageObjects.text2,
				ExcelUtils.readCell(1,
						ExcelUtils.getCell("webhook.specific.asset")),
				"Enter in text2 field", "e3");

		click(EntryPageObjects.save, "click on save button", "e16");
		//waitForSometime(3000);
		verifyText(EntryPageObjects.successMessage,
				VerificationData.Entry.entryCreatedSuccesmsz,
				"verify contentType successfully imported or not ", "ed-6");
		waitForSometime(2000);
		click(EntryPageObjects.cancel, "click on cancel button", "e16");

	}

	public static void importEntry(String path) {

		click(EntryPageObjects.imported, "click on imported entry", "e1-1");
		click(EntryPageObjects.addNewEntry, "click on sanity contentType",
				"e1-1");
		click(EntryPageObjects.importIcon, "click on import icon", "i-1");
		waitForSometime(2000);
		sendkeys(EntryPageObjects.browseEntry, path,
				"browse the entry which u want import", "if1");
		//waitForSometime(5000);
		click(EntryPageObjects.importedicon, "click on import button", "i3");
		//waitForSometime(2000);
		verifyTextByindex(ContentObjects.successMessage,
				VerificationData.Entry.entryCreatedSuccesmsz,
				"verify entry successfully imported or not ", "ed-6");
		click(EntryPageObjects.save, "click on cancel button", "i3");
		waitForSometime(2000);
		click(EntryPageObjects.cancel, "click on cancel button", "i3");

	}

	public static void copyEntry() {

		waitForSometime(2000);
		mousehover(EntryPageObjects.importedEntry,
				"click on .ellipsisIcon of entry", "ee11");
		click(EntryPageObjects.ellipsisIconOfImportedEntry,
				"click on ellipsisIcon of entry", "ee11");
		click(EntryPageObjects.copyEntry, "click on copy link", "ee11");

	}

	public static void exportEntryActions() throws AWTException {

		mousehover(EntryPageObjects.importedEntry,
				"Mouse hover on entry which you want to export", "ee11");
		click(EntryPageObjects.ellipsisIconOfImportedEntry,
				"click on ellipsisIcon of entry", "ee11");
		click(EntryPageObjects.export, "click on delete button", "d2");
		
		Robot object = new Robot();
		object.keyPress(KeyEvent.VK_ENTER);
		object.keyRelease(KeyEvent.VK_ENTER);
		//waitForSometime(5000);
	}

	public static void verifyCopiedEntryActions() {

		valueOfIputbox(EntryPageObjects.titleValue,
				VerificationData.CopyEntry.titleValue,
				"Verify title of copied entry", "tc-ec2");
		verifyText(EntryPageObjects.url1, VerificationData.CopyEntry.url,
				"verify url text", "tc-2.4");
		verifyText(EntryPageObjects.text_01, VerificationData.CopyEntry.text1,
				"verify text1 field of copy form", "tc-2.5");
		verifyText(EntryPageObjects.text_02, VerificationData.CopyEntry.text2,
				"verify text2 field of copy form", "tc-2.6");
		verifyText(EntryPageObjects.text_03, VerificationData.CopyEntry.text3,
				"verify text3 field of copy form", "tc-2.7");
		verifyText(EntryPageObjects.text_04, VerificationData.CopyEntry.text4,
				"verify text4 field of copy form", "tc-2.8");
		verifyText(EntryPageObjects.text_05, VerificationData.CopyEntry.text5,
				"verify text5 field of copy form", "tc-2.9");
		verifyText(EntryPageObjects.text_06, VerificationData.CopyEntry.text6,
				"verify text6 field of copy form", "tc-2.10");
		verifyText(EntryPageObjects.uploads,
				VerificationData.CopyEntry.uploads,
				"verify file  field of copy form", "tc-2.11");
		verifyText(EntryPageObjects.linkField, VerificationData.CopyEntry.link,
				"verify link  field of copy form", "tc-2.12");
		verifyText(EntryPageObjects.copybooleanField,
				VerificationData.CopyEntry.booleanfield,
				"verify boolean  field of copy form", "tc-2.13");
		verifyText(EntryPageObjects.numberField,
				VerificationData.CopyEntry.number,
				"verify number  field of copy form", "tc-2.14");
		verifyText(EntryPageObjects.dateField, VerificationData.CopyEntry.date,
				"verify date field of copy form", "tc-2.15");
		click(EntryPageObjects.savebutton, "click on save button", "Ec-2.16");

		/*
		 * verifyText(EntryPageObjects.successmessage,
		 * VerificationData.Entry.entryCreatedSuccesmsz,
		 * "verify entry is updated or not", "ee3");
		 */
		waitForSometime(2000);
		click(EntryPageObjects.cancel, "click on cancel button", "Ec-2.16");

	}

	public static void editEntry() {

		
		waitForSometime(2000);
		
		click(ContentObjects.contentType,
				"click on add new content type button", "12");
		waitForSometime(5000);
		click(EntryPageObjects.imported,
				"click on add new content type button", "12");
		waitForSometime(5000);
		
		click(EntryPageObjects.copyOfImportedEntry,
				"click on Copy of imported entry to edit", "ee11");
		clear(EntryPageObjects.title, "remove the entry name", "ee11");
		sendkeys(EntryPageObjects.title,
				ExcelUtils.readCell(1, ExcelUtils.getCell("edit.entry")),
				"enter name name", "e2");
		waitForSometime(2000);
		sendkeys(EntryPageObjects.url,
				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.url")),
				"Enter entry url", "e3");
		System.out.println("url entered");
		click(EntryPageObjects.savebutton, "click on save button", "Ec-2.16");
		waitForSometime(1000);
		verifyTextByindex(
				ContentObjects.successMessage,
				VerificationData.Entry.successMsz,
				"verify content type successfully added or not ", "ed-6");
		waitForSometime(1000);
		click(EntryPageObjects.cancel, "click on cancel button", "Ec-2.16");

	}

	public static void deleteEntry() {

		click(EntryPageObjects.editedEntry, "click edited entry", "d1");
		click(EntryPageObjects.removeEntry, "click on delete button", "d2");
		click(EntryPageObjects.deleteButtonOnwarningbox,
				"click on delete button to delete entry", "d2");
		verifyTextByindex(ContentObjects.successMessage,
				VerificationData.Entry.deleteMSz,
				"verify entry is deleted or not", "ee3");
	}

	public static void editEntryForCompare() {

	//	waitForSometime(3000);
		click(EntryPageObjects.contentType, "click on contentType link", "e1-1");
		click(EntryPageObjects.sanityForm, "click on sanity contentType",
				"e1-1");

		// Title & url

		clear(EntryPageObjects.title, "clear the value from imputbox", "ce1");
		sendkeys(EntryPageObjects.title,
				VerificationData.EntryForCompare.title, "Enter entry title",
				"e2");

		// single line

		clear(EntryPageObjects.singleLine, "clear the value from imputbox",
				"ce1");
		//waitForSometime(3000) ;
		sendkeys(EntryPageObjects.singleLine,
				VerificationData.EntryForCompare.singleline,
				"Enter vlaue in single line field", "e4");

		// number

		clear(EntryPageObjects.number, "clear the value from number field",
				"ce1");
		sendkeys(EntryPageObjects.number,
				VerificationData.EntryForCompare.number,
				"Enter value in number field", "e13");

		// boolean
		click(EntryPageObjects.booleanField,
				"click on label of field which you want to delete", "e12");

		// RTE

		clear(EntryPageObjects.rte, "clear the value from number field", "ce1");
		sendkeys(EntryPageObjects.rte, VerificationData.EntryForCompare.rtText,
				"Enter value in rte field", "e8");

		// group

		sendkeys(
				EntryPageObjects.linkTitleInGroup,
				"mahesh",
				"Enter value in link title field which has placed in group field",
				"e8");

		sendkeys(
				EntryPageObjects.linkTitleInGroup,
				"http://www.gochirp.in/#/",
				"Enter value in link link field which has placed in group field",
				"e8");

		// Link

		clear(EntryPageObjects.linkTitle, "clear the value from link field",
				"ce1");
		sendkeys(EntryPageObjects.linkTitle,
				VerificationData.EntryForCompare.link, "Enter entry url", "e14");
		clear(EntryPageObjects.linkValue, "clear the value from link field",
				"ce1");
		sendkeys(EntryPageObjects.linkValue,
				VerificationData.EntryForCompare.linkUrl, "Enter entry url",
				"e15");
		sendkeys(EntryPageObjects.multiline,
				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
				"Enter vlaue in single line field", "e4");
		//waitForSometime(5000);

		click(EntryPageObjects.save, "click on save button", "e16");

	}

	public static void verifyCompareVersionOfEntry() {

		click(EntryPageObjects.compareVersion,
				"click oncompare version button", "ee11");

		verifyText(EntryPageObjects.compareVersionTitle,
				VerificationData.EntryForCompare.heading,
				"verify heading of compare version", "cv1");
		verifyText(EntryPageObjects.version1,
				VerificationData.EntryForCompare.version1,
				"verify version text of old entry", "cv1");
		verifyText(EntryPageObjects.version2,
				VerificationData.EntryForCompare.version2,
				"verify version text of current entry", "cv1");
		verifyText(EntryPageObjects.openThisVersion,
				VerificationData.EntryForCompare.openVersion,
				"verify open old version", "cv1");
		verifyText(EntryPageObjects.currentVersion,
				VerificationData.EntryForCompare.currentVersion,
				"verify current version", "cv1");

		verifyText(EntryPageObjects.entryVersion2title,
				VerificationData.EntryForCompare.url,
				"verify value of title inputbox", "cv1");
		verifyText(EntryPageObjects.entryVersion2singleLine,
				VerificationData.EntryForCompare.singleline,
				"verify value of single line  inputbox", "cv1");
	/*	verifyText(EntryPageObjects.entryVersion2markDown,
				VerificationData.EntryForCompare.markdDown,
				"verify value of mark donwn", "cv1");
		verifyText(EntryPageObjects.entryVersion2number,
				VerificationData.EntryForCompare.number,
				"verify value of number field inputbox", "cv1");
		verifyText(EntryPageObjects.entryVersion2rte,
				VerificationData.EntryForCompare.rtText,
				"verify value of rt inputbox", "cv1");
		verifyText(EntryPageObjects.entryVersion2Link,
				VerificationData.EntryForCompare.link,
				"verify value of link inputbox", "cv1");*/

		
		waitForSometime(3000);
		click(EntryPageObjects.compareVarsionCloseButton,
				"click oncompare version button", "ee11");
	
		verifyText(EntryPageObjects.version,
				"2",
				"verify current version of entry", "cv1");
	}

	public static void searchEntryActions() {

		sendkeys(EntryPageObjects.searchEntryHere,
				ExcelUtils.readCell(1, ExcelUtils.getCell("edit.entry")),
				"enter entry name which you want to search", "e2");
		keys(EntryPageObjects.searchEntryHere, "press enter key", "a125");
		verifyText(EntryPageObjects.editedEntry,
				VerificationData.Entry.editedEntry, "verify searched entry",
				"ee3");
		click(ContentObjects.clodeIcon, "select close icon ", "r3");
		//waitForSometime(3000);

	}
	
	
	public static void LocaliseActions() {

		
		click(EntryPageObjects.contentType, "click on content type menu", "l2");
		
		click(EntryPageObjects.imported, "click on imported form", "l3");
		
		click(EntryPageObjects.importedEntry, "click on imported entry", "l4");

		String  entryID = getTextAndStoreInVariable(EntryPageObjects.entryID, "verify searched entry","ee3");
        
       System.out.println(entryID);
		
		click(EntryPageObjects.save, "click on save button", "l17");
		
		
        click(EntryPageObjects.enUS, "click on entry language dropdown", "l15");
		
		click(EntryPageObjects.jaJp, "click on ja-jp for Localise  entry", "l15");
		
		click(EntryPageObjects.save, "click on save button", "l17");
		
		verifyText(EntryPageObjects.headingOfLocaliseEntrywarningBox,
				VerificationData.Entry.localiseEntry, "verify localise on warning box","ee3");
	
		click(EntryPageObjects.saveOnwarningBox, "click on save button", "l17");
		
		verifyText(EntryPageObjects.entryID,entryID,"verify entry id matching or not", "LE1");
		
		click(EntryPageObjects.cancel, "click on cancel button", "l17");
		
		verifyText(EntryPageObjects.languageNameIOnEntrylistPage, "Japanese  (Japan)","verify entry lanuage on entry list page", "LE1");
		
	}

}

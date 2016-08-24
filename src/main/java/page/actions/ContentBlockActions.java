package page.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.built.io.automationframework.BasePageActions;
import com.built.io.automationframework.ExcelUtils;

import data.VerificationData;
import page.objects.ContentBlockObjects;
import page.objects.ContentBlockObjects;
import page.objects.ContentBlockObjects;
import page.objects.ContentObjects;
import page.objects.DashboardObjects;
import page.objects.EntryPageObjects;
import page.objects.SettingsPageObjects;


public class ContentBlockActions extends BasePageActions {
	
	
	public static void importContentType( String path) {

		click(ContentBlockObjects.contentType, "click on contenttype link", "tc-3");
		waitForSometime(2000);
		click(ContentBlockObjects.importIcon, "click on import icon", "i-1");
		sendkeys(ContentBlockObjects.browse, path, "browse the form which u want import", "if1");
		click(ContentBlockObjects.importedIconOnWarningBox1,
				"click on import button", "i3");
		verifyTextByindex(ContentBlockObjects.successMessage,
				VerificationData.contenttype.successMSZ,
				"verify CT successfully added or not ", "al-5");

	}
	
	
	public static void exportContentType() throws AWTException  {

		mousehover(ContentBlockObjects.firstCT, "mouse hover on sanity form",
				"tc-3.7");
		click(ContentBlockObjects.EllipsisIcon,
				"mouse hover on elipsis icon of imported form", "tc-3.7");
		click(ContentBlockObjects.exportCT, "click on import icon", "tc-3");
		//waitForSometime(2000);
		  Robot object = new Robot(); object.keyPress(KeyEvent.VK_ENTER);
		  object.keyRelease(KeyEvent.VK_ENTER);
		 
	}
	
	
  public static void copyContentTypeAction(String value) {

		mousehover(ContentBlockObjects.firstCT, "mouse hover on content which you want to copy",
				"tc-3.7");
		System.out.println("in EllipsisIcon");
		click(ContentBlockObjects.EllipsisIcon,
				"mouse hover on elipsis icon of copy of imported form",
				"tc-3.7");
		System.out.println("after  EllipsisIcon");
		click(ContentBlockObjects.copyContentType, "click on import icon", "tc-3");
		waitForSometime(3000);
		valueOfIputbox(ContentBlockObjects.contentTypeTitle,
				value, "verify title of form",
				"f1");
		waitForSometime(3000);
		click(ContentBlockObjects.addFiedls, "click on save button", "tc-3");
		click(ContentBlockObjects.popup1, "click on close button of the pop up", "tc-3");
		
		
	}
	
	public static void verifyCopiedContetTypeActionsActions() {

		  waitForSometime(3000);
		System.out.println("we r in copy form action page");
		//verifyText(SingleContentBlockObjects.url, VerificationData.CopyForm.url,
		//		"verify success message", "tc-2.4");
		
		verifyText(ContentBlockObjects.text1, VerificationData.CopyForm.text1,
				"verify text1 field of copy form", "tc-2.4");
		verifyText(ContentBlockObjects.text2, VerificationData.CopyForm.text2,
				"verify text2 field of copy form", "tc-2.4");
		verifyText(ContentBlockObjects.text3, VerificationData.CopyForm.text3,
				"verify text3 field of copy form", "tc-2.4");
		verifyText(ContentBlockObjects.text4, VerificationData.CopyForm.text4,
				"verify text4 field of copy form", "tc-2.4");
		verifyText(ContentBlockObjects.text5, VerificationData.CopyForm.text5,
				"verify text5 field of copy form", "tc-2.4");
		verifyText(ContentBlockObjects.text6, VerificationData.CopyForm.text6,
				"verify text6 field of copy form", "tc-2.4");
		verifyText(ContentBlockObjects.group1, VerificationData.CopyForm.group,
				"verify group field of copy form", "tc-2.4");
		// text(CopyFormObjects.grptitle,
		// TestData.CopyForm.grpTitle,"verify success message", "tc-2.4");
		verifyText(ContentBlockObjects.grpRte, VerificationData.CopyForm.grpRte,
				"verify group Rt field of copy form text", "tc-2.4");
		verifyText(ContentBlockObjects.grpUpload, VerificationData.CopyForm.grpUpload,
				"verify group upload field of copy form", "tc-2.4");
		verifyText(ContentBlockObjects.grpboolean, VerificationData.CopyForm.grpBoolean,
				"verify group boolean field of copy form", "tc-2.4");
		verifyText(ContentBlockObjects.grpNumber, VerificationData.CopyForm.grpNumber,
				"verify group number field of copy form", "tc-2.4");
		verifyText(ContentBlockObjects.uploads, VerificationData.CopyForm.uploads,
				"verify file  field of copy form", "tc-2.4");
		verifyText(ContentBlockObjects.link1, VerificationData.CopyForm.link,
				"verify link  field of copy form", "tc-2.4");
		verifyText(ContentBlockObjects.booleanFiels, VerificationData.CopyForm.booleanfield,
				"verify boolean  field of copy form", "tc-2.4");
		verifyText(ContentBlockObjects.number1, VerificationData.CopyForm.number,
				"verify number  field of copy form", "tc-2.4");
		verifyText(ContentBlockObjects.date1, VerificationData.CopyForm.date,
				"verify date field of copy form", "tc-2.4");
		
		  waitForSometime(4000);
		click(ContentBlockObjects.saveButton1, "click on save button", "tc-3");
		  waitForSometime(4000);
		
			click(ContentBlockObjects.cancelEntry, "click on cancel button", "tc-3");

	}
	
	
	public static void editContentTypeAction(WebElement locator) {

		click(ContentBlockObjects.contentType, "click on contenttype link", "tc-3");
		waitForSometime(500);
		mousehover(locator,
				"mouse hover on mported form", "tc-3.7");
		click(ContentBlockObjects.secondCTEllipsisIcon,
				"mouse hover on elipsis icon of edit link of copy of imported form",
				"tc-3.7");
		click(ContentBlockObjects.editContentType, "click on import icon", "tc-3");
		click(ContentBlockObjects.editicon, "click on import icon", "tc-3");
		clear(ContentBlockObjects.contentTypeTitle, "clear the value form content type inputbox", "tc-3");
		sendkeys(ContentBlockObjects.contentTypeTitle, "Edited contenttype",
				"Enter the value in content type name field", "f1");
		//waitForSometime(2000);
		
		click(ContentBlockObjects.upDate, "click on save button", "tc-3");
		click(ContentBlockObjects.createAndSave, "click on save button", "tc-3");

	}
	
	
	public static void deleteContentTypeAction(WebElement locator) {

		//mousehover(locator,
		//		"mouse hover on edited content type", "tc-3.7");
		click(ContentBlockObjects.secondCTEllipsisIcon,
				"mouse hover on elipsis icon of edit link of copy of imported form",
				"tc-3.7");
		click(ContentBlockObjects.deleteCt, "click on import icon", "tc-3");
		click(ContentBlockObjects.deleteOnWarningBox, "click on import icon", "tc-3");
		waitForSometime(2000);
	}
	
	
	public static void addField(WebElement locator, WebElement locator1,
			String description, String tc) {

		dragAndDrop(locator, ContentBlockObjects.dropfield, description, tc);
		//waitForSometime(2000);
		click(locator1, "click on label of fiele", tc);
		click(ContentBlockObjects.multiple, "select muliple option", tc);
		click(ContentBlockObjects.mandatory, "select mandatory option", tc);
		click(ContentBlockObjects.labelcloseButton, "click on close button", tc);

	}
	
	
	
	
	public static void deleteFirstContentTypeAction(WebElement locator) {

		mousehover(locator,
				"mouse hover on edited content type", "tc-3.7");
		click(ContentBlockObjects.EllipsisIcon,
				"mouse hover on elipsis icon of edit link of copy of imported form",
				"tc-3.7");
		click(ContentBlockObjects.delete1, "click on import icon", "tc-3");
		click(ContentBlockObjects.deleteOnWarningBox, "click on import icon", "tc-3");
		waitForSometime(2000);
	}
	
	public static void createEntryInSingleContentBlock() {

		click(ContentBlockObjects.firstCT, "click on single content block CT",
				"e1-1");

		sendkeys(
				ContentBlockObjects.entryTitle,
				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.import.name")),
				"Enter entry title", "e2");
		waitForSometime(2000);
		
		sendkeys(
				ContentBlockObjects.text1Entry,
				ExcelUtils.readCell(1, ExcelUtils.getCell("webhook.any.entry")),
				"Enter value in text1 field", "e3");

		sendkeys(
				ContentBlockObjects.text2Entry,
				ExcelUtils.readCell(1,
						ExcelUtils.getCell("webhook.specific.asset")),
				"Enter in text2 field", "e3");

		click(ContentBlockObjects.saveEntry, "click on save button", "e16");
	
		verifyTextByindex(ContentBlockObjects.successMessage,
				VerificationData.Entry.entryCreatedSuccesmsz,
				"verify contentType successfully imported or not ", "ed-6");
		waitForSometime(2000);
		click(ContentBlockObjects.cancelEntry, "click on cancel button", "e16");

	}
	
     public static void addContentBlogForSingle(String formName, String tc) {
		
    	 click(ContentBlockObjects.contentType, "click on contenttype link", "tc-3");
		waitForSometime(2000);
		click(ContentBlockObjects.addNewForm,
				"click on add new content type button", tc);
		click(ContentBlockObjects.createBlock, "slelect content block option", tc);
		sendkeys(ContentBlockObjects.enterName, formName, "Enter form name", tc);
		click(ContentBlockObjects.createAndAddFields,
				"click 'create and addfield'button", tc);
		verifyTextByindex(
				ContentBlockObjects.successMessage,
				VerificationData.SanitycontentType.contentTypeCreatedSuccessMsz,
				"verify role successfully added or not ", "ed-6");

	}
 	public static void createContentType()  {	
		
		addField(ContentBlockObjects.singleLine,ContentBlockObjects.singleLineLabel,"add single line field","f1") ;
		 waitForSometime(4000);
		addField(ContentBlockObjects.multipleFieled,ContentBlockObjects.multipleFieledLabel,"add muliline field","f2") ;
		
		 
		 addField(ContentBlockObjects.rte,ContentBlockObjects.rteLabel,"add rte field","f4") ;
			// waitForSometime(1000);
			addField(ContentBlockObjects.markDown,ContentBlockObjects.markDownLabel,"add markdown field","f5") ;
			// waitForSometime(1000);
			addField(ContentBlockObjects.number,ContentBlockObjects.numberLabel,"add number field","f6") ;
			// waitForSometime(1000);
			
			BasePageActions.dragAndDrop(ContentBlockObjects.booleanfield, ContentBlockObjects.dropfield, "add boolean field", "7");
			// waitForSometime(1000);
			BasePageActions.dragAndDrop(ContentBlockObjects.date, ContentBlockObjects.dropfield, "add boolean field", "7");
			
			//addField(ContentBlockObjects.date,ContentBlockObjects.dateLabel,"add date field","f8") ;
			// waitForSometime(1000);
			addField(ContentBlockObjects.file,ContentBlockObjects.fileLabel,"add file field","f9") ;
			// waitForSometime(1000);
			addField(ContentBlockObjects.link,ContentBlockObjects.linkLabel,"add link field","f10") ;
			// waitForSometime(1000);
		
			// waitForSometime(1000);
			
			//BasePageActions.dragAndDrop(ContentBlockObjects.reference, ContentBlockObjects.dropfield, "add boolean field", "7");
		//	addReferenceField() ;
			
			// waitForSometime(1000);
			/*BasePageActions.dragAndDrop(ContentBlockObjects.group, ContentBlockObjects.dropfield, "add boolean field", "7");
			
			 waitForSometime(1000);
			BasePageActions.dragAndDrop(ContentBlockObjects.link, ContentBlockObjects.groupElement, "add boolean field", "7");
			// waitForSometime(1000);*/
			saveSchemaActions("f13") ;
			 //waitForSometime(2000);

	
	
	}
	
     
     public static void saveSchemaActions(String tc) {

 		click(ContentBlockObjects.saveAndClose,
 				"click on save button of contenttype", tc);
 		waitForSometime(500);
 		verifyTextByindex(ContentBlockObjects.successMessage,
 				VerificationData.SanitycontentType.contentTypeSuccessMsz,
 				"verify contentType successfully updated or not ", "ed-6");

 	}
     
     
     
     
  //Entry   
     
     
     
     public static void createEntryAction(WebElement contenttype,String title) {

 		
 		waitForSometime(300);
 		click(ContentBlockObjects.contentType, "click on contentType link", "e1-1");
 		click(contenttype, "click on sanity contentType",
 				"e1-1");

 		// Title & url
 		sendkeys(ContentBlockObjects.title,
 				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.title")),
 				"Enter entry title", "e2");
 	//	sendkeys(ContentBlockObjects.url,
 	//			ExcelUtils.readCell(1, ExcelUtils.getCell("entry.url")),
 	//			"Enter entry url", "e3");

 		// single line
 		sendkeys(ContentBlockObjects.entrySingleLine,
 				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
 				"Enter vlaue in single line field", "e4");

 		// number
 		sendkeys(ContentBlockObjects.numberEntry,
 				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.number")),
 				"Enter number in number field", "e13");

 		// boolean
 		click(ContentBlockObjects.booleanField,
 				"click on label of field which you want to delete", "e12");

 		// Date

 		click(ContentBlockObjects.dateEntry, "click on date field", "e21");
 		click(ContentBlockObjects.now, "click on now button", "e21");

 		// Link
 		sendkeys(ContentBlockObjects.linkTitle,
 				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.link")),
 				"Enter entry url", "e14");

 		sendkeys(ContentBlockObjects.linkValue,
 				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.linkurl")),
 				"Enter entry url", "e15");

 	/*	// Reference

 		click(ContentBlockObjects.searchReference, "select searched entry", "e7");

 		sendkeys(ContentBlockObjects.searchedEntry1, "Import",
 				"click on searched reference box", "e7");

 		click(ContentBlockObjects.searchedEntry, "select searched entry", "e7");*/

 		// upload file
 	
 		String rteImage = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("entry.rte.img")))
 		.getAbsolutePath();
 		
 		
 		sendkeys(ContentBlockObjects.upLoadFile,rteImage,"upload a file by using upload button", "e11");

 	/*	// choose from upload

 		click(ContentBlockObjects.upLoadFilePlusIcon,
 				"click on file plus symbol icon", "e7");


 		clickByindex(ContentBlockObjects.chooseFromUpload,1,"click on choose from upload link", "e7") ;
 		
 		sendkeys(ContentBlockObjects.searchOnChooseUploadpopUp, "mahi",
 				"Enter asset name which you want to insert", "e5");

 		click(ContentBlockObjects.selectIMg, "select searched assetk", "e7");

 		click(ContentBlockObjects.done, "click on done button", "e7");*/

 		// markdown
 		sendkeys(ContentBlockObjects.entryMarkDown,
 				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.markdown")),
 				"Enter vlaue in markdown field", "e5");

 		clickByindex(ContentBlockObjects.mardownImg,5, "click on markdown inage", "e7");
 		
 		String markDownImg = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("entry.markdown.img")))
 		.getAbsolutePath();
 		
 		System.out.println("path of markdown image :" +markDownImg);
 		sendkeys(ContentBlockObjects.browse1,rteImage,"upload image in markdown field", "e6");
 		waitForSometime(2000);
 		click(ContentBlockObjects.preview, "click on preview button", "e7");
 		waitForSometime(2000);
 		elementIsPresent(ContentBlockObjects.imgverify,
 				"verify image is present or not", "e123");

 		// RTE
 		waitForSometime(1000);
 		sendkeys(ContentBlockObjects.entryRte,
 				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.rte")),
 				"Enter value in rte field", "e8");
 		waitForSometime(1000);
 		click(ContentBlockObjects.rteImg, "click on rte image link", "e9");
 		waitForSometime(700);
 		
 		String rteImge = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("entry.rte.img")))
 		.getAbsolutePath();
 		
 		sendkeys(ContentBlockObjects.browse1,rteImge,"upload image in rte field", "e10");

 		// multi line
 		waitForSometime(1000);
 		sendkeys(ContentBlockObjects.multiline,
 				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
 				"Enter vlaue in single line field", "e4");
 		//waitForSometime(5000);
 		click(ContentBlockObjects.saveEntry, "click on save button", "e16");
 		
 		waitForSometime(5000);

 	}
     
     //Audit-logs
     
     
     public static void verifyAuditLogOFDeleteSingleContentBlock()  {

    		
    	 click(ContentBlockObjects.auditLogIcon, "click on audit log button", "e16");
    	 
    	 verifyText(ContentBlockObjects.userName1, VerificationData.auditLogs.userName,
 				"verify usename of edit form", "a93");
 		verifyText(ContentBlockObjects.action1, VerificationData.auditLogs.delete,
 				"verify action of edit form", "a94");
 		verifyText(ContentBlockObjects.module1, VerificationData.auditLogs.form,
 				"verify module of edit form", "a95");
 		verifyText(ContentBlockObjects.title1, VerificationData.auditLogs.CBimport,
 				"verify text of webhook for edit form", "a96");
 		
 		verifyText(ContentBlockObjects.userName2, VerificationData.auditLogs.userName,
 				"verify usename of edit form", "a93");
 		verifyText(ContentBlockObjects.action2, VerificationData.auditLogs.delete,
 				"verify action of edit form", "a94");
 		verifyText(ContentBlockObjects.module2, VerificationData.auditLogs.form,
 				"verify module of edit form", "a95");
 		verifyText(ContentBlockObjects.title2, VerificationData.auditLogs.editedContentType,
 				"verify name of the contenttype", "a96");
 		
 	}
     
     
     public static void verifyAuditLogOFEditSingleContentBlock()  {

 		
  		verifyText(ContentBlockObjects.userName3, VerificationData.auditLogs.userName,
  				"verify usename of edit form", "a93");
  		verifyText(ContentBlockObjects.action3, VerificationData.auditLogs.update,
  				"verify action of edit form", "a94");
  		verifyText(ContentBlockObjects.module3, VerificationData.auditLogs.form,
  				"verify module of edit form", "a95");
  		verifyText(ContentBlockObjects.title3, VerificationData.auditLogs.editedContentType,
  				"verify name of the contenttype", "a96");
  		
  	
  	}
     
     
     
     
     public static void verifyAuditLogOFCopySingleContentBlock()  {

   		
   		verifyText(ContentBlockObjects.userName4, VerificationData.auditLogs.userName,
   				"verify usename of edit form", "a93");
   		verifyText(ContentBlockObjects.action4, VerificationData.auditLogs.update,
   				"verify action of edit form", "a94");
   		verifyText(ContentBlockObjects.module4, VerificationData.auditLogs.form,
   				"verify module of edit form", "a95");
   		verifyText(ContentBlockObjects.title4, VerificationData.auditLogs.copyOfCB,
   				"verify name of the contenttype", "a96");
   		
   		verifyText(ContentBlockObjects.userName5, VerificationData.auditLogs.userName,
   				"verify usename of edit form", "a93");
   		verifyText(ContentBlockObjects.action5, VerificationData.auditLogs.create,
   				"verify action of edit form", "a94");
   		verifyText(ContentBlockObjects.module5, VerificationData.auditLogs.form,
   				"verify module of edit form", "a95");
   		verifyText(ContentBlockObjects.title5, VerificationData.auditLogs.copyOfCB,
   				"verify name of the contenttype", "a96");
  
     }
     
     
     public static void verifyAuditLogOFExportSingleContentBlock()  {

   	
   		
   		verifyText(ContentBlockObjects.userName6, VerificationData.auditLogs.userName,
   				"verify usename of edit form", "a93");
   		verifyText(ContentBlockObjects.action6, VerificationData.auditLogs.exprot,
   				"verify action of edit form", "a94");
   		verifyText(ContentBlockObjects.module6, VerificationData.auditLogs.form,
   				"verify module of edit form", "a95");
   		verifyText(ContentBlockObjects.title6, VerificationData.auditLogs.CBimport,
   				"verify name of the contenttype", "a96");
  
     }
 
     
     public static void verifyIportFormAuditLogs()  {

 		verifyText(ContentBlockObjects.userName7, VerificationData.auditLogs.userName,
 				"verify usename of  import form", "a67");
 		verifyText(ContentBlockObjects.action7, VerificationData.auditLogs.importentry,
 				"verify action of import form", "a68");
 		verifyText(ContentBlockObjects.module7, VerificationData.auditLogs.form,
 				"verify module of  import form", "a69");
 		verifyText(ContentBlockObjects.title7, VerificationData.auditLogs.CBimport,
 				"verify text of  import form", "a70");

 	}
     
     public static void verifyAuditLogOFCreateSingleContentBlock()  {

 		
    	 click(ContentBlockObjects.auditLogIcon, "click on audit log button", "e16");
    	 
    	 verifyText(ContentBlockObjects.userName1, VerificationData.auditLogs.userName,
 				"verify usename of edit form", "a93");
 		verifyText(ContentBlockObjects.action1, VerificationData.auditLogs.update,
 				"verify action of edit form", "a94");
 		verifyText(ContentBlockObjects.module1, VerificationData.auditLogs.form,
 				"verify module of edit form", "a95");
 		verifyText(ContentBlockObjects.title1, VerificationData.auditLogs.singleCB,
 				"verify text of webhook for edit form", "a96");
 		
 		verifyText(ContentBlockObjects.userName2, VerificationData.auditLogs.userName,
 				"verify usename of edit form", "a93");
 		verifyText(ContentBlockObjects.action2, VerificationData.auditLogs.create,
 				"verify action of edit form", "a94");
 		verifyText(ContentBlockObjects.module2, VerificationData.auditLogs.form,
 				"verify module of edit form", "a95");
 		verifyText(ContentBlockObjects.title2, VerificationData.auditLogs.singleCB,
 				"verify name of the contenttype", "a96");
 		
 	}
     
    
     public static void verifyAuditLogOFCreateEntryInSingleContentBlock()  {

    		verifyText(ContentBlockObjects.userName3, VerificationData.auditLogs.userName,
    				"verify usename of edit form", "a93");
    		verifyText(ContentBlockObjects.action3, VerificationData.auditLogs.create,
    				"verify action of edit form", "a94");
    		verifyText(ContentBlockObjects.module3, VerificationData.auditLogs.form,
    				"verify module of edit form", "a95");
    		verifyText(ContentBlockObjects.title3, VerificationData.auditLogs.CBimport,
    				"verify name of the contenttype", "a96");
   
      }
     
     public static void importEntry(String path) {

 		click(ContentBlockObjects.firstCT, "click on imported entry", "e1-1");
 		click(ContentBlockObjects.addNewEntry, "click on sanity contentType",
 				"e1-1");
 		click(ContentBlockObjects.importIcon, "click on import icon", "i-1");
 		waitForSometime(2000);
 		sendkeys(ContentBlockObjects.browseEntry, path,
 				"browse the entry which u want import", "if1");
 		//waitForSometime(5000);
 		click(ContentBlockObjects.importedicon, "click on import button", "i3");
 		//waitForSometime(2000);
 		verifyTextByindex(ContentBlockObjects.successMessage,
 				VerificationData.Entry.entryCreatedSuccesmsz,
 				"verify entry successfully imported or not ", "ed-6");
 		click(ContentBlockObjects.saveEntry, "click on cancel button", "i3");
 		waitForSometime(2000);
 		click(ContentBlockObjects.cancel, "click on cancel button", "i3");

 	}
     
 
}

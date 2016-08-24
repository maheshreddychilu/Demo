package page.actions;

import java.io.File;

import org.openqa.selenium.WebElement;

import com.built.io.automationframework.BasePageActions;
import com.built.io.automationframework.ExcelUtils;

import data.VerificationData;
import page.objects.ColumnViewObjects;
import page.objects.ColumnViewObjects;
import page.objects.ColumnViewObjects;
import page.objects.URLpatternObjects;

public class ColumnViewActions extends BasePageActions {
	
	public static void addField(WebElement locator, WebElement locator1,
			String description, String tc) {

		dragAndDrop(locator, ColumnViewObjects.dropfield, description, tc);
		//waitForSometime(2000);
	
		
		click(locator1, "click on label of fiele", tc);
		click(ColumnViewObjects.mandatory, "select mandatory option", tc);
		click(ColumnViewObjects.labelcloseButton, "click on close button", tc);

	}
	
	public static void addContentTypeForSingle(String formName,
			String description, String tc) throws InterruptedException {

		
		waitForSometime(3000);
		click(ColumnViewObjects.addNewForm,
				"click on add new content type button", tc);
		sendkeys(ColumnViewObjects.enterName, formName, "Enter form name", tc);
		click(ColumnViewObjects.createMultiple,
				"click on add new content type button", tc);

		click(ColumnViewObjects.createAndAddFields,
				"click on add new form button", tc);
	     waitForSometime(1000);
		verifyTextByindex(
				ColumnViewObjects.successMessage,
				VerificationData.SanitycontentType.contentTypeCreatedSuccessMsz,
				"verify content type successfully added or not ", "ed-6");

	}
	
	public static void saveSchemaActions(String tc) {

		click(ColumnViewObjects.saveAndClose,
				"click on save button of contenttype", tc);
		waitForSometime(500);
		verifyTextByindex(ColumnViewObjects.successMessage,
				VerificationData.SanitycontentType.contentTypeSuccessMsz,
				"verify contentType successfully updated or not ", "ed-6");

	}
	
	public void createContentType() throws InterruptedException  {

	//	addContentTypeForSingle(ExcelUtils.readCell(1, ExcelUtils.getCell("form.name")),ExcelUtils.readCell(1, ExcelUtils.getCell("form.description")),"af1") ;
		 waitForSometime(1000);
		addField(ColumnViewObjects.singleLine,ColumnViewObjects.singleLineLabel,"add single line field","f1") ;
		addField(ColumnViewObjects.multipleFieled,ColumnViewObjects.multipleFieledLabel,"add muliline field","f2") ;
		addField(ColumnViewObjects.number,ColumnViewObjects.numberLabel,"add number field","f6") ;
		BasePageActions.dragAndDrop(ColumnViewObjects.booleanfield, ColumnViewObjects.dropfield, "add boolean field", "7");
		BasePageActions.dragAndDrop(ColumnViewObjects.dateCt, ColumnViewObjects.dropfield, "add boolean field", "7");
		addField(ColumnViewObjects.link,ColumnViewObjects.linkLabel,"add link field","f10") ;
		saveSchemaActions("f13") ;
	
 }
    public static void closePopUp()  {	

    	click(URLpatternObjects.popup,
				"click on shared with me link", "sf-2");
	}
	
  public static void createEntryAction(WebElement contenttype) {

		waitForSometime(300);
		click(ColumnViewObjects.contentType, "click on contentType link", "e1-1");
		click(contenttype, "click on sanity contentType",
			"e1-1");
		
		click(ColumnViewObjects.addNewForm,
				"click on add new content type button", "12");
		
		  // boolean
	    click(ColumnViewObjects.booleanField,"click on label of field which you want to delete", "e12");
		// Date
		click(ColumnViewObjects.date, "click on date field", "e21");
		click(ColumnViewObjects.now, "click on now button", "e21");
	    click(ColumnViewObjects.now, "click on now button", "e21");
		// Link
		sendkeys(ColumnViewObjects.linkTitleEntry,ExcelUtils.readCell(1, ExcelUtils.getCell("entry.link")),"Enter entry url", "e14");
		sendkeys(ColumnViewObjects.linkValue,ExcelUtils.readCell(1, ExcelUtils.getCell("entry.linkurl")),"Enter entry url", "e15");
		// Title & url
		sendkeys(ColumnViewObjects.title,ExcelUtils.readCell(1, ExcelUtils.getCell("entry.title")),"Enter entry title", "e2");
		// single line
		sendkeys(ColumnViewObjects.singleLineEntry,	"builtio","Enter vlaue in single line field", "e4");
		// number
		sendkeys(ColumnViewObjects.numberEntry,ExcelUtils.readCell(1, ExcelUtils.getCell("entry.number")),"Enter number in number field", "e13");

       // multi line
		waitForSometime(1000);
		sendkeys(ColumnViewObjects.multilineEntry,ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),"Enter vlaue in single line field", "e4");
		click(ColumnViewObjects.savebutton, "click on save button", "e16");
		waitForSometime(2000);
		click(ColumnViewObjects.entryCancel, "click on save button", "e16");

	}
  
  public static void verifyColumnViewAction(WebElement option,WebElement locator1,WebElement locator2,String first,String second) {

		waitForSometime(500);
		click(ColumnViewObjects.coloumnViewICon, "click on column view icon", "e1-1");
		click(option, "select field in columnview dropdown",
			"e1-1");
		verifyText(locator1,first,"verify value of the field", "ed-6");
		verifyText(locator2,second,"verify value of the field", "ed-6");
		 
		click(option, "select field in columnview dropdown",
				"e1-1");
		elementIsNotPresent(locator1, "verify field presentor not",
				"e1-1");
		elementIsNotPresent(locator2, "verify field value presentor not",
				"e1-1");
		
		click(ColumnViewObjects.coloumnViewICon, "click on column view icon", "e1-1");
	}

  public static void deleteContentTypeAction() {

 	 System.out.println("In delete CT");
 	 click(ColumnViewObjects.contentType, "click on contenttype link", "tc-3");
 	 click(ColumnViewObjects.firstTEllipsisIcon,
				"mouse hover on elipsis icon of edit link of copy of imported form",
				"tc-3.7");
		click(ColumnViewObjects.deleteCt, "click on import icon", "tc-3");
		click(ColumnViewObjects.deleteOnWarningBox, "click on import icon", "tc-3");
		waitForSometime(1000);
	}
	

}

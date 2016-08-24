package page.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.built.io.automationframework.BasePageActions;
import com.relevantcodes.extentreports.LogStatus;

import data.VerificationData;
import page.objects.AssetObjects;
import page.objects.ContentObjects;
import page.objects.DashboardObjects;
import page.objects.LoginPageObjects;
import page.objects.SettingsPageObjects;
import page.objects.WebHookObjects;

public class ContentTypeActions extends BasePageActions {

	public static void importContentType(WebElement locator, String path) {

		click(ContentObjects.contentType, "click on contenttype link", "tc-3");
		waitForSometime(2000);
		click(ContentObjects.importIcon, "click on import icon", "i-1");
		sendkeys(locator, path, "browse the form which u want import", "if1");
		click(ContentObjects.importedIconOnWarningBox,
				"click on import button", "i3");
		verifyText(ContentObjects.importedForm,
				VerificationData.SanitycontentType.importedForm,
				"verify contentType successfully imported or not ", "ed-6");

	}

	public static void addField(WebElement locator, WebElement locator1,
			String description, String tc) {

		dragAndDrop(locator, ContentObjects.dropfield, description, tc);

		click(locator1, "click on label of fiele", tc);
		click(ContentObjects.multiple, "select muliple option", tc);
		click(ContentObjects.mandatory, "select mandatory option", tc);
		
		click(ContentObjects.labelcloseButton, "click on close button", tc);

	}
	
	public static void addRTEField(WebElement locator, WebElement locator1,
			String description, String tc) {

		dragAndDrop(locator, ContentObjects.dropfield, description, tc);
		waitForSometime(800);
		click(locator1, "click on label of fiele", tc);
		click(ContentObjects.multiple, "select muliple option", tc);
		click(ContentObjects.mandatory, "select mandatory option", tc);
		waitForSometime(800);
		closeButton(ContentObjects.labelcloseButton, "click on close button", tc);

	}
	public static void closeButton(WebElement locator, String description, String tc) {
		try {
			higlightElement(locator);
			locator.isEnabled();
			locator.click();
			extentTest.log(LogStatus.PASS, description);
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException:");
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.PASS, description);
			System.out.println("element not found :  " + locator + description);
			takeScreenshot(tc);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.PASS, description);
			takeScreenshot(tc);
			
			
		}
	}

	public static void deleteField(WebElement locator, String tc) {

		mousehover(locator, "mouse hover on mported form", "tc-3.7");
		clickByindex(ContentObjects.deleteIcon1, 2, "click on edit icon", "L2");
		click(ContentObjects.deletebutton, "click on delete button", tc);

	}

	public static void saveSchemaActions(String tc) {

		click(ContentObjects.saveAndClose,
				"click on save button of contenttype", tc);
		waitForSometime(500);
		verifyTextByindex(ContentObjects.successMessage,
				VerificationData.SanitycontentType.contentTypeSuccessMsz,
				"verify contentType successfully updated or not ", "ed-6");

	}

	public static void cancelSchema() {

		 waitForSometime(4000);
		click(ContentObjects.cancel, "click on cancel button of schema", "12");

	}

	public static void addContentType(String formName, String description,
			String tc) {
		waitForSometime(2000);
    	click(ContentObjects.contentType,
				"click on add new content type button", tc);

		wiatForElement("//a[@data-ng-click='forms.create()']");

		click(ContentObjects.newContentType,
				"click on add new content type button", tc);
		sendkeys(ContentObjects.enterName, formName, "Enter form name", tc);
		click(ContentObjects.createAndAddFields,
				"click on add new form button", tc);
		waitForSometime(500);
		click(DashboardObjects.popup,
			"click on shared with me link", "sf-2");
//		verifyText(
//				ContentObjects.successMessage,
//				VerificationData.SanitycontentType.contentTypeCreatedSuccessMsz,
//				"verify contenmt Type successfully created or not ", "ed-6");

	}

	public static void addContentTypeForSingle(String formName,
			String description, String tc) throws InterruptedException {

		click(ContentObjects.addNewForm,
				"click on add new content type button", tc);

		sendkeys(ContentObjects.enterName, formName, "Enter form name", tc);

		click(ContentObjects.createAndAddFields,
				"click on add new form button", tc);
		
	     waitForSometime(1000);
		
	     
	     
	//	verifyTextByindex(
	//			ContentObjects.successMessage,
	//			VerificationData.SanitycontentType.contentTypeCreatedSuccessMsz,
	//			"verify content type successfully added or not ", "ed-6");
		
		

		
	}

	public static void addReferenceField() {

		click(ContentObjects.referenceLabel, "select muliple option", "r3");

		clickBySize(ContentObjects.selectContentType,
				"click on selectModule dropdown list", "w-13");

		click(ContentObjects.importedFormOnDropDown, "select imported form",
				"r1");
		click(ContentObjects.labelcloseButton, "click on close button", "r3");
	}

	public static void exportContentTypeActions() throws AWTException {

		mousehover(ContentObjects.importedForm, "mouse hover on empty form",
				"tc-3.7");
		click(ContentObjects.importedEllipsisIcon,
				"mouse hover on elipsis icon of imported form", "tc-3.7");
		click(ContentObjects.exportLink, "click on export link", "tc-3");
		//waitForSometime(2000);
		Robot object = new Robot();
		object.keyPress(KeyEvent.VK_ENTER);
		object.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void exportContentTypeWithEntryActions() throws AWTException {

		mousehover(ContentObjects.sanityForm, "mouse hover on sanity form",
				"tc-3.7");
		click(ContentObjects.sanityEllipsisIcon,
				"mouse hover on elipsis icon of imported form", "tc-3.7");
		click(ContentObjects.exportLink1, "click on import icon", "tc-3");
		//waitForSometime(2000);
		
		  Robot object = new Robot(); object.keyPress(KeyEvent.VK_ENTER);
		  object.keyRelease(KeyEvent.VK_ENTER);
		 
	}

	public static void deleteContentTypeAction() {

		//waitForSometime(3000);
		mousehover(ContentObjects.editForm,
				"mouse hover on edited content type", "tc-3.7");
		click(ContentObjects.editedEllipsisIcon,
				"mouse hover on elipsis icon of edit link of copy of imported form",
				"tc-3.7");
		click(ContentObjects.delete, "click on import icon", "tc-3");
		click(ContentObjects.deleteOnWarningBox, "click on import icon", "tc-3");
		waitForSometime(2000);
	}

	public static void copyContentTypeAction() {
	
		mousehover(ContentObjects.importedForm, "mouse hover on mported form",
				"tc-3.7");
		click(ContentObjects.importedEllipsisIcon,
				"mouse hover on elipsis icon of copy of imported form",
				"tc-3.7");
		click(ContentObjects.copyContentType, "click on import icon", "tc-3");
		valueOfIputbox(ContentObjects.contentTypeTitle,
				VerificationData.CopyForm.copyFormAction, "verify title of form",
				"f1");
	//	waitForSometime(1000);
		click(ContentObjects.createAndSave, "click on save button", "tc-3");
	}

	public static void editContentTypeAction() {

		click(ContentObjects.contentType, "click on contenttype link", "tc-3");
		waitForSometime(500);
		mousehover(ContentObjects.copyOfImportedForm,
				"mouse hover on mported form", "tc-3.7");
		click(ContentObjects.copy_importedFormEllipsisIcon,
				"mouse hover on elipsis icon of edit link of copy of imported form",
				"tc-3.7");
		click(ContentObjects.editContentType, "click on import icon", "tc-3");
		click(ContentObjects.editicon, "click on import icon", "tc-3");
		clear(ContentObjects.contentTypeTitle, "clear the value form content type inputbox", "tc-3");
		sendkeys(ContentObjects.contentTypeTitle, "Edited contenttype",
				"Enter the value in content type name field", "f1");
		//waitForSometime(2000);
		click(ContentObjects.createAndSave, "click on save button", "tc-3");

	}

	public static void searchContentTypeAction() {

		//waitForSometime(1000);
		sendkeys(ContentObjects.searchAllContentType, "imported form",
				"enter contenttype name which you want to search", "12");
		keys(ContentObjects.searchAllContentType, "press enter key", "a125");
		verifyText(ContentObjects.importedForm,
				VerificationData.SanitycontentType.importedForm,
				"verify searched contenttype  ", "ed-6");
		click(ContentObjects.clodeIcon, "select close icon ", "r3");
		//waitForSometime(3000);
	}

	public static void createLebel() {

		waitForSometime(3000);
		click(ContentObjects.applyLableFor, "click on apply label drop down",
				"L1");
		waitForSometime(800);
		click(ContentObjects.createNewLable, "click on apply label drop down",
				"L2");
		sendkeys(ContentObjects.labelName, "Sanity label",
				"Enter name of the label", "L3");
		click(ContentObjects.createApply, "click on apply label drop down",
				"L2");
		waitForSometime(700);
		verifyTextByindex(ContentObjects.successMessage,
				VerificationData.SanitycontentType.lebelCreatedSuccessMsz,
				"verify succes message", "ed-6");

	}

	public static void verifyLabelViewPageActions() {

	
		click(ContentObjects.contentType, "click on contenttype link", "tc-3");
		waitForSometime(2000);
		click(ContentObjects.alphabetical, "click label view dropdown", "L12");
		waitForSometime(2000);
		click(ContentObjects.labeloption, "select label option from dropdown",
				"L13");
		verifyText(ContentObjects.formTitle,
				VerificationData.SanitycontentType.title,
				"verify form title text", "ed-14");
		verifyText(ContentObjects.formDesc,
				VerificationData.SanitycontentType.discription,
				"verify description text", "ed-15");
		verifyText(ContentObjects.modifyAt,
				VerificationData.SanitycontentType.ModifiedAt,
				"verify ModifiedAt  text", "ed-16");
		verifyText(ContentObjects.manageLabel,
				VerificationData.SanitycontentType.manageLabel,
				"verify manageLabel text", "ed-17");
		verifyText(ContentObjects.emptyForm,
				VerificationData.SanitycontentType.emptyForm,
				"verify empty content type text", "ed-17");
		verifyText(ContentObjects.sanityLabelPage,
				VerificationData.SanitycontentType.sanityLabel,
				"verify sanity label text", "ed-18");
	}

	public static void createLebelFromLabelView() {

	
		
		click(ContentObjects.manageLabel, "click on manage label button", "L1");
		click(ContentObjects.newLabel, "click new label button", "L1");
		sendkeys(ContentObjects.labelName, "Childlabel",
				"Enter name of the label", "L3");
		click(ContentObjects.applyLableFor, "click on apply label drop down",
				"L1");
		click(ContentObjects.sanityLabel, "select sanity label as aparent",
				"L1");
		click(ContentObjects.createLabel, "click on create button", "L1");
		
		//waitForSometime(2000);
		verifyTextByindex(ContentObjects.successMessage,
				VerificationData.SanitycontentType.labelCreatedMsz,
				"verify succes message", "ed-6");
		click(ContentObjects.labelClose,
				"click on close button of manage label dailogbox", "L2");
	//	waitForSometime(3000);
	}

	public static void editLableActions() {
	
		click(ContentObjects.manageLabel, "click on manage label link", "L1");
		waitForSometime(1000);
		clickByindex(ContentObjects.labelEditIcon, 4, "click on edit icon", "L2");
		clear(ContentObjects.labelName,
				"clear the value form label name inputbox", "L2");
		sendkeys(ContentObjects.labelName, "Editlabel",
				"Enter name of the label", "L3");
		click(ContentObjects.editLabelsvaeButton, "click on apply label drop down",
				"L2");
		verifyTextByindex(ContentObjects.successMessage,
				VerificationData.SanitycontentType.lebelUpdateSuccessMsz,
				"verify succes message", "ed-6");
		click(ContentObjects.labelClose,
				"click on close button of manage label dailogbox", "L2");
		//waitForSometime(2000);

	}

	public static void deleteLableActions() {

		click(ContentObjects.manageLabel, "click on manage label link", "L1");
		clickByindex(ContentObjects.deleteIcon, 6, "click on delete icon", "L2");
		click(ContentObjects.deleteButtonOnWarningBox,
				"click on delete button", "L3");
		click(ContentObjects.labelClose,
				"click on close button of manage label dailogbox", "L4");
	}
	

	public static void verifyPaginationOfContenttypeActions() {

		verifyText(ContentObjects.pagination,
				VerificationData.SanitycontentType.paginationText,
				"verify pagination ", "ed-6");

	}

	public static void addContentBlogForSingle(String formName, String tc) {
		
		click(ContentObjects.contentType, "click on contenttype link", "tc-3");
		waitForSometime(2000);
		click(ContentObjects.addNewForm,
				"click on add new content type button", tc);
		click(ContentObjects.createBlock, "slelect content block option", tc);
		sendkeys(ContentObjects.enterName, formName, "Enter form name", tc);
		click(ContentObjects.createAndAddFields,
				"click 'create and addfield'button", tc);
		verifyTextByindex(
				ContentObjects.successMessage,
				VerificationData.SanitycontentType.contentTypeCreatedSuccessMsz,
				"verify role successfully added or not ", "ed-6");

	}

	public static void addContentBlogForSet(String formName,
			String description, String tc) {

		click(ContentObjects.addNewForm,
				"click on add new content type button", tc);
		waitForSometime(2000);
		click(ContentObjects.createBlock, "slelect content block option", tc);
		sendkeys(ContentObjects.enterName, formName, "Enter form name", tc);
		click(ContentObjects.sets, "slelect content block option", tc);
		click(ContentObjects.createAndAddFields,
				"click on add new form button", tc);
		verifyTextByindex(
				ContentObjects.successMessage,
				VerificationData.SanitycontentType.contentTypeCreatedSuccessMsz,
				"verify role successfully added or not ", "ed-6");

	}

}

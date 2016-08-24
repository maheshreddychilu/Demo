package page.actions;

import org.openqa.selenium.WebElement;

import page.objects.PublishModalObjects;
import page.objects.PublishModalObjects;
import page.objects.PublishModalObjects;
import page.objects.PublishModalObjects;
import page.objects.PublishModalObjects;
import page.objects.SettingsPageObjects;

import com.built.io.automationframework.BasePageActions;
import com.built.io.automationframework.ExcelUtils;

import data.VerificationData;

public class PublishModalActions extends BasePageActions {
	
	// Languages Actions
		public static void clickOnLanguageTab()  {

			   waitForSometime(1000) ;	
			mousehover(PublishModalObjects.settingsMenu,
					"mouse hover on setting menu", "hs-1");
			click(PublishModalObjects.languagesLink,
					"click on add new language button", "Al-1");

		}

	
		public static void addNewLanguage(String langugeName)  {

			  waitForSometime(3000) ;
			click(PublishModalObjects.add, "click on add new language button",
					"Al-1");
			click(PublishModalObjects.languageName,
					"click on language list dropdown", "Al-2");
			sendkeys(
					PublishModalObjects.searchlanguage,
					langugeName,
					"enter language name in search input box which you want to search",
					"al-3");
			click(PublishModalObjects.selectLanguage,
					"click on language list dropdown", "Al-4");
			click(PublishModalObjects.addLanguage, "click on add button", "Al-4");
			verifyTextByindex(PublishModalObjects.successMessage,
					VerificationData.Setting.lunguageAddsuccessMessage,
					"verify langauage successfully added or not ", "al-5");
		}
	
		//================================================
		
		
		public static void createBlankEnv(WebElement locator,String envName)  {

			
			click(locator, "click on add new language button",
					"AE-1");
			sendkeys(PublishModalObjects.envName,envName,"enter Environment name in name inputbox",
					"Ae-2");
			click(PublishModalObjects.advced,"click add button", "Al-4");
			click(PublishModalObjects.serversCheckBox,"click add button", "Al-4");
			click(PublishModalObjects.create,
					"click add button", "Al-4");

		}
		
		public static void clickOnEnvironmentTab()  {

			 waitForSometime(3000);
	   mousehover(PublishModalObjects.settingsMenu,
			"mouse hover on setting menu", "e-1");
	  waitForSometime(2000);
	  click(PublishModalObjects.environmentsLink,
			"click on Environment link", "E2");
	  waitForSometime(500);
	
     }
		
	
	//===================content type actiobs
	
	public static void addContentTypeForSingle(String formName,
			String description, String tc) throws InterruptedException {

		click(PublishModalObjects.contentType,
				"click on content type button which is placed on header", tc);
		waitForSometime(3000);
		click(PublishModalObjects.addNewForm,
				"click on add new content type button", tc);
		sendkeys(PublishModalObjects.enterName, formName, "Enter form name", tc);
		click(PublishModalObjects.createMultiple,
				"click on add new content type button", tc);
		click(PublishModalObjects.createAndAddFields,
				"click on add new form button", tc);
	     waitForSometime(1000);
		verifyTextByindex(
				PublishModalObjects.successMessage,
				VerificationData.SanitycontentType.contentTypeCreatedSuccessMsz,
				"verify content type successfully added or not ", "ed-6");

	}
	
	public void createContentType() throws InterruptedException  {

		//	addContentTypeForSingle(ExcelUtils.readCell(1, ExcelUtils.getCell("form.name")),ExcelUtils.readCell(1, ExcelUtils.getCell("form.description")),"af1") ;
			 waitForSometime(1000);
			addField(PublishModalObjects.singleLine,PublishModalObjects.singleLineLabel,"add single line field","f1") ;
			addField(PublishModalObjects.multipleFieled,PublishModalObjects.multipleFieledLabel,"add muliline field","f2") ;
			addField(PublishModalObjects.number,PublishModalObjects.numberLabel,"add number field","f6") ;
			BasePageActions.dragAndDrop(PublishModalObjects.booleanfield, PublishModalObjects.dropfield, "add boolean field", "7");
			BasePageActions.dragAndDrop(PublishModalObjects.dateCt, PublishModalObjects.dropfield, "add boolean field", "7");
			addField(PublishModalObjects.link,PublishModalObjects.linkLabel,"add link field","f10") ;
			saveSchemaActions("f13") ;
		
	 }
	 
	 public static void addField(WebElement locator, WebElement locator1,
				String description, String tc) {
			dragAndDrop(locator, PublishModalObjects.dropfield, description, tc);
			//waitForSometime(2000);
			click(locator1, "click on label of fiele", tc);
			click(PublishModalObjects.multiple, "select muliple option", tc);
			click(PublishModalObjects.mandatory, "select mandatory option", tc);
			click(PublishModalObjects.labelcloseButton, "click on close button", tc);

		}
	 
	   public static void saveSchemaActions(String tc) {
	 		click(PublishModalObjects.save,
	 				"click on save button of contenttype", tc);
	 		waitForSometime(500);
	 		verifyTextByindex(PublishModalObjects.successMessage,
	 				VerificationData.SanitycontentType.contentTypeSuccessMsz,
	 				"verify contentType successfully updated or not ", "ed-6");
	 	}

	   
	   
	//=================Entry actions
	   
	   
	   
	   public static void createEntryAction(WebElement contenttype) {

			waitForSometime(300);
			click(PublishModalObjects.contentType, "click on contentType link", "e1-1");
			click(contenttype, "click on sanity contentType",
				"e1-1");
			
			click(PublishModalObjects.addNewForm,
					"click on add new content type button", "12");
			
			  // boolean
		    click(PublishModalObjects.booleanField,"click on label of field which you want to delete", "e12");
			// Date
			click(PublishModalObjects.dateEntry, "click on date field", "e21");
			click(PublishModalObjects.now, "click on now button", "e21");
		    click(PublishModalObjects.done, "click on now button", "e21");
			// Link
			sendkeys(PublishModalObjects.linkTitleEntry,ExcelUtils.readCell(1, ExcelUtils.getCell("entry.link")),"Enter entry url", "e14");
			sendkeys(PublishModalObjects.linkValue,ExcelUtils.readCell(1, ExcelUtils.getCell("entry.linkurl")),"Enter entry url", "e15");
			// Title & url
			sendkeys(PublishModalObjects.title,ExcelUtils.readCell(1, ExcelUtils.getCell("entry.title")),"Enter entry title", "e2");
			// single line
			sendkeys(PublishModalObjects.singleLineEntry,	"builtio","Enter vlaue in single line field", "e4");
			// number
			sendkeys(PublishModalObjects.numberEntry,ExcelUtils.readCell(1, ExcelUtils.getCell("entry.number")),"Enter number in number field", "e13");

	       // multi line
			waitForSometime(1000);
			sendkeys(PublishModalObjects.multilineEntry,ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),"Enter vlaue in single line field", "e4");
			click(PublishModalObjects.saveEntry, "click on save button", "e16");
			waitForSometime(1000);
			//click(PublishModalObjects.entryCancel, "click on save button", "e16");

		}
	   
	//Localise entry
	   
	   
	   public static void LocaliseActions(WebElement Locator1, WebElement Locator2) {

			
		     String  entryID = getTextAndStoreInVariable(PublishModalObjects.entryID, "verify searched entry","ee3");
	         System.out.println(entryID);
	        click(Locator1, "click on entry language dropdown", "l15");
			click(Locator2, "click on ja-jp for Localise  entry", "l15");
			waitForSometime(2000);
			click(PublishModalObjects.saveEntry, "click on save button", "l17");
			verifyText(PublishModalObjects.headingOfLocaliseEntrywarningBox,
					VerificationData.Entry.localiseEntry, "verify localise on warning box","ee3");
			click(PublishModalObjects.saveOnwarningBox, "click on save button", "l17");
			
			System.out.println("entry id  :" +entryID);
			//verifyText(PublishModalObjects.entryID, entryID,"verify entry id matching or not", "LE1");
			waitForSometime(1000);
			click(PublishModalObjects.entryCancel, "click on cancel button", "l17");
			//verifyText(PublishModalObjects.languageNameIOnEntrylistPage, "Japanese  (Japan)","verify entry lanuage on entry list page", "LE1");
			//click(PublishModalObjects.languageNameIOnEntrylistPage, "go to the localised entry page", "l17");
			
		}
	   
	   
	   public static void LocaliseEntryInTeluguLocale() {
		
		   click(PublishModalObjects.languageNameIOnEntrylistPage, "click on localesed entry ", "l17");
		   String  entryID = getTextAndStoreInVariable(PublishModalObjects.entryID, "verify searched entry","ee3");
	         System.out.println(entryID);
	         click(PublishModalObjects.localeDropdwon, "click locale dropdown box", "l17");
	         click(PublishModalObjects.telugu, "click on teslugu locale to localise", "l15");
			waitForSometime(2000);
			click(PublishModalObjects.saveEntry, "click on save button", "l17");
			verifyText(PublishModalObjects.headingOfLocaliseEntrywarningBox,
					VerificationData.Entry.localiseEntry, "verify localise on warning box","ee3");
			click(PublishModalObjects.saveOnwarningBox, "click on save button", "l17");
			verifyText(PublishModalObjects.entryID,entryID,"verify entry id matching or not", "LE1");
			click(PublishModalObjects.entryCancel, "click on cancel button", "l17");
			verifyText(PublishModalObjects.languageNameIOnEntrylistPage, "Telugu  (India)","verify entry lanuage on entry list page", "LE1");
			
		}
	   
	   public static void verifyPublishingModalActions() {
			
		   click(PublishModalObjects.languageNameIOnEntrylistPage, "click on localesed entry ", "l17");
	         click(PublishModalObjects.localeDropdwon, "click locale dropdown box", "l17");
	         click(PublishModalObjects.enUS, "click on teslugu locale to localise", "l15");
			waitForSometime(2000);
			click(PublishModalObjects.publishButton, "click on publish entry button", "l17");
		
			verifyText(PublishModalObjects.publishModalTitle,
					VerificationData.Entry.publishModalTitle, "verify title of the publish modal","ee3");
			elementIsChecked(PublishModalObjects.englishLocale, "verify master locale selected or not", "l17");
			elementIsNotChecked(PublishModalObjects.englishAUS, "verify foreign (enus) locale selected or not", "l17");
			elemetIsDisable(PublishModalObjects.jajp, "verify foreign (jajp) locale enabled or not", "l17");
			elemetIsDisable(PublishModalObjects.teluguLocale, "verify foreign (telugu) locale enabled or not", "l17");
			
			verifyText(PublishModalObjects.selectAllUnlocalizedLan, "Select all unlocalized languages","verify slect all unlocallized language text", "LE1");
			click(PublishModalObjects.selectAllUnlocalizedLan, "click on Select all unlocalized languages link", "l17");
			elementIsChecked(PublishModalObjects.englishAUS, "verify locale selected or not", "l17");
			
			mousehover(PublishModalObjects.mHelpTExt, "mouse over on m  symbol", "l17");
			waitForSometime(800);
			verifyText(PublishModalObjects.lHelpTExtDes, VerificationData.Entry.masterLocaleHelpText,"verify help text of M", "LE1");
			
			mousehover(PublishModalObjects.lHelpTExt, "mouse over on m  symbol", "l17");
			waitForSometime(800);
			verifyText(PublishModalObjects.lHelpTExtDes, VerificationData.Entry.forignLocaleHelpText,"verify help text of L", "LE1");
			
			click(PublishModalObjects.publishButton, "click on publish entry button", "l17");
			
		}
	
	   public static void verifyUnlocalizeEntryActions() {
			
	       //  click(PublishModalObjects.localeDropdwon, "click locale dropdown box", "l17");
	         click(PublishModalObjects.closePopUp, "click on close button", "l15");
			waitForSometime(2000);
			click(PublishModalObjects.unlocalizeButton, "click onunlocalize button", "l17");
			verifyText(PublishModalObjects.titleOFunlocalizeModal,
					VerificationData.Entry.unlocaliseEntry, "verify Unlocalise on warning box","ee3");
			click(PublishModalObjects.unlocalizeButtonOnmodal, "click on save button", "l17");
			verifyTextByindex(PublishModalObjects.successMessage,
					VerificationData.Entry.unlocaliseEntrySuccessMsz,
					"verify langauage successfully added or not ", "al-5");
			
			click(PublishModalObjects.entryCancel, "click on save button", "l17");
		//	verifyText(PublishModalObjects.languageNameIOnEntrylistPage,
		//			VerificationData.Entry.engUS, "verify localise on warning box","ee3");
			
		}
	   
}

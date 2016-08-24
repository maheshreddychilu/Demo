package page.actions;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.openqa.selenium.WebElement;

import com.built.io.automationframework.BasePageActions;
import com.built.io.automationframework.ExcelUtils;

import data.VerificationData;
import page.objects.ContentBlockObjects;
import page.objects.DashboardObjects;
import page.objects.EntryPageObjects;
import page.objects.SettingsPageObjects;
import page.objects.URLpatternObjects;
import page.objects.ContentObjects;
import page.objects.URLpatternObjects;

public class URLpatternActions extends BasePageActions {
	
	public static String date1 ;
	public static String month1 ;
	public static String date2 ;
	public static String date3 ;
	public static String day1 ;

	
	
	public static String Date() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		// get current date time with Date()
		Date date = new Date();
		 date1 = dateFormat.format(date);
		dateFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		System.out.println(date1);
		return date1;
	}
	public static String Date1() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// get current date time with Date()
		Date date = new Date();
		 date1 = dateFormat.format(date);
		dateFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		System.out.println(date1);
		return date1;
	}
	
	public static String DateWithMonth() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM");
		// get current date time with Date()
		Date date = new Date();
		 date2 = dateFormat.format(date);
		dateFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		System.out.println(date1);
		return date2;
	}
	
	public static String month() {
		DateFormat dateFormat = new SimpleDateFormat("/MM");
		// get current date time with Date()
		Date date = new Date();
		month1 = dateFormat.format(date);
		dateFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		System.out.println(date1);
		return month1;
	}
	
	public static String day() {
		DateFormat dateFormat = new SimpleDateFormat("/dd");
		// get current date time with Date()
		Date date = new Date();
		day1 = dateFormat.format(date);
		dateFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		System.out.println(day1);
		return day1;
	}
	
	
	public static String Date4() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// get current date time with Date()
		Date date = new Date();
		 date3 = dateFormat.format(date);
		dateFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		System.out.println(date3);
		return date3;
	}
	
	
	
	
	public static void addField(WebElement locator, WebElement locator1,
			String description, String tc) {
		dragAndDrop(locator, URLpatternObjects.dropfield, description, tc);
		//waitForSometime(2000);
		click(locator1, "click on label of fiele", tc);
		click(URLpatternObjects.multiple, "select muliple option", tc);
		click(URLpatternObjects.mandatory, "select mandatory option", tc);
		click(URLpatternObjects.labelcloseButton, "click on close button", tc);

	}
	
	
	public static void addContentBlogForSingle(String formName, String tc) {
	
		click(URLpatternObjects.contentType, "click on contenttype link", "tc-3");
		waitForSometime(2000);
		click(URLpatternObjects.addNewForm,
				"click on add new content type button", tc);
		click(URLpatternObjects.createMultiple, "slelect content block option", tc);
		sendkeys(URLpatternObjects.enterName, formName, "Enter form name", tc);
		click(URLpatternObjects.createAndAddFields,
				"click 'create and addfield'button", tc);
		verifyTextByindex(
				URLpatternObjects.successMessage,
				VerificationData.SanitycontentType.contentTypeCreatedSuccessMsz,
				"verify role successfully added or not ", "ed-6");
	
	}
	
    public static void closePopUp()  {	
   		
   		
    	click(URLpatternObjects.popup,
				"click on shared with me link", "sf-2");
	
	}
	
       public static void createContentType()  {	
		
		addField(URLpatternObjects.singleLine,URLpatternObjects.singleLineLabel,"add single line field","f1") ;
		addField(URLpatternObjects.multipleFieled,URLpatternObjects.multipleFieledLabel,"add muliline field","f2") ;
			saveSchemaActions("f13") ;	 
	}
	
       public static void copyContentTypeAction() {
    		
    	   click(URLpatternObjects.cancel,
      				"mouse hover on elipsis icon of the content type",
      				"tc-3.7");
    	   mousehover(URLpatternObjects.firstCT, "mouse hover on content type",
   				"tc-3.7");
   		click(URLpatternObjects.importedEllipsisIcon,
   				"mouse hover on elipsis icon of the content type",
   				"tc-3.7");
   		click(URLpatternObjects.copyContentType, "click on copy icon", "tc-3");
   		valueOfIputbox(URLpatternObjects.contentTypeTitle,
   				VerificationData.CopyForm.formTitlt, "verify title of form",
   				"f1");
   		click(URLpatternObjects.createAndSave, "click on save button", "tc-3");
   	}

       public static void EditContentTypeAction() {
   		
    	   click(URLpatternObjects.contentType, "click on save button", "tc-3");
    	   mousehover(URLpatternObjects.firstCT, "mouse hover on content type",
   				"tc-3.7");
   		click(URLpatternObjects.importedEllipsisIcon,
   				"mouse hover on elipsis icon of the content type",
   				"tc-3.7");
   		click(URLpatternObjects.editForm, "click on edit icon", "tc-3");
   	
   	}
     
     public static void saveSchemaActions(String tc) {
 		click(URLpatternObjects.save,
 				"click on save button of contenttype", tc);
 		waitForSometime(500);
 		verifyTextByindex(URLpatternObjects.successMessage,
 				VerificationData.SanitycontentType.contentTypeSuccessMsz,
 				"verify contentType successfully updated or not ", "ed-6");

 	}
	
     
     public static void verifyTitlePatternActions(WebElement Locator) {

 		click(URLpatternObjects.defaultURl,
 				"click on default field textbox", "1");
 		waitForSometime(500);
 		elementIsChecked(URLpatternObjects.titlePattern,"verify title pattern checked or not", "ed-6");
 		verifyText(URLpatternObjects.title,VerificationData.SanitycontentType.prieewTitle,
 				"verify contentType successfully updated or not ", "ed-6");
 		click(URLpatternObjects.saveAndClose,"click on save and close button", "1");
 		waitForSometime(1000);
 		click(Locator,"click on content type", "1");
 		click(URLpatternObjects.addNewForm,"click on create entry", "1");
 		clear(URLpatternObjects.entrytitle,"clear value from the title field", "1");
 		sendkeys(URLpatternObjects.entrytitle,"verify title url patten", "clear value from the title field" , "1");	
 		click(URLpatternObjects.titleEdit,"clickon edit buttion of the URL", "1");
 		valueOfIputbox(URLpatternObjects.entryurl,"/verify-title-url-patten", "verify URLpattern reflected or not" , "1");
 		click(URLpatternObjects.ok,"clickon ok buttion of the URL field", "1");
 			sendkeys(URLpatternObjects.entrysingleLine,
 					ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
 					"Enter vlaue in single line field", "e4");
 			waitForSometime(1000);
 			sendkeys(URLpatternObjects.multiline,
 					ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
 					"Enter vlaue in single line field", "e4");
 		click(URLpatternObjects.savebutton,"clickon save buttion of theentry", "1");
 		waitForSometime(1000);
 		click(URLpatternObjects.entryCancel,"clickon cancel buttion of theentry", "1");
 		verifyText(URLpatternObjects.urlTextOnentryListPage,"/verify-title-url-patten",
  				"verify URL pattern applied or not ", "ed-6");
 	}
     
     
     public static void verifyTitlePatternActionsWithPrefixActions() {

  		click(URLpatternObjects.defaultURl,
  				"click on default field textbox", "1");
  		waitForSometime(500);  		
  		elementIsChecked(URLpatternObjects.titlePattern,"verify title pattern checked or not", "ed-6");	
  		sendkeys(URLpatternObjects.prefix,"sanity","click on save and close button", "1");
  		verifyText(URLpatternObjects.title,VerificationData.SanitycontentType.prieewTitle,
  				"verify contentType successfully updated or not ", "ed-6");
  		click(URLpatternObjects.saveAndClose,"click on save and close button", "1");
  		click(URLpatternObjects.firstCT,"click on content type", "1");
  		click(URLpatternObjects.addNewForm,"click on create entry", "1");
  		clear(URLpatternObjects.entrytitle,"clear value from the title field", "1");
  		
  		sendkeys(URLpatternObjects.entrytitle,"verify title url patten", "clear value from the title field" , "1");
  		
  		click(URLpatternObjects.titleEdit,"clickon edit buttion of the URL", "1");
  	
  		valueOfIputbox(URLpatternObjects.entryurl,"/sanity/verify-title-url-patten", "verify URLpattern reflected or not" , "1");
  		
  		click(URLpatternObjects.ok,"clickon ok buttion of the URL field", "1");
  		

  			sendkeys(URLpatternObjects.entrysingleLine,
  					ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
  					"Enter vlaue in single line field", "e4");
  		
  			waitForSometime(1000);
  			sendkeys(URLpatternObjects.multiline,
  					ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
  					"Enter vlaue in single line field", "e4");
  		
  		click(URLpatternObjects.savebutton,"clickon save buttion of theentry", "1");
  		waitForSometime(1000);
  		click(URLpatternObjects.entryCancel,"clickon cancel buttion of theentry", "1");
  
  		verifyText(URLpatternObjects.urlTextOnentryListPage,"/sanity/verify-title-url-patten",
   				"verify URL pattern applied or not ", "ed-6");
  		
  		
  	}
     
     public static void deleteContentTypeAction() {

    	 System.out.println("In delete CT");
    	 click(URLpatternObjects.contentType, "click on contenttype link", "tc-3");
    	 click(URLpatternObjects.firstTEllipsisIcon,
 				"mouse hover on elipsis icon of edit link of copy of imported form",
 				"tc-3.7");
 		click(URLpatternObjects.deleteCt, "click on import icon", "tc-3");
 		click(URLpatternObjects.deleteOnWarningBox, "click on import icon", "tc-3");
 		waitForSometime(1000);
 		
 		
 	}
     
     public static void clickOnlogo() {

    	
 		click(URLpatternObjects.logo, "click on logo", "tc-3");
 		waitForSometime(1000);
 		
 		
 	}
 	
	
     public static void applyAndVerifyURlpattern(List<WebElement> locator,int intex ,String patternpriew, String Urlvalue) {

  		click(URLpatternObjects.defaultURl,
  				"click on default field textbox", "1");
  		waitForSometime(500);
  		clickByindex( locator,intex,"salect URL pattern", "1");		
  		verifyText(URLpatternObjects.title,patternpriew,
  				"verify URL pattern applied or not ", "ed-6");	
  		click(URLpatternObjects.saveAndClose,"click on save and close button", "1");	
     	click(URLpatternObjects.firstCT,"click on content type", "1");
  		click(URLpatternObjects.addNewForm,"click on create entry", "1");
  		clear(URLpatternObjects.entrytitle,"clear value from the title field", "1");
  		sendkeys(URLpatternObjects.entrytitle,"verify URL patten", "clear value from the title field" , "1");	
  		click(URLpatternObjects.titleEdit,"clickon edit buttion of the URL", "1");
  		valueOfIputbox(URLpatternObjects.entryurl, Urlvalue , "verify URLpattern reflected or not" , "1");	
        click(URLpatternObjects.ok,"clickon ok buttion of the URL field", "1");
        sendkeys(URLpatternObjects.EntrysingleLine,
					ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
					"Enter vlaue in single line field", "e4");
			waitForSometime(1000);
			sendkeys(URLpatternObjects.multiline,
					ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
					"Enter vlaue in single line field", "e4");
			click(URLpatternObjects.savebutton,"clickon save buttion of theentry", "1");
			waitForSometime(1000);
			click(URLpatternObjects.entryCancel,"clickon cancel buttion of theentry", "1");
  		verifyText(URLpatternObjects.urlTextOnentryListPage,Urlvalue,
  				"verify URL pattern applied or not ", "ed-6");
  		
  		
  	}
     
     
     public static void applyAndVerifyURlpatternWithPrefix(List<WebElement> locator,int intex ,String patternpriew, String Urlvalue) {

   		click(URLpatternObjects.defaultURl,
   				"click on default field textbox", "1");
   		waitForSometime(500);
   		clickByindex( locator,intex,"salect URL pattern", "1");	   		
   		sendkeys(URLpatternObjects.prefix,"sanity","Enter prrifx", "1");	 		
   		verifyText(URLpatternObjects.title,patternpriew,
   				"verify URL pattern applied or not ", "ed-6");	
   		click(URLpatternObjects.saveAndClose,"click on save and close button", "1");	
      	click(URLpatternObjects.firstCT,"click on content type", "1");
   		click(URLpatternObjects.addNewForm,"click on create entry", "1");
   		clear(URLpatternObjects.entrytitle,"clear value from the title field", "1");
   		sendkeys(URLpatternObjects.entrytitle,"verify URL patten", "clear value from the title field" , "1");	
   		click(URLpatternObjects.titleEdit,"clickon edit buttion of the URL", "1");
   		valueOfIputbox(URLpatternObjects.entryurl, Urlvalue , "verify URLpattern reflected or not" , "1");	
         click(URLpatternObjects.ok,"clickon ok buttion of the URL field", "1");
         sendkeys(URLpatternObjects.EntrysingleLine,
 					ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
 					"Enter vlaue in single line field", "e4");
 			waitForSometime(1000);
 			sendkeys(URLpatternObjects.multiline,
 					ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
 					"Enter vlaue in single line field", "e4");
 			click(URLpatternObjects.savebutton,"clickon save buttion of theentry", "1");
 			waitForSometime(1000);
 			
 			click(URLpatternObjects.entryCancel,"clickon cancel buttion of theentry", "1");
   		verifyText(URLpatternObjects.urlTextOnentryListPage,Urlvalue,
   				"verify URL pattern applied or not ", "ed-6");
   		
   		
   	}
     
     public static void applyCustomURLPattern(List<WebElement> locator,int intex ,String customURl,String patternpriew, String Urlvalue) {

    		click(URLpatternObjects.defaultURl,
    				"click on default field textbox", "1");
    		waitForSometime(500);
    		elemetIsEnable(URLpatternObjects.customUrlInputBox,"Verify inputbox enable or not", "1");	   		
    		clickByindex( locator,intex,"salect URL pattern", "1");	   		
    		sendkeys(URLpatternObjects.customUrlInputBox,customURl ,"enter custom URL pattern", "1");	 		
    		waitForSometime(2000);
    		verifyText(URLpatternObjects.title,patternpriew,
    				"verify URL pattern applied or not ", "ed-6");	
    		waitForSometime(2000);
    		click(URLpatternObjects.saveAndClose,"click on save and close button", "1");	
         	click(URLpatternObjects.firstCT,"click on content type", "1");
    		click(URLpatternObjects.addNewForm,"click on create entry", "1");
    		clear(URLpatternObjects.entrytitle,"clear value from the title field", "1");
    		sendkeys(URLpatternObjects.entrytitle,"verify URL patten", "clear value from the title field" , "1");	
    		click(URLpatternObjects.titleEdit,"clickon edit buttion of the URL", "1");
    		valueOfIputbox(URLpatternObjects.entryurl, Urlvalue , "verify URLpattern reflected or not" , "1");	
            click(URLpatternObjects.ok,"clickon ok buttion of the URL field", "1");
            sendkeys(URLpatternObjects.EntrysingleLine,
  					ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
  					"Enter vlaue in single line field", "e4");
  			waitForSometime(1000);
  			sendkeys(URLpatternObjects.multiline,
  					ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
  					"Enter vlaue in single line field", "e4");
  			click(URLpatternObjects.savebutton,"clickon save buttion of theentry", "1");
  			waitForSometime(1000);
  			
  			click(URLpatternObjects.entryCancel,"clickon cancel buttion of theentry", "1");
    		verifyText(URLpatternObjects.urlTextOnentryListPage,Urlvalue,
    				"verify URL pattern applied or not ", "ed-6");
    		
    		
    	}
        
       
     
     public static void applyCustomURLEntryID(List<WebElement> locator,int intex,String customURl,String patternpriew, String Urlvalue) {

 		click(URLpatternObjects.defaultURl,
 				"click on default field textbox", "1");
 		waitForSometime(500);
 		elemetIsEnable(URLpatternObjects.customUrlInputBox,"Verify inputbox enable or not", "1");	   		
 		clickByindex( locator,intex,"salect URL pattern", "1");	   		
 		waitForSometime(1500);
 		sendkeys(URLpatternObjects.customUrlInputBox,customURl ,"enter custom URL pattern", "1");	
 		waitForSometime(1500);
 		verifyText(URLpatternObjects.title,patternpriew,
 				"verify URL pattern applied or not ", "ed-6");	
 		waitForSometime(1000);
 		click(URLpatternObjects.saveAndClose,"click on save and close button", "1");	
      	click(URLpatternObjects.firstCT,"click on content type", "1");
 		click(URLpatternObjects.addNewForm,"click on create entry", "1");
 		clear(URLpatternObjects.entrytitle,"clear value from the title field", "1");
 		sendkeys(URLpatternObjects.entrytitle,"verify URL patten", "clear value from the title field" , "1");	
 		sendkeys(URLpatternObjects.EntrysingleLine,
				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
				"Enter vlaue in single line field", "e4");
		waitForSometime(1000);
		sendkeys(URLpatternObjects.multiline,
				ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
				"Enter vlaue in single line field", "e4");
		click(URLpatternObjects.savebutton,"clickon save buttion of theentry", "1");
		waitForSometime(1000);
 		click(URLpatternObjects.savebutton,"clickon save buttion of theentry", "1");
 		String entryID =getTextAndStoreInVariable(URLpatternObjects.entryID,"get the entry ID", "ed-6");
 		String Urlvalue1 = Urlvalue+ "/"+entryID ;
 		click(URLpatternObjects.titleEdit,"clickon edit buttion of the URL", "1");
 		valueOfIputbox(URLpatternObjects.entryurl, Urlvalue1 , "verify URLpattern reflected or not" , "1");	
         click(URLpatternObjects.ok,"clickon ok buttion of the URL field", "1");
			click(URLpatternObjects.entryCancel,"clickon cancel buttion of theentry", "1");
 		verifyText(URLpatternObjects.urlTextOnentryListPage,Urlvalue1,
 				"verify URL pattern applied or not ", "ed-6");
 		
 		
 	}
     
     
     public static void applyCustomURLPatternWithPrefix(int intex ,String customURl,String patternpriew, String Urlvalue) {

 		click(URLpatternObjects.defaultURl,
 				"click on default field textbox", "1");
 		waitForSometime(500);
 		elemetIsEnable(URLpatternObjects.customUrlInputBox,"Verify inputbox enable or not", "1");	   		
 		clickByindex(URLpatternObjects.redioButton,intex,"salect URL pattern", "1");	   		
 		sendkeys(URLpatternObjects.customUrlInputBox,customURl ,"enter custom URL pattern", "1");	
 		sendkeys(URLpatternObjects.prefix,"sanity" ,"enter custom URL pattern", "1");	
 		waitForSometime(2000);
 		verifyText(URLpatternObjects.title,patternpriew,
 				"verify URL pattern applied or not ", "ed-6");	
 		waitForSometime(2000);
 		click(URLpatternObjects.saveAndClose,"click on save and close button", "1");	
      	click(URLpatternObjects.firstCT,"click on content type", "1");
 		click(URLpatternObjects.addNewForm,"click on create entry", "1");
 		clear(URLpatternObjects.entrytitle,"clear value from the title field", "1");
 		sendkeys(URLpatternObjects.entrytitle,"verify URL patten", "clear value from the title field" , "1");	
 		click(URLpatternObjects.titleEdit,"clickon edit buttion of the URL", "1");
 		valueOfIputbox(URLpatternObjects.entryurl, Urlvalue , "verify URLpattern reflected or not" , "1");	
         click(URLpatternObjects.ok,"clickon ok buttion of the URL field", "1");
         sendkeys(URLpatternObjects.EntrysingleLine,
					ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
					"Enter vlaue in single line field", "e4");
			waitForSometime(1000);
			sendkeys(URLpatternObjects.multiline,
					ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
					"Enter vlaue in single line field", "e4");
			click(URLpatternObjects.savebutton,"clickon save buttion of theentry", "1");
			waitForSometime(1000);
			
			click(URLpatternObjects.entryCancel,"clickon cancel buttion of theentry", "1");
 		verifyText(URLpatternObjects.urlTextOnentryListPage,Urlvalue,
 				"verify URL pattern applied or not ", "ed-6");
 		
 		
 	}
     
     
     public static void applyDisableURLPatternWithPrefix(int intex) {

  		click(URLpatternObjects.defaultURl,
  				"click on default field textbox", "1");
  		waitForSometime(500);   		
  		clickByindex(URLpatternObjects.redioButton,intex,"salect URL pattern", "1");	   		
  		waitForSometime(2000);
  		//elementNotPresent(URLpatternObjects.title,"verify URL pattern present or not", "ed-6");	
  		waitForSometime(2000);
  		click(URLpatternObjects.saveAndClose,"click on save and close button", "1");	
       	click(URLpatternObjects.firstCT,"click on content type", "1");
  		click(URLpatternObjects.addNewForm,"click on create entry", "1");
  		sendkeys(URLpatternObjects.entrytitle,"verify URL patten", "enter entry title" , "1");
  		sendkeys(URLpatternObjects.EntrysingleLine,
 					ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
 					"Enter vlaue in single line field", "e4");
 			waitForSometime(1000);
 			sendkeys(URLpatternObjects.multiline,
 					ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
 					"Enter vlaue in single line field", "e4");
 			click(URLpatternObjects.savebutton,"clickon save buttion of theentry", "1");
 			waitForSometime(1000);
 			verifyText(URLpatternObjects.errorMSZ,VerificationData.SanitycontentType.verifyErrorMSZ,
 	  				"verify error message ", "ed-6");	
 			click(URLpatternObjects.entryCancel,"clickon cancel buttion of theentry", "1");
 			
 			click(URLpatternObjects.leave,"clickon leave buttion of the entry", "1");
 			
  	}
     
     
     public static void verifyURLPatternInCopiedCtActions() {

  		click(URLpatternObjects.defaultURl,
  				"click on default field textbox", "1");
  		waitForSometime(500);
  		elementIsChecked(URLpatternObjects.titlePattern,"verify title pattern checked or not", "ed-6");
  		verifyText(URLpatternObjects.title,VerificationData.SanitycontentType.prieewTitle,
  				"verify contentType successfully updated or not ", "ed-6");
  		
  		click(URLpatternObjects.saveAndClose,"click on save and close button", "1");
  		
  		click(URLpatternObjects.firstCT,"click on content type", "1");
  		
  		click(URLpatternObjects.addNewForm,"click on create entry", "1");
  		
  		clear(URLpatternObjects.entrytitle,"clear value from the title field", "1");
  		
  		sendkeys(URLpatternObjects.entrytitle,"verify title url patten", "clear value from the title field" , "1");
  		
  		click(URLpatternObjects.titleEdit,"clickon edit buttion of the URL", "1");
  	
  		valueOfIputbox(URLpatternObjects.entryurl,"/verify-title-url-patten", "verify URLpattern reflected or not" , "1");
 
  		click(URLpatternObjects.ok,"clickon ok buttion of the URL field", "1");
  		
  			sendkeys(URLpatternObjects.entrysingleLine,
  					ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
  					"Enter vlaue in single line field", "e4");
  		
  			waitForSometime(1000);
  			sendkeys(URLpatternObjects.multiline,
  					ExcelUtils.readCell(1, ExcelUtils.getCell("entry.text")),
  					"Enter vlaue in single line field", "e4");
  		
  		click(URLpatternObjects.savebutton,"clickon save buttion of theentry", "1");
  		waitForSometime(1000);
  		click(URLpatternObjects.entryCancel,"clickon cancel buttion of theentry", "1");
  
  		verifyText(URLpatternObjects.urlTextOnentryListPage,"/verify-title-url-patten",
   				"verify URL pattern applied or not ", "ed-6");
  		
  		
  	}
  
 	public static void importContentType(WebElement locator, String path) {

		click(URLpatternObjects.contentType, "click on contenttype link", "tc-3");
		waitForSometime(2000);
		click(URLpatternObjects.importIcon, "click on import icon", "i-1");
		sendkeys(locator, path, "browse the form which u want import", "if1");
		click(URLpatternObjects.importedIconOnWarningBox,
				"click on import button", "i3");
		
	}
	
 	 public static void exportEntryAction() {
 		
  	  
  	   mousehover(URLpatternObjects.firstEntry, "mouse hover on entry",
 				"tc-3.7");
 		click(URLpatternObjects.ellipssisIconOfEntry,
 				"mouse hover on elipsis icon of the content type",
 				"tc-3.7");
 		click(URLpatternObjects.exportEntry, "click on copy icon", "tc-3");
 		
 	}
 	 
 	 public static void copyEntryAction() {
  		
 	  	   mousehover(URLpatternObjects.firstEntry, "mouse hover on entry",
 	 				"tc-3.7");
 	 		click(URLpatternObjects.ellipssisIconOfEntry,
 	 				"mouse hover on elipsis icon of the content type",
 	 				"tc-3.7");
 	 		click(URLpatternObjects.copyIcon, "click on copy icon", "tc-3");
 	 		valueOfIputbox(URLpatternObjects.entryTitle, "Copy of verify URL patten" , "verify title of an entry" , "1");
 	 		click(URLpatternObjects.titleEdit,"clickon edit buttion of the URL", "1");
 	 		valueOfIputbox(URLpatternObjects.entryurl, "/copy-of-verify-url-patten/2016/blt123a123b123c" , "verify URLpattern reflected or not" , "1");	
 	 		click(URLpatternObjects.ok,"click on ok buttion of the URL field", "1");
 	         
 	 		waitForSometime(1000);
 	 		click(URLpatternObjects.savebutton, "click on save button", "tc-3");  
 	        click(URLpatternObjects.entryCancel, "click on cancel button of the entry", "tc-3");
 	       verifyText(URLpatternObjects.copyiedEntryURL,"/copy-of-verify-url-patten/2016/blt123a123b123c",
 	   				"verify URL pattern applied or not ", "ed-6");
 	     
 	 	}

 	 public static void DeleteEntryAction() {
   		
	  	   mousehover(URLpatternObjects.firstEntry, "mouse hover on entry",
	 				"tc-3.7");
	 		click(URLpatternObjects.CopiedEntryelipsesICon,
	 				"mouse hover on copied entry",
	 				"tc-3.7");
	 		click(URLpatternObjects.deleteEntry, "click on delete icon", "tc-3");
	 		
	 		click(URLpatternObjects.deleteButtonOnWarningBox,"clickon delete button", "1");
	 	
	       verifyTextByindex(URLpatternObjects.successMessage,
					VerificationData.Entry.deleteMSz,
					"verify entry deleted successfully added or not ", "al-5");
	     
	 	}
  
}

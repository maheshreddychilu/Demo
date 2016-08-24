package page.actions;

import java.io.File;

import org.openqa.selenium.WebElement;

import page.objects.ContentObjects;
import page.objects.DefaultValueObjects;
import page.objects.DefaultValueObjects;
import page.objects.DefaultValueObjects;
import page.objects.DefaultValueObjects;
import page.objects.URLpatternObjects;

import com.built.io.automationframework.BasePageActions;
import com.built.io.automationframework.ExcelUtils;

import data.VerificationData;

public class DefaultValueActions extends BasePageActions {
	
	public static void addContentBlogForSingle(String formName, String tc) {
		
		click(DefaultValueObjects.contentType, "click on contenttype link", "tc-3");
		waitForSometime(2000);
		click(DefaultValueObjects.addNewForm,
				"click on add new content type button", tc);
		click(DefaultValueObjects.createMultiple, "slelect content block option", tc);
		sendkeys(DefaultValueObjects.enterName, formName, "Enter form name", tc);
		click(DefaultValueObjects.createAndAddFields,
				"click 'create and addfield'button", tc);
		verifyTextByindex(
				DefaultValueObjects.successMessage,
				VerificationData.SanitycontentType.contentTypeCreatedSuccessMsz,
				"verify role successfully added or not ", "ed-6");
	
	}
	
    public static void closePopUp()  {	

    	click(DefaultValueObjects.popup,
				"click on shared with me link", "sf-2");
	
	}
	
       public static void createContentType()  {	

    		waitForSometime(3000);
    	   
    	   addField(DefaultValueObjects.singleLine,DefaultValueObjects.singleLineLabel,"add single line field","f1") ;
  		addField(DefaultValueObjects.multipleFieled,DefaultValueObjects.multipleFieledLabel,"add muliline field","f2") ;
  		addField(DefaultValueObjects.rte,DefaultValueObjects.rteLabel,"add rte field","f4") ;
  		addField(DefaultValueObjects.number,DefaultValueObjects.numberLabel,"add number field","f6") ;
  		BasePageActions.dragAndDrop(DefaultValueObjects.booleanfield, DefaultValueObjects.dropfield, "add boolean field", "7");
  		BasePageActions.dragAndDrop(DefaultValueObjects.date, DefaultValueObjects.dropfield, "add boolean field", "7");
  		addField(DefaultValueObjects.link,DefaultValueObjects.linkLabel,"add link field","f10") ;
	    saveSchemaActions("f13") ;	 
	}
	
       public static void addField(WebElement locator, WebElement locator1,
   			String description, String tc) {
   		dragAndDrop(locator, DefaultValueObjects.dropfield, description, tc);
   		//click(locator1, "click on label of fiele", tc);
   		

   	}
     
       public static void saveSchemaActions(String tc) {
    		click(DefaultValueObjects.save,
    				"click on save button of contenttype", tc);
    		waitForSometime(500);
    		verifyTextByindex(DefaultValueObjects.successMessage,
    				VerificationData.SanitycontentType.contentTypeSuccessMsz,
    				"verify contentType successfully updated or not ", "ed-6");

    	}
       
   
       
       public static void verifyDefaultValueOfTextboxActions() {

    	   //Single line
    	    click(DefaultValueObjects.singleLineLabel,"click on single ling text box", "1");
    		waitForSometime(500);
    		sendkeys(DefaultValueObjects.singleTextDefaultValue, "contentstack", "enter value in default value filed of single line textbox" , "1");		
    		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");
    		
    		//Multi line
    		click(DefaultValueObjects.multipleFieledLabel,"click on multiple text box lebel", "1");
    		sendkeys(DefaultValueObjects.multipleTextDefaultValue, "contentstack", "enter value in default value filed of multi line textbox" , "1");	
    		click(DefaultValueObjects.labelcloseButton, "click on close button", "d2");
    	
    		
    		//Link
    		click(DefaultValueObjects.linkLabel,"click on link filed", "1");
       		sendkeys(DefaultValueObjects.linkDefaultValueTitle, "contentstack", "enter value in defaultvalue title of link filed" , "1");	
       		sendkeys(DefaultValueObjects.linkDefaultValueURL, "https://contentstack.built.io", "enter value in defaultvalue URL of link filed" , "1");	
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d2");
    		
    		//Number
       		click(DefaultValueObjects.numberLabel,"click on number field", "1");
       		waitForSometime(500);
       		sendkeys(DefaultValueObjects.numberDefaultValue, "200", "enter value in default value of number filed" , "1");		
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");
    	  //Date custom
       		
       		click(DefaultValueObjects.dateLabel,"click on date field", "1");
       		waitForSometime(500);
       		
       		clear(DefaultValueObjects.dateDisplayName,"clear the value from date displayname field", "1");
       		
     		waitForSometime(500);
       		sendkeys(DefaultValueObjects.dateDisplayName, "custom", "enter the display name of the date field" , "1");
     		waitForSometime(1000);
       		
     		click(DefaultValueObjects.customDate,"click on boolean field", "1");
     		waitForSometime(1000);
       		sendkeys(DefaultValueObjects.customDatePlacerate, "1990-09-29", "enter the custom date" , "1");
     		waitForSometime(1000);
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");
 		
       		
       		//Boolean true
       		
       		click(DefaultValueObjects.booleanfieldLabel,"click on boolean field", "1");
       		waitForSometime(500);
       		sendkeys(DefaultValueObjects.booleanDisplayName, "true", "enter value in default value of number filed" , "1");		
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");
    		
          
       		BasePageActions.dragAndDrop(DefaultValueObjects.booleanfield, DefaultValueObjects.dropfield, "add boolean field", "7");
       		
       		//Boolean false
       		
       		click(DefaultValueObjects.booleanfieldLabel,"click on boolean field", "1");
       		waitForSometime(500);
       		click(DefaultValueObjects.booleanTRue,"click on boolean field", "1");
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");
  
    	

       		//Date
       		
       		BasePageActions.dragAndDrop(DefaultValueObjects.date, DefaultValueObjects.dropfield, "add boolean field", "7");
    		click(DefaultValueObjects.dateLabel,"click on date field", "1");
       		waitForSometime(500);
       		click(DefaultValueObjects.createDateDefaultValue,"click on boolean field", "1");
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");

       		click(DefaultValueObjects.saveAndClose,"click on save and close button", "1");
    		
    	
       		//******************Entry*************************
       		
       		waitForSometime(1000);
       		click(DefaultValueObjects.firstCt,"click on content type", "1");
     		click(DefaultValueObjects.addNewForm,"click on create entry", "1");	
     		valueOfIputbox(DefaultValueObjects.singleLineEntry,"contentstack", "verify default value present or not" , "1");
     		valueOfIputbox(DefaultValueObjects.multilineLineEntry,"contentstack", "verify default value present or not" , "1");
    		
    		//Number
     		valueOfIputbox(DefaultValueObjects.entryNumber,"200", "verify number default value in entry" , "1");
     		
     		//Link
     		
     		valueOfIputbox(DefaultValueObjects.linkTitleEntry,"contentstack", "verify link title default value in entry" , "1");	
     		
     		valueOfIputbox(DefaultValueObjects.linkTitleURL,"https://contentstack.built.io", "verify link URL default value in entry" , "1");

     		//Boolean	
     		elementCheckedByindex(DefaultValueObjects.booleanCheckBox,0, "verify boolean checkbox checked or not" , "1");
     		
     		//Boolean true	
     		elementCheckedByindex(DefaultValueObjects.booleanCheckBox,1, "verify boolean checkbox checked or not" , "1");
	
     		click(DefaultValueObjects.savebutton,"clickon save buttion of theentry", "1");

     	     		waitForSometime(1000);

     		
     		//Custom Date
     		valueOfIputbox(DefaultValueObjects.DateCustom,"1990-09-29", "verify custom date default value in entry" , "1");
    
     		System.out.println(VerificationData.SanitycontentType.todayDate);
 	      //Date
     		valueOfIputbox(DefaultValueObjects.dateEntry,VerificationData.SanitycontentType.todayDate, "verify custom date default value in entry" , "1");
     		
      		click(DefaultValueObjects.entryCancel,"clickon cancel buttion of theentry", "1");
     		
    	}
       
      
       public static void verifyDefaultValueIncopiedActions() {

            click(DefaultValueObjects.contentType, "click on contenttype link", "tc-3");
            click(DefaultValueObjects.firstTEllipsisIcon,
     				"click on EllipsisIcon of CT",
     				"tc-3.7");
     		click(DefaultValueObjects.copyIcon, "click on import icon", "tc-3");	
     		valueOfIputbox(DefaultValueObjects.enterName,"copy_of_TextField default value", "verify name of the copied CT" , "1");	
     		click(DefaultValueObjects.createAndAddFields, "click on create and add fields", "tc-3");

    	   //Single line
    	    click(DefaultValueObjects.singleLineLabel,"click on single ling text box", "1");
    		waitForSometime(500);
    		valueOfIputbox(DefaultValueObjects.singleTextDefaultValue, "contentstack", "verify default value of single line textbox" , "1");		
    		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");
    		
    		//Multi line
    		click(DefaultValueObjects.multipleFieledLabel,"click on multiple text box lebel", "1");
    		valueOfIputbox(DefaultValueObjects.multipleTextDefaultValue, "contentstack", "verify default value of multi line textbox" , "1");	
    		click(DefaultValueObjects.labelcloseButton, "click on close button", "d2");
    	
    		
    		//Link
    		click(DefaultValueObjects.linkLabel,"click on link filed", "1");
    		valueOfIputbox(DefaultValueObjects.linkDefaultValueTitle, "contentstack", "verify defaultvalue title of link filed" , "1");	
    		valueOfIputbox(DefaultValueObjects.linkDefaultValueURL, "https://contentstack.built.io", "verify defaultvalue URL of link filed" , "1");	
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d2");
    		
    		//Number
       		click(DefaultValueObjects.numberLabel,"click on number field", "1");
       		waitForSometime(500);
       		valueOfIputbox(DefaultValueObjects.numberDefaultValue, "200", "verify default value of number filed" , "1");		
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");
    
       		//Date custom
       		
       		click(DefaultValueObjects.customdateLabel,"click on date field", "1");
       		waitForSometime(500);
     		valueOfIputbox(DefaultValueObjects.customDatePlacerate, "1990-09-29", "verify default value of customdate" , "1");
     		waitForSometime(1000);
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");
 		
       		//Boolean false
       		
       		click(DefaultValueObjects.booleanfieldLabel,"click on boolean field", "1");
       		waitForSometime(500);
       		elementIsNotChecked(DefaultValueObjects.booleanTRue,"verify boolean field checked or not", "1");
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");

       		//Date
       		
    		click(DefaultValueObjects.dateLabel,"click on date field", "1");
       		waitForSometime(500);
       		elementIsChecked(DefaultValueObjects.createDateDefaultValue,"verify rediobutton checked or not", "1");
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");

       		click(DefaultValueObjects.saveAndClose,"click on save and close button", "1");
    		
    	
       		//******************Entry*************************
       		
       		waitForSometime(1000);
       		click(DefaultValueObjects.secondCT,"click on content type", "1");
     		click(DefaultValueObjects.addNewForm,"click on create entry", "1");	
     		valueOfIputbox(DefaultValueObjects.singleLineEntry,"contentstack", "verify default value present or not" , "1");
     		valueOfIputbox(DefaultValueObjects.multilineLineEntry,"contentstack", "verify default value present or not" , "1");
    		
    		//Number
     		valueOfIputbox(DefaultValueObjects.entryNumber,"200", "verify number default value in entry" , "1");
     		
     		//Link
     		
     		valueOfIputbox(DefaultValueObjects.linkTitleEntry,"contentstack", "verify link title default value in entry" , "1");	
     		
     		valueOfIputbox(DefaultValueObjects.linkTitleURL,"https://contentstack.built.io", "verify link URL default value in entry" , "1");

     		//Boolean	
     		elementCheckedByindex(DefaultValueObjects.booleanCheckBox,0, "verify boolean checkbox checked or not" , "1");
     		
     		//Boolean true	
     		elementCheckedByindex(DefaultValueObjects.booleanCheckBox,1, "verify boolean checkbox checked or not" , "1");
	
     		click(DefaultValueObjects.savebutton,"clickon save buttion of theentry", "1");

     	     		waitForSometime(1000);

     		
     		//Custom Date
     		valueOfIputbox(DefaultValueObjects.DateCustom,"1990-09-29", "verify custom date default value in entry" , "1");
     	
     		
     		System.out.println(VerificationData.SanitycontentType.todayDate);
     		
     		
     		
     		//Date
     		valueOfIputbox(DefaultValueObjects.dateEntry,VerificationData.SanitycontentType.todayDate, "verify custom date default value in entry" , "1");
     		
     		click(DefaultValueObjects.entryCancel,"clickon cancel buttion of theentry", "1");
    
    	}
       
       
       
       
       public static void verifyDefaultValueInEditedContentTypeActions() {

    	 //Single line
   	   
    	   click(DefaultValueObjects.contentType, "click on contenttype link", "tc-3");
           click(DefaultValueObjects.firstTEllipsisIcon,
    				"click on EllipsisIcon of CT",
    				"tc-3.7");
       	click(DefaultValueObjects.editIcon, "click on import icon", "tc-3");	
    	   
    	   
    	  click(DefaultValueObjects.singleLineLabel,"click on single ling text box", "1");
   		waitForSometime(500);
   		clear(DefaultValueObjects.singleTextDefaultValue, "clear the value from the default value field", "1");
   		sendkeys(DefaultValueObjects.singleTextDefaultValue, "contentstack.io", "enter value in default value filed of single line textbox" , "1");		
   		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");
   		
   		//Multi line
   		click(DefaultValueObjects.multipleFieledLabel,"click on multiple text box lebel", "1");
   		clear(DefaultValueObjects.multipleTextDefaultValue,"clear the value from the default value field", "1");
   		sendkeys(DefaultValueObjects.multipleTextDefaultValue, "contentstack-express", "enter value in default value filed of multi line textbox" , "1");	
   		click(DefaultValueObjects.labelcloseButton, "click on close button", "d2");
   	
   		
   		//Link
   		    click(DefaultValueObjects.linkLabel,"click on link filed", "1");
      		
   			clear(DefaultValueObjects.linkDefaultValueTitle,"clear the value from the default value field", "1");
   		    sendkeys(DefaultValueObjects.linkDefaultValueTitle, "buildio", "enter value in defaultvalue title of link filed" , "1");	
   			clear(DefaultValueObjects.linkDefaultValueURL,"clear the value from the default value field", "1");
   		    sendkeys(DefaultValueObjects.linkDefaultValueURL, "https://www.built.io", "enter value in defaultvalue URL of link filed" , "1");	
      		click(DefaultValueObjects.labelcloseButton, "click on close button", "d2");
   		
   		//Number
      		click(DefaultValueObjects.numberLabel,"click on number field", "1");
      		waitForSometime(500);
      		clear(DefaultValueObjects.numberDefaultValue,"clear the value from the default value field", "1");
      		sendkeys(DefaultValueObjects.numberDefaultValue, "500", "enter value in default value of number filed" , "1");		
      		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");
   	  
      		
                //Date custom
       		
       		click(DefaultValueObjects.customdateLabel,"click on date field", "1");
       		waitForSometime(500);
     		valueOfIputbox(DefaultValueObjects.customDatePlacerate, "1990-09-29", "verify default value of customdate" , "1");
     		waitForSometime(1000);
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");
 		
       		//Boolean false
       		
       		click(DefaultValueObjects.booleanfieldLabel,"click on boolean field", "1");
       		waitForSometime(500);
       		elementIsChecked(DefaultValueObjects.booleanTRue,"verify boolean field checked or not", "1");
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");

       		//Date
       		
    		click(DefaultValueObjects.dateLabel,"click on date field", "1");
       		waitForSometime(500);
       		elementIsChecked(DefaultValueObjects.createDateDefaultValue,"verify rediobutton checked or not", "1");
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");

       		click(DefaultValueObjects.saveAndClose,"click on save and close button", "1");
   		
   	
      		//******************Entry*************************
      		
      		waitForSometime(1000);
      		click(DefaultValueObjects.firstCt,"click on content type", "1");
    		click(DefaultValueObjects.addNewForm,"click on create entry", "1");	
    		valueOfIputbox(DefaultValueObjects.singleLineEntry,"contentstack.io", "verify default value present or not" , "1");
    		valueOfIputbox(DefaultValueObjects.multilineLineEntry,"contentstack-express", "verify default value present or not" , "1");
   		
   		//Number
    		valueOfIputbox(DefaultValueObjects.entryNumber,"500", "verify number default value in entry" , "1");
    		
    		//Link
    		
    		valueOfIputbox(DefaultValueObjects.linkTitleEntry,"buildio", "verify link title default value in entry" , "1");	
    		
    		valueOfIputbox(DefaultValueObjects.linkTitleURL,"https://www.built.io", "verify link URL default value in entry" , "1");

    		//Boolean	
    		elementCheckedByindex(DefaultValueObjects.booleanCheckBox,0, "verify boolean checkbox checked or not" , "1");
    		
    		//Boolean true	
    		elementCheckedByindex(DefaultValueObjects.booleanCheckBox,1, "verify boolean checkbox checked or not" , "1");
	
    		click(DefaultValueObjects.savebutton,"clickon save buttion of theentry", "1");

    	     		waitForSometime(1000);

    		
    		//Custom Date
    		valueOfIputbox(DefaultValueObjects.DateCustom,"1990-09-29", "verify custom date default value in entry" , "1");
   
    		System.out.println(VerificationData.SanitycontentType.todayDate);
	      //Date
    		valueOfIputbox(DefaultValueObjects.dateEntry,VerificationData.SanitycontentType.todayDate, "verify custom date default value in entry" , "1");
    		
     		click(DefaultValueObjects.entryCancel,"clickon cancel buttion of theentry", "1");
    		
   
   	}
          
       
       
       
       
       
      

       public static void verifyDefaultValueInImportedContentTypeActions() {

            click(DefaultValueObjects.contentType, "click on contenttype link", "tc-3");
            
            

            String importedForm = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("default_value.json")))
    		.getAbsolutePath();
    		System.out.println("content type path " +importedForm);
    	
    		click(DefaultValueObjects.importIcon, "click on import icon", "i-1");
    		sendkeys(DefaultValueObjects.browse, importedForm, "browse the form which u want import", "if1");
    		click(DefaultValueObjects.importedIconOnWarningBox,
    				"click on import button", "i3");
    	 
    		click(DefaultValueObjects.firstTEllipsisIcon,
     				"click on EllipsisIcon of CT",
     				"tc-3.7");
     		click(DefaultValueObjects.editIcon, "click on import icon", "tc-3");	
    		//Single line
    	    click(DefaultValueObjects.singleLineLabel,"click on single ling text box", "1");
    		waitForSometime(500);
    		valueOfIputbox(DefaultValueObjects.singleTextDefaultValue, "contentstack", "verify default value of single line textbox" , "1");		
    		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");
    		
    		//Multi line
    		click(DefaultValueObjects.multipleFieledLabel,"click on multiple text box lebel", "1");
    		valueOfIputbox(DefaultValueObjects.multipleTextDefaultValue, "contentstack", "verify default value of multi line textbox" , "1");	
    		click(DefaultValueObjects.labelcloseButton, "click on close button", "d2");
    	
    		
    		//Link
    		click(DefaultValueObjects.linkLabel,"click on link filed", "1");
    		valueOfIputbox(DefaultValueObjects.linkDefaultValueTitle, "contentstack", "verify defaultvalue title of link filed" , "1");	
    		valueOfIputbox(DefaultValueObjects.linkDefaultValueURL, "https://contentstack.built.io", "verify defaultvalue URL of link filed" , "1");	
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d2");
    		
    		//Number
       		click(DefaultValueObjects.numberLabel,"click on number field", "1");
       		waitForSometime(500);
       		valueOfIputbox(DefaultValueObjects.numberDefaultValue, "200", "verify default value of number filed" , "1");		
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");
    
       		//Date custom
       		
       		click(DefaultValueObjects.customdateLabel,"click on date field", "1");
       		waitForSometime(500);
     		valueOfIputbox(DefaultValueObjects.customDatePlacerate, "1990-09-29", "verify default value of customdate" , "1");
     		waitForSometime(1000);
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");
 		
       		//Boolean false
       		
       		click(DefaultValueObjects.booleanfieldLabel,"click on boolean field", "1");
       		waitForSometime(500);
       		elementIsChecked(DefaultValueObjects.booleanTRue,"verify boolean field checked or not", "1");
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");

       		//Date
       		
    		click(DefaultValueObjects.dateLabel,"click on date field", "1");
       		waitForSometime(500);
       		elementIsChecked(DefaultValueObjects.createDateDefaultValue,"verify rediobutton checked or not", "1");
       		click(DefaultValueObjects.labelcloseButton, "click on close button", "d1");

       		click(DefaultValueObjects.saveAndClose,"click on save and close button", "1");
    		
    	
       		//******************Entry*************************
       		
       		waitForSometime(1000);
       		click(DefaultValueObjects.firstCt,"click on content type", "1");
     		click(DefaultValueObjects.addNewForm,"click on create entry", "1");	
     		valueOfIputbox(DefaultValueObjects.singleLineEntry,"contentstack", "verify default value present or not" , "1");
     		valueOfIputbox(DefaultValueObjects.multilineLineEntry,"contentstack", "verify default value present or not" , "1");
    		
    		//Number
     		valueOfIputbox(DefaultValueObjects.entryNumber,"200", "verify number default value in entry" , "1");
     		
     		//Link
     		
     		valueOfIputbox(DefaultValueObjects.linkTitleEntry,"contentstack", "verify link title default value in entry" , "1");	
     		
     		valueOfIputbox(DefaultValueObjects.linkTitleURL,"https://contentstack.built.io", "verify link URL default value in entry" , "1");

     		//Boolean	
     		elementCheckedByindex(DefaultValueObjects.booleanCheckBox,0, "verify boolean checkbox checked or not" , "1");
     		
     		//Boolean true	
     		elementCheckedByindex(DefaultValueObjects.booleanCheckBox,1, "verify boolean checkbox checked or not" , "1");
	
     		click(DefaultValueObjects.savebutton,"clickon save buttion of theentry", "1");

     	     		waitForSometime(1000);

     		//Custom Date
     		valueOfIputbox(DefaultValueObjects.DateCustom,"1990-09-29", "verify custom date default value in entry" , "1");
	
     		System.out.println(VerificationData.SanitycontentType.todayDate);
	
     		//Date
     		valueOfIputbox(DefaultValueObjects.dateEntry,VerificationData.SanitycontentType.todayDate, "verify custom date default value in entry" , "1");
     		
     		click(DefaultValueObjects.entryCancel,"clickon cancel buttion of theentry", "1");
    
    	}
       
       
       public static void deleteContentTypeAction() {

      	 System.out.println("In delete CT");
      	 click(DefaultValueObjects.contentType, "click on contenttype link", "tc-3");
      	 click(DefaultValueObjects.firstTEllipsisIcon,
   				"click on EllipsisIcon of CT",
   				"tc-3.7");
   		click(DefaultValueObjects.deleteCt, "click on import icon", "tc-3");
   		click(DefaultValueObjects.deleteOnWarningBox, "click on import icon", "tc-3");
   		waitForSometime(1000);
   	}
      
   	
}

package page.actions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.built.io.automationframework.BasePageActions;
import com.relevantcodes.extentreports.LogStatus;

import data.VerificationData;
import page.objects.AssetObjects;
import page.objects.ContentObjects;
import page.objects.EntryPageObjects;
import page.objects.PublishQueueObjects;
import page.objects.VerifyPublishActivitiesObjects;
import page.objects.VerifyPublishActivitiesObjects;

public class VerifyPublishActivities extends BasePageActions {
	
	public static int minuts ;
	
	public static String sceduleMinutes ;
	
	

	public static void clicOnkAssetLink()  {

		click(VerifyPublishActivitiesObjects.assetMenu, "click on asset menu which has placed on header", "A1");
		//click(VerifyPublishActivitiesObjects.newAsset, "click on asset menu which has placed on header", "A1");

	}
	
	public static void clicOnkContentTypeLink()  {

		click(VerifyPublishActivitiesObjects.contentTypetMenu, "click on contenttype menu which has placed on header", "A1");

	}
	
	public static void uploadAssets(String path, String description,String tagname,
			String testcase1d)  {

		click(VerifyPublishActivitiesObjects.addNewAsset, "click on addnew asst link" , testcase1d);
				//  waitForSometime(5000);
		sendkeys(VerifyPublishActivitiesObjects.browseAsset, path, description, testcase1d);
		
		sendkeys(VerifyPublishActivitiesObjects.tags, tagname, description, testcase1d);
	
				//  waitForSometime(5000);
		click(VerifyPublishActivitiesObjects.save, "click on save button" , testcase1d);
	//	verifyText(VerifyPublishActivitiesObjects.successMessage,VerificationData.Assets.createAssetSuccessMessage,"verify uplaod asset suuccess message",testcase1d) ;
	
	}
	
	
	public static void importContentType(WebElement locator, String path) {

		
		click(VerifyPublishActivitiesObjects.contentType, "click on content type menu button", "A1");
	     waitForSometime(5000);
		click(VerifyPublishActivitiesObjects.imortIcon, "click on import icon", "i-1");
		waitForSometime(3000);
		sendkeys(locator, path, "browse the form which u want import", "if1");
	//	waitForSometime(3000);
		click(VerifyPublishActivitiesObjects.importedIconOnWarningBox,
				"click on import button", "i3");
	//	waitForSometime(2000);
		verifyText(VerifyPublishActivitiesObjects.imported,
				VerificationData.SanitycontentType.importedForm,
				"verify contentType successfully imported or not ", "ed-6");

	}
	
	
	public static void importEntry(String path)  {
		
		click(VerifyPublishActivitiesObjects.imported, "click on imported content type ", "e1-1");
		click(VerifyPublishActivitiesObjects.addNewEntry, "click on imported content type ", "e1-1");
		click(VerifyPublishActivitiesObjects.importIcon, "click on import icon", "i-1");
		//  waitForSometime(3000);
		sendkeys(VerifyPublishActivitiesObjects.browseEntry, path,
				"browse the entry which u want import", "if1");
		 // waitForSometime(5000);
		click(VerifyPublishActivitiesObjects.importedicon, "click on import button", "i3");
		waitForSometime(2000) ;
		
		click(VerifyPublishActivitiesObjects.saveButton, "click on import button", "i3");
		//waitForSometime(2000) ;
		click(VerifyPublishActivitiesObjects.publish, "click on Entry which you want to publish", "A1");
		click(VerifyPublishActivitiesObjects.production1, "click on Entry which you want to publish ", "A1");
		click(VerifyPublishActivitiesObjects.development1, "click on Entry which you want to publish ", "A1");
		click(VerifyPublishActivitiesObjects.stag1, "click on Entry which you want to publish ", "A1");
		click(VerifyPublishActivitiesObjects.testEnv1, "click on Entry which you want to publish ", "A1");
		click(VerifyPublishActivitiesObjects.publishLater, "click on Entry which you want to publish ", "A1");
		clickBySize(VerifyPublishActivitiesObjects.selectTimeAndDate, "click on Entry which you want to publish ", "A1");
		click(VerifyPublishActivitiesObjects.now, "click on asset which you want to publish ", "A1");
		mintesValue() ;
				  waitForSometime(1000);
		clear(VerifyPublishActivitiesObjects.minits, "click on asset which you want to publish ", "A1");
	    sendkeys(VerifyPublishActivitiesObjects.minits, sceduleMinutes,"click on asset which you want to publish ", "A1");
		click(VerifyPublishActivitiesObjects.done, "click on asset which you want to publish ", "A1");
		click(VerifyPublishActivitiesObjects.publishOnpopup, "click on asset which you want to publish ", "A1");
		waitForSometime(2000) ;
		verifyText(VerifyPublishActivitiesObjects.successMessage,VerificationData.Assets.publishEntrySuccessMessage,"verify publish Entry suuccess message","d4") ;
	

	}
	
	
	public static void publishAseetWithScedule() {
		
		

		mousehover(VerifyPublishActivitiesObjects.siteName, "click on asset which you want to publish ", "A1");
		waitForSometime(3000);
		click(VerifyPublishActivitiesObjects.open, "click on asset which you want to publish ", "A2");
		waitForSometime(700);
		clicOnkAssetLink();
		waitForSometime(3000);
		uploadAssets("D:\\ContenstackWorkspace\\ContentStackUIAutomation\\src\\main\\resources\\Dhaval.jpg", "Uploading Image File","jpg",
				"A-3");	
		click(VerifyPublishActivitiesObjects.dhaval, "click on asset which you want to publish ", "A4");
		click(VerifyPublishActivitiesObjects.filterIcon, "click on filter icon to close", "A5");
		click(VerifyPublishActivitiesObjects.publish, "click on publish button", "A6");
		click(VerifyPublishActivitiesObjects.production, "select production environment", "A7");
		click(VerifyPublishActivitiesObjects.development, "select developement environment", "A8");
		click(VerifyPublishActivitiesObjects.stag, "select stag environment", "A9");
		click(VerifyPublishActivitiesObjects.testEnv, "select test environment", "A10");
		click(VerifyPublishActivitiesObjects.publishLater, "click on publish later button", "A11");
		clickBySize(VerifyPublishActivitiesObjects.selectTimeAndDate, "click on select time and date option", "A12");
		click(VerifyPublishActivitiesObjects.now, "click on now button", "A13");
		mintesValue() ;
				  waitForSometime(1000);
		clear(VerifyPublishActivitiesObjects.minits, "clear the value in mint inputbox ", "A14");
	    sendkeys(VerifyPublishActivitiesObjects.minits, sceduleMinutes,"add the minites to schedule", "A15");
		click(VerifyPublishActivitiesObjects.done, "click on click on done button", "A16");
		click(VerifyPublishActivitiesObjects.publishOnpopup, "click on publish button", "A17");
		waitForSometime(2000) ;
		verifyText(VerifyPublishActivitiesObjects.successMessage,VerificationData.Assets.publishAssetSuccessMessage,"verify publish asset suuccess message","d18") ;
	
	}
	
	
	public static void mintesValue(){
		
		String  mints = VerifyPublishActivitiesObjects.minits.getAttribute("value") ;
		int num = Integer.parseInt(mints); 
		System.out.println("minute is " + num);
		minuts =num +1 ;
		sceduleMinutes = Integer.toString(minuts);
	}
	
	
   public static void verifyEnvName(WebElement locator, String value,
			String description, String tcid  ){
	   higlightElement(locator);
		try {
			String actual = locator.getText();
			if (actual.equals("stag")) {
				extentTest.log(LogStatus.PASS, description);
			} else if(actual.equals("production")){
				
				extentTest.log(LogStatus.PASS, description);
			}else if(actual.equals("testenv")){
				
				extentTest.log(LogStatus.PASS, description);
			}else if(actual.equals("development")){
				
				extentTest.log(LogStatus.PASS, description);
			}else {
				
				extentTest.log(LogStatus.FAIL, description);
				System.out.println("text not matched");
				takeScreenshot(tcid);
				System.out.println("text not matched :  " + description);
				System.out.println(actual + "  not equals  " + value);
			}
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tcid);
			System.out.println("element not found" + locator + description);
		
	  }catch (Exception e) {
		System.out.println(e.getMessage());
		extentTest.log(LogStatus.FAIL, description);
		takeScreenshot(tcid);

	  }
	}	
			
		
	
	
	public static void unPublishAseetWithScedule() {

		clicOnkAssetLink();
		click(VerifyPublishActivitiesObjects.dhaval, "click on asset which you want to publish ", "A1");
		click(VerifyPublishActivitiesObjects.filterIcon, "click on asset which you want to publish", "A1");
		click(VerifyPublishActivitiesObjects.unpublish, "click on asset which you want to publish", "A1");
		  waitForSometime(1000);
		click(VerifyPublishActivitiesObjects.production, "select production environment", "A7");
		click(VerifyPublishActivitiesObjects.development, "select developement environment", "A8");
		click(VerifyPublishActivitiesObjects.stag, "select stag environment", "A9");
		click(VerifyPublishActivitiesObjects.testEnv, "select test environment", "A10");
		click(VerifyPublishActivitiesObjects.unPublishLater, "click on publish later button", "A11");
		clickBySize(VerifyPublishActivitiesObjects.selectTimeAndDate, "click on select time and date option", "A12");
		click(VerifyPublishActivitiesObjects.now, "click on now button", "A13");
		mintesValue() ;
				  waitForSometime(1000);
		clear(VerifyPublishActivitiesObjects.minits, "clear the value in mint inputbox ", "A14");
	    sendkeys(VerifyPublishActivitiesObjects.minits, sceduleMinutes,"add the minites to schedule", "A15");
		click(VerifyPublishActivitiesObjects.done, "click on click on done button", "A16");
		click(VerifyPublishActivitiesObjects.publishOnpopup, "click on publish button", "A17");
		waitForSometime(2000) ;
	
		verifyText(VerifyPublishActivitiesObjects.successMessage,VerificationData.Assets.unPublishAssetSuccessMessage,"verify publish asset suuccess message","d4") ;
	
	}
	
	
	public static void publishQueueAssetInSpecificStackActions()  {

		System.out.println("in publishqueue publish asset");
	  
		click(VerifyPublishActivitiesObjects.publishQueueLink, "click publish Queue icon", "p1");
		verifyText(VerifyPublishActivitiesObjects.publsiTimetitle, VerificationData.PublishQueue.time, "verify Time", "p2");
		verifyText(VerifyPublishActivitiesObjects.publishContentType, VerificationData.PublishQueue.form, "verify form", "p3");
		verifyText(VerifyPublishActivitiesObjects.publishEntryTitle, VerificationData.PublishQueue.entry,
				"verify entryName", "p4");
		verifyText(VerifyPublishActivitiesObjects.publishVersion, VerificationData.PublishQueue.version,
				"verify version", "p5");
		verifyText(VerifyPublishActivitiesObjects.publishQueueLanguage, VerificationData.PublishQueue.language,
				"verify language", "p6");
		verifyText(VerifyPublishActivitiesObjects.publishedByTitle, VerificationData.PublishQueue.usename,
				"verify userName", "p7");
		verifyText(VerifyPublishActivitiesObjects.publisEnv, VerificationData.PublishQueue.env,
				"verify environment", "p8");
		verifyText(VerifyPublishActivitiesObjects.publishStatus, VerificationData.PublishQueue.status, "verify status",
				"p9");
		

		
		  waitForSometime(100000);
		  
		 click(VerifyPublishActivitiesObjects.refreshIcon, "click publish Queue icon", "p1");
		 
		 waitForSometime(10000);
		
		// click(VerifyPublishActivitiesObjects.refreshIcon, "click publish Queue icon", "p1");
		
		 verifyText(VerifyPublishActivitiesObjects.entry1, VerificationData.PublishQueue.assetName,
				"verify form name of an entry", "p10");
		verifyText(VerifyPublishActivitiesObjects.contentType1, VerificationData.PublishQueue.contentTypeName1,
				"verify entry name", "p11");
		verifyText(VerifyPublishActivitiesObjects.language1, VerificationData.PublishQueue.language1,
				"verify versionNumber of an entry", "p12");
		verifyText(VerifyPublishActivitiesObjects.publishBy1, VerificationData.PublishQueue.user,
				"verify langName of an entry", "p3");
		verifyEnvName(VerifyPublishActivitiesObjects.envName1, VerificationData.PublishQueue.envName1,
				"verify userName of an entry", "p3");
		verifyText(VerifyPublishActivitiesObjects.status1, VerificationData.PublishQueue.statusOfEntry,
				"verify environment of an entry", "p3");
	

		verifyText(VerifyPublishActivitiesObjects.entry2, VerificationData.PublishQueue.assetName,
				"verify form name of an entry", "p10");
		verifyText(VerifyPublishActivitiesObjects.contentType2, VerificationData.PublishQueue.contentTypeName1,
				"verify entry name", "p11");
		verifyText(VerifyPublishActivitiesObjects.language2, VerificationData.PublishQueue.language1,
				"verify versionNumber of an entry", "p12");
		verifyText(VerifyPublishActivitiesObjects.publishBy1, VerificationData.PublishQueue.user,
				"verify langName of an entry", "p3");
		verifyEnvName(VerifyPublishActivitiesObjects.envName2, VerificationData.PublishQueue.envProdName,
				"verify userName of an entry", "p3");
		verifyText(VerifyPublishActivitiesObjects.status2, VerificationData.PublishQueue.statusOfEntry,
				"verify environment of an entry", "p3");
		
		

		verifyText(VerifyPublishActivitiesObjects.entry3, VerificationData.PublishQueue.assetName,
				"verify form name of an entry", "p10");
		verifyText(VerifyPublishActivitiesObjects.contentType3, VerificationData.PublishQueue.contentTypeName1,
				"verify entry name", "p11");
		verifyText(VerifyPublishActivitiesObjects.language3, VerificationData.PublishQueue.language1,
				"verify versionNumber of an entry", "p12");
		verifyText(VerifyPublishActivitiesObjects.publishBy3, VerificationData.PublishQueue.user,
				"verify langName of an entry", "p3");
		verifyEnvName(VerifyPublishActivitiesObjects.envName3, VerificationData.PublishQueue.envStagName,
				"verify userName of an entry", "p3");
		verifyText(VerifyPublishActivitiesObjects.status3, VerificationData.PublishQueue.statusOfEntry,
				"verify environment of an entry", "p3");
		
		

		verifyText(VerifyPublishActivitiesObjects.entry4, VerificationData.PublishQueue.assetName,
				"verify form name of an entry", "p10");
		verifyText(VerifyPublishActivitiesObjects.contentType4, VerificationData.PublishQueue.contentTypeName1,
				"verify entry name", "p11");
		verifyText(VerifyPublishActivitiesObjects.language4, VerificationData.PublishQueue.language1,
				"verify versionNumber of an entry", "p12");
		verifyText(VerifyPublishActivitiesObjects.publishBy4, VerificationData.PublishQueue.user,
				"verify langName of an entry", "p3");
		verifyEnvName(VerifyPublishActivitiesObjects.envName4, VerificationData.PublishQueue.envDevName,
				"verify userName of an entry", "p3");
		//verifyText(VerifyPublishActivitiesObjects.status4, VerificationData.PublishQueue.statusOfEntry,
			//	"verify environment of an entry", "p3");
	
   }
	
	
	public static void verifyPublishQueueOfUnPublishAsset()  {
		
		System.out.println("in publishqueue unpublish asset");
		 waitForSometime(2000);
	    click(VerifyPublishActivitiesObjects.publishQueueLink, "click publish Queue icon", "p1");
		 waitForSometime(1000);
		verifyText(VerifyPublishActivitiesObjects.publsiTimetitle, VerificationData.PublishQueue.time, "verify Time", "p2");
		verifyText(VerifyPublishActivitiesObjects.publishContentType, VerificationData.PublishQueue.form, "verify form", "p3");
		verifyText(VerifyPublishActivitiesObjects.publishEntryTitle, VerificationData.PublishQueue.entry,
				"verify entryName", "p4");
		verifyText(VerifyPublishActivitiesObjects.publishVersion, VerificationData.PublishQueue.version,
				"verify version", "p5");
		verifyText(VerifyPublishActivitiesObjects.publishQueueLanguage, VerificationData.PublishQueue.language,
				"verify language", "p6");
		verifyText(VerifyPublishActivitiesObjects.publishedByTitle, VerificationData.PublishQueue.usename,
				"verify userName", "p7");
		verifyText(VerifyPublishActivitiesObjects.publisEnv, VerificationData.PublishQueue.env,
				"verify environment", "p8");
		verifyText(VerifyPublishActivitiesObjects.publishStatus, VerificationData.PublishQueue.status, "verify status",
				"p9");
		

		  waitForSometime(100000);
		 click(VerifyPublishActivitiesObjects.refreshIcon, "click publish Queue icon", "p1");
		 
		 waitForSometime(10000);
		
		// click(VerifyPublishActivitiesObjects.refreshIcon, "click publish Queue icon", "p1");
		
		 verifyText(VerifyPublishActivitiesObjects.entry1, VerificationData.PublishQueue.assetName,
				"verify form name of an entry", "p10");
		verifyText(VerifyPublishActivitiesObjects.contentType1, VerificationData.PublishQueue.contentTypeName1,
				"verify entry name", "p11");
		verifyText(VerifyPublishActivitiesObjects.language1, VerificationData.PublishQueue.language1,
				"verify versionNumber of an entry", "p12");
		verifyText(VerifyPublishActivitiesObjects.publishBy1, VerificationData.PublishQueue.user,
				"verify langName of an entry", "p3");
		verifyEnvName(VerifyPublishActivitiesObjects.envName1, VerificationData.PublishQueue.envStagName,
				"verify userName of an entry", "p3");
		verifyText(VerifyPublishActivitiesObjects.status1, VerificationData.PublishQueue.statusOfEntry1,
				"verify environment of an entry", "p3");
	
		verifyText(VerifyPublishActivitiesObjects.entry2, VerificationData.PublishQueue.assetName,
				"verify form name of an entry", "p10");
		verifyText(VerifyPublishActivitiesObjects.contentType2, VerificationData.PublishQueue.contentTypeName1,
				"verify entry name", "p11");
		verifyText(VerifyPublishActivitiesObjects.language2, VerificationData.PublishQueue.language1,
				"verify versionNumber of an entry", "p12");
		verifyText(VerifyPublishActivitiesObjects.publishBy1, VerificationData.PublishQueue.user,
				"verify langName of an entry", "p3");
		verifyEnvName(VerifyPublishActivitiesObjects.envName2, VerificationData.PublishQueue.envProdName,
				"verify userName of an entry", "p3");
		verifyText(VerifyPublishActivitiesObjects.status2, VerificationData.PublishQueue.statusOfEntry1,
				"verify environment of an entry", "p3");
		
		verifyText(VerifyPublishActivitiesObjects.entry3, VerificationData.PublishQueue.assetName,
				"verify form name of an entry", "p10");
		verifyText(VerifyPublishActivitiesObjects.contentType3, VerificationData.PublishQueue.contentTypeName1,
				"verify entry name", "p11");
		verifyText(VerifyPublishActivitiesObjects.language3, VerificationData.PublishQueue.language1,
				"verify versionNumber of an entry", "p12");
		verifyText(VerifyPublishActivitiesObjects.publishBy3, VerificationData.PublishQueue.user,
				"verify langName of an entry", "p3");
		verifyEnvName(VerifyPublishActivitiesObjects.envName3, VerificationData.PublishQueue.envName1,
				"verify userName of an entry", "p3");
		verifyText(VerifyPublishActivitiesObjects.status3, VerificationData.PublishQueue.statusOfEntry1,
				"verify environment of an entry", "p3");
		
		verifyText(VerifyPublishActivitiesObjects.entry4, VerificationData.PublishQueue.assetName,
				"verify form name of an entry", "p10");
		verifyText(VerifyPublishActivitiesObjects.contentType4, VerificationData.PublishQueue.contentTypeName1,
				"verify entry name", "p11");
		verifyText(VerifyPublishActivitiesObjects.language4, VerificationData.PublishQueue.language1,
				"verify versionNumber of an entry", "p12");
		verifyText(VerifyPublishActivitiesObjects.publishBy4, VerificationData.PublishQueue.user,
				"verify langName of an entry", "p3");
	//	verifyEnvName(VerifyPublishActivitiesObjects.envName4, VerificationData.PublishQueue.envDevName,
	//			"verify userName of an entry", "p3");
		verifyText(VerifyPublishActivitiesObjects.status4, VerificationData.PublishQueue.statusOfEntry1,
				"verify environment of an entry", "p3");
	
 
		clicOnkAssetLink();
		click(VerifyPublishActivitiesObjects.dhaval, "click on asset which you want to publish ", "A1");
		click(VerifyPublishActivitiesObjects.delete, "click on asset which you want to publish ", "A1");
		click(VerifyPublishActivitiesObjects.deleteButtonOnwarningBox, "click on asset which you want to publish ", "A1");
	
	}
	
	
	
	
	public static void verifyPublishQueueOfPublishedEntry()  {

	    System.out.println("in publish queue publish entry ");
		
		
		click(VerifyPublishActivitiesObjects.publishQueueLink, "click publish Queue icon", "p1");
		verifyText(VerifyPublishActivitiesObjects.publsiTimetitle, VerificationData.PublishQueue.time, "verify Time", "p2");
		verifyText(VerifyPublishActivitiesObjects.publishContentType, VerificationData.PublishQueue.form, "verify form", "p3");
		verifyText(VerifyPublishActivitiesObjects.publishEntryTitle, VerificationData.PublishQueue.entry,
				"verify entryName", "p4");
		verifyText(VerifyPublishActivitiesObjects.publishVersion, VerificationData.PublishQueue.version,
				"verify version", "p5");
		verifyText(VerifyPublishActivitiesObjects.publishQueueLanguage, VerificationData.PublishQueue.language,
				"verify language", "p6");
		verifyText(VerifyPublishActivitiesObjects.publishedByTitle, VerificationData.PublishQueue.usename,
				"verify userName", "p7");
		//verifyEnvName(VerifyPublishActivitiesObjects.publisEnv, VerificationData.PublishQueue.env,
		//		"verify environment", "p8");
		verifyText(VerifyPublishActivitiesObjects.publishStatus, VerificationData.PublishQueue.status, "verify status",
				"p9");
		
		  waitForSometime(100000);
		 click(VerifyPublishActivitiesObjects.refreshIcon, "click publish Queue icon", "p1");
		 
		 waitForSometime(10000);
		
		 verifyText(VerifyPublishActivitiesObjects.entry1, VerificationData.PublishQueue.entryName,
				"verify form name of an entry", "p10");
		verifyText(VerifyPublishActivitiesObjects.contentType1, VerificationData.PublishQueue.contentTypeName,
				"verify entry name", "p11");
		verifyText(VerifyPublishActivitiesObjects.language1, VerificationData.PublishQueue.language1,
				"verify versionNumber of an entry", "p12");
		verifyText(VerifyPublishActivitiesObjects.publishBy1, VerificationData.PublishQueue.user,
				"verify langName of an entry", "p3");
	//	verifyText(VerifyPublishActivitiesObjects.envName1, VerificationData.PublishQueue.envName1,
	//			"verify userName of an entry", "p3");
		//verifyEnvName(VerifyPublishActivitiesObjects.status1, VerificationData.PublishQueue.statusOfEntry,
		//		"verify environment of an entry", "p3");
	
		verifyText(VerifyPublishActivitiesObjects.entry2, VerificationData.PublishQueue.entryName,
				"verify form name of an entry", "p10");
		verifyText(VerifyPublishActivitiesObjects.contentType2, VerificationData.PublishQueue.contentTypeName,
				"verify entry name", "p11");
		verifyText(VerifyPublishActivitiesObjects.language2, VerificationData.PublishQueue.language1,
				"verify versionNumber of an entry", "p12");
		verifyText(VerifyPublishActivitiesObjects.publishBy1, VerificationData.PublishQueue.user,
				"verify langName of an entry", "p3");
		verifyEnvName(VerifyPublishActivitiesObjects.envName2, VerificationData.PublishQueue.envProdName,
				"verify userName of an entry", "p3");
		verifyText(VerifyPublishActivitiesObjects.status2, VerificationData.PublishQueue.statusOfEntry,
				"verify environment of an entry", "p3");
		
		verifyText(VerifyPublishActivitiesObjects.entry3, VerificationData.PublishQueue.entryName,
				"verify form name of an entry", "p10");
		verifyText(VerifyPublishActivitiesObjects.contentType3, VerificationData.PublishQueue.contentTypeName,
				"verify entry name", "p11");
		verifyText(VerifyPublishActivitiesObjects.language3, VerificationData.PublishQueue.language1,
				"verify versionNumber of an entry", "p12");
		verifyText(VerifyPublishActivitiesObjects.publishBy3, VerificationData.PublishQueue.user,
				"verify langName of an entry", "p3");
		verifyEnvName(VerifyPublishActivitiesObjects.envName3, VerificationData.PublishQueue.envStagName,
				"verify userName of an entry", "p3");
		verifyText(VerifyPublishActivitiesObjects.status3, VerificationData.PublishQueue.statusOfEntry,
				"verify environment of an entry", "p3");
		
		

		verifyText(VerifyPublishActivitiesObjects.entry4, VerificationData.PublishQueue.entryName,
				"verify form name of an entry", "p10");
		verifyText(VerifyPublishActivitiesObjects.contentType4, VerificationData.PublishQueue.contentTypeName,
				"verify entry name", "p11");
		verifyText(VerifyPublishActivitiesObjects.language4, VerificationData.PublishQueue.language1,
				"verify versionNumber of an entry", "p12");
		verifyText(VerifyPublishActivitiesObjects.publishBy4, VerificationData.PublishQueue.user,
				"verify langName of an entry", "p3");
		verifyEnvName(VerifyPublishActivitiesObjects.envName4, VerificationData.PublishQueue.envDevName,
				"verify userName of an entry", "p3");
		//verifyText(VerifyPublishActivitiesObjects.status4, VerificationData.PublishQueue.statusOfEntry,
//		"verify environment of an entry", "p3");
	
   }
	
	public static void unPublishEntryWithScedule() {

		click(VerifyPublishActivitiesObjects.contentType, "click on content type menu button", "A1");
		click(VerifyPublishActivitiesObjects.imported, "click onimported form", "A1");
		
		click(VerifyPublishActivitiesObjects.importedentry, "click on imported entry", "A1");
		
		click(VerifyPublishActivitiesObjects.unpublish, "click on asset which you want to publish", "A1");
		click(VerifyPublishActivitiesObjects.production1, "click on asset which you want to publish ", "A1");
		click(VerifyPublishActivitiesObjects.development1, "click on asset which you want to publish ", "A1");
		click(VerifyPublishActivitiesObjects.stag1, "click on asset which you want to publish ", "A1");
		click(VerifyPublishActivitiesObjects.testEnv1, "click on asset which you want to publish ", "A1");
		click(VerifyPublishActivitiesObjects.unPublishLater, "click on asset which you want to publish ", "A1");
		clickBySize(VerifyPublishActivitiesObjects.selectTimeAndDate, "click on asset which you want to publish ", "A1");
		click(VerifyPublishActivitiesObjects.now, "click on asset which you want to publish ", "A1");
		mintesValue() ;
				  waitForSometime(3000);
		clear(VerifyPublishActivitiesObjects.minits, "click on asset which you want to publish ", "A1");
	    sendkeys(VerifyPublishActivitiesObjects.minits, sceduleMinutes,"click on asset which you want to publish ", "A1");
		click(VerifyPublishActivitiesObjects.done, "click on asset which you want to publish ", "A1");
		click(VerifyPublishActivitiesObjects.publishOnpopup, "click on asset which you want to publish ", "A1");
		waitForSometime(2000) ;
		verifyText(VerifyPublishActivitiesObjects.successMessage,VerificationData.Assets.unPublishEntrySuccessMessage,"verify publish asset suuccess message","d4") ;
	
	}
	
	
	public static void verifyPublishQueueOfUnPublishedEntry()  {

	  
		 System.out.println("in publish queue un publish entry ");
		
		click(VerifyPublishActivitiesObjects.publishQueueLink, "click publish Queue icon", "p1");
		verifyText(VerifyPublishActivitiesObjects.publsiTimetitle, VerificationData.PublishQueue.time, "verify Time", "p2");
		verifyText(VerifyPublishActivitiesObjects.publishContentType, VerificationData.PublishQueue.form, "verify form", "p3");
		verifyText(VerifyPublishActivitiesObjects.publishEntryTitle, VerificationData.PublishQueue.entry,
				"verify entryName", "p4");
		verifyText(VerifyPublishActivitiesObjects.publishVersion, VerificationData.PublishQueue.version,
				"verify version", "p5");
		verifyText(VerifyPublishActivitiesObjects.publishQueueLanguage, VerificationData.PublishQueue.language,
				"verify language", "p6");
		verifyText(VerifyPublishActivitiesObjects.publishedByTitle, VerificationData.PublishQueue.usename,
				"verify userName", "p7");
		//verifyEnvName(VerifyPublishActivitiesObjects.publisEnv, VerificationData.PublishQueue.env,
		//		"verify environment", "p8");
	//	verifyText(VerifyPublishActivitiesObjects.publishStatus, VerificationData.PublishQueue.status, "verify status",
		//		"p9");
		
		  waitForSometime(100000);
		 click(VerifyPublishActivitiesObjects.refreshIcon, "click on refresh button", "p1");
		 
		 waitForSometime(10000);
		
		 verifyText(VerifyPublishActivitiesObjects.entry1, VerificationData.PublishQueue.entryName,
				"verify form name of an entry", "p10");
		verifyText(VerifyPublishActivitiesObjects.contentType1, VerificationData.PublishQueue.contentTypeName,
				"verify entry name", "p11");
		verifyText(VerifyPublishActivitiesObjects.language1, VerificationData.PublishQueue.language1,
				"verify versionNumber of an entry", "p12");
		verifyText(VerifyPublishActivitiesObjects.publishBy1, VerificationData.PublishQueue.user,
				"verify langName of an entry", "p3");
		verifyEnvName(VerifyPublishActivitiesObjects.envName1, VerificationData.PublishQueue.envName1,
				"verify userName of an entry", "p3");
		verifyText(VerifyPublishActivitiesObjects.status1, VerificationData.PublishQueue.statusOfEntry1,
				"verify environment of an entry", "p3");
	
		verifyText(VerifyPublishActivitiesObjects.entry2, VerificationData.PublishQueue.entryName,
				"verify form name of an entry", "p10");
		verifyText(VerifyPublishActivitiesObjects.contentType2, VerificationData.PublishQueue.contentTypeName,
				"verify entry name", "p11");
		verifyText(VerifyPublishActivitiesObjects.language2, VerificationData.PublishQueue.language1,
				"verify versionNumber of an entry", "p12");
		verifyText(VerifyPublishActivitiesObjects.publishBy1, VerificationData.PublishQueue.user,
				"verify langName of an entry", "p3");
		verifyEnvName(VerifyPublishActivitiesObjects.envName2, VerificationData.PublishQueue.envProdName,
				"verify userName of an entry", "p3");
		verifyText(VerifyPublishActivitiesObjects.status2, VerificationData.PublishQueue.statusOfEntry1,
				"verify environment of an entry", "p3");
		
		verifyText(VerifyPublishActivitiesObjects.entry3, VerificationData.PublishQueue.entryName,
				"verify form name of an entry", "p10");
		verifyText(VerifyPublishActivitiesObjects.contentType3, VerificationData.PublishQueue.contentTypeName,
				"verify entry name", "p11");
		verifyText(VerifyPublishActivitiesObjects.language3, VerificationData.PublishQueue.language1,
				"verify versionNumber of an entry", "p12");
		verifyText(VerifyPublishActivitiesObjects.publishBy3, VerificationData.PublishQueue.user,
				"verify langName of an entry", "p3");
		verifyEnvName(VerifyPublishActivitiesObjects.envName3, VerificationData.PublishQueue.envStagName,
				"verify userName of an entry", "p3");
		verifyText(VerifyPublishActivitiesObjects.status3, VerificationData.PublishQueue.statusOfEntry1,
				"verify environment of an entry", "p3");
		
		

		verifyText(VerifyPublishActivitiesObjects.entry4, VerificationData.PublishQueue.entryName,
				"verify form name of an entry", "p10");
		verifyText(VerifyPublishActivitiesObjects.contentType4, VerificationData.PublishQueue.contentTypeName,
				"verify entry name", "p11");
		verifyText(VerifyPublishActivitiesObjects.language4, VerificationData.PublishQueue.language1,
				"verify versionNumber of an entry", "p12");
		verifyText(VerifyPublishActivitiesObjects.publishBy4, VerificationData.PublishQueue.user,
				"verify langName of an entry", "p3");
		verifyEnvName(VerifyPublishActivitiesObjects.envName4, VerificationData.PublishQueue.envDevName,
				"verify userName of an entry", "p3");
		//verifyText(VerifyPublishActivitiesObjects.status4, VerificationData.PublishQueue.statusOfEntry1,
			//	"verify environment of an entry", "p3");
	
		
		click(VerifyPublishActivitiesObjects.contentType, "click on content type menu button", "A1");
		
		mousehover(VerifyPublishActivitiesObjects.imported, "mouse hover on importedform", "A1");
		
		click(VerifyPublishActivitiesObjects.ellipsisIcon, "click on ellipsisIcon of contenttype", "A1");
		
		click(VerifyPublishActivitiesObjects.deleteForm, "click on ellipsisIcon of contenttype", "A1");
		
		click(VerifyPublishActivitiesObjects.deleteButtonOcontentetYpe, "click on ellipsisIcon of contenttype", "A1");
   }

public static void filterPublishQueue() {
		
		verifyText(PublishQueueObjects.filterText, "FILTERS", "verify filter text is present or not", "pic6");
		elementIsPresent(PublishQueueObjects.hideFilterIcon, "Verify the hide fitler icon", "pic7");
		//click(PublishQueueObjects.hideFilterIcon, "click on hide fitler icon", "pic8");
		elementIsPresent(PublishQueueObjects.showFilterIcon, "Verify the show fitler icon", "pic9");
		//click(PublishQueueObjects.showFilterIcon, "click on show fitler icon", "pic10");
	}
	
	public static void statusPublishQueue() {
		
		verifyText(PublishQueueObjects.statusText, "STATUS", "verify filter text is present or not", "pic87");
		verifyText(PublishQueueObjects.published, "Published", "verify text is present or not", "pic11");
		click(PublishQueueObjects.published, "click on published check box", "pic12");
		verifyText(PublishQueueObjects.statusDashboard, "STATUS", "verify text is present or not", "pic13");
		verifyText(PublishQueueObjects.statusPublishedValue1, "Published", "verify text is present or not", "pic14");
		verifyText(PublishQueueObjects.statusPublishedValue2, "Published", "verify text is present or not", "pic15");
		verifyText(PublishQueueObjects.statusPublishedValue3, "Published", "verify text is present or not", "pic16");
		verifyText(PublishQueueObjects.statusPublishedValue4, "Published", "verify text is present or not", "pic17");
		verifyText(PublishQueueObjects.statusPublishedValue5, "Published", "verify text is present or not", "pic18");
		
		click(PublishQueueObjects.published, "click on published to uncheck", "pic42");
	}
	
	public static void statusUnPublishQueue() {
		
		verifyText(PublishQueueObjects.unpublished, "Unpublished", "verify text is present or not", "pic19");
		click(PublishQueueObjects.unpublished, "click on unpublished check box", "pic20");
		verifyText(PublishQueueObjects.statusDashboard, "STATUS", "verify text is present or not", "pic21");
		verifyText(PublishQueueObjects.statusUnpublishedValue1, "Unpublished", "verify text is present or not", "pic22");
		verifyText(PublishQueueObjects.statusUnpublishedValue2, "Unpublished", "verify text is present or not", "pic23");
		
		click(PublishQueueObjects.unpublished, "click on unpublished to uncheck", "pic43");
	}

	public static void statusScheduledPublishQueue() {
	
		verifyText(PublishQueueObjects.scheduledPublish, "Scheduled Publish", "verify text is present or not", "pic24");
		click(PublishQueueObjects.scheduledPublish, "click on Scheduled Publish check box", "pic25");
		verifyText(PublishQueueObjects.statusDashboard, "STATUS", "verify text is present or not", "pic26");
		verifyText(PublishQueueObjects.statusScheduledPublishedValue1, "Scheduled Publish", "verify text is present or not", "pic27");
		verifyText(PublishQueueObjects.statusScheduledPublishedValue2, "Scheduled Publish", "verify text is present or not", "pic28");
		
		click(PublishQueueObjects.scheduledPublish, "click on Scheduled Publish to uncheck", "pic44");
	}
	
	public static void statusScheduledUnPublishQueue() {
		
		verifyText(PublishQueueObjects.scheduledUnpublish, "Unscheduled Publish", "verify text is present or not", "pic29");
		click(PublishQueueObjects.scheduledUnpublish, "click on unpublished check box", "pic30");
		verifyText(PublishQueueObjects.statusDashboard, "STATUS", "verify text is present or not", "pic31");
		verifyText(PublishQueueObjects.statusScheduledUnPublishedValue1, "Unscheduled Publish", "verify text is present or not", "pic32");
		verifyText(PublishQueueObjects.statusScheduledUnPublishedValue2, "Unscheduled Publish", "verify text is present or not", "pic33");
		
		click(PublishQueueObjects.scheduledUnpublish, "click on unpublished to uncheck", "pic45");
	}
	
	public static void statusDeletedQueue() {
		
		verifyText(PublishQueueObjects.deleted, "Deleted", "verify text is present or not", "pic34");
		click(PublishQueueObjects.deleted, "click on Deleted check box", "pic35");
		verifyText(PublishQueueObjects.statusDashboard, "STATUS", "verify text is present or not", "pic36");
		verifyText(PublishQueueObjects.statusDeletedValue1, "Deleted", "verify text is present or not", "pic37");
		verifyText(PublishQueueObjects.statusDeletedValue2, "Deleted", "verify text is present or not", "pic38");
		verifyText(PublishQueueObjects.statusDeletedValue3, "Deleted", "verify text is present or not", "pic39");
		verifyText(PublishQueueObjects.statusDeletedValue4, "Deleted", "verify text is present or not", "pic40");
		verifyText(PublishQueueObjects.statusDeletedValue5, "Deleted", "verify text is present or not", "pic41");
		
		click(PublishQueueObjects.deleted, "click on Deleted to uncheck", "pic46");
	}
	
	public static void statusCancelledQueue() {
		
		verifyText(PublishQueueObjects.cancelled, "Cancelled", "verify text is present or not", "pic47");
		click(PublishQueueObjects.cancelled, "click on Cancelled check box", "pic48");
		verifyText(PublishQueueObjects.statusDashboard, "STATUS", "verify text is present or not", "pic49");
		verifyText(PublishQueueObjects.statusCancelledValue1, "Cancelled", "verify text is present or not", "pic50");
		verifyText(PublishQueueObjects.statusCancelledValue2, "Cancelled", "verify text is present or not", "pic51");
		verifyText(PublishQueueObjects.statusCancelledValue3, "Cancelled", "verify text is present or not", "pic52");
		verifyText(PublishQueueObjects.statusCancelledValue4, "Cancelled", "verify text is present or not", "pic53");
		
		click(PublishQueueObjects.cancelled, "click on Cancelled to uncheck", "pic54");
	}
	
	public static void statusFailedQueue() {
		
		verifyText(PublishQueueObjects.failed, "Failed", "verify text is present or not", "pic55");
		click(PublishQueueObjects.failed, "click on Failed check box", "pic56");
		verifyText(PublishQueueObjects.statusDashboard, "STATUS", "verify text is present or not", "pic57");
		verifyText(PublishQueueObjects.statusFailedValue1, "Failed", "verify text is present or not", "pic58");
		verifyText(PublishQueueObjects.statusFailedValue2, "Failed", "verify text is present or not", "pic59");
		verifyText(PublishQueueObjects.statusFailedValue3, "Failed", "verify text is present or not", "pic60");
		verifyText(PublishQueueObjects.statusFailedValue4, "Failed", "verify text is present or not", "pic61");
		
		click(PublishQueueObjects.failed, "click on Failed to uncheck", "pic62");
	}
	
	public static void statusInProgressQueue() {
		
		verifyText(PublishQueueObjects.inProgress, "In Progress", "verify text is present or not", "pic63");
		click(PublishQueueObjects.inProgress, "click on In Progress check box", "pic64");
		verifyText(PublishQueueObjects.statusDashboard, "STATUS", "verify text is present or not", "pic65");
		verifyText(PublishQueueObjects.statusInProgressValue1, "In Progress", "verify text is present or not", "pic66");
		verifyText(PublishQueueObjects.statusInProgressValue2, "In Progress", "verify text is present or not", "pic67");
		verifyText(PublishQueueObjects.statusInProgressValue3, "In Progress", "verify text is present or not", "pic68");
		verifyText(PublishQueueObjects.statusInProgressValue4, "In Progress", "verify text is present or not", "pic69");
		
		click(PublishQueueObjects.inProgress, "click on In Progress to uncheck", "pic70");
	}
	
	public static void statusPendingQueue() {
		
		verifyText(PublishQueueObjects.pending, "Pending", "verify text is present or not", "pic71");
		click(PublishQueueObjects.pending, "click on Pending check box", "pic72");
		verifyText(PublishQueueObjects.statusDashboard, "STATUS", "verify text is present or not", "pic73");
		verifyText(PublishQueueObjects.statusPendingValue1, "Pending", "verify text is present or not", "pic74");
		verifyText(PublishQueueObjects.statusPendingValue2, "Pending", "verify text is present or not", "pic75");
		verifyText(PublishQueueObjects.statusPendingValue3, "Pending", "verify text is present or not", "pic76");
		verifyText(PublishQueueObjects.statusPendingValue4, "Pending", "verify text is present or not", "pic77");
		
		click(PublishQueueObjects.pending, "click on Pending to uncheck", "pic78");
	}
	
	public static void statusEnvironmentsQueue() {
		
		verifyText(PublishQueueObjects.environmentsText, "ENVIRONMENTS", "verify text is present or not", "pic79");
		click(PublishQueueObjects.test, "click on test check box", "pic80");
		verifyText(PublishQueueObjects.environmentdashboard, "ENVIRONMENT(S)", "verify text is present or not", "pic81");
		verifyText(PublishQueueObjects.environmentValue1, "test", "verify text is present or not", "pic82");
		verifyText(PublishQueueObjects.environmentValue2, "test", "verify text is present or not", "pic83");
		verifyText(PublishQueueObjects.environmentValue3, "test", "verify text is present or not", "pic84");
		verifyText(PublishQueueObjects.environmentValue4, "test", "verify text is present or not", "pic85");
		
		click(PublishQueueObjects.test, "click on test to uncheck", "pic86");
	}
	
	public static void statusUsersQueue() {
		
		verifyText(PublishQueueObjects.users, "USERS", "verify text is present or not", "pic87");
		click(PublishQueueObjects.me, "click on me check box", "pic88");
		verifyText(PublishQueueObjects.publishedByDashboard, "PUBLISHED BY", "verify text is present or not", "pic81");
		verifyText(PublishQueueObjects.publishedByValue1, "Me", "verify text is present or not", "pic82");
		verifyText(PublishQueueObjects.publishedByValue2, "Me", "verify text is present or not", "pic83");
		verifyText(PublishQueueObjects.publishedByValue3, "Me", "verify text is present or not", "pic84");
		verifyText(PublishQueueObjects.publishedByValue4, "Me", "verify text is present or not", "pic85");
		
		click(PublishQueueObjects.me, "click on me to uncheck", "pic86");
	}
	
	public static void statusLanguagesQueue() {
		
		verifyText(PublishQueueObjects.languages, "LANGUAGES", "verify text is present or not", "pic87");
		click(PublishQueueObjects.englishUs, "click on US check box", "pic88");
		verifyText(PublishQueueObjects.languageDashboard, "LANGUAGE", "verify text is present or not", "pic89");
		verifyText(PublishQueueObjects.languageValue1, "English (United States)", "verify text is present or not", "pic90");
		verifyText(PublishQueueObjects.languageValue2, "English (United States)", "verify text is present or not", "pic91");
		verifyText(PublishQueueObjects.languageValue3, "English (United States)", "verify text is present or not", "pic92");
		verifyText(PublishQueueObjects.languageValue4, "English (United States)", "verify text is present or not", "pic93");
		
		click(PublishQueueObjects.englishUs, "click on US to uncheck", "pic94");
	}
	
    public static void statusFormQueue() {
		
		verifyText(PublishQueueObjects.languages, "LANGUAGES", "verify text is present or not", "pic87");
		click(PublishQueueObjects.englishUs, "click on US check box", "pic88");
		verifyText(PublishQueueObjects.languageDashboard, "LANGUAGE", "verify text is present or not", "pic89");
		verifyText(PublishQueueObjects.languageValue1, "English (United States)", "verify text is present or not", "pic90");
		verifyText(PublishQueueObjects.languageValue2, "English (United States)", "verify text is present or not", "pic91");
		verifyText(PublishQueueObjects.languageValue3, "English (United States)", "verify text is present or not", "pic92");
		verifyText(PublishQueueObjects.languageValue4, "English (United States)", "verify text is present or not", "pic93");
		
		
	}
}

package page.actions;

import com.built.io.automationframework.BasePageActions;

import data.VerificationData;
import page.objects.PublishQueueObjects;
import page.objects.VerifyPublishActivitiesObjects;

public class PublishQueueActions extends BasePageActions  {
	
	
	
	public static void publishQueueActions()  {

	click(PublishQueueObjects.publishQueueLink, "click publish Queue icon", "p1");
		
		verifyText(PublishQueueObjects.publsiTimetitle, VerificationData.PublishQueue.time, "verify Time", "p2");
		verifyText(PublishQueueObjects.publishContentType, VerificationData.PublishQueue.form, "verify form", "p3");
		verifyText(PublishQueueObjects.publishEntryTitle, VerificationData.PublishQueue.entry,
				"verify entryName", "p4");
		verifyText(PublishQueueObjects.publishVersion, VerificationData.PublishQueue.version,
				"verify version", "p5");
		verifyText(PublishQueueObjects.publishQueueLanguage, VerificationData.PublishQueue.language,
				"verify language", "p6");
		verifyText(PublishQueueObjects.publishedByTitle, VerificationData.PublishQueue.usename,
				"verify userName", "p7");
		verifyText(PublishQueueObjects.publisEnv, VerificationData.PublishQueue.env,
				"verify environment", "p8");
		verifyText(PublishQueueObjects.publishStatus, VerificationData.PublishQueue.status, "verify status",
				"p9");
		verifyText(PublishQueueObjects.publisheContentTypeName, VerificationData.PublishQueue.contentTypeName,
				"verify form name of an entry", "p10");
		verifyText(PublishQueueObjects.publisheEntryName, VerificationData.PublishQueue.entryName,
				"verify entry name", "p11");
		verifyText(PublishQueueObjects.publisheContentTypeVersion, VerificationData.PublishQueue.versionNumber,
				"verify versionNumber of an entry", "p12");
		verifyText(PublishQueueObjects.publishedLanguage, VerificationData.PublishQueue.langName,
				"verify langName of an entry", "p3");
		verifyText(PublishQueueObjects.publishedBy, VerificationData.PublishQueue.user,
				"verify userName of an entry", "p3");
		verifyText(PublishQueueObjects.envName, VerificationData.PublishQueue.envName,
				"verify environment of an entry", "p3");
		verifyText(PublishQueueObjects.status, VerificationData.PublishQueue.statusOfEntry,
				"verify status of entry", "p3");

	}
	
	
	
	
	

	public static void publishQueueAssetActions()  {

	   click(PublishQueueObjects.publishQueueLink, "click publish Queue icon", "p1");
		
		verifyText(PublishQueueObjects.publsiTimetitle, VerificationData.PublishQueue.time, "verify Time", "p2");
		verifyText(PublishQueueObjects.publishContentType, VerificationData.PublishQueue.form, "verify form", "p3");
		verifyText(PublishQueueObjects.publishEntryTitle, VerificationData.PublishQueue.entry,
				"verify entryName", "p4");
		verifyText(PublishQueueObjects.publishVersion, VerificationData.PublishQueue.version,
				"verify version", "p5");
		verifyText(PublishQueueObjects.publishQueueLanguage, VerificationData.PublishQueue.language,
				"verify language", "p6");
		verifyText(PublishQueueObjects.publishedByTitle, VerificationData.PublishQueue.usename,
				"verify userName", "p7");
		verifyText(PublishQueueObjects.publisEnv, VerificationData.PublishQueue.env,
				"verify environment", "p8");
		verifyText(PublishQueueObjects.publishStatus, VerificationData.PublishQueue.status, "verify status",
				"p9");
		verifyText(PublishQueueObjects.publisheContentTypeName, VerificationData.PublishQueue.contentTypeName,
				"verify form name of an entry", "p10");
		verifyText(PublishQueueObjects.publisheEntryName, VerificationData.PublishQueue.entryName,
				"verify entry name", "p11");
		verifyText(PublishQueueObjects.publisheContentTypeVersion, VerificationData.PublishQueue.versionNumber,
				"verify versionNumber of an entry", "p12");
		verifyText(PublishQueueObjects.publishedLanguage, VerificationData.PublishQueue.langName,
				"verify langName of an entry", "p3");
		verifyText(PublishQueueObjects.publishedBy, VerificationData.PublishQueue.user,
				"verify userName of an entry", "p3");
		verifyText(PublishQueueObjects.envName, VerificationData.PublishQueue.envName,
				"verify environment of an entry", "p3");
		verifyText(PublishQueueObjects.status, VerificationData.PublishQueue.statusOfEntry,
				"verify status of entry", "p3");

	}
	

	
	public static void unPublishQueueAssetInSpecificStackActions()  {

		  click(PublishQueueObjects.publishQueueLink, "click publish Queue icon", "p1");
			
			verifyText(PublishQueueObjects.publsiTimetitle, VerificationData.PublishQueue.time, "verify Time", "p2");
			verifyText(PublishQueueObjects.publishContentType, VerificationData.PublishQueue.form, "verify form", "p3");
			verifyText(PublishQueueObjects.publishEntryTitle, VerificationData.PublishQueue.entry,
					"verify entryName", "p4");
			verifyText(PublishQueueObjects.publishVersion, VerificationData.PublishQueue.version,
					"verify version", "p5");
			verifyText(PublishQueueObjects.publishQueueLanguage, VerificationData.PublishQueue.language,
					"verify language", "p6");
			verifyText(PublishQueueObjects.publishedByTitle, VerificationData.PublishQueue.usename,
					"verify userName", "p7");
			verifyText(PublishQueueObjects.publisEnv, VerificationData.PublishQueue.env,
					"verify environment", "p8");
			verifyText(PublishQueueObjects.publishStatus, VerificationData.PublishQueue.status, "verify status",
					"p9");
			
			  waitForSometime(200000);
				
			
			 click(PublishQueueObjects.refreshIcon, "click publish Queue icon", "p1");
			 
			  waitForSometime(2000);
				
			
			 click(PublishQueueObjects.refreshIcon, "click publish Queue icon", "p1");
			
			 verifyText(PublishQueueObjects.entry1, VerificationData.PublishQueue.assetName,
					"verify form name of an entry", "p10");
			verifyText(PublishQueueObjects.contentType1, VerificationData.PublishQueue.contentTypeName1,
					"verify entry name", "p11");
			verifyText(PublishQueueObjects.language1, VerificationData.PublishQueue.language1,
					"verify versionNumber of an entry", "p12");
			verifyText(PublishQueueObjects.publishBy1, VerificationData.PublishQueue.user,
					"verify langName of an entry", "p3");
			verifyText(PublishQueueObjects.envName1, VerificationData.PublishQueue.envName1,
					"verify userName of an entry", "p3");
			verifyText(PublishQueueObjects.status1, VerificationData.PublishQueue.statusOfEntry1,
					"verify environment of an entry", "p3");
		

			verifyText(PublishQueueObjects.entry2, VerificationData.PublishQueue.assetName,
					"verify form name of an entry", "p10");
			verifyText(PublishQueueObjects.contentType2, VerificationData.PublishQueue.contentTypeName1,
					"verify entry name", "p11");
			verifyText(PublishQueueObjects.language2, VerificationData.PublishQueue.language1,
					"verify versionNumber of an entry", "p12");
			verifyText(PublishQueueObjects.publishBy1, VerificationData.PublishQueue.user,
					"verify langName of an entry", "p3");
			verifyText(PublishQueueObjects.envName2, VerificationData.PublishQueue.envProdName,
					"verify userName of an entry", "p3");
			verifyText(PublishQueueObjects.status2, VerificationData.PublishQueue.statusOfEntry1,
					"verify environment of an entry", "p3");
			
			

			verifyText(PublishQueueObjects.entry3, VerificationData.PublishQueue.assetName,
					"verify form name of an entry", "p10");
			verifyText(PublishQueueObjects.contentType3, VerificationData.PublishQueue.contentTypeName1,
					"verify entry name", "p11");
			verifyText(PublishQueueObjects.language3, VerificationData.PublishQueue.language1,
					"verify versionNumber of an entry", "p12");
			verifyText(PublishQueueObjects.publishBy3, VerificationData.PublishQueue.user,
					"verify langName of an entry", "p3");
			verifyText(PublishQueueObjects.envName3, VerificationData.PublishQueue.envStagName,
					"verify userName of an entry", "p3");
			verifyText(PublishQueueObjects.status3, VerificationData.PublishQueue.statusOfEntry1,
					"verify environment of an entry", "p3");
			
			

			verifyText(PublishQueueObjects.entry4, VerificationData.PublishQueue.assetName,
					"verify form name of an entry", "p10");
			verifyText(PublishQueueObjects.contentType4, VerificationData.PublishQueue.contentTypeName1,
					"verify entry name", "p11");
			verifyText(PublishQueueObjects.language4, VerificationData.PublishQueue.language1,
					"verify versionNumber of an entry", "p12");
			verifyText(PublishQueueObjects.publishBy4, VerificationData.PublishQueue.user,
					"verify langName of an entry", "p3");
			verifyText(PublishQueueObjects.envName4, VerificationData.PublishQueue.envDevName,
					"verify userName of an entry", "p3");
			verifyText(PublishQueueObjects.status4, VerificationData.PublishQueue.statusOfEntry1,
					"verify environment of an entry", "p3");
			
			click(PublishQueueObjects.contentType1, "click on asset which you want to publish ", "A1");
	
	
	}
		
		
	
	
	
	
	
	
	public static void initPublishQueue() {
	 mousehover(PublishQueueObjects.testingSite, "Mouse hover to testing site", "pic2");
	 click(PublishQueueObjects.openTestingSite, "Open the testing site", "pic3");
	 verifyText(PublishQueueObjects.headerPublishQueue, "PUBLISH QUEUE", "verify public queue text is present or not", "pic4");
	 click(PublishQueueObjects.headerPublishQueue, "click on public queue tab in the header", "pic5");
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
}

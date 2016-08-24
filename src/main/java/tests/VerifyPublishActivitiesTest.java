package tests;

import java.io.File;

import org.testng.annotations.Test;

import page.actions.PublishQueueActions;
import page.actions.VerifyPublishActivities;
import page.objects.ContentObjects;
import page.objects.VerifyPublishActivitiesObjects;

import com.built.io.automationframework.ExcelUtils;

public class VerifyPublishActivitiesTest extends VerifyPublishActivities {
	
	 
	@Test(priority = 1, groups = "Publish/Unpublish")
	public static void publishAssetWithSchedule() {
	
		publishAseetWithScedule() ;
	    publishQueueAssetInSpecificStackActions();
	}
	
  @Test(priority = 2, groups = "Publish/Unpublish")
	public static void unPublishAssetWithSchedule() {
	
		unPublishAseetWithScedule() ;
		verifyPublishQueueOfUnPublishAsset();
		
	}

	@Test(priority = 3, groups = "Publish/Unpublish")
	public static void publishEntryWithSchedule() {
	
		String importedForm = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("Imported.form")))
		.getAbsolutePath();
		
		importContentType(VerifyPublishActivitiesObjects.browse, importedForm) ;
		 waitForSometime(4000);
		 String importEntry = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("Imported.entry")))
			.getAbsolutePath();
			
			importEntry(importEntry);
		 verifyPublishQueueOfPublishedEntry();
	}
	
	 @Test(priority = 4, groups = "Publish/Unpublish")
		public static void unPublishEntryWithSchedule() {
		
		     unPublishEntryWithScedule() ;
		     verifyPublishQueueOfUnPublishedEntry();
		     
			
		}
	
/*	 @Test(priority = 5, groups = "Publish Queue", description = "Publish Queue Filter")
		public static void filtersInPublishQueue() {
			
			filterPublishQueue();
			statusPublishQueue();
			statusUnPublishQueue();
			statusScheduledPublishQueue();
			statusScheduledUnPublishQueue();
			statusDeletedQueue();
			statusCancelledQueue();
			statusFailedQueue();
			statusInProgressQueue();
			statusPendingQueue();
			statusEnvironmentsQueue();
			statusUsersQueue();
			statusLanguagesQueue();

		}
*/
	 
	 
	 
	 
	 
	 
	 
	 
	 
}

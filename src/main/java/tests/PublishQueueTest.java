package tests;

import org.testng.annotations.Test;

import page.actions.PublishQueueActions;
import page.actions.VerifyPublishActivities;

public class PublishQueueTest extends PublishQueueActions {
	
	
	
	
   /*@Test(priority = 1, groups = "Publish Queue", description = "Publish Queue Filter")
	public static void verifyPublishQueue() {
		
		publishQueueActions() ;
	}*/
	

	
	
	@Test(priority = 2, groups = "Publish/Unpublish")
	public static void publishEntryWithSchedule() {
	
		VerifyPublishActivities.unPublishAseetWithScedule() ;
		
	}
	
	
	@Test(priority = 1, groups = "Publish Queue", description = "Publish Queue Filter")
	public static void verifyPublishQueueofUNpublishedAsset() {
		
		unPublishQueueAssetInSpecificStackActions() ;
	}
	
	
	
	
	
}
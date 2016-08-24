package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import page.actions.AuditLogActions;
import page.actions.SettingPageActions;
import page.actions.WebHookActions;

public class WebHookTest  extends WebHookActions{
	
	@Test(priority = 1, groups = "Webhook")
	public void createWebhookForAnyContenttype() {

		clickOnWebhookTab();
		createWebhookForAnyContentTypeActions() ;
	}

	@Test(priority = 2, groups = "Webhook")
	public void createWebhookForAnyEntry() throws IOException {

		createWebhookForAnyEntryActions() ;
	}

	@Test(priority = 3, groups = "Webhook")
	public void createWebhookForAnyAsset() {

		createWebhookForAnyAssetActions() ;
	}
	
	

}

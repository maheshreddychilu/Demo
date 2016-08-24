package page.actions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import page.objects.SettingsPageObjects;
import page.objects.WebHookObjects;

import com.built.io.automationframework.BasePageActions;
import com.built.io.automationframework.Driver;
import com.built.io.automationframework.ExcelUtils;




import data.VerificationData;

public class WebHookActions extends BasePageActions {

	
	public static void clickOnWebhookTab()  {

		waitForSometime(2000);
		mousehover(WebHookObjects.settingsMenu,
				"mouse hover on setting menu", "w-1");
		click(WebHookObjects.webhookLink,
				"click on webhook link link", "w2");

	}

	public static void createWebhookForAnyContentTypeActions()  {

		waitForSometime(2000);
		click(WebHookObjects.addWebHook, "click on addWebHook button", "w-3");
		sendkeys(WebHookObjects.name, ExcelUtils.readCell(1,
				ExcelUtils.getCell("webhook.any.contenttype")),
				"enter value in webhook name inputbox", "w-1");
		waitForSometime(2000);
		sendkeys(WebHookObjects.url, ExcelUtils.readCell(1,
				ExcelUtils.getCell("webhook.url")),
				"enter value in webhook url inputbox", "w-2");
		clickBySize(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-4");
		click(WebHookObjects.form, "click on form ", "w-5");
		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-5");
		click(WebHookObjects.createted, "click on created in dropdown list",
				"w-6");
		click(WebHookObjects.plusButton, "click on plusButton", "w-7");

		clickBySize(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-8");
		click(WebHookObjects.form, "click on form ", "w-9");
		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-10");
		click(WebHookObjects.updated, "click on updated in dropdown list",
				"w-11");
		click(WebHookObjects.plusButton, "click on plusButton", "w-12");

		clickBySize(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-13");
		click(WebHookObjects.form, "click on form ", "w-14");
		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-15");
		click(WebHookObjects.deleted, "click on deleted in dropdown list",
				"w-16");
      System.out.println("before create button");
		click(WebHookObjects.create, "click on create Button", "w-17");
				 waitForSometime(3000);
		click(WebHookObjects.close, "click on close Button", "w-18");
		   System.out.println("before create button");
		  waitForSometime(2000);
		   System.out.println("before create button");
		verifyText(WebHookObjects.webhookForAnyForm,
				VerificationData.WebHook.webhookForAnyForm,
				"verify webhook created or not", "w-18");

				  waitForSometime(1000);
	
	
	}
	
	
	public static void createWebhookForAnyEntryActions() throws IOException  {

		waitForSometime(2000);
		click(WebHookObjects.addWebHook, "click on addWebHook button", "w-3");
		
				  
		sendkeys(WebHookObjects.name, ExcelUtils.readCell(1,
				ExcelUtils.getCell("webhook.any.entry")),
				"enter value in webhook name inputbox", "w-1");
		waitForSometime(400);
		sendkeys(WebHookObjects.url, ExcelUtils.readCell(1,
				ExcelUtils.getCell("webhook.url")),
				"enter value in webhook url inputbox", "w-2");
		
		
		//Created
		clickBySize(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-4");
		click(WebHookObjects.entry, "click on form ", "w-5");
		
		clickBySize(WebHookObjects.selectContentType,
				"click on selectModule dropdown list", "w-4");
		click(WebHookObjects.all, "click on form ", "w-5");
		
		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-5");
		click(WebHookObjects.createted, "click on created in dropdown list",
				"w-6");
	
		
		//Update
		click(WebHookObjects.plusButton, "click on plusButton", "w-7");

		clickBySize(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-8");
		click(WebHookObjects.entry, "click on form ", "w-9");
		
		clickBySize(WebHookObjects.selectContentType,
				"click on selectModule dropdown list", "w-4");
		click(WebHookObjects.all, "click on form ", "w-5");
		
		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-10");
		click(WebHookObjects.updated, "click on updated in dropdown list",
				"w-11");
		
		
		//delete
		click(WebHookObjects.plusButton, "click on plusButton", "w-12");

		clickBySize(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-13");
		click(WebHookObjects.entry, "click on entry ", "w-14");
		
		clickBySize(WebHookObjects.selectContentType,
				"click on selectModule dropdown list", "w-4");
		click(WebHookObjects.all, "click on form ", "w-5");
		
		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-15");
		click(WebHookObjects.deleted, "click on deleted in dropdown list",
				"w-16");

	
	
		
		//publish
		click(WebHookObjects.plusButton, "click on plusButton", "w-12");

		clickBySize(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-13");
		click(WebHookObjects.entry, "click on entry ", "w-14");
		
		clickBySize(WebHookObjects.selectContentType,
				"click on selectModule dropdown list", "w-4");
		click(WebHookObjects.all, "click on form ", "w-5");
		
		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-15");
		click(WebHookObjects.published, "click on deleted in dropdown list",
				"w-16");
		clickBySize(WebHookObjects.selectEnv,
				"click on enviroment dropdown list", "w-16");
		click(WebHookObjects.all, "click on blank in dropdown list", "w-6");

		clickBySize(WebHookObjects.publishStatus,
				"click on enviroment dropdown list", "w-16");
		click(WebHookObjects.successfully,
				"click on successfully in dropdown list", "w-6");
		
		
		// unpublish
		
		click(WebHookObjects.plusButton, "click on plusButton", "w-12");

		clickBySize(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-13");
		click(WebHookObjects.entry, "click on entry ", "w-14");
		
		clickBySize(WebHookObjects.selectContentType,
				"click on selectModule dropdown list", "w-4");
		click(WebHookObjects.all, "click on form ", "w-5");
		
		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-15");
		click(WebHookObjects.unpublished, "click on deleted in dropdown list",
				"w-16");
		clickBySize(WebHookObjects.selectEnv,
				"click on enviroment dropdown list", "w-16");
		click(WebHookObjects.all, "click on blank in dropdown list", "w-6");

		clickBySize(WebHookObjects.publishStatus,
				"click on enviroment dropdown list", "w-16");
		click(WebHookObjects.unSuccessfully,
				"click on successfully in dropdown list", "w-6");
		
		click(WebHookObjects.create, "click on create Button", "w-17");
				  waitForSometime(1000);
		click(WebHookObjects.close, "click on close Button", "w-18");
		 waitForSometime(1000);
		
		verifyText(WebHookObjects.webhookForAnyEntry,
				VerificationData.WebHook.nameOfWebhookForAnyEntry,
				"verify webhook created or not", "w-18");

		 
				  
	}
	

 
	public static void createWebhookForAnyAssetActions()  {

		waitForSometime(2000);
		click(WebHookObjects.addWebHook, "click on addWebHook button", "w-3");
		
		sendkeys(WebHookObjects.name, ExcelUtils.readCell(1,
				ExcelUtils.getCell("webhook.any.asset")),
				"enter value in webhook name inputbox", "w-1");
		waitForSometime(400);
		sendkeys(WebHookObjects.url, ExcelUtils.readCell(1,
				ExcelUtils.getCell("webhook.url")),
				"enter value in webhook url inputbox", "w-2");
		
		
		//Created
		clickBySize(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-4");
		click(WebHookObjects.asset, "click on form ", "w-5");
		

		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-5");
		click(WebHookObjects.createted, "click on created in dropdown list",
				"w-6");
	
		
		//Update
		click(WebHookObjects.plusButton, "click on plusButton", "w-7");

		clickBySize(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-8");
		click(WebHookObjects.asset, "click on form ", "w-9");
		
		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-10");
		click(WebHookObjects.updated, "click on updated in dropdown list",
				"w-11");
		
		
		//delete
		click(WebHookObjects.plusButton, "click on plusButton", "w-12");

		clickBySize(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-13");
		click(WebHookObjects.asset, "click on entry ", "w-14");
		
		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-15");
		click(WebHookObjects.deleted, "click on deleted in dropdown list",
				"w-16");

	
	
		
		//publish
		click(WebHookObjects.plusButton, "click on plusButton", "w-12");

		clickBySize(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-13");
		click(WebHookObjects.asset, "click on entry ", "w-14");
		
		
		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-15");
		click(WebHookObjects.published, "click on deleted in dropdown list",
				"w-16");
		clickBySize(WebHookObjects.selectEnv,
				"click on enviroment dropdown list", "w-16");
		click(WebHookObjects.all, "click on blank in dropdown list", "w-6");

		clickBySize(WebHookObjects.publishStatus,
				"click on enviroment dropdown list", "w-16");
		click(WebHookObjects.successfully,
				"click on successfully in dropdown list", "w-6");
		
		
		// unpublish
		
		click(WebHookObjects.plusButton, "click on plusButton", "w-12");

		clickBySize(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-13");
		click(WebHookObjects.asset, "click on entry ", "w-14");
		

		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-15");
		click(WebHookObjects.unpublished, "click on deleted in dropdown list",
				"w-16");
		clickBySize(WebHookObjects.selectEnv,
				"click on enviroment dropdown list", "w-16");
		click(WebHookObjects.all, "click on blank in dropdown list", "w-6");

		clickBySize(WebHookObjects.publishStatus,
				"click on enviroment dropdown list", "w-16");
		click(WebHookObjects.unSuccessfully,
				"click on successfully in dropdown list", "w-6");
		
		click(WebHookObjects.create, "click on create Button", "w-17");
	
		  waitForSometime(700);
	
		click(WebHookObjects.close, "click on close Button", "w-18");
				  waitForSometime(3000);
		verifyText(WebHookObjects.webhookForaSpecificAsset,
				VerificationData.WebHook.nameOfWebhookForAnyAsset,
				"verify webhook created or not", "w-18");

			;
	}
	



	public static void createWebhookForAspecificForm()  {

		
		waitForSometime(500);
		click(WebHookObjects.addWebHook, "click on addWebHook button", "w-3");
				
		
		sendkeys(WebHookObjects.name, ExcelUtils.readCell(1,
				ExcelUtils.getCell("webhook.specific.contenttype")),
				"enter value in webhook name inputbox", "w-1");
		waitForSometime(400);
		sendkeys(WebHookObjects.url, ExcelUtils.readCell(1,
				ExcelUtils.getCell("webhook.url")),
				"enter value in webhook url inputbox", "w-2");
		
	
		//Update
		click(WebHookObjects.anyDropDown, "click on 'any' dropdown", "w-3");
		click(WebHookObjects.aspecific, "click on 'aspecific' in dropdown",
				"w-3");
		clickBySize(WebHookObjects.selectModule,"click on selectModule dropdown list", "w-4");
		click(WebHookObjects.form, "click on form ", "w-5");
		clickBySize(WebHookObjects.selectContentType, "click on selectForm dropdown list",
				"w-4");
		click(WebHookObjects.copyOfImportedForm,
				"click on copyOfImportedForm ", "w-5");
		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-5");
		click(WebHookObjects.updated, "click on created in dropdown list",
				"w-6");
		
		
		
		//Delete
		
		click(WebHookObjects.plusButton, "click on plusButton", "w-7");

		click(WebHookObjects.anyDropDown, "click on 'any' dropdown", "w-3");
		click(WebHookObjects.aspecific, "click on 'aspecific' in dropdown",
				"w-3");
		clickBySize(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-8");
		click(WebHookObjects.form, "click on form ", "w-9");
		clickBySize(WebHookObjects.selectContentType, "click on selectForm dropdown list",
				"w-4");
		click(WebHookObjects.copyOfImportedForm,
				"click on copyOfImportedForm ", "w-5");
		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-10");
		click(WebHookObjects.deleted, "click on create Button", "w-17");
		
		click(WebHookObjects.create, "click on create Button", "w-17");
		waitForSometime(1000);
		click(WebHookObjects.close, "click on close Button", "w-18");
		verifyText(WebHookObjects.webhookForaSpecificForm,
				VerificationData.WebHook.nameForWebhook,
				"verify webhook created or not", "w-18");
	}





public static void createWebhookForAspecificEntry()  {

	      waitForSometime(500);


		click(WebHookObjects.addWebHook, "click on addWebHook button", "w-3");

		sendkeys(WebHookObjects.name, ExcelUtils.readCell(1,
				ExcelUtils.getCell("webhook.secific.entry")),
				"enter value in webhook name inputbox", "w-1");
		sendkeys(WebHookObjects.url, ExcelUtils.readCell(1,
				ExcelUtils.getCell("webhook.url")),
				"enter value in webhook url inputbox", "w-2");

        // update
	
		click(WebHookObjects.anyDropDown, "click on 'any' dropdown", "w-3");
		click(WebHookObjects.aspecific, "click on 'aspecific' in dropdown",
				"w-3");
		clickBySize(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-4");
				  //waitForSometime(2000);
		click(WebHookObjects.entry, "click on form ", "w-5");
		clickBySize(WebHookObjects.selectContentType, "click on selectForm dropdown list",
				"w-4");
				
		click(WebHookObjects.copyOfImportedForm1,
				"click on copyOfImportedForm ", "w-5");

		click(WebHookObjects.selectEntry, "click on selectEntry dropdown list",
				"w-4");
		click(WebHookObjects.copyOfImportedEntry,
				"click on copyOfImportedForm ", "w-5");

		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-5");
		click(WebHookObjects.updated, "click on created in dropdown list",
				"w-6");
				
		
		click(WebHookObjects.plusButton, "click on plusButton", "w-7");

		//Delete
		
		click(WebHookObjects.anyDropDown, "click on 'any' dropdown", "w-3");
		click(WebHookObjects.aspecific, "click on 'aspecific' in dropdown",
				"w-3");
		clickBySize(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-4");
			//	  waitForSometime(2000);
		click(WebHookObjects.entry, "click on form ", "w-5");
		clickBySize(WebHookObjects.selectContentType, "click on selectForm dropdown list",
				"w-4");
				  
		click(WebHookObjects.copyOfImportedForm1,
				"click on copyOfImportedForm ", "w-5");

		 
		click(WebHookObjects.selectEntry, "click on selectEntry dropdown list",
				"w-4");
		click(WebHookObjects.copyOfImportedEntry,
				"click on copyOfImportedForm ", "w-5");
		// waitForSometime(3000);
		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-5");
		click(WebHookObjects.deleted, "click on created in dropdown list",
				"w-6");
				//  waitForSometime(1000);
		
	
	/*	//publish
		click(WebHookObjects.plusButton, "click on plusButton", "w-7");
		
		click(WebHookObjects.anyDropDown, "click on 'any' dropdown", "w-3");
		click(WebHookObjects.aspecific, "click on 'aspecific' in dropdown",
				"w-3");
		clickBySize(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-13");

		click(WebHookObjects.entry, "click on form ", "w-14");

		clickBySize(WebHookObjects.selectContentType, "click on selectForm dropdown list",
				"w-4");
		click(WebHookObjects.copyOfImportedForm1,
				"click on copyOfImportedForm ", "w-5");

		 waitForSometime(2000);
		click(WebHookObjects.selectEntry, "click on selectEntry dropdown list",
				"w-4");

		
		click(WebHookObjects.copyOfImportedEntry,
				"click on copyOfImportedForm ", "w-5");
		 waitForSometime(3000);
		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-15");
		click(WebHookObjects.published, "click on deleted in dropdown list",
				"w-16");
		
		click(WebHookObjects.selectEnvironment,
				"click on selectEnvironment in dropdown list", "w-6");
		click(WebHookObjects.blank, "click on blank in dropdown list", "w-6");
		click(WebHookObjects.selectPublishStatus,
				"click on selectPublishStatus in dropdown list", "w-6");
		click(WebHookObjects.successfully,
				"click on successfully in dropdown list", "w-6");
	
		
		
		//Unpublishe
click(WebHookObjects.plusButton, "click on plusButton", "w-7");
		
		click(WebHookObjects.anyDropDown, "click on 'any' dropdown", "w-3");
		click(WebHookObjects.aspecific, "click on 'aspecific' in dropdown",
				"w-3");
		clickBySize(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-13");

		click(WebHookObjects.entry, "click on form ", "w-14");

		clickBySize(WebHookObjects.selectContentType, "click on selectForm dropdown list",
				"w-4");
		click(WebHookObjects.copyOfImportedForm1,
				"click on copyOfImportedForm ", "w-5");

		click(WebHookObjects.selectEntry, "click on selectEntry dropdown list",
				"w-4");

		click(WebHookObjects.copyOfImportedEntry,
				"click on copyOfImportedForm ", "w-5");
		clickBySize(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-15");
		click(WebHookObjects.unpublished, "click on deleted in dropdown list",
				"w-16");
		
		click(WebHookObjects.selectEnvironment,
				"click on selectEnvironment in dropdown list", "w-6");
		click(WebHookObjects.blank, "click on blank in dropdown list", "w-6");
		click(WebHookObjects.selectPublishStatus,
				"click on selectPublishStatus in dropdown list", "w-6");
		click(WebHookObjects.successfully,
				"click on successfully in dropdown list", "w-6");
		
				  waitForSometime(3000);
		
		click(WebHookObjects.close, "click on close Button", "w-18");
			
		*/

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void createWebhookForAnyAssetActions()  {

		

		click(WebHookObjects.addWebHook, "click on addWebHook button", "w-3");
		inputbox(WebHookObjects.name, ExcelUtils.getCellData(54, 1),
				"enter value in webhook name inputbox", "w-1");
		inputbox(WebHookObjects.url, ExcelUtils.getCellData(49, 1),
				"enter value in webhook url inputbox", "w-2");

		click(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-4");
		click(WebHookObjects.asset, "click on asset in drop down", "w-5");
		click(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-5");
		click(WebHookObjects.createted, "click on created in dropdown list",
				"w-6");
		click(WebHookObjects.plusButton, "click on plusButton", "w-7");
		click(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-8");
		click(WebHookObjects.asset, "click on asset ", "w-9");

		click(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-10");
		click(WebHookObjects.updated, "click on updated in dropdown list",
				"w-11");
		click(WebHookObjects.plusButton, "click on plusButton", "w-12");

		click(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-13");
		click(WebHookObjects.asset, "click on form ", "w-14");
		click(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-15");
		click(WebHookObjects.deleted, "click on deleted in dropdown list",
				"w-16");
		click(WebHookObjects.plusButton, "click on plusButton", "w-12");

		click(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-13");
		click(WebHookObjects.asset, "click on form ", "w-14");
		click(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-15");
		click(WebHookObjects.published, "click on published in dropdown list",
				"w-16");
		clickBySize("//span[contains(.,'Select Environment')]",
				"click on enviroment dropdown list", "w-16");
		click(WebHookObjects.blank, "click on blank in dropdown list", "w-6");

		clickBySize("//span[contains(.,'Select Publish Status')]",
				"click on enviroment dropdown list", "w-16");
		click(WebHookObjects.successfully,
				"click on successfully in dropdown list", "w-6");
		click(WebHookObjects.plusButton, "click on plusButton", "w-12");
		click(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-13");
		click(WebHookObjects.asset, "click on form ", "w-14");
		click(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-15");
		click(WebHookObjects.unpublished,
				"click on unpublished in dropdown list", "w-16");
		clickBySize("//span[contains(.,'Select Environment')]",
				"click on enviroment dropdown list", "w-16");
		click(WebHookObjects.blank, "click on blank in dropdown list", "w-6");

		clickBySize("//span[contains(.,'Select Publish Status')]",
				"click on enviroment dropdown list", "w-16");
		click(WebHookObjects.successfully,
				"click on successfully in dropdown list", "w-6");
		click(WebHookObjects.create, "click on create Button", "w-17");
				  waitForSometime(3000);
		click(WebHookObjects.close, "click on close Button", "w-18");
				  waitForSometime(3000);
		// text(WebHookObjects.webhookForAnyAsset,
		// TestData.WebHook.nameOfWebhookForAnyAsset,
		// "verify webhook created or not", "w-18");

				  waitForSometime(3000);

	}

	public static void createWebhookForAspecificAsset()  {

		

		click(WebHookObjects.addWebHook, "click on addWebHook button", "w-3");
		inputbox(WebHookObjects.name, ExcelUtils.getCellData(55, 1),
				"enter value in webhook name inputbox", "w-1");
		inputbox(WebHookObjects.url, ExcelUtils.getCellData(49, 1),
				"enter value in webhook url inputbox", "w-2");
		click(WebHookObjects.anyDropDown, "click on 'any' dropdown", "w-3");
		click(WebHookObjects.aspecific, "click on 'aspecific' in dropdown",
				"w-3");
		click(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-4");
		click(WebHookObjects.asset, "click on asset in drop down", "w-5");
		click(WebHookObjects.selectAsset,
				"click on selectModule dropdown list", "w-4");
		click(WebHookObjects.seletedAsset, "click on asset in drop down", "w-5");
		click(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-5");
		click(WebHookObjects.publishSpecific,
				"click on published in dropdown list", "w-6");
		click(WebHookObjects.selectEnvironment,
				"click on selectEnvironment in dropdown list", "w-6");
		click(WebHookObjects.blank, "click on blank in dropdown list", "w-6");

		click(WebHookObjects.selectPublishStatus,
				"click on selectPublishStatus in dropdown list", "w-6");
		click(WebHookObjects.successfully,
				"click on successfully in dropdown list", "w-6");

		click(WebHookObjects.plusButton, "click on plusButton", "w-7");
		click(WebHookObjects.anyDropDown, "click on 'any' dropdown", "w-3");
		click(WebHookObjects.aspecific, "click on 'aspecific' in dropdown",
				"w-3");
		click(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-8");
		click(WebHookObjects.asset, "click on asset ", "w-9");

		click(WebHookObjects.selectAsset,
				"click on selectModule dropdown list", "w-4");
		click(WebHookObjects.seletedAsset, "click on asset in drop down", "w-5");

		click(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-10");

		click(WebHookObjects.upadateSpecific,
				"click on updated in dropdown list", "w-11");

		click(WebHookObjects.plusButton, "click on plusButton", "w-12");
		click(WebHookObjects.anyDropDown, "click on 'any' dropdown", "w-3");
		click(WebHookObjects.aspecific, "click on 'aspecific' in dropdown",
				"w-3");
		click(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-13");
		click(WebHookObjects.asset, "click on form ", "w-14");

		click(WebHookObjects.selectAsset,
				"click on selectModule dropdown list", "w-4");
		click(WebHookObjects.seletedAsset, "click on asset in drop down", "w-5");
		click(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-15");
		click(WebHookObjects.deleteSpecific,
				"click on deleted in dropdown list", "w-16");

		click(WebHookObjects.plusButton, "click on plusButton", "w-12");
		click(WebHookObjects.anyDropDown, "click on 'any' dropdown", "w-3");
		click(WebHookObjects.aspecific, "click on 'aspecific' in dropdown",
				"w-3");
		click(WebHookObjects.selectModule,
				"click on selectModule dropdown list", "w-13");
		click(WebHookObjects.asset, "click on form ", "w-14");

		click(WebHookObjects.selectAsset,
				"click on selectModule dropdown list", "w-4");
		click(WebHookObjects.seletedAsset, "click on asset in drop down", "w-5");

		click(WebHookObjects.selectAction,
				"click on selectAction dropdown list", "w-10");
		click(WebHookObjects.unpublishSpecific,
				"click on unpublished in dropdown list", "w-16");
		clickBySize("//span[contains(.,'Select Environment')]",
				"click on enviroment dropdown list", "w-16");
		click(WebHookObjects.blank, "click on blank in dropdown list", "w-6");

		clickBySize("//span[contains(.,'Select Publish Status')]",
				"click on enviroment dropdown list", "w-16");
		click(WebHookObjects.successfully,
				"click on successfully in dropdown list", "w-6");

		click(WebHookObjects.create, "click on create Button", "w-17");
				  waitForSometime(3000);
		click(WebHookObjects.close, "click on close Button", "w-18");
		text(WebHookObjects.webhookForaSpecificAsset,
				VerificationData.WebHook.nameOfWebhookForSpecificAsset,
				"verify webhook created or not", "w-18");
	}*/



}

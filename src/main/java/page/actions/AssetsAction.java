package page.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import page.objects.AssetObjects;

import com.built.io.automationframework.BasePageActions;

import data.VerificationData;

public class AssetsAction extends BasePageActions {

	public static void clicOnkAssetLink() {

		waitForSometime(2000);
		click(AssetObjects.assetMenu,
				"click on asset menu which has placed on header", "A1");
		waitForSometime(3000);
	} 

	public static void uploadAssets(String path, String description,
			String tagname, String testcase1d) {
         System.out.println("uploading asset");
     	waitForSometime(3000);
		click(AssetObjects.addNewAsset, "click on addnew asst link", testcase1d);
		sendkeys(AssetObjects.browseAsset, path, description, testcase1d);
		click(AssetObjects.tags, "click on addnew asst link", testcase1d);
		sendkeys(AssetObjects.tags1, tagname, description, testcase1d);
		click(AssetObjects.save, "click on save button", testcase1d);
		verifyTextByindex(AssetObjects.successMessage,
				VerificationData.Assets.createAssetSuccessMessage,
				"verify uplaod asset suuccess message", testcase1d);

	}

	public static void verifyAssetsActions() {

		verifyText(AssetObjects.doc, VerificationData.Assets.blog,
				"verify docx file", "u-2.1");

		verifyText(AssetObjects.html, VerificationData.Assets.html,
				"verify html file", "u-2.1");

		verifyText(AssetObjects.xls, VerificationData.Assets.xls,
				"verify xls file", "u-2.1");

		verifyText(AssetObjects.ppt, VerificationData.Assets.ppt,
				"verify ppt file", "u-2.1");

		verifyText(AssetObjects.zip, VerificationData.Assets.xenuzip,
				"verify zip file", "u-2.10");

		verifyText(AssetObjects.pdf, VerificationData.Assets.pdf,
				"verify pdf file", "u-2.9");

		verifyText(AssetObjects.txt, VerificationData.Assets.txt,
				"verify txt file", "u-2.8");

		verifyText(AssetObjects.ras, VerificationData.Assets.ras,
				"verify ras file", "u-2.7");

		verifyText(AssetObjects.pgm, VerificationData.Assets.pgm,
				"verify pgm file", "u-2.6");

		verifyText(AssetObjects.pcx, VerificationData.Assets.pcx,
				"verify pcx file", "tc-2.5");

		click(AssetObjects.paginationIcon, "click pagination right icon", "23");

		verifyText(AssetObjects.json, VerificationData.Assets.json,
				"verify json file", "tc-2.4");

		verifyText(AssetObjects.mp4, VerificationData.Assets.mp4,
				"verify mp4 file", "u-2.4");

		verifyText(AssetObjects.svg, VerificationData.Assets.svg,
				"verify svg file", "u-2.3");

		verifyText(AssetObjects.mp3, VerificationData.Assets.mp3,
				"verify mp3 file", "uc-2.2");

		verifyText(AssetObjects.jpg, VerificationData.Assets.jpg,
				"verify JPG file", "u-2.1");

	}

	public static void deleteAssetsActions(WebElement locator) {

		click(locator, "click on asset which you want to delete", "d1");
		click(AssetObjects.delete, "click on delete link", "d2");
		click(AssetObjects.yes, "click on yes button", "d3");
		waitForSometime(1000);
		verifyTextByindex(AssetObjects.successMessage,
				VerificationData.Assets.deleteAssetSuccessMessage,
				"verify delete asset suuccess message", "d4");
	}

	public void editAssetsActions(WebElement locator, String value) {

		click(AssetObjects.assetMenu, "click pagination right icon", "23");
		   waitForSometime(1000) ;
      click(AssetObjects.paginationIcon, "click pagination right icon", "23");
		click(locator, "click on asset which you want to update", "e1");
		sendkeys(AssetObjects.browseAsset, value,
				"Enter path of the new asset", "e2");
		click(AssetObjects.update, "click on update button", "e3");
		  waitForSometime(500) ;
		verifyTextByindex(AssetObjects.successMessage,
				VerificationData.Assets.UpdateAssetSuccessMessage,
				"verify delete asset suuccess message", "e4");

	}

	public static void downloadAssetsActions(WebElement locator)
			throws AWTException {
		waitForSometime(1000);
		mousehover(AssetObjects.downLoadedFile, "mouse hover on asset which you want to download", "d1");
		waitForSometime(3000);
		click(locator, "click on asset which you want to download", "d1");
		waitForSometime(1000);
		click(AssetObjects.download, "click on download link", "d2");
		Robot object = new Robot();
		object.keyPress(KeyEvent.VK_ENTER);
		object.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void searchAssetsActions(String value) {
	
		sendkeys(AssetObjects.searchInput, value,
				"Enter asset name which you want to search", "a111");
		keys(AssetObjects.searchInput, "press enter key", "a125");
		verifyText(AssetObjects.searchedAsset, value,
				"verify searched asset display or not", "tc-2.4");
		click(AssetObjects.searchCloseButton,
				"click on close button of search", "a124");
	}

	public static void publishAssetActions() {

		click(AssetObjects.assetMenu, "click pagination right icon", "23");
		click(AssetObjects.doc, "click on asset which you want to publish",
				"d1");
		click(AssetObjects.publsih, "click on delete link", "d2");
		click(AssetObjects.blank, "click on delete link", "d2");
		click(AssetObjects.publsihButtonOnpopup, "click on yes button", "d3");
		verifyTextByindex(AssetObjects.successMessage,
				VerificationData.Assets.publishAssetSuccessMessage,
				"verify publish asset suuccess message", "d4");
	}

	public static void filterAssets() {

		
		waitForSometime(500) ;
		click(AssetObjects.assetMenu, "click on asset menu placed on header",
				"235");

		// audio
		waitForSometime(3000) ;
		click(AssetObjects.audio, "click on audio checkbox in filter tab",
				"235");
		verifyText(AssetObjects.mp3, VerificationData.Assets.mp3,
				"verify mp3 file", "uc-2.2");
		waitForSometime(2000) ;
		click(AssetObjects.audio, "click on audio checkbox in filter tab",
				"235");
		waitForSometime(3000) ;
		// image
		click(AssetObjects.image, "click on image checkbox in filter tab",
				"235");
		// verifyText(AssetObjects.jpg, VerificationData.Assets.jpg,
		// "verify JPG file",
		// "u-2.1");
		verifyText(AssetObjects.svg, VerificationData.Assets.svg,
				"verify svg file", "u-2.3");
		waitForSometime(500) ;
		click(AssetObjects.image, "click on image checkbox in filter tab",
				"235");

		// Video
		waitForSometime(2000) ;
		click(AssetObjects.video, "click on video checkbox in filter tab",
				"235");
		verifyText(AssetObjects.mp4, VerificationData.Assets.mp4,
				"verify mp3 file", "uc-2.2");
		waitForSometime(1000) ;
		click(AssetObjects.video, "click on video checkbox in filter tab",
				"235");

		// Documents
		waitForSometime(1000) ;
		click(AssetObjects.document, "click on document checkbox in filter tab",
				"235");
		verifyText(AssetObjects.doc, VerificationData.Assets.blog,
				"verify mp3 file", "uc-2.2");
		waitForSometime(1000) ;
		click(AssetObjects.document, "click on document checkbox in filter tab",
				"235");

		// pdf
		waitForSometime(1000) ;
		click(AssetObjects.pdf1, "click on pdf checkbox in filter tab", "235");
		verifyText(AssetObjects.pdf, VerificationData.Assets.pdf,
				"verify pdf file", "u-2.9");
		waitForSometime(1000) ;
		click(AssetObjects.pdf1, "click on pdf checkbox in filter tab", "235");

		// Plaln
		waitForSometime(1000) ;
		click(AssetObjects.plainText, "click on plainText checkbox in filter tab",
				"235");
		verifyText(AssetObjects.txt, VerificationData.Assets.txt,
				"verify txt file", "u-2.8");
		verifyText(AssetObjects.html, VerificationData.Assets.html,
				"verify html file", "u-2.1");
		waitForSometime(1000) ;
		click(AssetObjects.plainText, "click on plainText checkbox in filter tab",
				"235");
		waitForSometime(1000) ;
		// Presentation

		click(AssetObjects.presentations,
				"click on presentations checkbox in filter tab", "235");
		verifyText(AssetObjects.ppt, VerificationData.Assets.ppt,
				"verify ppt file", "u-2.1");
		waitForSometime(1000) ;
		click(AssetObjects.presentations,
				"click on presentations checkbox in filter tab", "235");

		// spreadsheet
		waitForSometime(1000) ;
		click(AssetObjects.spreadsheet,
				"click on audio checkbox in filter tab", "235");
		verifyText(AssetObjects.xls, VerificationData.Assets.xls,
				"verify xls file", "u-2.1");
		waitForSometime(1000) ;
		click(AssetObjects.spreadsheet,
				"click on spreadsheet checkbox in filter tab", "235");

		
		// Tags

		    waitForSometime(1000) ;
				click(AssetObjects.xlsTag,
						"click on xls checkbox in tags table", "235");
				verifyText(AssetObjects.xls, VerificationData.Assets.xls,
						"verify xls file", "u-2.1");
				click(AssetObjects.xls,
						"click on xls checkbox in filter tab", "235");
				   waitForSometime(1000) ;
				click(AssetObjects.xlsTag,
						"click on xls checkbox in tags table", "235");
				
				   waitForSometime(1000) ;
				sendkeys(AssetObjects.searchTAg, "ppt", "search ppt in tags filter", "2356");
				
				click(AssetObjects.pptTag,
						"click on ppt checkboxx in filter tab", "235");
				
				verifyText(AssetObjects.ppt, VerificationData.Assets.ppt,
						"verify ppt file", "u-2.1");
				waitForSometime(1000) ;
				click(AssetObjects.pptTag,
						"click on audio checkbox in filter tab", "235");
		
	}

}

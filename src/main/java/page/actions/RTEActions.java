package page.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.built.io.automationframework.BasePageActions;

import page.objects.ContentObjects;
import page.objects.DashboardObjects;
import page.objects.RteObjects;
import page.objects.SettingsPageObjects;
import data.VerificationData;

public class RTEActions extends BasePageActions {

	public static String htmlCode = "<p><code>mahesh</code><code>reddy</code></p>";

	public static void createFormWithRTE() {

		waitForSometime(1000);
		click(RteObjects.plusIconOFContentType,
				"click on plus icon of contenttype", "Rt-1");
		sendkeys(RteObjects.formTitle, "RteForm", "enter the name of the form",
				"rt-2");
		click(RteObjects.multipleOption, "select multiple", "rt-3");
		click(RteObjects.addFields, "click on create and add field button",
				"rt-3");
		waitForSometime(500);
		click(DashboardObjects.popup, "click on close button of popup", "rt-4");

		waitForSometime(1000);
		clickWithoutHiglight(RteObjects.rte, "click on shared with me link",
				"rt-5");
		clickWithoutHiglight(RteObjects.rteLabel, "click on rtE label", "rt-6");
		clickWithoutHiglight(RteObjects.multiple, "select multiple option",
				"rt-7");
		waitForSometime(1000);
		click(RteObjects.save, "click on save button", "rt-8");
		waitForSometime(1000);
		click(RteObjects.cancel, "click on cancel", "rt-9");
		// click(RteObjects.rteForm, "click on cancel", "rt-6");

	}

	public static void moreThanOneCodeTagUnderPtagAction() {

		click(RteObjects.rteForm, "click on cancel", "rt-");
		click(RteObjects.plusIconOFContentType, "click on cancel", "rt-");
		sendkeys(RteObjects.entryTitle, "New entry", "enter title of entry",
				"rt-2");
		sendkeys(RteObjects.url, "/contentstack", "enter url of entry", "rt-2");
		click(RteObjects.rHtml,
				"click on html tag link which has placed on RTE header", "rt-6");
		waitForSometime(1000);
		sendkeys(RteObjects.rteTextArea, htmlCode, "enter html code", "rt-2");
		waitForSometime(1000);
		click(RteObjects.rHtml,
				"click on html tag link which has placed on RTE header", "rt-6");
		waitForSometime(500);
		click(RteObjects.entrySave, "click on save button of entry", "rt-6");
		waitForSometime(500);
		click(RteObjects.cancelEntry, "click on cancel  button of entry",
				"rt-6");
		click(RteObjects.entry, "click on rte form", "rt-6");
		click(RteObjects.rHtml,
				"click on html tag link which has placed on RTE header", "rt-6");
		//valueOfIputbox(RteObjects.rteTextArea, "mahesh reddy",
		//		"verify value which has placed in rte", "rt-6");
		click(RteObjects.cancelEntry, "click on cancel  button of entry",
				"rt-6");

	}

	public static void ImageUploadedSuccessfullyButNotAbleToGetThroughRTEActions() {

		click(RteObjects.entry, "click on rte form", "rt-6");
		click(RteObjects.rteImage, "click on rte image link", "rt-i");
		sendkeys(
				RteObjects.browse,
				"D:\\ContenstackWorkspace\\ContentStackUIAutomation\\src\\main\\resources\\char.jpg",
				"upload a image file in rte", "rt-2");
		elementIsPresent(RteObjects.uploadedImage,
				"verify element is successfully uploaded or not", "rt-6");
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
		waitForSometime(1000);
		click(RteObjects.cancelEntry, "click on cancel  button of entry",
				"rt-6");
	}

	public static void AlignmentOptionIsMissingFromBasicRTEAction() {

		click(RteObjects.entry, "click on rte form", "rt-6");
		elementIsPresent(RteObjects.aligment,
				"verify aligment option is present or not", "rt-6");
		waitForSometime(500);
		click(RteObjects.cancelEntry, "click on cancel  button of entry",
				"rt-6");
	}

	public static void versionDifferenceForMultipleRTEAction() {

		click(RteObjects.plusIconOFContentType, "click on cancel", "rt-");
		sendkeys(RteObjects.entryTitle, "version diff", "enter title of entry",
				"rt-2");
		sendkeys(RteObjects.url, "/contentstack", "enter url of entry", "rt-2");
		sendkeys(RteObjects.basicRteTextArea, "contenstack io",
				"Enter text in rte field", "rt-6");
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
		waitForSometime(1000);
		click(RteObjects.plusICon, "click on plus icon of rte field", "rt-6");
		sendkeys(RteObjects.secondRTE, "built.flow",
				"enter the value in second rte", "rt-6");
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
		waitForSometime(1000);
		click(RteObjects.compareVersion, "click on compare varsion button", "rt-6");
		waitForSometime(2000);
		click(RteObjects.closeIconOFCompareVersion, "click on close button of compare varsion",
				"rt-6");
		waitForSometime(1000);
		click(RteObjects.cancelEntry, "click on cancel  button of entry",
				"rt-6");
	}
	
	
	public static void  applyFontColorToHeaderAction() {

		click(RteObjects.plusIconOFContentType, "click on cancel", "rt-");
		sendkeys(RteObjects.entryTitle, "entry1", "enter title of entry",
				"rt-2");
		sendkeys(RteObjects.url, "/contentstack", "enter url of entry", "rt-2");
		sendkeys(RteObjects.basicRteTextArea, "contenstack io",
				"Enter text in rte field", "rt-6");
		click(RteObjects.formating, "click on formating button which has placed on rte", "rt-");
		click(RteObjects.header, "select header option", "rt-");
		
		getCssValue(RteObjects.contestackio, "font-size","36px","verify header option applyed or not", "rt-6");
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
		
		waitForSometime(1000);
		click(RteObjects.cancelEntry, "click on cancel  button of entry",
				"rt-6");
		
	}
	

	public static void  boldUnderlineAreNotWorkingProperlyActions() {

		waitForSometime(2000) ;
		click(RteObjects.plusIconOFContentType, "click on cancel", "rt-");
		sendkeys(RteObjects.entryTitle, "test entry", "enter title of entry",
				"rt-2");
		sendkeys(RteObjects.url, "/contentstack", "enter url of entry", "rt-2");
		click(RteObjects.bold, "click on bold button", "rt-6");
		sendkeys(RteObjects.basicRteTextArea, "contenstack io",
				"Enter text in rte field", "rt-6");
		waitForSometime(2000) ;
		//keboadkeys(RteObjects.basicRteTextArea, "select the contentstackio sentence", "rt-");
		
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
		getCssValue(RteObjects.boldContestackio, "font-weight","700","verify select text bold or not", "rt-6");
		waitForSometime(1000);
		//click(RteObjects.cancelEntry, "click on cancel  button of entry","rt-6");
		
	  }

	public static void  horizontalRuleInRTEDoesntGetSavedAction() {

		waitForSometime(2000) ;
		click(RteObjects.horizontalRole, "click on horizontal rule button", "rt-");
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
		waitForSometime(2000) ;
		elementIsPresent(RteObjects.horizontalRoleInRTe, "verify horizontal role gets saved or not ",
				"rt-6");
		waitForSometime(1000) ;
		click(RteObjects.cancelEntry, "click on cancel  button of entry","rt-6");
		
	}

	
	public static void  when3alphabetsEnteredItAppendsTheDeletedURLAction() {

		waitForSometime(2000) ;
		click(RteObjects.plusIconOFContentType, "click on cancel", "rt-");
		sendkeys(RteObjects.entryTitle, "entry url", "enter title of entry",
				"rt-2");
		sendkeys(RteObjects.url, "/contentstack", "enter url of entry", "rt-2");
		click(RteObjects.link, "click on link button", "rt-6");	
		click(RteObjects.insertLink, "click on insert link button", "rt-6");	
		sendkeys(RteObjects.linkUrl, "https://www.google.co.in/", "enter url of the link", "rt-2");	
		sendkeys(RteObjects.linkText, "https://www.google.co.in/", "enter text of the link", "rt-2");
		click(RteObjects.insert, "click on insert link button", "rt-6");	
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
		waitForSometime(4000) ;
		click(RteObjects.linkGoogle, "click on link which you have inserted in rte", "rt-6");
		waitForSometime(2000) ;
		click(RteObjects.editLink, "click on insert link button", "rt-6");	
		waitForSometime(2000) ;
		clear(RteObjects.linkText, "clear the value from the inputbox", "rt-2");
		waitForSometime(500) ;
		sendkeys(RteObjects.linkUrl, "https://www.google.co.in/", "enter url of the link", "rt-2");	
		sendkeys(RteObjects.linkText, "abc", "enter text of the link", "rt-2");
		waitForSometime(500) ;
		click(RteObjects.insert, "click on insert link button", "rt-6");
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
		waitForSometime(500) ;
		//valueOfIputbox(RteObjects.rteTextArea, "abc",
		//		"verify value which has placed in rte", "rt-6");
		waitForSometime(500) ;
		click(RteObjects.cancelEntry, "click on cancel  button of entry","rt-6");
		
	}
	
	public static void  insertVideoActions() {
		waitForSometime(2000) ;
		click(RteObjects.plusIconOFContentType, "click on cancel", "rt-");
		sendkeys(RteObjects.entryTitle, "insert video in RTE", "enter title of entry",
				"rt-2");
		sendkeys(RteObjects.url, "/contentstack", "enter url of entry", "rt-2");
		click(RteObjects.video, "click on link button", "rt-6");	
		sendkeys(RteObjects.vidoeTextArea, "https://www.youtube.com/watch?v=RTXH9tGmqVg", "insert video in rte",
				"rt-2");	
		click(RteObjects.insertButton, "click on insert video button button", "rt-6");	
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
		waitForSometime(500) ;
		waitForSometime(500) ;
		click(RteObjects.cancelEntry, "click on cancel  button of entry","rt-6");
		
	}
	
	public static void formattingAndAlignmentNanAotBeDoneWhenBulletsAreAppliedAction() {

		waitForSometime(2000) ;
		click(RteObjects.plusIconOFContentType, "click on cancel", "rt-");
		sendkeys(RteObjects.entryTitle, "format testing", "enter title of entry",
				"rt-2");
		sendkeys(RteObjects.url, "/contentstack", "enter url of entry", "rt-2");
		sendkeys(RteObjects.basicRteTextArea, "contenstack io",
				"Enter text in rte field", "rt-6");
		click(RteObjects.bullet, "click on bullet link", "rt-7");
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
		valueOfIputbox(RteObjects.rteTextArea,"<ul><li>contenstack io</li></ul>", "verify text which has placed in rte editor", "rt-6");
		waitForSometime(500) ;
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
	
		click(RteObjects.cancelEntry, "click on cancel  button of entry","rt-6");
		
	}
	
	public static void VersionExceedForImageInRTEActions() {

		waitForSometime(2000) ;
		mousehover(RteObjects.settings,
				"mouse hover on setting menu", "hs-1");
		click(RteObjects.environments,"click ON ENVIRONMENT LINK", "Al-4");
		
		click(RteObjects.newEnv, "click create new environment button", "rt-");
		
		sendkeys(RteObjects.envName,"Blank","enter Environment name in name inputbox",
				"Ae-2");
		click(RteObjects.advced,"click add button", "Al-4");
		click(RteObjects.serversCheckBox,"click add button", "Al-4");
		click(RteObjects.create,
				"click add button", "Al-4");
		click(RteObjects.contentType, "click on content type menu which has placed on header", "rt-01");
		
		click(RteObjects.rteForm, "click on content type menu which has placed on header", "rt-02");
		waitForSometime(800) ;
		click(RteObjects.plusIconOFContentType, "click on create new entry button", "rt-03");
		sendkeys(RteObjects.entryTitle, "version exceded in publish queue", "enter title of entry",
				"rt-2");
		sendkeys(RteObjects.url, "/contentstack", "enter url of entry", "rt-04");
		sendkeys(RteObjects.basicRteTextArea, "contenstack io",
				"Enter text in rte field", "rt-06");
		click(RteObjects.bullet, "click on save  button of entry", "rt-09");
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
		valueOfIputbox(RteObjects.rteTextArea,"<ul><li>contenstack io</li></ul>", "verify the text which has placed in the RTE text editor", "rt-11");
		waitForSometime(500) ;
		click(RteObjects.entrySave, "click on save  button of entry", "rt-12");
		click(RteObjects.publsihButton, "click on publish butoon", "rt-13");
		waitForSometime(1000) ;
		
		click(RteObjects.publishButtonOnPopUP, "click on publish butoon on popup", "rt-14");
		
		click(RteObjects.publishQueue, "click on publish queue button","rt-15");
		
		verifyText(RteObjects.version, "1",
						"verify version of the entry", "al-16");
		
	}
	
	public static void imageInsertedTwiceOnDoubleclickOnImageFromChooseActions() {

		waitForSometime(2000) ;
		
		click(RteObjects.contentType, "click on content type menu which has placed on header", "rt-");
		
		click(RteObjects.rteForm, "click on content type menu which has placed on header", "rt-");
		
		click(RteObjects.plusIconOFContentType, "click on cancel", "rt-");
		
		sendkeys(RteObjects.entryTitle, "doble click on selected image", "enter title of entry",
				"rt-2");
		sendkeys(RteObjects.url, "/contentstack", "enter url of entry", "rt-2");
		
		click(RteObjects.rteImage, "click on image button", "rt-6");
	
		click(RteObjects.choose, "click on choose button", "rt-12");
		
		waitForSometime(2000) ;
		 
		doubleClick(RteObjects.image, "double click on the iamage", "rt-002");
		
		waitForSometime(3000) ;
	
		click(RteObjects.entrySave, "click on save  button of entry", "rt-20");
	
		waitForSometime(3000) ;
		
		click(RteObjects.cancelEntry, "click on cancel  button of entry","rt-21");
		
	}
	
	public static void pastingTextCopiedFromTheRTEIntoTheRTE_TheBoldTagWithinTheListDisappearsAction() {

		click(RteObjects.plusIconOFContentType, "click on cancel", "rt-");
		sendkeys(RteObjects.entryTitle, "verify bold text", "enter title of entry",
				"rt-2");
		sendkeys(RteObjects.url, "/contentstack", "enter url of entry", "rt-2");
	
		click(RteObjects.bold, "click on bold button", "rt-");
		
		sendkeys(RteObjects.basicRteTextArea, "contenstack io",
				"Enter text in rte field", "rt-6");
	
		copyText(RteObjects.basicRteTextArea, "click on save  button of entry", "rt-6");
		
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
		waitForSometime(1000);
		click(RteObjects.plusICon, "click on plus icon of rte field", "rt-6");
		pasteText(RteObjects.secondRTE, 
				"enter the value in second rte", "rt-6");
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
		waitForSometime(1000);
		click(RteObjects.compareVersion, "click on copare varsion button", "rt-6");
		
		click(RteObjects.closeIconOFCompareVersion, "click on close button of compare varsion",
				"rt-6");
		getCssValue(RteObjects.secondRTE, "font-weight","400","verify select text bold or not", "rt-6");
	
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
		
		click(RteObjects.cancelEntry, "click on cancel  button of entry",
				"rt-6");
	}
	
	public static void formattingAndAlignmentCanNotBeDoneWhenBulletsAreAppliedACtions() {

		waitForSometime(2000) ;
		
		click(RteObjects.plusIconOFContentType, "click on add enrty button", "rt-");
		
		sendkeys(RteObjects.entryTitle, "format text when bullet is applied", "enter title of entry",
				"rt-2");
		sendkeys(RteObjects.url, "/contentstack", "enter url of entry", "rt-2");
		
		sendkeys(RteObjects.basicRteTextArea, "contenstack",
				"Enter text in rte field", "rt-6");
		
		click(RteObjects.bullet, "click on bullet option", "rt-");
		
		copyText(RteObjects.basicRteTextArea, "apply helvetica font to the text", "rt-");
		
		click(RteObjects.fontFamily, "click on fontfamily button which has placed on RTE header", "rt-");
	
		copyText(RteObjects.basicRteTextArea, "apply helvetica font to the text", "rt-");
		
		click(RteObjects.helveticaText, "apply helvetica font to the text", "rt-");
		
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
	
		waitForSometime(1000);

		getCssValue(RteObjects.contestackioText,"font-family" ,"Arial,Helvetica,Verdana,Tahoma,sans-serif","click on save  button of entry", "rt-6");
		
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
		
		waitForSometime(400);
		
		click(RteObjects.cancelEntry, "click on cancel  button of entry",
				"rt-6");
		
	}
	
	
	
	
	public static void  LinkOptionIsMissingFromInsertImageModalACtions() {

		waitForSometime(2000) ;
		
		click(RteObjects.plusIconOFContentType, "click on add enrty button", "rt-");
		
		sendkeys(RteObjects.entryTitle, "verify link option when upload the image", "enter title of entry",
				"rt-2");
		sendkeys(RteObjects.url, "/contentstack", "enter url of entry", "rt-2");
		click(RteObjects.rteImage, "click on rte image button", "rt-6");
		sendkeys(
				RteObjects.browse,
				"D:\\ContenstackWorkspace\\ContentStackUIAutomation\\src\\main\\resources\\char.jpg",
				"upload a image file in rte", "rt-2");
		
		elementIsPresent(RteObjects.uploadedImage,
				"verify element is successfully uploaded or not", "rt-6");
		
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");	
		waitForSometime(3000);	
		elementIsPresent(RteObjects.link,
				"verify link option is present or not", "rt-6");
		
		waitForSometime(400);	
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
		
		click(RteObjects.cancelEntry, "click on cancel  button of entry",
				"rt-6");
	
	}
	
	
	public static void  inRTE_Ddata_sys_asset_uid_IsMissingFromTheFileWhichIsUploadedFromTheSystemACtions() {

		waitForSometime(2000) ;
		click(RteObjects.plusIconOFContentType, "click on add enrty button", "rt-");
		sendkeys(RteObjects.entryTitle, "verify asset data-sys-id ", "enter title of entry",
				"rt-2");
		sendkeys(RteObjects.url, "/contentstack", "enter url of entry", "rt-2");
		click(RteObjects.rteImage, "click on rte image button", "rt-6");
		sendkeys(
				RteObjects.browse,
				"D:\\ContenstackWorkspace\\ContentStackUIAutomation\\src\\main\\resources\\char.jpg",
				"upload a image file in rte", "rt-2");
		
		elementIsPresent(RteObjects.uploadedImage,
				"verify element is successfully uploaded or not", "rt-6");
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
		waitForSometime(400);	
		getAttribute(RteObjects.uploadedImage, "data-sys-asset-uid" ,"data-sys-asset-uid","verify arribute empty or not", "rt-6");	
		waitForSometime(400);	
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");	
		click(RteObjects.cancelEntry, "click on cancel  button of entry",
				"rt-6");
		
	}
	
	
	public static void verifyFontsizeOFtheTextACtions() {

		waitForSometime(2000) ;
		
		click(RteObjects.plusIconOFContentType, "click on add enrty button", "rt-");
		sendkeys(RteObjects.entryTitle, "format text when bullet is applied", "enter title of entry",
				"rt-2");
		sendkeys(RteObjects.url, "/contentstack", "enter url of entry", "rt-2");	
		sendkeys(RteObjects.basicRteTextArea, "contenstack",
				"Enter text in rte field", "rt-6");
		copyText(RteObjects.basicRteTextArea, "apply helvetica font to the text", "rt-");
		click(RteObjects.fontSize, "click on bullet option", "rt-");
		copyText(RteObjects.sizeOfFont, "apply helvetica font to the text", "rt-");
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");
		waitForSometime(1000);
		getCssValue(RteObjects.contestackioText,"font-fize" ,"18px","verify font size", "rt-6");	
		click(RteObjects.entrySave, "click on save  button of entry", "rt-6");	
		waitForSometime(400);	
		click(RteObjects.cancelEntry, "click on cancel  button of entry",
				"rt-6");
		
	}
	
	
	public static void  searchNameGetsDisappearedFrom_choose_from_uploads_optionACtions() {

		waitForSometime(2000) ;
		
		click(RteObjects.plusIconOFContentType, "click on add enrty button", "rt-");
		sendkeys(RteObjects.entryTitle, "search field", "enter title of entry",
				"rt-2");
		sendkeys(RteObjects.url, "/contentstack", "enter url of entry", "rt-2");
		click(RteObjects.rteImage, "click on rte image button", "rt-6");	
		sendkeys(
				RteObjects.browse,
				"D:\\ContenstackWorkspace\\ContentStackUIAutomation\\src\\main\\resources\\char.jpg",
				"upload first image file in rte", "rt-2");
	

	
	
	elementIsPresent(RteObjects.uploadedImage,
				"verify element is successfully uploaded or not", "rt-6");
		
		waitForSometime(4000) ;
		
		click(RteObjects.rteImage, "click on rte image button", "rt-6");
		
		sendkeys(
				RteObjects.browse,
				"D:\\ContenstackWorkspace\\ContentStackUIAutomation\\src\\main\\resources\\download.jpg",
				"upload second image file in rte", "rt-2");
		
		waitForSometime(2000);	
		click(RteObjects.entrySave, "click on save  button of entry", "rt-16");
		click(RteObjects.rteImage, "click on rte image button", "rt-12");	
 	    click(RteObjects.choose, "click on choose button", "rt-7");	
		sendkeys(RteObjects.searchImage,"char.jpg","upload second image file in rte", "rt-2");
		waitForSometime(2000) ;
		click(RteObjects.searchButton, "click on search button", "rt-8");
		waitForSometime(2000) ;
		doubleClick(RteObjects.download, "click on download.jpg image", "rt-9");
		waitForSometime(4000) ;
	    verifyElementSize(RteObjects.download1,1, "verify size of the download.jp image", "rt-19");
		click(RteObjects.entrySave, "click on save  button of entry", "rt-25");
		click(RteObjects.cancelEntry, "click on cancel  button of entry",
				"rt-6");
		
	}
	

}

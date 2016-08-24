package page.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import page.objects.DashboardObjects;
import page.objects.SettingsPageObjects;

import com.built.io.automationframework.BasePageActions;
import com.built.io.automationframework.BaseTest;
import com.built.io.automationframework.ExcelUtils;
import com.built.io.automationframework.Reports;

import data.VerificationData;

public class DashboardPageActions extends BasePageActions {

	public static void createStackActions(String SiteName) {


		
		//	click(DashboardObjects.popup, "click on shared with me link", "sf-2");
		click(DashboardObjects.addNewStack,
				"click on add new stack button to create site", "s-1");
		sendkeys(DashboardObjects.newsiteTitle, SiteName,
				"Enter Title of site", "tc-2.2");
		sendkeys(DashboardObjects.description,
				ExcelUtils.readCell(1, ExcelUtils.getCell("site.description")),
				"Enter Description of site", "s-2");
		click(DashboardObjects.createNewSiteButton, "click on create button",
				"s-3");
		verifyText(DashboardObjects.successMessage,
				VerificationData.Stack.siteCreatedsuccessMessage,
				"verify stack created or not ", "tc2.3");
	}

	public static void searchStack(String SiteName) {

		click(DashboardObjects.stackSearchicon, "click at search icon", "s-1");
		sendkeys(DashboardObjects.stackSearchinputbox,
				ExcelUtils.readCell(1, ExcelUtils.getCell("site.name")),
				"Enter site name in search inputbox", "tc-2.2");
		verifyText(DashboardObjects.searchResultSite,
				ExcelUtils.readCell(1, ExcelUtils.getCell("site.name")),
				"verify ", "tc2.3");
	}

	public static void filterStack(String SiteName) {

		click(DashboardObjects.allStacksIcon, "click on all stack icon", "sf-1");
		click(DashboardObjects.popup, "click on shared with me link", "sf-2");
		click(DashboardObjects.stackSharedwithmelink,
				"click on shared with me link", "sf-2");
		sendkeys(DashboardObjects.newsiteTitle,
				ExcelUtils.readCell(1, ExcelUtils.getCell("site.name")),
				"Enter Title of site", "tc-2.2");
		sendkeys(DashboardObjects.description,
				ExcelUtils.readCell(1, ExcelUtils.getCell("site.discription")),
				"Enter Description of site", "s-2");
		click(DashboardObjects.createNewSiteButton, "click on create button",
				"s-3");
	}

	public static void checkAllStacks() {

		System.out.println("in dashboard page");

		//click(DashboardObjects.popup, "click on shared with me link", "sf-2");
		waitForSometime(4000);
		
		verifyText(DashboardObjects.defaultStacks, "All Stacks",
				"Verified the text is present or not", "tc-1");
		elementIsPresent(DashboardObjects.sharedStackseg,
				"Shared stacks present in all stacks filter", "tc-11");
		// elementIsPresent(DashboardObjects.myStackseg,
		// "My stacks present in my stacks filter", "tc-12");

		click(DashboardObjects.defaultStacks, "click on All Stacks drop down",
				"tc-2");
	
		verifyText(DashboardObjects.sharedWithMe, "Shared with me",
				"Verified the text is present or not", "tc-3");
		click(DashboardObjects.sharedWithMe, "click on Shared with me", "tc-4");
		elementIsPresent(DashboardObjects.sharedStackseg,
				"Shared stacks present in all stacks filter", "tc-12");

		click(DashboardObjects.sharedWithMeDropdown,
				"click on Shared with me in drop down", "tc-5");

		verifyText(DashboardObjects.myStacks, "My Stacks",
				"Verified the text is present or not", "tc-6");
		click(DashboardObjects.myStacks, "click on My Stacks", "tc-7");
		elementIsPresent(DashboardObjects.myStackseg,
				"My stacks present in my stacks filter", "tc-13");

		click(DashboardObjects.myStacksDropdown,
				"click on My Stacks drop down", "tc-8");
		verifyText(DashboardObjects.allStacks, "All stacks",
				"Verified the text is present or not", "tc-8");
		click(DashboardObjects.allStacks, "Click on All stacks", "tc-9");
		elementIsPresent(DashboardObjects.sharedStackseg,
				"Shared stacks present in all stacks filter", "tc-14");
		elementIsPresent(DashboardObjects.myStackseg,
				"My stacks present in my stacks filter", "tc-15");

	}

	public static void stacksSearch() {
		elementIsPresent(DashboardObjects.searchImage,
				"Search image is present", "tc-9");
		mousehover(DashboardObjects.searchImage, "Mouse hover to search image",
				"tc-10");
//elementIsPresent(DashboardObjects.searchTextField,
			//	"Search text field is present", "tc-11");
		sendkeys(DashboardObjects.searchTextField, "Audit log",
				"Search 'Ashwin' in the stacks search field", "tc-19");

		keys(DashboardObjects.searchTextField, "click enter key", "25");
		// DashboardObjects.searchTextField.sendKeys(Keys.ENTER);
		// elementIsPresent(DashboardObjects.myStackseg,
		// "My stacks present in my stacks filter", "tc-16");
		click(DashboardObjects.searchCloseIcon, "Close search result", "tc-17");

		sendkeys(DashboardObjects.searchTextField, "RAMLAL",
				"Search 'RAMLAL' in the stacks search field", "tc-20");
		keys(DashboardObjects.searchTextField, "click enter key", "25");
		// DashboardObjects.searchTextField.sendKeys(Keys.ENTER);
		click(DashboardObjects.searchCloseIcon, "Close search result", "tc-17");

	}
	
	public static void publishReport() {

	  System.out.println("publishing the report");
		
		waitForSometime(3000) ;
	   
	   click(DashboardObjects.logo, "Click on contentstack logolog", "pr-2");
	   
	    System.out.println("in dashboard page");
	   
	   waitForSometime(2000) ;
	   mousehover(DashboardObjects.automationReport, "mouse hover on automation report stack", "pr-1");
	  
	   waitForSometime(3000) ;
		
		click(DashboardObjects.report_open, "Click on open stack button", "pr-2");
		waitForSometime(2000) ;
		
		click(DashboardObjects.assetmenu, "Click on assets menu which has placed on header", "pr-3");
		
		  waitForSometime(3000) ;
		
		click(DashboardObjects.assetplusIcon, "Click on new asset button", "pr-4");
		
		 waitForSometime(3000) ;
	
		System.out.println("report" + BaseTest.baseDir+Reports.report_name);
		
		 waitForSometime(3000) ;
	
		sendkeys(DashboardObjects.browse, BaseTest.baseDir+Reports.report_name, "upload the report", "pr-5");
		
	
		click(DashboardObjects.publishIcon, "Click on publish button", "pr-6");
		
		 waitForSometime(2000) ;
		
		 click(DashboardObjects.production, "select production env for publish", "pr-7");
		
		click(DashboardObjects.publishButtonOnpopUp, "click on publish button", "pr-8");
	
	//	verifyText(DashboardObjects.successMessage,
		//		VerificationData.Assets.publishAssetSuccessMessage,
		//		"verify asset publish succes message", "9r-9");
		
     
	/*	//Jmeter report
		
		click(DashboardObjects.assetmenu, "Click on assets menu which has placed on header", "pr-3");
		
		click(DashboardObjects.assetplusIcon, "Click on new asset button", "pr-4");
		 waitForSometime(3000) ;
       
		sendkeys(DashboardObjects.browse, BaseTest.baseDir+"Test.jtl-report.html", "upload the report", "pr-5");
		 waitForSometime(3000) ;
		
		click(DashboardObjects.publishIcon, "Click on publish button", "pr-6");
		
		
		click(DashboardObjects.production, "select production env for publish", "pr-7");
		
		click(DashboardObjects.publishButtonOnpopUp, "click on publish button", "pr-8");
	
	//	verifyText(DashboardObjects.successMessage,
	//			VerificationData.Assets.publishAssetSuccessMessage,
	//			"verify asset publish succes message", "9r-9");
		
		System.out.println("published report successfully ");
*/
	}
	public static void deleteStackActions()  {

		   waitForSometime(1000) ;
		mousehover(DashboardObjects.settingsMenu,
				"mouse hover on setting menu", "hs-1");
   waitForSometime(2000) ;
		click(DashboardObjects.stackLink, "clickstack option", "Es-1");
		 waitForSometime(1000) ;
		click(DashboardObjects.deleteStack, "click on delete button", "es-2");
		 waitForSometime(800) ;
		click(DashboardObjects.deleteOnwarningbox, "click on delete button",
				"es-2");

	}

}

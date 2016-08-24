package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.built.io.automationframework.Driver;

public class DashboardObjects {

	@FindBy(xpath = "//img[@title='Built.io.Contentstack']")
	public static WebElement logoInDashboard;

	@FindBy(xpath = "//div[@class='ui-pnotify-text']")
	public static WebElement successMessage;
	
	@FindBy(xpath = "//*[@class='ngdialog-close']")
	public static WebElement popup;

	
	@FindBy(xpath = "//span[@class='user-name ng-binding']")
	public static WebElement userName;
	
	@FindBy(xpath = "//a[contains(.,'Credentials')]")
	public static WebElement userCredentials;
	
	@FindBy(xpath = "//a[contains(.,'Billing')]")
	public static WebElement userbilling;
	
	@FindBy(xpath = "//img[@src='/static/images/help-icon.png']")
	public static WebElement helpLink;
	
	@FindBy(xpath = "//img[@src='/static/images/globe-icon.png']")
	public static WebElement documentsLink;
	
	@FindBy(xpath = "//a[contains(.,'Sign Out')]")
	public static WebElement userSignOut;
	

	@FindBy(xpath = "//*[@class='dropdown-toggle left ng-binding']/i")
	public static WebElement allStacksIcon;
	
	@FindBy(xpath = "//a[contains(.,'Shared with me')]")
	public static WebElement stackSharedwithmelink;
	
	@FindBy(xpath = "//a[contains(.,'My Stacks')]")
	public static WebElement mystackLink;
	
	@FindBy(xpath = "//a[contains(.,'All stacks')]")
	public static WebElement allStackLink;
	
	@FindBy(xpath = "//i[@class='icon-search']")
	public static WebElement stackSearchicon;
	
	
	@FindBy(xpath = "//span[@class='stack-name ng-binding']")
	public static WebElement stackSearchinputbox;
	
	@FindBy(xpath = "//div[@class='stack']")
	public static WebElement searchResultSite ;

	                 
	@FindBy(xpath = "//div[@class='cs-create-btn top-26 ng-binding ng-scope']")
	public static WebElement addNewStack;
	
	/*@FindBy(xpath = "//div[@class='cs-create-btn top-26 ng-scope']")
	public static WebElement addNewStack;
	*/
	@FindBy(xpath = "//h3[@id='ngdialog1-aria-labelledby']")
	public static WebElement dialogBoxOFcreateNewStack;

	@FindBy(xpath = "//input[@class='cs-text-box w-100 ng-pristine ng-untouched ng-invalid ng-invalid-required']")
	public static WebElement newsiteTitle;

	@FindBy(xpath = "//input[@class='col-xs-8 ng-pristine ng-invalid ng-invalid-required ng-valid-pattern']")
	public static WebElement siteUniqueId;

	@FindBy(xpath = "//textarea[@data-ng-model='stk.stack.description']")
	public static WebElement description;

	                      
	
	@FindBy(xpath = "//button[@class='btn cs-btn-success btn-large left ng-binding']")
	public static WebElement createNewSiteButton;

	@FindBy(xpath = "//div[@class='ui-pnotify-text']")
	public static WebElement SiteSuccessMessage;
	
	

	
	
	@FindBy(xpath = "//span[@class='dropdown-toggle left ng-binding']")
	public static WebElement defaultStacks;
	
	@FindBy(xpath = "//*[contains(text(),'Shared with me')]")
	public static WebElement sharedWithMe;
	
	@FindBy(xpath = "//*[contains(text(),'Shared with me')]")
	public static WebElement sharedWithMeDropdown;
	
	@FindBy(xpath = "//*[contains(text(),'My Stacks')]")
	public static WebElement myStacks;
	
	@FindBy(xpath = "//*[contains(text(),'My stacks')]")
	public static WebElement myStacksDropdown;
	
	@FindBy(xpath = "//*[contains(text(),'All stacks')]")
	public static WebElement allStacks;
	
	@FindBy(xpath = "//*[@id='stacks']/div[2]/div/i[1]")
	public static WebElement searchImage;
	
	@FindBy(xpath = "//input[@placeholder='Search all stacks']")
	public static WebElement searchTextField;
	
	@FindBy(xpath = "//*[@id='stacks']/div[2]/div/i[2]")
	public static WebElement searchCloseIcon;
	
	@FindBy(xpath = "//*[@id='stacks']/div[3]/div")
	public static WebElement sharedStackseg;
	
	@FindBy(xpath = "//*[@id='stacks']/div[3]/div")
	public static WebElement myStackseg;
	
	
	//Report stack

	@FindBy(xpath = "//img[@title='Built.io.Contentstack']")
	public static WebElement logo;
	
	
	@FindBy(xpath = "//span[contains(.,'Contentstack Automation Reports')]")
	public static WebElement automationReport;
	
	
	@FindBy(xpath = "//a[@data-site-name='Contentstack Automation Reports']")
	public static WebElement report_open;
	
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.ASSETS']")
	public static WebElement assetmenu;
	
	
	@FindBy(xpath = "//img[@class='cs-plus-icon']")
	public static WebElement assetplusIcon;
	
	
	@FindBy(xpath = "//input[@name='upload[upload]']")
	public static WebElement browse;
	
	@FindBy(xpath = "//img[@class='icon-filter']")
	public static WebElement filterCloseIcon;
	
	@FindBy(xpath = "//i[@class='icon-globe ng-scope']")
	public static WebElement publishIcon;
	
	@FindBy(xpath = "//*[@class='cs-form-group border select-env clearfix publishing-env']/div[2]/label/span")
	public static WebElement production;
	
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement publishButtonOnpopUp;
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.SETTINGS']")
	public static WebElement settingsMenu;
	

	@FindBy(xpath = "//a[@translate='NAV_BAR.STACKS']")
	public static WebElement stackLink;
	
	@FindBy(xpath = "//button[@data-ng-click='info.remove(info.stack.api_key)']")
	public static WebElement deleteStack;
	
	@FindBy(xpath = "//span[@data-ng-click='stk.yes()']")
	public static WebElement deleteOnwarningbox;


	public static void initiatePageoject() {
		PageFactory.initElements(Driver.driver, DashboardObjects.class);
		System.out.println("in pageobject");
	}

}

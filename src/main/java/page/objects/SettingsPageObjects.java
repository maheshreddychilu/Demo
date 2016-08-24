package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.built.io.automationframework.Driver;

public class SettingsPageObjects {

	//satak
	
	@FindBy(xpath = "//span[@class='title ng-binding']")
	public static WebElement stackHeading;
	
	@FindBy(xpath = "//h5[contains(.,'GENERAL')]")
	public static WebElement general;
	
	@FindBy(xpath = "//input[@name='stackname']")
	public static WebElement stackName;
	
	@FindBy(xpath = "//textarea[@data-ng-model='info.stack.description']")
	public static WebElement stakDescription;
	
	@FindBy(xpath = "//input[@data-ng-disabled='!info.isOwner']")
	public static WebElement adminEmail;
	
	@FindBy(xpath = "//span[contains(.,' SETTINGS')]")
	public static WebElement dateFormat;
	
	@FindBy(xpath = "//div[@class='cs-text-box w-60 dummy-wrapper']")
	public static WebElement apiDetails;
	
	@FindBy(xpath = "//div[@class='cs-text-box w-60 dummy-wrapper']")
	public static WebElement accessToken;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement save;
	
	@FindBy(xpath = "//button[@data-ng-click='info.remove(info.stack.api_key)']")
	public static WebElement deleteStack;
	
	@FindBy(xpath = "//button[@class='btn cs-btn-success btn-large left ng-scope']")
	public static WebElement transferOwnership;
	
	@FindBy(xpath = "//span[@data-ng-click='stk.yes()']")
	public static WebElement deleteOnwarningbox;
	
	
	
	
	//Seetings
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.SETTINGS']")
	public static WebElement settingsMenu;
	
	@FindBy(xpath = "//a[@translate='NAV_BAR.STACKS']")
	public static WebElement stackLink;
	
	@FindBy(xpath = "//a[@translate='NAV_BAR.ENVIRONMENTS']")
	public static WebElement environmentsLink;
	
	@FindBy(xpath = "//a[@translate='NAV_BAR.LANGUAGES']")
	public static WebElement languagesLink;
	
	@FindBy(xpath = "//a[@translate='NAV_BAR.USERS']")
	public static WebElement usersLink;
	
	@FindBy(xpath = "//a[@translate='NAV_BAR.ROLES']")
	public static WebElement rolesLink;

	@FindBy(xpath = "//a[@translate='NAV_BAR.WEBHOOKS']")
	public static WebElement webhookLink;
	
	         
	@FindBy(xpath = "//div[@class='table-cell w-50']")
	public static WebElement languageTextOnDefaultPage;
	
	@FindBy(xpath = "//div[contains(text(),'Code')]")
	public static WebElement code;

	
	@FindBy(xpath = "//div[@data-ng-bind='locale.locale_uid']")
	public static WebElement defaultLanguagecode;

	@FindBy(xpath = "//div[contains(text( ),'English  (United States) ')]")
	public static WebElement defualtLangName;

	
	
	
	
	
	

	
	//languages
	
	
	
	@FindBy(xpath = "//img[@class='cs-plus-icon']")
	public static WebElement add;
	
	@FindBy(xpath = "//span[contains(.,'Select Language')]")
	public static WebElement languageName;

	@FindBy(xpath = "//span[contains(.,'English  (United States) ')]")
	public static WebElement english;

	@FindBy(xpath = "//span[contains(.,'Default Language')]")
	public static WebElement defaultLanguage;

	@FindBy(xpath = "//div[@data-ng-bind='locale.locale_uid']")
	public static WebElement languageCode;
	
	@FindBy(xpath = "//input[@placeholder='Search Languages']")
	public static WebElement searchlanguage;
	
	@FindBy(xpath = "//label[@class='lbl ng-binding ng-scope']")
	public static WebElement selectLanguage;
	
	@FindBy(xpath = "//button[@class='btn cs-btn-success btn-large left']")
	public static WebElement addLanguage;
	
	@FindBy(xpath = "//*[contains(text(),'English  (Australia) ')]")
	public static WebElement addedLanguges;

	@FindBy(xpath = "//*[@data-target='#action-dropdown-3']")
	public static WebElement ellipsisOflan;
		
	@FindBy(xpath = "//*[@class='icon-trash bigger-160']")
	public static List<WebElement> deletelan1;
	
	@FindBy(xpath = "//span[@data-ng-click='env.yes()']")
	public static WebElement deleteButtonOfWarningDailogbox;
	
	@FindBy(xpath = "//span[@data-ng-click='language.yes()']")
	public static WebElement deleteButtonOfWarningDailogboxforlang;




	@FindBy(xpath = "//div[@class='ui-pnotify-text']")
	public static List <WebElement> successMessage;
	
	@FindBy(xpath = "//input[@placeholder='Search languages']")
	public static WebElement searchAllLanguages;
	
	@FindBy(xpath = "//*[contains(text(),'English  (Australia)')]")
	public static WebElement searchedLanguage;
	
	
	@FindBy(xpath = "//i[@class='icon-close']")
	public static WebElement searchCloseButton;
	
	
	
	
	
	//Enviromnet
	
	
	@FindBy(xpath = "//a[@class='btn cs-btn-success ng-scope']")
	public static WebElement addNewEnvBlankEnvPage;
	
	@FindBy(xpath = "//img[@class='cs-plus-icon']")
	public static WebElement addNewEnvOnEnvPage;
	
	@FindBy(xpath = "//input[@auto-focus='focusHere']")
	public static WebElement envName;
	
	@FindBy(xpath = "//input[@placeholder='Enter environment base URL']")
	public static WebElement envUrl;

	@FindBy(xpath = "//img[@data-ng-click='env.addPreviewUrl($index)']")
	public static WebElement serverPlus;

	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement create;

	@FindBy(xpath = "//span[contains(.,'Advance')]")
	public static WebElement advced;
	
	@FindBy(xpath = "//span[contains(.,'Deploy Content to Server(s)')]")
	public static WebElement serversCheckBox;
	
	@FindBy(xpath = "//div[contains(text(),'stag')]")
	public static WebElement stagEnv;
	
	@FindBy(xpath = "//div[contains(text(),'blank')]")
	public static WebElement blankEnv;
	
	@FindBy(xpath = "//div[contains(text(),'production')]")
	public static WebElement prod;
	
	@FindBy(xpath = "//div[contains(text(),'development')]")
	public static WebElement dev;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/div/ul[2]/li[2]/div/div/i")
	public static WebElement secondServer;

	@FindBy(xpath = "//span[contains(.,'Delete')]")
	public static WebElement deleteEnv;
	
	@FindBy(xpath = "//input[@placeholder='Search environments']")
	public static WebElement seachEnv;
	

	@FindBy(xpath = "//*[@data-target='#action-dropdown-1']")
	public static WebElement ellipsisOfEnv;
		
	@FindBy(xpath = "//*[@id='action-dropdown-1']//span")
	public static WebElement deleteEnv1;
	
	
	@FindBy(xpath = "//span[@data-ng-click='env.yes()']")
	public static WebElement deleteButtonONwarningBox;

	@FindBy(xpath = "//span[contains(.,'Telugu - India ')]")
	public static WebElement teluguOnList;

	
	@FindBy(xpath = "//input[@auto-focus='focusHere']")
	public static WebElement inviteUserEmail;

	@FindBy(xpath = "//ul[@class='select2-choices']")
	public static WebElement role;

	@FindBy(xpath = "//*[@id='select2-drop']/ul/li[1]/div")
	public static WebElement contentManger1;

	@FindBy(xpath = "//*[@id='select2-drop']/ul/li[2]/div")
	public static WebElement devoloper1;

	@FindBy(xpath = "//a[@class='select2-search-choice-close']")
	public static WebElement removeRole;

	@FindBy(xpath = "//*[@id='main-container']/div/div[3]/div[2]/div/div/div[2]/div/div/div[2]/ul[2]/li[1]/a/div[1]")
	public static WebElement user1;

	@FindBy(xpath = "//i[@class='icon-trash bigger-160']")
	public static WebElement userDelte;

	@FindBy(xpath = "//button[@class='btn btn-sm btn-success']")
	public static WebElement yesButton;

	@FindBy(xpath = "//*[@id='sidebar']/ul/li[1]/a/i")
	public static WebElement formstab;

	@FindBy(xpath = "//*[@id='main-container']/div/div[3]/div[2]/div/div/div[1]/ul/li[3]/a")
	public static WebElement lang1;

	@FindBy(xpath = "//*[@id='main-container']/div/div[3]/div[2]/div/div/div[1]/ul/li[4]/a")
	public static WebElement users1;

	@FindBy(xpath = "//*[@id='main-container']/div/div[3]/div[2]/div/div/div[2]/div/div/div[2]/ul[2]/li[1]/a/div[2]")
	public static WebElement mahesh;

	

	@FindBy(xpath = "//div[contains(text(),'Name')]")
	public static WebElement name;

	@FindBy(xpath = "//div[contains(text(),'Owner')]")
	public static WebElement owner;

	@FindBy(xpath = "//input[@auto-focus='focusHere']")
	public static WebElement nameOfRole;

	


	


	@FindBy(xpath = "//span[contains(.,'Edit')]")
	public static WebElement edit;

	@FindBy(xpath = "//*[@id='select2-drop']/ul/li[2]/div")
	public static WebElement customInUSer;

	@FindBy(xpath = "//span[contains(.,'custom')]")
	public static WebElement editedRole;

	@FindBy(xpath = "//input[@data-ng-value='site.api_key']")
	public static WebElement apiKey;

	@FindBy(xpath = "//span[@data-ng-bind='currentUser.email']")
	public static WebElement usernameForLogOut;

	@FindBy(xpath = "//h4[contains(.,'Test Site')]")
	public static WebElement siteXpath;

	
	@FindBy(xpath = "//i[@class='icon-form']")
	public static WebElement form;

	@FindBy(xpath = "//span[contains(text(),'Edit')]")
	public static WebElement roleEdit;

	@FindBy(xpath = "//i[@class='icon-list']")
	public static WebElement audit;

	@FindBy(css = "div.field-table > ul:nth-child(2) > li:nth-child(3) > a > div.field-content.w-5 > div > span > i")
	public static WebElement deleteLangue;

	@FindBy(xpath = "//div[contains(text(),'stag')]")
	public static WebElement verifyStagenv;

	@FindBy(xpath = "//div[contains(text(),'blank')]")
	public static WebElement verifyBlanlkenv;

	@FindBy(xpath = "//div[contains(text(),'development')]")
	public static WebElement verifyDevenv;

	@FindBy(xpath = "//div[contains(text(),'production')]")
	public static WebElement verifyprodenv;

	@FindBy(xpath = "//div[contains(text(),'test')]")
	public static WebElement verifyTestenv;

	@FindBy(xpath = "//div[@class='ui-pnotify-text']")
	public static WebElement deleteEnvMSZ;

	@FindBy(xpath = "//*[contains(text(),'Afrikaans - South Africa')]")
	public static WebElement selectLanguageDropDown;

	public static void initiatePageoject() {
		PageFactory.initElements(Driver.driver, SettingsPageObjects.class);

	
	
	
	
	
	
	}
	
	
	
	
	
}

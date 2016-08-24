package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersObjects {
	
	
	
	/*
	 * Settings drop down for Developer
	 */
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.SETTINGS']")
	public static WebElement settingsMenu;
	
	@FindBy(xpath = "//a[@translate='NAV_BAR.USERS']")
	public static WebElement usersLink;
	
	@FindBy(xpath = "//*[@id='header']/div/div[1]/a")
	public static WebElement logo;
	
	@FindBy(xpath = "//*[@class='ngdialog-close']")
	public static WebElement popup;
	
	@FindBy(xpath = "//i[@class='icon-cog']")
	public static WebElement headerSettingIcon;
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.SETTINGS']")
	public static WebElement headerSettingText;
	
	@FindBy(xpath = "//span[@class='drop-down-text']")
	public static WebElement headerSettingDropdown;
	
	@FindBy(xpath = "//a[@href='#!/stack/bltc4aa3fad82437b27/settings/stack']")
	public static WebElement stackDropdown;
	
	@FindBy(xpath ="//a[@translate='NAV_BAR.ENVIRONMENTS']")
	public static WebElement environmentDropdown;
	
//	@FindBy(xpath ="//a[@class='ng-scope']")
//	public static List <WebElement> environmentDropdown;
	
	@FindBy(xpath = "//a[@translate='NAV_BAR.LANGUAGES']")
	public static WebElement languagesDropdown;
	
	@FindBy(xpath = "//a[@translate='NAV_BAR.USERS']")
	public static WebElement usersDropdown;
	
	@FindBy(xpath = "//a[@translate='NAV_BAR.ROLES']")
	public static WebElement rolesDropdown;
	
	@FindBy(xpath = "//a[@translate='NAV_BAR.WEBHOOKS']")
	public static WebElement webhooksDropdown;
	
	
	
	/*
	 * Users window
	 */
	@FindBy(xpath = "//span[@class='title ng-binding']")
	public static WebElement usersText;
	
	@FindBy(xpath = "//span[@data-ng-bind='stk.stack.name']")
	public static WebElement stacksTextBreadcrumb;
	
	@FindBy(xpath = "//span[@data-ng-bind='stk.stack.name']")
	public static WebElement rajTextBreadcrumb;
	
	@FindBy(xpath = "//span[@title='Settings']")
	public static WebElement settingsTextBreadcrumb;
	
	@FindBy(xpath = "//ul[@class='clearfix']/li[3]/span")
	public static WebElement usersTextBreadcrumb;
	
	@FindBy(xpath = "//img[@class='cs-plus-icon']")
	public static WebElement addNewUserButton;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div[1]/div[1]/div/i")
	public static WebElement searchIcon;
	
	@FindBy(xpath = "//input[@placeholder='Search all users']")
	public static WebElement searchTextField;
	
	
	/*
	 * Users table
	 */
	@FindBy(xpath = "//div[@translate='TABLE_HEADER.EMAIL_ADDRESS']")
	public static WebElement emailAddHeader;
	
	@FindBy(xpath = "//div[@translate='TABLE_HEADER.ROLES']")
	public static WebElement rolesHeader;
	
	@FindBy(xpath = "//div[@translate='TABLE_HEADER.INVITED_BY']")
	public static WebElement invitedByHeader;
	
	@FindBy(xpath = "//div[@translate='TABLE_HEADER.STATUS']")
	public static WebElement statusHeader;
	
	@FindBy(xpath = "//div[@data-ng-bind='collaborator.email']")
	public static WebElement emailValue;
	
	@FindBy(xpath = "//span[contains(text(),'Content Manager')]")
	public static WebElement contentManager;
	
	@FindBy(xpath = "//span[contains(.,'Owner')]")
	public static WebElement rolesValue;
	
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/ul[2]/li/div/a/div[3]")
	public static WebElement invitedValue;
	
	@FindBy(xpath = "//span[contains(text(),'Accepted')]")
	public static WebElement statusValue;
	
	/*
	 * Invite User window
	 */
	@FindBy(xpath = "//h3[contains(.,'Invite User')]")
	public static WebElement inviteUserText;
	
	@FindBy(xpath = "//label[contains(.,'Email*')]")
	public static WebElement emailText;
	
	@FindBy(xpath = "//input[@maxlength='50']")
	public static WebElement emailMessageText1;
	
	
	
	@FindBy(xpath = "//input[@maxlength='50']")
	public static WebElement emailMessageText;
	
	@FindBy(xpath = "//ul[@class='tag-editor ui-sortable']")
	public static WebElement emailTextField;
	
	@FindBy(xpath = "//input[@maxlength='50']")
	public static WebElement emailField;

	
	@FindBy(xpath = "//label[contains(.,'Roles*')]")
	public static WebElement selectRolesText;
	
	@FindBy(xpath = "//*[contains(text(),'Select Role')]")
	public static WebElement selectRole;
	
	@FindBy(xpath = "//span[contains(.,'Developer')]")
	public static WebElement developerCheckBox;
	
	@FindBy(xpath = "//span[contains(.,'Content Manager')]")
	public static WebElement contentManagerCheckBox;

	@FindBy(xpath = "//*[@class='lbl ng-binding']")
	public static List<WebElement> contentManagerCheckBoxIndropDown;
	 
	@FindBy(xpath = "//span[contains(.,'new role')]")
	public static WebElement newRole;
	
	@FindBy(xpath = "//span[contains(.,'Update roleew role')]")
	public static WebElement testRoleCheckBox;
	
	@FindBy(xpath = "//label[contains(.,'Message')]")
	public static WebElement messageText;
	
	@FindBy(xpath = "//textarea[@ng-model='user.collaborator.message']")
	public static WebElement messageTextField;
	
	@FindBy(xpath = "//span[@data-ng-click='user.no()']")
	public static WebElement canceltext;
	
	@FindBy(xpath = "//*[@class='icon-ok ng-scope']")
	public static WebElement invite;
	
	@FindBy(xpath = "//div[@class='ui-pnotify-text']")
	public static WebElement successfullMsg;
	
	
	
	//custom roles
	
	@FindBy(xpath = "//ul[@class='scroll-bar-design no-padding']/li[3]/label/input")
	public static WebElement customroleswithcreateRight;
	
	
	@FindBy(xpath = "//ul[@class='scroll-bar-design no-padding']/li[4]/label/input")
	public static WebElement customroleswithdeleteAndUpdateRight;
	
	@FindBy(xpath = "//ul[@class='scroll-bar-design no-padding']/li[5]/label/input")
	public static WebElement customroleswithdeleteAndpublish;
	
	@FindBy(xpath = "//a[@data-ng-if='entryList.roles.create']")
	public static WebElement createEntryButton;

	
	
	/*
	 * User Dashboard
	 */
	@FindBy(xpath = "//div[@data-ng-bind='collaborator.email']")
	public static WebElement contentManagerUser;
	
	@FindBy(xpath = "//span[contains(text(),'Content Manager')]")
	public static WebElement contentManagerRoles;
	
	@FindBy(xpath = "//span[@data-ng-if='roles.length']")
	public static WebElement rolesName;
	
	
	@FindBy(xpath = "//span[contains(text(),'Developer')]")
	public static WebElement devloper;
	

	@FindBy(xpath = "//span[@data-ng-if='roles.length']")
	public static WebElement role;
	
	@FindBy(xpath = "//div[@class='key ng-binding ng-scope']")
	public static WebElement contentManagerInvitedBy;
	
	@FindBy(xpath = "//*[@class='table-cell w-20 no-right-border']/div/span")
	public static WebElement contentManagerStatus;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/ul[2]/li[1]/div/div/i")
	public static WebElement contentManagerActionIcon;
	
	@FindBy(xpath = "//*[@id='action-dropdown-0']/a")
	public static WebElement contentManagerActionOption;
	
	/*
	 * user delete popup
	 */
	
	@FindBy(xpath = "//h3[@id='ngdialog2-aria-labelledby']")
	public static WebElement removeUserText;
	
	@FindBy(xpath = "//span[@class='font-semi-bold ng-binding']")
	public static WebElement removeUserDesc;
	
	@FindBy(xpath = "//span[@class='btn cs-transparent-btn btn-large mr-5 left']")
	public static WebElement removeUserCancelButton;
	
	@FindBy(xpath = "//span[@class='btn cs-btn-success left']")
	public static WebElement removeUserRemoveButton;
	
	@FindBy(xpath = "//div[@class='ngdialog-close']")
	public static WebElement removeUserClosePopup;
	
	@FindBy(xpath = "//div[@class='ui-pnotify-text']")
	public static WebElement deleteSuccessfullMsg;
	
	
	/*
	 * Sign out from current user	
	 */
	@FindBy(xpath = "//span[@class='user-name ng-binding']")
	public static WebElement identifyCurrentUser;
	
	@FindBy(xpath = "//a[contains(.,'Sign Out')]")
	public static WebElement currentUserSignOut;
	
	
	/*
	 * New User dashboard	
	 */
	@FindBy(xpath = "//span[contains(text(),'Test Site')]")
	public static WebElement currentUserApp;
	
	@FindBy(xpath = "//a[@data-site-name='Test Site']")
	public static WebElement openCurrentUserApp;
	
	@FindBy(xpath = "//i[@class='icon-cog']")
	public static WebElement currentUserAppSettingsIcon;
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.SETTINGS']")
	public static WebElement currentUserAppSettingsText;
	
	@FindBy(xpath = "//a[@translate='NAV_BAR.STACKS']")
	public static WebElement currentUserAppSettingsStack;
	
	@FindBy(xpath = "//a[@href='#!/stack/bltc4aa3fad82437b27/settings/environments']")
	public static WebElement currentUserAppSettingsEnvironments;
	
	@FindBy(xpath = "//a[@href='#!/stack/bltc4aa3fad82437b27/settings/languages']")
	public static WebElement currentUserAppSettingsLanguage;
	
	/*
	 * Update user	
	 */
	@FindBy(xpath = "//h3[contains(.,'Update User')]")
	public static WebElement updateUser;
	
	@FindBy(xpath = "//label[contains(.,'Email*')]")
	public static WebElement updateUserEmailText;
	
	@FindBy(xpath = "//input[@data-ng-model='user.collaborator.email']")
	public static WebElement updateUserEmailValue;
	
	@FindBy(xpath = "//label[contains(.,'Roles*')]")
	public static WebElement updateUserRolesText;
	
	@FindBy(xpath = "//span[@class='filter-selected ng-binding ng-scope']")
	public static WebElement updateUserRolesDropDown;
			
	@FindBy(xpath = "//span[@class='btn cs-transparent-btn btn-large mr-5 left']")
	public static WebElement updateUserCancelButton;
			
	@FindBy(xpath = "//*[@class='icon-ok']")
	public static WebElement updateUserUpdateButton;
	
	@FindBy(xpath = "//div[@class='ngdialog-close']")
	public static WebElement updateUserCloseButton;
	
	@FindBy(xpath = "//div[@class='ui-pnotify-text']")
	public static WebElement updateSuccessfullyMsg;
	
	
	/*
	 * Stack page header	
	 */
	@FindBy(xpath = "//span[@class='title ng-binding']")
	public static WebElement stackText;
	
	@FindBy(xpath = "//a[contains(.,'Stacks')]")
	public static WebElement stacksBreadcrum;
	
	@FindBy(xpath = "//span[@data-ng-bind='stk.stack.name']")
	public static WebElement rajBreadcrum;
	
	@FindBy(xpath = "//span[@title='Settings']")
	public static WebElement settingsBreadcrum;
	
	@FindBy(xpath = "//ul[@class='clearfix']/li[3]/span")
	public static WebElement stackPageBreadcrum;
	

	
	
	
	/*
	 * Stack page content	
	 */
	
	@FindBy(xpath = "//h5[contains(.,'GENERAL')]")
	public static WebElement generalText;
	
	@FindBy(xpath = "//label[contains(.,'Name *')]")
	public static WebElement generalName;
	
	@FindBy(xpath = "//input[@name='stackname']")
	public static WebElement generalNameValue;
	
	@FindBy(xpath = "//label[contains(.,'Description')]")
	public static WebElement generalDesc;
	
	@FindBy(xpath = "//textarea[@class='cs-text-box w-60 ng-pristine ng-untouched ng-valid']")
	public static WebElement generalDescValue;
	
	@FindBy(xpath = "//label[contains(.,'Stack Admin Email')]")
	public static WebElement generalSiteAdmin;
	
	@FindBy(xpath = "//input[@class='cs-text-box w-60 ng-pristine ng-untouched ng-valid']")
	public static WebElement generalSiteAdminValue;
	
	@FindBy(xpath = "//label[contains(.,'Date Format')]")
	public static WebElement generalDateFormat;
	
	@FindBy(xpath = "//span[@data-ng-if='setSelected']")
	public static WebElement generalDateFormatValue;
	
	@FindBy(xpath = "//label[contains(.,'Time Format')]")
	public static WebElement timeFormatText;
	
	@FindBy(xpath = "//span[contains(.,'12hrs')]")
	public static WebElement twelveHrs;
	
	@FindBy(xpath = "//span[contains(.,'24hrs')]")
	public static WebElement twentyFourHrs;
	
	@FindBy(xpath = "//h5[contains(.,'API CREDENTIALS')]")
	public static WebElement apiDetailsText;
	
	@FindBy(xpath = "//label[contains(.,'API Key')]")
	public static WebElement apiKeyText;
	
	@FindBy(xpath = "//label[contains(.,'Access Token')]")
	public static WebElement apiKeyValue;
	
	@FindBy(xpath = "//label[contains(.,'Access Token')]")
	public static WebElement accessTokenText;
	
	@FindBy(xpath = "//label[contains(.,'Access Token')]")
	public static WebElement accessTokenValue;
	
	@FindBy(xpath = "//button[@data-ng-click='info.leaveStack(info.stack.api_key)']")
	public static WebElement leaveStack;
	
	
	
	@FindBy(xpath = "//span[@data-ng-click='stk.yes()']")
	public static WebElement leave;
	
	@FindBy(xpath = "//span[@data-ng-click='stk.cancel()']")
	public static WebElement cancel;
	
	
	/*
	 * Stack page content	
	 */
	
	@FindBy(xpath = "//h3[contains(.,'Confirm action')]")
	public static WebElement cofirmActionText;
	
	@FindBy(xpath = "//span[contains(.,'Are You sure you want to leave this stack?')]")
	public static WebElement cofirmActionDesc;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/div/span[1]")
	public static WebElement cofirmActionCancelButton;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/div/span[2]")
	public static WebElement cofirmActionLeaveButton;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]")
	public static WebElement cofirmActionCloseButton;
	
	
	/*
	 * Environment page	
	 */
	@FindBy(xpath = "//span[@class='title ng-binding']")
	public static WebElement environmentText;
	
	@FindBy(xpath = "//span[@class='ng-binding ng-scope']")
	public static WebElement environmentBreadcrum;
	
	@FindBy(xpath = "//a[contains(.,'New Environment')]")
	public static WebElement addNewEnv;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div/div/ul[1]/li/div[1]")
	public static WebElement environmentNameText;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div/div/ul[1]/li/div[2]")
	public static WebElement environmentUrlsText;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div/div/ul[2]/li/div/a/div[1]")
	public static WebElement environmentName1;

	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div/div/ul[2]/li/div/a/div[2]/ul/li/span[1]")
	public static WebElement environmentUrl1;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div/div/ul[2]/li/div/a/div[2]/ul/li/span[2]")
	public static WebElement environmentUrl2;
	
	/*
	 * Languages page	
	 */
	@FindBy(xpath = "//span[@class='title ng-binding']")
	public static WebElement languagesText;
	
	@FindBy(xpath = "//ul[@class='clearfix']/li[3]/span")
	public static WebElement languagesBreadcrum;
	
	@FindBy(xpath = "//input[@class='cs-text-box ng-pristine ng-untouched ng-valid']")
	public static WebElement languagesTextField;
	
	@FindBy(xpath = "//div[contains(text(),'Name')]")
	public static WebElement languagesNameText;
	
	@FindBy(xpath = "//div[contains(text(),'Code')]")
	public static WebElement languagesCodeText;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div/ul[2]/li/div/a/div[1]")
	public static WebElement languagesNameValue;
	
	@FindBy(xpath = "//div[@data-ng-bind='locale.locale_uid']")
	public static WebElement languagesCodeValue;
	
	@FindBy(xpath = "//div[@data-ng-click='language.add()']")
	public static WebElement addNewlanguage;
	
	
	//Content type
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.CONTENT']")
	public static WebElement contentType;
	
	
	@FindBy(xpath = "//span[contains(.,'Imported Form')]")
	public static WebElement importedForm;
	
	@FindBy(xpath = "//a[@data-ng-if='entryList.roles.create']")
	public static WebElement create;
	
	@FindBy(xpath = "//span[contains(text(),'Import')]")
	public static WebElement importIcon;
	
	@FindBy(xpath = "//input[@name='entry']")
	public static WebElement browse;
	
	@FindBy(xpath = "//button[@data-ng-click='upload()']")
	public static WebElement submit;
	
	@FindBy(xpath = "//span[contains(.,'Imported Entry')]")
	public static WebElement importEntry;
	
	@FindBy(xpath = "//i[@class='icon icon-ellipsis-v action-btn-icon']")
	public static WebElement ellopsisIcon;
	
	@FindBy(xpath = "//span[contains(.,'Export')]")
	public static WebElement export;
	
	@FindBy(xpath = "//span[contains(.,'Delete')]")
	public static WebElement delete;
	
	@FindBy(xpath = "//a[contains(.Publish')]")
	public static WebElement publish;
	/*
	 * Content manager 
	 */
	
	@FindBy(xpath = "//span[contains(.,'Test Site')]")
	public static WebElement testingApp;
	
	@FindBy(xpath = "//a[@data-site-name='Test Site']")
	public static WebElement openTestingApp;
	
	/*
	 * Developer settings - Stack
	 */
	@FindBy(xpath = "//button[@class='btn right cs-btn-success mr-5 ng-scope']")
	public static WebElement saveStack;
	
	@FindBy(xpath = "//button[@class='btn cs-border-btn btn-large ng-scope']")
	public static WebElement resetAccessToken;
	
	
	/*
	 * Developer settings - Environments
	 */
	
	@FindBy(xpath = "//a[contains(.,'New Environment')]")
	public static WebElement addNewEnvironment;
	
	
	/*
	 * Developer settings - Environments
	 */
	@FindBy(xpath = "//div[@data-ng-click='language.add()']")
	public static WebElement addNewLanguages;
	
	/*
	 * Developer settings - Users
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/ul[2]/li[2]/div/a/div[1]")
	public static WebElement ownerEmailID;
	
	@FindBy(xpath = "//span[contains(.,'Owner')]")
	public static WebElement ownerRoles;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/ul[2]/li[2]/div/a/div[4]/div/span")
	public static WebElement ownerStatus;


	

}





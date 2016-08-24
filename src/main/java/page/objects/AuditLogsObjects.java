package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.built.io.automationframework.BasePageActions;
import com.built.io.automationframework.BaseTest;
import com.built.io.automationframework.Driver;

public class AuditLogsObjects extends BasePageActions {

	
	
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[1]/div/ul[1]/li/div")
	public static WebElement filters;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[1]/div/ul[1]/li/div/img")
	public static WebElement hideFilterIcon;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[1]/div/ul[1]/li/div/i")
	public static WebElement showFilterIcon;
	
	//Users
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[1]/div/ul[2]/li[1]/div/h3")
	public static WebElement usersText;
	
	@FindBy(xpath = "//*[@id='type']/div/div[2]/label/span")
	public static WebElement usersMe;
	
	
	
	/*
	 * Actions options in filters
	 */
	
	                 
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div[1]/div/ul[2]/li[2]/div/h3")
	public static WebElement actionText;
	
	@FindBy(xpath = "//*[@id='actions']/div/div[1]/label/span")
	public static WebElement createAction;
	
	@FindBy(xpath = "//*[@id='actions']/div/div[2]/label/span")
	public static WebElement deleteAction;
	
	@FindBy(xpath = "//*[@id='actions']/div/div[3]/label/span")
	public static WebElement updateAction;
	
	@FindBy(xpath = "//*[@id='actions']/div/div[4]/label/span")
	public static WebElement importAction;
	
	@FindBy(xpath = "//*[@id='actions']/div/div[5]/label/span")
	public static WebElement exportAction;
	
	@FindBy(xpath = "//*[@id='actions']/div/div[6]/label/span")
	public static WebElement shareAction;
	
	@FindBy(xpath = "//*[@id='actions']/div/div[7]/label/span")
	public static WebElement unshareAction;
	
	
	
	/*
	 * Modules options in filters
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[1]/div/ul[2]/li[3]/div/h3")
	public static WebElement modulesText;
	
	@FindBy(xpath = "//*[@id='module']/div/div[1]/label/span")
	public static WebElement modulesForm;
	
	@FindBy(xpath = "//*[@id='module']/div/div[2]/label/span")
	public static WebElement modulesEntry;
	
	@FindBy(xpath = "//*[@id='module']/div/div[3]/label/span")
	public static WebElement modulesAsset;
	
	@FindBy(xpath = "//*[@id='module']/div/div[4]/label/span")
	public static WebElement modulesUser;
	
	@FindBy(xpath = "//*[@id='module']/div/div[5]/label/span")
	public static WebElement modulesLocale;
	
	@FindBy(xpath = "//*[@id='module']/div/div[6]/label/span")
	public static WebElement modulesEnvironment;
	
	@FindBy(xpath = "//*[@id='module']/div/div[7]/label/span")
	public static WebElement modulesSite;
	
	@FindBy(xpath = "//*[@id='module']/div/div[8]/label/span")
	public static WebElement modulesRoles;
	
	@FindBy(xpath = "//*[@id='module']/div/div[9]/label/span")
	public static WebElement modulesWebhook;
	
	
	
	/*
	 *Languages options in filters
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[1]/div/ul[2]/li[4]/div/h3")
	public static WebElement langugaesText;
	
	@FindBy(xpath = "//*[@id='languages']/div/div[1]/label/span")
	public static WebElement langugaesArabic;
	
	@FindBy(xpath = "//*[@id='languages']/div/div[2]/label/span")
	public static WebElement langugaesChina;
	
	@FindBy(xpath = "//*[@id='languages']/div/div[3]/label/span")
	public static WebElement langugaesEnglish;
	
	
	
	/*
	 * username in the dashboard, 
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[1]/div[2]")
	public static WebElement usernameDashboard;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[3]/span")
	public static WebElement usernameValue1;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[2]/span")
	public static WebElement usernameValue2;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[2]/span")
	public static WebElement usernameValue3;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[2]/span")
	public static WebElement usernameValue4;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[2]/span")
	public static WebElement usernameValue5;
	
	
	
	
	/*
	 * Actions in the dashboard
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[1]/div[3]")
	public static WebElement actionDashboard;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[4]/span")
	public static WebElement actionValue1;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[3]/span")
	public static WebElement actionValue2;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[3]/span")
	public static WebElement actionValue3;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[3]/span")
	public static WebElement actionValue4;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[3]/span")
	public static WebElement actionValue5;
	
	

	
	/*
	 *  module in the dashboard
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[1]/div[4]")
	public static WebElement moduleDashboard;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[5]/span")
	public static WebElement moduleValue1;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[4]/span")
	public static WebElement moduleValue2;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[4]/span")
	public static WebElement moduleValue3;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[4]/span")
	public static WebElement moduleValue4;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[4]/span")
	public static WebElement moduleValue5;
	
	
	/*
	 *  stack dashboard temporary
	 */
	@FindBy(xpath = "//*[@id='stacks']/div[13]/div")
	public static WebElement mouseHoverStack;
	
	@FindBy(xpath = "//*[@id='stacks']/div[13]/div/div/a")
	public static WebElement clickOnStack;
	
	@FindBy(xpath = "//*[@id='header']/div/div[3]/ul/li[4]/a/span")
	public static WebElement clickOnAuditLog;
	
	 @FindBy(xpath = "//*[@id='type']/div/div[2]/label/span")
	 public static WebElement usersMe1;
	
	
	
	//span[@translate='NAV_BAR.ASSETS']
	
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.AUDIT_LOG']")
	public static WebElement auditLogIcon;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[3]/span")
	public static WebElement userName1;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[4]/span")
	public static WebElement action1;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[5]/span")
	public static WebElement module1;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[6]/span")
	public static WebElement title1;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[7]/span")
	public static WebElement remotoAdress1;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[2]/span")
	public static WebElement userName2;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[3]/span")
	public static WebElement action2;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[4]/span")
	public static WebElement module2;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[5]/span")
	public static WebElement title2;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[6]/span")
	public static WebElement remotoAdress2;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[2]/span")
	public static WebElement userName3;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[3]/span")
	public static WebElement action3;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[4]/span")
	public static WebElement module3;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[5]/span")
	public static WebElement title3;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[6]/span")
	public static WebElement remotoAdress3;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[2]/span")
	public static WebElement userName4;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[3]/span")
	public static WebElement action4;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[4]/span")
	public static WebElement module4;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[5]/span")
	public static WebElement title4;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[6]/span")
	public static WebElement remotoAdress4;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[2]/span")
	public static WebElement userName5;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[3]/span")
	public static WebElement action5;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[4]/span")
	public static WebElement module5;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[5]/span")
	public static WebElement title5;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[6]/span")
	public static WebElement remotoAdress5;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[2]/span")
	public static WebElement userName6;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[3]/span")
	public static WebElement action6;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[4]/span")
	public static WebElement module6;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[5]/span")
	public static WebElement title6;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[6]/span")
	public static WebElement remotoAdress6;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[2]/span")
	public static WebElement userName7;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[3]/span")
	public static WebElement action7;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[4]/span")
	public static WebElement module7;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[5]/span")
	public static WebElement title7;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[6]/span")
	public static WebElement remotoAdress7;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[8]/div[2]/span")
	public static WebElement userName8;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[8]/div[3]/span")
	public static WebElement action8;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[8]/div[4]/span")
	public static WebElement module8;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[8]/div[5]/span")
	public static WebElement title8;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[8]/div[6]/span")
	public static WebElement remotoAdress8;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[2]/span")
	public static WebElement userName9;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[3]/span")
	public static WebElement action9;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[4]/span")
	public static WebElement module9;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[5]/span")
	public static WebElement title9;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[6]/span")
	public static WebElement remotoAdress9;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[2]/span")
	public static WebElement userName10;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[3]/span")
	public static WebElement action10;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[4]/span")
	public static WebElement module10;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[5]/span")
	public static WebElement title10;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[6]/span")
	public static WebElement remotoAdress10;
	
	
	//Pagination
	
	@FindBy(xpath = "//i[@class='icon-chevron-right']")
	public static WebElement rightNavigationIcon;
	
	//Entry Title
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[6]/span")
	public static WebElement title1entry;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[6]/div/div[1]/span[2]")
	public static WebElement title1content;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[6]/div/div[3]/span[2]")
	public static WebElement title1lang;
	

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[5]/span")
	public static WebElement title2entry;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[5]/div/div[1]/span[2]")
	public static WebElement title2content;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[5]/div/div[3]/span[2]")
	public static WebElement title2lang;
	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[5]/span")
	public static WebElement title3entry;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[5]/div/div[1]/span[2]")
	public static WebElement title3content;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[5]/div/div[3]/span[2]")
	public static WebElement title3lang;
	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[5]/span")
	public static WebElement title4entry;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[5]/div/div[1]/span[2]")
	public static WebElement title4content;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[5]/div/div[3]/span[2]")
	public static WebElement title4lang;
	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[5]/span")
	public static WebElement title5entry;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[5]/div/div[1]/span[2]")
	public static WebElement title5content;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[5]/div/div[3]/span[2]")
	public static WebElement title5lang;
	

	public static void initiatePageoject() {
		PageFactory.initElements(driver, AuditLogsObjects.class);

	}
	
}

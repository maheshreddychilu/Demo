package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.built.io.automationframework.Driver;

public class WebHookObjects {

	@FindBy(xpath = "//*[@class='cs-plus-icon']")
	public static WebElement addWebHook;

	@FindBy(xpath = "//input[@data-ng-model='hook.webHook.name']")
	public static WebElement name;

	@FindBy(xpath = "//input[@data-ng-model='hook.webHook.url']")
	public static WebElement url;

	@FindBy(xpath = "//span[@translate='NAV_BAR.SETTINGS']")
	public static WebElement settingsMenu;
	
	@FindBy(xpath = "//a[@translate='NAV_BAR.WEBHOOKS']")
	public static WebElement webhookLink;
	
	@FindBy(xpath = "//span[contains(text(),'Any')]")
	public static WebElement anyDropDown;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/form/div/div[3]/div/div[2]/div/div[1]/div[2]/div/ul/li/div[3]/a/div")
	public static WebElement anyInDropdown;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/form/div/div[3]/div/div[2]/div/div[1]/div[2]/div/ul/li/div[4]/a/div")
	public static WebElement aspecific;



	public static By selectModule = By.xpath("//span[contains(text(),'Select Module')]") ;
	
	public static By selectContentType = By.xpath("//span[contains(text(),'Select Content Type')]") ;
	
	@FindBy(xpath = "//div[contains(text(),'Content Type')]")
	public static WebElement form;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/form/div/div[3]/div/div[2]/div/div[1]/div[3]/div/ul/li/div[4]/a/div")
	public static WebElement entry;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/form/div/div[3]/div/div[2]/div/div[1]/div[3]/div/ul/li/div[5]/a/div")
	public static WebElement asset;

	public static By selectAction = By.xpath("//span[contains(text(),'Select Action')]") ;

	@FindBy(xpath = "//div[@class='ng-binding ng-scope']")
	public static WebElement all;
	
	public static By selectEnv = By.xpath("//span[contains(.,'Select Environment')]") ;
	
	
	public static By publishStatus = By.xpath("//span[contains(.,'Select Publish Status')]") ;
	

	@FindBy(xpath = "//div[contains(text(),'Published')]")
	public static WebElement published;

	@FindBy(xpath = "//div[contains(text(),'Unpublished')]")
	public static WebElement unpublished;
	
	
	@FindBy(xpath = "//span[contains(text(),'Select Entry')]")
	public static WebElement selectEntry;

	@FindBy(xpath = "//span[contains(text(),'Select Asset')]")
	public static WebElement selectAsset;

	@FindBy(xpath = "//span[contains(.,'Select Environment')]")
	public static WebElement selectEnvironment;

	@FindBy(xpath = "//span[contains(.,'Select Publish Status')]")
	public static WebElement selectPublishStatus;

	@FindBy(xpath = "//*[@id='select2-drop']/ul/li/div")
	public static WebElement seletedAsset;

	@FindBy(xpath = "//div[contains(text(),'copy_of_Imported Form')]")
	public static WebElement copyOfImportedForm;

	@FindBy(xpath = "//div[contains(text(),'Imported Form')]")
	public static WebElement copyOfImportedForm1;

	@FindBy(xpath = "//div[contains(text(),'Copy of Imported Entry')]")
	public static WebElement copyOfImportedEntry;

	@FindBy(xpath = "//div[contains(text(),'Created')]")
	public static WebElement createted;

	@FindBy(xpath = "//div[contains(text(),'Updated')]")
	public static WebElement updated;

	@FindBy(xpath = "//div[contains(text(),'Deleted')]")
	public static WebElement deleted;

	

	@FindBy(xpath = "//div[contains(text(),'blank')]")
	public static WebElement blank;


	@FindBy(xpath = "//img[@class='icon-plus ng-scope']")
	public static WebElement plusButton;


	@FindBy(xpath = "//div[contains(text(),'Successfully')]")
	public static WebElement successfully;

	@FindBy(xpath = "//div[contains(text(),'Unsuccessfully')]")
	public static WebElement unSuccessfully;
	
	
	
	@FindBy(xpath = "//button[@class='btn cs-btn-success btn-large mr-5 left']")
	public static WebElement create;

	@FindBy(xpath = "//button[@id='cnl']")
	public static WebElement close;

	/*@FindBy(xpath = "//button[@ng-click='hook.cancel()']")
	public static WebElement close;*/
	
	@FindBy(xpath = "//span[contains(text(),'webhook for any contentType')]")
	public static WebElement webhookForAnyForm;

	@FindBy(xpath = "//span[contains(.,'webhook for a specific contentType')]")
	public static WebElement webhookForaSpecificForm;

	@FindBy(xpath = "//span[contains(.,'webhook for any entry')]")
	public static WebElement webhookForAnyEntry;

	@FindBy(xpath = "//span[contains(.,'webhook for any entry')]")
	public static WebElement webhookForaSpecificEntry;

	@FindBy(xpath = "//span[contains(.,'webhook for any asset')]")
	public static WebElement webhookForaSpecificAsset;

	@FindBy(xpath = "//span[contains(.,'Content Types')]")
	public static WebElement formIcon;

	@FindBy(xpath = "//*[contains(text(),'Imported Form')]")
	public static WebElement importedForm;

	@FindBy(xpath = "//*[contains(text(),'Imported Entry')]")
	public static WebElement ImportedEntry;

	@FindBy(xpath = "//span[contains(text(),'webhook for any Asset')]")
	public static WebElement webhookForAnyAsset;

	@FindBy(xpath = "//*[@id='select2-drop']/ul/li[1]/div")
	public static WebElement upadateSpecific;

	@FindBy(xpath = "//*[@id='select2-drop']/ul/li[2]/div")
	public static WebElement deleteSpecific;

	@FindBy(xpath = "//*[@id='select2-drop']/ul/li[3]/div")
	public static WebElement publishSpecific;

	@FindBy(xpath = "//*[@id='select2-drop']/ul/li[4]/div")
	public static WebElement unpublishSpecific;

	

}

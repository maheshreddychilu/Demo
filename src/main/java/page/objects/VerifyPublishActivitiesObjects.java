package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyPublishActivitiesObjects {
	
	//Form
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.CONTENT']")
	public static WebElement contentTypetMenu;
	
	@FindBy(xpath = "//img[@class='icon-upload-image']")
	public static WebElement imortIcon;
	
	@FindBy(xpath = "//div[@class='pipe-line']")
	public static WebElement importIconOnWarningBox;
	
	@FindBy(xpath = "//input[@type='file']")
	public static WebElement browse;
	
	@FindBy(xpath = "//button[@data-ng-click='upload()']")
	public static WebElement importedIconOnWarningBox;
	
	@FindBy(xpath = "//span[contains(.,'Imported Entry')]")
	public static WebElement importedentry;
	
	@FindBy(xpath = "//span[contains(text(),'Imported Form')]")
	public static WebElement imported;
	
	@FindBy(xpath = "//a[@data-ng-if='entryList.roles.create']")
	public static WebElement addNewEntry;
	
	@FindBy(xpath = "//img[@title='Import']")
	public static WebElement importIcon;
	
	@FindBy(xpath = "//input[@name='entry']")
	public static WebElement browseEntry;

	@FindBy(xpath = "//button[@class='btn cs-btn-success left']")
	public static WebElement importedicon;
	
	@FindBy(xpath = "//i[@class='icon-ok ng-scope']")
	public static WebElement saveButton;

	
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.ASSETS']")
	public static WebElement assetMenu;

	@FindBy(xpath = "//div[@class='btn cs-btn-success']")
	public static WebElement newAsset;

	@FindBy(xpath = "//img[@class='cs-plus-icon']")
	public static WebElement addNewAsset;
	
	@FindBy(xpath = "//input[@name='upload[upload]']")
	public static WebElement browseAsset;
	
	@FindBy(xpath = "//ul[@class='tag-editor ui-sortable']")
	public static WebElement tags;
	

	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement save;
	
	@FindBy(xpath = "//span[contains(.,'Verify Publishing Activities')]")
	public static WebElement siteName;

	@FindBy(xpath = "//a[@data-site-name='Verify Publishing Activities']")
	public static WebElement open;
	
	@FindBy(xpath = "//span[contains(.,'Verify Publishing Activities')]")
	public static WebElement asset;
	
	@FindBy(xpath = "//span[contains(.,' ASSETS')]")
	public static WebElement assetTab;
	
	@FindBy(xpath = "//button[contains(.,'Publish')]")
	public static WebElement publish;
	
	@FindBy(xpath = "//img[@class='ng-scope']")
	public static WebElement unpublish;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement unpublishOnpopup;
	
	@FindBy(xpath = "//img[@class='icon-filter']")
	public static WebElement filterIcon;
	
	@FindBy(xpath = "//span[@title='Dhaval.jpg']")
	public static WebElement dhaval;
	
	@FindBy(xpath = "//button[@data-ng-click='asset.remove(file)']")
	public static WebElement delete;
	
	@FindBy(xpath = "//span[@data-ng-click='deleteAsset.yes()']")
	public static WebElement deleteButtonOnwarningBox;
	
	@FindBy(xpath = "//span[@title='production']")
	public static WebElement production;
	
	@FindBy(xpath = "//span[@title='development']")
	public static WebElement development;
	
	@FindBy(xpath = "//span[@title='stag']")
	public static WebElement stag;
	
	@FindBy(xpath = "//span[@title='testenv']")
	public static WebElement testEnv;
	
	@FindBy(xpath = "//span[contains(.,'Publish Later')]")
	public static WebElement publishLater;
	
	@FindBy(xpath = "//span[contains(.,'Unpublish Later')]")
	public static WebElement unPublishLater;

	
	@FindBy(xpath = "//button[@class='btn cs-btn-success left ng-scope']")
	public static WebElement publishOnpopup;
	
	@FindBy(xpath = "//button[@data-handler='today']")
	public static WebElement now;
	
	@FindBy(xpath = "//input[@aria-valuemax='59']")
	public static WebElement minits;

	@FindBy(xpath = "//button[contains(.,'Done')]")
	public static WebElement done;

	@FindBy(xpath = "//i[@class='icon-refresh']")
	public static WebElement refresh;

	@FindBy(xpath = "//i[@title='Cancel Scheduling']")
	public static WebElement cancleSceduling;

	@FindBy(xpath = "//span[@data-ng-click='cancelSchedule.yes()']")
	public static WebElement yes;
	
	@FindBy(xpath = "//span[@class='schedule_queue label_btn clear ng-binding status-cancel']")
	public static WebElement canceld;

	public static By selectTimeAndDate = By.xpath("//*[@placeholder='Select Date and Time']") ;
	
	@FindBy(xpath = "//div[@class='ui-pnotify-text']")
	public static WebElement successMessage;

	@FindBy(xpath = "//span[@translate='NAV_BAR.CONTENT']")
	public static WebElement contentType;
	
	@FindBy(xpath = "//i[@class='icon icon-ellipsis-v action-btn-icon']")
	public static WebElement ellipsisIcon;
	
	@FindBy(xpath = "//*[@title='Delete']")
	public static WebElement deleteForm;

	@FindBy(xpath = "//span[@data-ng-click='deleteForm.yes()']")
	public static WebElement deleteButtonOcontentetYpe;
	
	@FindBy(xpath = "//span[contains(.,'production')]")
	public static WebElement production1;
	
	@FindBy(xpath = "//span[contains(.,'development')]")
	public static WebElement development1;
	
	@FindBy(xpath = "//span[contains(.,'stag')]")
	public static WebElement stag1;
	
	@FindBy(xpath = "//span[contains(.,'testenv')]")
	public static WebElement testEnv1;
	
	
	
	//PUBLISH QUEUE
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.PUBLISH_QUEUE']")
	public static WebElement publishQueueLink;

	@FindBy(xpath = "//span[@class='title ng-binding']")
	public static WebElement publishQueue;
	
	@FindBy(xpath = "//div[@translate='PUBLISH_QUEUE.TIME']")
	public static WebElement publsiTimetitle;
	
	@FindBy(xpath = "//div[@translate='PUBLISH_QUEUE.ENTRY']")
	public static WebElement publishEntryTitle;
	
	@FindBy(xpath = "//div[@translate='PUBLISH_QUEUE.FORM']")
	public static WebElement publishContentType;
	
	@FindBy(xpath = "//div[@translate='PUBLISH_QUEUE.VERSION']")
	public static WebElement publishVersion;
	
	@FindBy(xpath = "//div[@translate='PUBLISH_QUEUE.LANGUAGE']")
	public static WebElement publishQueueLanguage;
	
	@FindBy(xpath = "//div[@translate='PUBLISH_QUEUE.USERNAME']")
	public static WebElement publishedByTitle;
	
	@FindBy(xpath = "//div[@translate='PUBLISH_QUEUE.ENVIRONMENT']")
	public static WebElement publisEnv;
	
	@FindBy(xpath = "//div[@translate='PUBLISH_QUEUE.STATUS']")
	public static WebElement publishStatus;
	
	@FindBy(xpath = "//a[contains(.,'Sanity Entry')]")
	public static WebElement publisheEntryName;
	
	@FindBy(xpath = "//a[contains(.,'sanity form')]")
	public static WebElement publisheContentTypeName;
	
	@FindBy(xpath = "//span[contains(.,'1')]")
	public static WebElement publisheContentTypeVersion;
	
	@FindBy(xpath = "//span[contains(.,'English  (United States)')]")
	public static WebElement publishedLanguage;
	
	@FindBy(xpath = "//span[contains(.,'Me')]")
	public static WebElement publishedBy;
	
	@FindBy(xpath = "//span[contains(.,'blank')]")
	public static WebElement envName;
	
	@FindBy(xpath = "//span[contains(.,'Published')]")
	public static WebElement status;
	
	
	//scedule asset In specific app
	
	@FindBy(xpath = "//div[@class='refresh']")
	public static WebElement refreshIcon;
	                 
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[3]")
	public static WebElement entry1;
               
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[4]/a")
	public static WebElement contentType1;
                
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[6]/span")
	public static WebElement language1;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[7]/span")
	public static WebElement publishBy1;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[8]/span")
	public static WebElement envName1;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[9]/div/div/span")
	public static WebElement status1;
	
	
	
	                
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[2]")
	public static WebElement entry2;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[3]/a")
	public static WebElement contentType2;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[5]/span")
	public static WebElement language2;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[6]/span")
	public static WebElement publishBy2;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[7]/span")
	public static WebElement envName2;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[8]/div/div/span")
	public static WebElement status2;

	
	
	             
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[2]")
	public static WebElement entry3;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[3]/a")
	public static WebElement contentType3;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[5]/span")
	public static WebElement language3;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[6]/span")
	public static WebElement publishBy3;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[7]/span")
	public static WebElement envName3;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[8]/div/div/span")
	public static WebElement status3;

	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[2]")
	public static WebElement entry4;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[3]/a")
	public static WebElement contentType4;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[5]/span")
	public static WebElement language4;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[6]/span")
	public static WebElement publishBy4;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[7]/span")
	public static WebElement envName4;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[8]/div/div/span")
	public static WebElement status4;
	
	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[2]")
	public static WebElement entry5;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[3]/a")
	public static WebElement contentType5;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[4]/span")
	public static WebElement language5;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[5]/span")
	public static WebElement publishBy5;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[6]/span")
	public static WebElement envName5;


	
	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[2]")
	public static WebElement entry6;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[3]/a")
	public static WebElement contentType6;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[4]/span")
	public static WebElement language6;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[5]/span")
	public static WebElement publishBy6;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[6]/span")
	public static WebElement envName6;


	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[2]")
	public static WebElement entry7;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[3]/a")
	public static WebElement contentType7;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[4]/span")
	public static WebElement language7;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[5]/span")
	public static WebElement publishBy7;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[6]/span")
	public static WebElement envName7;

	
	
	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[8]/div[2]")
	public static WebElement entry8;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[8]/div[3]/a")
	public static WebElement contentType8;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[8]/div[4]/span")
	public static WebElement language8;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[8]/div[5]/span")
	public static WebElement publishBy8;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[8]/div[6]/span")
	public static WebElement envName8;

	
	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[2]")
	public static WebElement entry9;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[3]/a")
	public static WebElement contentType9;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[4]/span")
	public static WebElement language9;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[5]/span")
	public static WebElement publishBy9;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[6]/span")
	public static WebElement envName9;


	
	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[2]")
	public static WebElement entry10;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[3]/a")
	public static WebElement contentType10;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[4]/span")
	public static WebElement language10;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[5]/span")
	public static WebElement publishBy10;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[6]/span")
	public static WebElement envName10;
	
	
	
}

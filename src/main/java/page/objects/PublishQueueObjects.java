package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PublishQueueObjects {
	
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

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[3]/span")
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
	
	
	
	                
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[2]/span")
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

	
	
	             
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[2]/span")
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

	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[2]/span")
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
	
	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[2]/span")
	public static WebElement entry5;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[3]/a")
	public static WebElement contentType5;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[4]/span")
	public static WebElement language5;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[5]/span")
	public static WebElement publishBy5;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[6]/span")
	public static WebElement envName5;


	
	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[2]/span")
	public static WebElement entry6;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[3]/a")
	public static WebElement contentType6;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[4]/span")
	public static WebElement language6;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[5]/span")
	public static WebElement publishBy6;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[6]/span")
	public static WebElement envName6;


	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[2]/span")
	public static WebElement entry7;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[3]/a")
	public static WebElement contentType7;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[4]/span")
	public static WebElement language7;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[5]/span")
	public static WebElement publishBy7;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[6]/span")
	public static WebElement envName7;

	
	
	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[8]/div[2]/span")
	public static WebElement entry8;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[8]/div[3]/a")
	public static WebElement contentType8;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[8]/div[4]/span")
	public static WebElement language8;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[8]/div[5]/span")
	public static WebElement publishBy8;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[8]/div[6]/span")
	public static WebElement envName8;

	
	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[2]/span")
	public static WebElement entry9;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[3]/a")
	public static WebElement contentType9;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[4]/span")
	public static WebElement language9;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[5]/span")
	public static WebElement publishBy9;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[6]/span")
	public static WebElement envName9;


	
	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[2]/span")
	public static WebElement entry10;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[3]/a")
	public static WebElement contentType10;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[4]/span")
	public static WebElement language10;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[5]/span")
	public static WebElement publishBy10;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[6]/span")
	public static WebElement envName10;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//*[@id='header']/div/div[1]/a/img")
	public static WebElement homeLogo;
	
	@FindBy(xpath = "//*[@id='stacks']/div[4]/div")
	public static WebElement testingSite;
	
	@FindBy(xpath = "//*[@id='stacks']/div[4]/div/div/a")
	public static WebElement openTestingSite;
	
	@FindBy(xpath = "//*[@id='header']/div/div[3]/ul/li[3]/a/span")
	public static WebElement headerPublishQueue;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div[1]/div/ul[1]/li/div")
	public static WebElement filterText;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[1]/div/ul[1]/li/div/img")
	public static WebElement hideFilterIcon;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[1]/div/ul[1]/li/div/i")
	public static WebElement showFilterIcon;
	
	
	/*
	 * Status options in filter
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[1]/div/ul[2]/li[1]/div/h3")
	public static WebElement statusText;
	
	@FindBy(xpath = "//*[@id='status']/div/div[1]/label/span")
	public static WebElement published;
	
	@FindBy(xpath = "//*[@id='status']/div/div[2]/label/span")
	public static WebElement unpublished;
	
	@FindBy(xpath = "//*[@id='status']/div/div[3]/label/span")
	public static WebElement scheduledPublish;
	
	@FindBy(xpath = "//*[@id='status']/div/div[4]/label/span")
	public static WebElement scheduledUnpublish;
	
	@FindBy(xpath = "//*[@id='status']/div/div[5]/label/span")
	public static WebElement deleted;
	
	@FindBy(xpath = "//*[@id='status']/div/div[6]/label/span")
	public static WebElement cancelled;
	
	@FindBy(xpath = "//*[@id='status']/div/div[7]/label/span")
	public static WebElement failed;

	@FindBy(xpath = "//*[@id='status']/div/div[8]/label/span")
	public static WebElement inProgress;
	
	@FindBy(xpath = "//*[@id='status']/div/div[9]/label/span")
	public static WebElement pending;
	
	/*
	 * Environment options in filter
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[1]/div/ul[2]/li[2]/div/h3")
	public static WebElement environmentsText;
	
	@FindBy(xpath = "//*[@id='envs']/div/div[1]/label/span")
	public static WebElement first_env;
	
	@FindBy(xpath = "//*[@id='envs']/div/div[2]/label/span")
	public static WebElement test;
	
	/*
	 * Users options in filter
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[1]/div/ul[2]/li[3]/div/h3")
	public static WebElement users;
	
	@FindBy(xpath = "//*[@id='users']/div/div[6]/label/span")
	public static WebElement me;
	
	/*
	 * languages options in filter
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[1]/div/ul[2]/li[4]/div/h3")
	public static WebElement languages;
	
	@FindBy(xpath = "//*[@id='languages']/div/div[1]/label/span")
	public static WebElement arabic;
	
	@FindBy(xpath = "//*[@id='languages']/div/div[2]/label/span")
	public static WebElement chineese;
	
	@FindBy(xpath = "//*[@id='languages']/div/div[3]/label/span")
	public static WebElement englishAus;
	
	@FindBy(xpath = "//*[@id='languages']/div/div[4]/label/span")
	public static WebElement englishBel;
	
	@FindBy(xpath = "//*[@id='languages']/div/div[5]/label/span")
	public static WebElement englishUs;
	
	@FindBy(xpath = "//*[@id='languages']/div/div[6]/label/span")
	public static WebElement farsi;
	
	@FindBy(xpath = "//*[@id='languages']/div/div[7]/label/span")
	public static WebElement french;
	
	@FindBy(xpath = "//*[@id='languages']/div/div[8]/label/span")
	public static WebElement hindi;
	
	@FindBy(xpath = "//*[@id='languages']/div/div[9]/label/span")
	public static WebElement japan;
	
	@FindBy(xpath = "//*[@id='languages']/div/div[10]/label/span")
	public static WebElement telugu;
	
	/*
	 * Forms options in filter
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[1]/div/ul[2]/li[5]/div/h3")
	public static WebElement forms;
	
	@FindBy(xpath = "//*[@id='forms']/div/div[1]/label/span")
	public static WebElement chilu;
	
	@FindBy(xpath = "//*[@id='forms']/div/div[2]/label/span")
	public static WebElement mahesh;
	
	@FindBy(xpath = "//*[@id='forms']/div/div[3]/label/span")
	public static WebElement rajesh;
	
	@FindBy(xpath = "//*[@id='forms']/div/div[4]/label/span")
	public static WebElement sony;
	
	@FindBy(xpath = "//*[@id='forms']/div/div[5]/label/span")
	public static WebElement webpage;
	
	
	/*
	 * published status in filter
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[1]/div[8]")
	public static WebElement statusDashboard;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[9]/div/span")
	public static WebElement statusPublishedValue1;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[8]/div/span")
	public static WebElement statusPublishedValue2;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[8]/div/span")
	public static WebElement statusPublishedValue3;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[8]/div/span")
	public static WebElement statusPublishedValue4;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[8]/div/span")
	public static WebElement statusPublishedValue5;
	
	
	/*
	 * unpublished status in filter
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[9]/div/span")
	public static WebElement statusUnpublishedValue1;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[8]/div/span")
	public static WebElement statusUnpublishedValue2;
	
	
	/*
	 * Scheduled published status in filter
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[9]/div/span")
	public static WebElement statusScheduledPublishedValue1;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[9]/div/span")
	public static WebElement statusScheduledPublishedValue2;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[9]/div/span")
	public static WebElement statusScheduledPublishedValue3;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[9]/div/span")
	public static WebElement statusScheduledPublishedValue4;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[9]/div/span")
	public static WebElement statusScheduledPublishedValue5;
	
	/*
	 * Scheduled unpublished status in filter
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[9]/div/span")
	public static WebElement statusScheduledUnPublishedValue1;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[9]/div/span")
	public static WebElement statusScheduledUnPublishedValue2;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[9]/div/span")
	public static WebElement statusScheduledUnPublishedValue3;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[9]/div/span")
	public static WebElement statusScheduledUnPublishedValue4;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[9]/div/span")
	public static WebElement statusScheduledUnPublishedValue5;
	
	/*
	 * Deleted status in filter
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[9]/div[2]/span")
	public static WebElement statusDeletedValue1;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[8]/div/div/span")
	public static WebElement statusDeletedValue2;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[8]/div[2]/span")
	public static WebElement statusDeletedValue3;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[8]/div[2]/span")
	public static WebElement statusDeletedValue4;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[8]/div[2]/span")
	public static WebElement statusDeletedValue5;
	
	/*
	 * Cancelled status in filter
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[9]/div[2]/span")
	public static WebElement statusCancelledValue1;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[8]/div[2]/span")
	public static WebElement statusCancelledValue2;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[8]/div[2]/span")
	public static WebElement statusCancelledValue3;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[8]/div[2]/span")
	public static WebElement statusCancelledValue4;
	
	/*
	 * Failed status in filter
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[9]/div[2]/span")
	public static WebElement statusFailedValue1;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[8]/div[2]/span")
	public static WebElement statusFailedValue2;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[8]/div[2]/span")
	public static WebElement statusFailedValue3;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[8]/div[2]/span")
	public static WebElement statusFailedValue4;
	
	/*
	 * In Progress status in filter
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[9]/div[2]/span")
	public static WebElement statusInProgressValue1;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[8]/div[2]/span")
	public static WebElement statusInProgressValue2;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[8]/div[2]/span")
	public static WebElement statusInProgressValue3;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[8]/div[2]/span")
	public static WebElement statusInProgressValue4;
	
	/*
	 * Pending status in filter
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[1]/div[9]/div[2]/span")
	public static WebElement statusPendingValue1;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[2]/div[8]/div[2]/span")
	public static WebElement statusPendingValue2;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[3]/div[8]/div[2]/span")
	public static WebElement statusPendingValue3;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[8]/div[2]/span")
	public static WebElement statusPendingValue4;

	/*
	 * Environment in Filter
	 */
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[1]/div[7]")
	public static WebElement environmentdashboard;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[8]/span")
	public static WebElement environmentValue1;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[7]/span")
	public static WebElement environmentValue2;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[7]/span")
	public static WebElement environmentValue3;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[7]/span")
	public static WebElement environmentValue4;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[8]/div[7]/span")
	public static WebElement environmentValue5;
	
	/*
	 * Users in Filter
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[1]/div[6]")
	public static WebElement publishedByDashboard;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[7]/span")
	public static WebElement publishedByValue1;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[6]/span")
	public static WebElement publishedByValue2;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[8]/div[6]/span")
	public static WebElement publishedByValue3;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[9]/div[6]/span")
	public static WebElement publishedByValue4;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[10]/div[6]/span")
	public static WebElement publishedByValue5;
	
	/*
	 * Languages in Filter
	 */
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[1]/div[5]")
	public static WebElement languageDashboard;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[4]/div[6]/span")
	public static WebElement languageValue1;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[5]/div[5]/span")
	public static WebElement languageValue2;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[6]/div[5]/span")
	public static WebElement languageValue3;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[7]/div[5]/span")
	public static WebElement languageValue4;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div/div[2]/div/ul[2]/li[8]/div[5]/span")
	public static WebElement languageValue5;
}

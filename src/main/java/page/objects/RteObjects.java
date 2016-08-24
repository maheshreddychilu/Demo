package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RteObjects {

	@FindBy(xpath = "//span[@translate='NAV_BAR.CONTENT']")
	public static WebElement contentType;
	
	@FindBy(xpath = "//img[@class='cs-plus-icon']")
	public static WebElement plusIconOFContentType;
	
	@FindBy(xpath = "//input[@data-ng-model='formCreate.form.title']")
	public static WebElement formTitle;
	

	@FindBy(xpath = "//span[contains(.,'Multiple (allows to create multiple entries, e.g., blog posts, press releases)')]")
	public static WebElement multipleOption;
	
	
	@FindBy(xpath = "//button[@data-ng-if='!formCreate.isEdit']")
	public static WebElement addFields;
	
	@FindBy(xpath = "//img[@src='https://contentstack-static.built.io/images/rich_text_editor.png']")
	public static WebElement rte;
	
	
	@FindBy(xpath = "//label[contains(.,'Rich text editor ')]")
	public static WebElement rteLabel;
	
	@FindBy(xpath = "//div[@class='field-holder w-80 clearfix ng-scope angular-ui-tree']")
	public static WebElement dropfield;
	
	@FindBy(xpath = "//span[@data-ng-click='form.save();']")
	public static WebElement save;
	
	@FindBy(xpath = "//div[@class='ui-pnotify-text']")
	public static WebElement successMsz;
	
	@FindBy(xpath = "//span[@data-ng-click='form.cancel();']")
	public static WebElement cancel;
	
	@FindBy(xpath = "//span[@data-ng-bind='form.title']")
	public static WebElement rteForm;
	
	@FindBy(xpath = "//input[@name='title']")
	public static WebElement entryTitle;
	
	@FindBy(xpath = "//input[contains(@name,'url')]")
	public static WebElement url;
	
	
	@FindBy(xpath = "//a[@class='re-icon re-html']")
	public static WebElement rHtml;

	@FindBy(xpath = "//span[contains(.,'Multiple')]")
	public static WebElement multiple;
	
	@FindBy(xpath = "//span[contains(.,'Mandatory')]")
	public static WebElement mandatory;
	
	@FindBy(xpath = "//textarea[@name='advance_rich_text_editor_0']")
	public static WebElement rteTextArea;
	
	@FindBy(xpath = "//div[@class='redactor-editor']")
	public static WebElement basicRteTextArea;
	
	@FindBy(css = "div:nth-child(2) > div:nth-child(2) > div > div > div > div > div.redactor-editor")
	public static WebElement secondRTE;
	
	
	@FindBy(xpath = "//i[@class='icon-plus']")
	public static WebElement plusICon;
	
	@FindBy(xpath = "//a[@class='btn cs-border-btn left cv-btn ng-scope']")
	public static WebElement compareVersion;

	@FindBy(css = "div:nth-child(2) > div > div > div > div.clearfix.compare-rich_text_editor-rte-btn-1-text > p > span")
	public static WebElement secondrteIncopareversionpage;
	
	@FindBy(xpath = "//*[@class='textarea']/div[2]/p")
	public static WebElement firstrteIncopareversionpage;
	
	@FindBy(xpath = "//i[@class='icon-close right']")
	public static WebElement closeIconOFCompareVersion;
	

	
	@FindBy(xpath = "//button[@data-ng-if='(saveEntry.isCreate && saveEntry.roles.create) || (saveEntry.isEdit && saveEntry.roles.update)']")
	public static WebElement entrySave;
	
	@FindBy(xpath = "//span[@data-ng-click='saveEntry.cancel()']")
	public static WebElement cancelEntry;
	
	@FindBy(xpath = "//span[@data-ng-bind='form.title']")
	public static WebElement rteForm1;
	
	@FindBy(xpath = "//div[@class='table-cell w-30']/span")
	public static WebElement entry;
	
	@FindBy(xpath = "//a[@class='re-icon re-image']")
	 public static WebElement rteImage;
	
	@FindBy(xpath = "//input[@name='file']")
	 public static WebElement browse;
	
	@FindBy(xpath = "//a[@rel='tab2']")
	 public static WebElement choose;
	
	@FindBy(xpath = "//input[@placeholder='Search Images']")
	 public static WebElement searchImage;
	
	@FindBy(xpath = "//button[@class='btn btn-sm btn-white']")
	 public static WebElement searchButton;
	
	@FindBy(xpath = "//img[@title='char.jpg']")
	 public static WebElement download;
	
	@FindBy(xpath = "//img[@alt='char.jpg']")
	 public static  List <WebElement> download1;
	
	@FindBy(xpath = "//img[@alt='char.jpg']")
	 public static WebElement uploadedImage;
	
	@FindBy(xpath = "//a[@aria-label='Alignment']")
	 public static WebElement aligment;
	
	@FindBy(xpath = "//a[@aria-label='Formatting']")
	 public static WebElement formating;
	
	@FindBy(xpath = "//a[contains(.,'Header 1')]")
	 public static WebElement header;
	
	@FindBy(xpath = "//h1[contains(.,'contenstack io')]")
	 public static WebElement contestackio;
	
	@FindBy(xpath = "//strong[contains(.,'contenstack io')]")
	 public static WebElement boldContestackio;
	
	
	@FindBy(xpath = "//a[@aria-label='Insert Horizontal Rule']")
	 public static WebElement horizontalRole;
	
	@FindBy(xpath = "//div[@class='redactor-editor']/hr")
	 public static WebElement horizontalRoleInRTe;
	

	@FindBy(xpath = "//a[@aria-label='Bold']")
	 public static WebElement bold;
	
	@FindBy(xpath = "//a[@aria-label='Link']")
	 public static WebElement link;
	
	
	@FindBy(xpath = "//*[@class='redactor-dropdown-link']")
	 public static WebElement insertLink;
	
	
	@FindBy(xpath = "//input[@id='redactor-link-url']")
	 public static WebElement linkUrl;
	
	
	@FindBy(xpath = "//button[@class='redactor-modal-btn redactor-modal-action-btn']")
	 public static WebElement insert;
	
	@FindBy(xpath = "//a[@href='https://www.google.co.in/']")
	 public static WebElement linkGoogle;
	
	@FindBy(xpath = "//input[@id='redactor-link-url-text']")
	 public static WebElement linkText;
	
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	 public static WebElement editLink;

	@FindBy(xpath = "//a[@aria-label='Insert Video']")
	 public static WebElement video;

	@FindBy(xpath = "//textarea[@id='redactor-insert-video-area']")
	 public static WebElement vidoeTextArea;
	
	@FindBy(xpath = "//button[@class='redactor-modal-btn redactor-modal-action-btn']")
	 public static WebElement insertButton;
	
	@FindBy(xpath = "//a[@aria-label='&bull; Unordered List']")
	 public static WebElement bullet;


	
	@FindBy(xpath = "//span[@translate='NAV_BAR.SETTINGS']")
	 public static WebElement settings;
	
	@FindBy(xpath = "//a[@translate='NAV_BAR.ENVIRONMENTS']")
	 public static WebElement environments;
	
	
	@FindBy(xpath = "//a[@aria-label='Change Font Family']")
	 public static WebElement fontFamily;
	
	@FindBy(xpath = "//*[contains(text(),'Georgia')]")
	 public static WebElement helveticaText;
	
	
	
	@FindBy(xpath = "//input[@auto-focus='focusHere']")
	public static WebElement envName;
	
	
	@FindBy(xpath = "//span[contains(.,'Advance')]")
	public static WebElement advced;
	
	@FindBy(xpath = "//span[contains(.,'Deploy Content to Server(s)')]")
	public static WebElement serversCheckBox;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement create;
	
	@FindBy(xpath = "//button[@class='btn cs-btn-success btn-large left ng-scope']")
	public static WebElement publsihButton;
	
	@FindBy(xpath = "//button[@class='btn cs-btn-success left ng-scope']")
	public static WebElement publishButtonOnPopUP;
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.PUBLISH_QUEUE']")
	public static WebElement publishQueue;

	
	@FindBy(xpath = "//span[@data-ng-bind='queue.entry.version']")
	public static WebElement version;
	
	@FindBy(xpath = "//*[@class='rte-img-ch']/img")
	public static WebElement image;
	
	@FindBy(xpath = "//a[@data-ng-click='env.save(true, {}, true)']")
	public static WebElement newEnv;
	
	
	@FindBy(xpath = "//li[contains(text(),'contenstack')]")
	 public static WebElement contestackioText;
	
	@FindBy(xpath = "//a[@aria-label='Change Font Size']")
	 public static WebElement fontSize;
	
	@FindBy(xpath = "//a[contains(text(),'18px')]")
	 public static WebElement sizeOfFont;
	
}

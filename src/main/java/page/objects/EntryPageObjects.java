package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntryPageObjects {

	@FindBy(xpath = "//span[@translate='NAV_BAR.CONTENT']")
	public static WebElement contentType;
	
	@FindBy(xpath = "//span[contains(.,'sanity form')]")
	public static WebElement sanityForm;
	
	@FindBy(xpath = "//span[contains(.,'SingleContentblock')]")
	public static WebElement singleContentBlock;
	
	@FindBy(xpath = "//span[contains(.,'SetContentblock')]")
	public static WebElement setContentBlock;

	@FindBy(xpath = "//span[contains(text(),'Imported Form')]")
	public static WebElement imported;
	
	@FindBy(xpath = "//img[@class='icon-upload-image']")
	public static WebElement importIcon;
	
	@FindBy(xpath = "//img[@class='cs-plus-icon']")
	public static WebElement addNewEntry;
	
	@FindBy(xpath = "//input[contains(@name,'title')]")
	public static WebElement title;
	
	@FindBy(xpath = "//input[contains(@name,'url')]")
	public static WebElement url;

	@FindBy(xpath = "//input[@name='multiple_single_line_0']")
	public static WebElement singleLine;
	
	@FindBy(xpath = "//textarea[@name='multiple_multi_line_0']")
	public static WebElement multiline;
	
	@FindBy(xpath = "//div[@class='redactor-editor']")
	public static WebElement rte;
	
	@FindBy(xpath = "//a[@aria-label='Insert Image']")
	public static WebElement rteImg;

	@FindBy(xpath = "//input[@name='file']")
	public static WebElement browse;

	@FindBy(xpath = "//textarea[@name='multiple_markdown_0']")
	public static WebElement markDown;

	//@FindBy(xpath = "//*[@id='wmd-image-button-1']")
	//public static WebElement mardownImg;

	@FindBy(xpath = "//*[@class='wmd-button']")
	public static List<WebElement> mardownImg;

	@FindBy(xpath = "//*[@class='icon-eye-open']")
	public static WebElement preview;
	
	@FindBy(xpath = "//img[@alt='enter image description here']")
	public static WebElement imgverify;
	
	@FindBy(xpath = "//input[@type='number']")
	public static WebElement number;

	@FindBy(xpath = "//input[@placeholder='Date [yyyy-mm-dd]']")
	public static WebElement date;
	
	@FindBy(xpath = "//button[contains(.,'Now')]")
	public static WebElement now;
	
	@FindBy(xpath = "//input[@data-ng-model='field.value.title']")
	public static WebElement linkTitleInGroup;
	
	@FindBy(xpath = "//input[@data-ng-model='field.value.href']")
	public static WebElement linkUrl;

	@FindBy(xpath = "//span[@class='lbl']")
	public static WebElement booleanField;

	@FindBy(xpath = "//span[@ng-click='$select.activate()']")
	public static WebElement searchReference;
	
	@FindBy(xpath = "//input[@type='search']")
	public static WebElement searchedEntry1;
	
	@FindBy(xpath = "//div[contains(text(),'Imported Entry')]")
	public static WebElement searchedEntry;
	
	
	@FindBy(xpath = "//input[@type='file']")
	public static WebElement upLoadFile;

	@FindBy(xpath = "//span[@class='auto-scale-img in-entry']")
	public static WebElement upLoadedFile;

	
	@FindBy(xpath = "//i[@data-ng-click='saveEntry.addMultiple({file: null},field.value, $index);limit.count=limit.count+1;']")
	public static WebElement upLoadFilePlusIcon;
	
	
	@FindBy(xpath = "//input[@data-ng-model='multiple.title']")
	public static WebElement linkTitle;

	@FindBy(xpath = "//input[@name='multiple_link_0']")
	public static WebElement linkValue;

	@FindBy(xpath = "//*[@class='choose-from-upload cs-link']")
	public static List<WebElement> chooseFromUpload;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	public static WebElement searchOnChooseUploadpopUp;

	@FindBy(xpath = "//span[@title='mahi1.jpg']")
	public static WebElement selectIMg;
	
	@FindBy(xpath = "//span[@title='mahi1.jpg']")
	public static WebElement doneImg;
	
	@FindBy(xpath = "//span[@class='auto-scale-img-ch']")
	public static WebElement selectImg;
	
	@FindBy(xpath = "//button[@class='btn cs-btn-success left']")
	public static WebElement done;
	
	@FindBy(xpath = "//*[@class='icon-ok ng-scope']")
	public static WebElement save;

	@FindBy(xpath = "//button[@data-ng-click='saveEntry.remove()']")
	public static WebElement delete;

	@FindBy(xpath = "//span[@data-ng-click='saveEntry.cancel()']")
	public static WebElement cancel;
	
	
	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/ul[2]/li[1]/div/i")
	public static WebElement entryEllipsisIcon;
	
	@FindBy(xpath = "//span[contains(.,'Export')]")
	public static WebElement export;
	
	@FindBy(xpath = "//span[contains(.,'Delete')]")
	public static WebElement deleteEntry;
	
	@FindBy(xpath = "//span[@class='btn cs-btn-success left']")
	public static WebElement deleteButtonOnwarningbox;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/ul[2]/li/a/div[1]")
	public static WebElement entryName;
	
	@FindBy(xpath = "//div[@class='ui-pnotify-text']")
	public static WebElement successmessage;
	
	@FindBy(xpath = "//span[@data-ng-click='upload()']")
	public static WebElement importedIconOnWarningBox;
	
	//@FindBy(xpath = "//*[@class='table-cell-column min-w300']/span")
	//public static WebElement importedEntry;
	
	@FindBy(xpath = "//div[@class='table-cell-column min-w300']/span")
	public static WebElement importedEntry;
	
	
	
	
	@FindBy(xpath = "//span[@class='ng-binding']")
	public static WebElement importedEntry1;
	
	@FindBy(xpath = "//input[@name='text_01']")
	public static WebElement text1;
	
	@FindBy(xpath = "//input[@name='multiple_text_03_0']")
	public static WebElement text2;
	
	@FindBy(xpath = "//input[@name='entry']")
	public static WebElement browseEntry;

	@FindBy(xpath = "//button[@data-ng-click='upload()']")
	public static WebElement importedicon;
	
	@FindBy(xpath = "//div[@class='ui-pnotify-text']")
	public static WebElement successMessage;
	
	@FindBy(xpath = "//button[@data-ng-click='form.$valid && saveEntry.savePublish(saveEntry.entry)']")
	public static WebElement publish;
	
	@FindBy(xpath = "//h3[@id='ngdialog5-aria-labelledby']")
	public static WebElement publishEntry;
	
	@FindBy(xpath = "//button[@class='btn cs-btn-success left ng-scope']")
	public static WebElement publishOnPopUp;
	
	
	
	//Copy Entry
	
	
	@FindBy(xpath = "//i[@title='Copy']")
	public static WebElement copyEntry;

	@FindBy(xpath = "//i[@class='icon icon-ellipsis-v action-btn-icon']")
	public static WebElement ellipsisIconOfImportedEntry;
	
	@FindBy(xpath = "//input[@name='title']")
	public static WebElement titleValue;

	@FindBy(xpath = "//span[contains(.,'URL')]")
	public static WebElement url1;

	@FindBy(xpath = "//span[contains(.,'Text_01')]")
	public static WebElement text_01;

	@FindBy(xpath = "//span[contains(.,'Text_02')]")
	public static WebElement text_02;

	@FindBy(xpath = "//span[contains(.,'Text_03')]")
	public static WebElement text_03;

	@FindBy(xpath = "//span[contains(.,'Text_04')]")
	public static WebElement text_04;

	@FindBy(xpath = "//span[contains(.,'Text_05')]")
	public static WebElement text_05;

	@FindBy(xpath = "//span[contains(.,'Text_06')]")
	public static WebElement text_06;

	@FindBy(xpath = "//span[contains(.,'UPLOADS')]")
	public static WebElement uploads;

	@FindBy(xpath = "//span[contains(.,'Link_field')]")
	public static WebElement linkField;

	@FindBy(xpath = "//span[contains(.,'Boolean')]")
	public static WebElement copybooleanField;

	@FindBy(xpath = "//span[contains(.,'Number_field')]")
	public static WebElement numberField;

	@FindBy(xpath = "//span[contains(.,'Date_field')]")
	public static WebElement dateField;

	@FindBy(xpath = "//label[contains(.,'Tags')]")
	public static WebElement tages;

	@FindBy(xpath = "//*[@class='icon-ok ng-scope']")
	public static WebElement savebutton;

	@FindBy(xpath = "//a[contains(.,'Imported Form')]")
	public static WebElement importedFormLink;
	

	//Edit Entry
	
	@FindBy(xpath = "//span[contains(text(),'Copy of Imported Entry')]")
	public static WebElement copyOfImportedEntry;
	
	@FindBy(xpath = "//span[contains(.,'Edited entry')]")
	public static WebElement editedEntry;
	
	@FindBy(xpath = "//button[@data-ng-click='saveEntry.remove()']")
	public static WebElement removeEntry;
	
	
	
	
	
	//comapare version
	
	@FindBy(xpath = "//a[@class='btn cs-border-btn left cv-btn ng-scope']")
	public static WebElement compareVersion;
	
	@FindBy(xpath = "//span[contains(.,'Version 1')]")
	public static WebElement version1;
	
	@FindBy(xpath = "//span[contains(.,'Version 2')]")
	public static WebElement version2;
	
	@FindBy(xpath = "//span[@class='title ng-binding']")
	public static WebElement compareVersionTitle;
	
	@FindBy(xpath = "//div[@class='right btn cs-btn-success ng-scope']")
	public static WebElement openThisVersion;
	
	@FindBy(xpath = "//h4[contains(.,'Current Version')]")
	public static WebElement currentVersion;
	
	@FindBy(xpath = "//i[@class='icon-close right']")
	public static WebElement compareVarsionCloseButton;
	
	@FindBy(xpath = "//span[@class='ng-binding ng-scope firepath-matching-node']")
	public static WebElement version;
	
	
	
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div/div/div/div/div/div/div/div/div[2]/div/div")
	public static WebElement entryVersion2title;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div/div/div/div/div/div/div/div[2]/div/div")
	public static WebElement  entryVersion2url;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div/div/div/div/div/div/div/div[2]/div/div/div/div")
	public static WebElement  entryVersion2singleLine;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[12]/div/div/div/div/div/div/div/div/div[2]/div/div/div/div")
	public static WebElement  entryVersion2multiline;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[11]/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[2]")
	public static WebElement  entryVersion2rte;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[4]/div/div/div/div/div/div/div/div/div[2]/div/div")
	public static WebElement  entryVersion2markDown;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[10]/div/div/div/div/div/div/div/div[2]/ul/li")
	public static WebElement  entryVersion2number;

	@FindBy(xpath = "//span[@class='lbl']")
	public static WebElement  entryVersion2booleanField;


	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[6]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/div/span[2]")
	public static WebElement  entryVersion2Link;


	//Search Entry
	
	
	@FindBy(xpath = "//input[@placeholder='Search entry']")
	public static WebElement  searchEntryHere;
	

	//Localize entry
	
	@FindBy(xpath = "//*[@class='cs-filters-list cs-publish-list']/div/span[2]")
	public static WebElement  entryID;
	
	@FindBy(xpath = "//span[contains(.,'English  (United States)')]")
	public static WebElement  enUS;
	
	@FindBy(xpath = "//label[contains(.,'Japanese  (Japan)')]")
	public static WebElement  jaJp;
	
	
	@FindBy(xpath = "//h3[@id='ngdialog1-aria-labelledby']")
	public static WebElement  headingOfLocaliseEntrywarningBox;

	@FindBy(xpath = "//span[@data-ng-click='confirm.yes()']")
	public static WebElement  saveOnwarningBox;
	
	@FindBy(xpath = "//div[@class='table-cell w-30']/span[2]")
	public static WebElement  languageNameIOnEntrylistPage;
	
	
}

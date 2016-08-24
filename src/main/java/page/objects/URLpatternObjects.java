package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class URLpatternObjects {
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.CONTENT']")
	public static WebElement contentType;
	
	@FindBy(xpath = "//img[@class='cs-plus-icon']")
	public static WebElement addNewForm;
	
	@FindBy(xpath = "//div[@class='btn cs-border-btn mt-10']")
	public static WebElement createWebPage;
	
	@FindBy(xpath = "//span[contains(.,'Content Block')]")
	public static WebElement createBlock;
	
	@FindBy(xpath = "//span[contains(.,'Multiple (allows to create multiple entries, e.g., blog posts, press releases)')]")
	public static WebElement createMultiple;

	@FindBy(xpath = "//span[contains(.,'Sets')]")
	public static WebElement sets;
	
	@FindBy(xpath = "//input[@data-ng-model='formCreate.form.title']")
	public static WebElement enterName;
	
	@FindBy(xpath = "//textarea[@class='cs-text-box w-100 ng-pristine ng-untouched ng-valid']")
	public static WebElement description;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement createAndAddFields;

	@FindBy(xpath = "//div[@class='field-holder w-80 clearfix ng-scope angular-ui-tree']")
	public static WebElement dropfield;
	
	@FindBy(xpath = "//div[@class='ui-pnotify-text']")
	public static List <WebElement> successMessage;
	
	@FindBy(xpath = "//*[@class='ngdialog-close']")
	public static WebElement popup;

	

	
	

	@FindBy(xpath = "//img[@data-field-name='Single line textbox']")
	public static WebElement singleLine;

	@FindBy(xpath = "//img[@data-field-name='Multi line textbox']")
	public static WebElement multipleFieled;
	                            
	@FindBy(xpath = "//img[@data-field-name='Rich text editor']")
	public static WebElement rte;
	
	@FindBy(xpath = "//img[@data-field-name='Markdown']")
	public static WebElement markDown;

	@FindBy(xpath = "//img[@data-field-name='Number']")
	public static WebElement number;
	
	@FindBy(xpath = "//img[@data-field-name='Boolean']")
	public static WebElement booleanfield;
	
	
	@FindBy(xpath = "//img[@data-field-name='Reference']")
	public static WebElement reference;
	
	@FindBy(xpath = "//img[@data-field-name='Group']")
	public static WebElement group;
	
	@FindBy(xpath = "//div[@class='w-100 dummy-obj-for-drag ng-scope angular-ui-tree-node']")
	public static WebElement groupElement;
		
	
	@FindBy(xpath = "//i[@class='icon-calendar']")
	public static WebElement date;
	
	@FindBy(xpath = "//i[@class='icon-file-text-alt']")
	public static WebElement file;
	
	@FindBy(xpath = "//i[@class='icon-link']")
	public static WebElement link;
	//lables
	
	@FindBy(xpath = "//label[contains(.,'Single line textbox ')]")
	public static WebElement singleLineLabel;

	@FindBy(xpath = "//label[contains(.,'Multi line textbox ')]")
	public static WebElement multipleFieledLabel;

	@FindBy(xpath = "//label[contains(.,'Rich text editor ')]")
	public static WebElement rteLabel;
	
	@FindBy(xpath = "//label[contains(.,'Markdown')]")
	public static WebElement markDownLabel;

	@FindBy(xpath = "//label[contains(.,'Number')]")
	public static WebElement numberLabel;
	
	@FindBy(xpath = "//label[contains(.,'Boolean')]")
	public static WebElement booleanfieldLabel;
	
	@FindBy(xpath = "//label[contains(.,'date')]]")
	public static WebElement dateLabel;
	
	@FindBy(xpath = "//label[contains(.,'File ')]")
	public static WebElement fileLabel;
	
	@FindBy(xpath = "//label[contains(.,'Link ')]")
	public static WebElement linkLabel;
	
	@FindBy(xpath = "//label[contains(.,'Reference')]")
	public static WebElement referenceLabel;

	public static By selectContentType =By.xpath("//span[contains(.,'Select Content Type')]") ;
	
	@FindBy(xpath = "//label[contains(.,'Imported Form')]")
	public static WebElement importedFormOnDropDown;
	
	@FindBy(xpath = "//label[contains(.,'Group')]")
	public static WebElement groupLabel;
	
	@FindBy(xpath = "//i[@class='icon-close']")
	public static WebElement labelcloseButton;
	
	@FindBy(xpath = "//i[@class='icon-trash']")
	public static WebElement deleteButton;
	
	
	@FindBy(xpath = "//span[@class='btn cs-btn-success left']")
	public static WebElement deleteButtonOnWarningBox;
	
	@FindBy(xpath = "//span[contains(.,'Multiple')]")
	public static WebElement multiple;
	
	@FindBy(xpath = "//span[contains(.,'Mandatory')]")
	public static WebElement mandatory;
	
	@FindBy(xpath = "//span[contains(.,'Unique')]")
	public static WebElement unique;
	
	@FindBy(xpath = "//label[contains(.,'Max Length')]")
	public static WebElement maxLenth;
	
	@FindBy(xpath = "//button[@data-ng-click='form.save();']")
	public static WebElement save;
	
	@FindBy(xpath = "//button[@data-ng-click='form.save(true);']")
	public static WebElement saveAndClose;
	
	
	@FindBy(xpath = "//i[@class='icon-trash']")
	public static List<WebElement> deleteIcon;
	
	@FindBy(xpath = "//div[@translate='TABLE_HEADER.DESC']")
	public static WebElement formDesc;
	
	
	@FindBy(xpath = "//span[@data-ng-click='confirm.yes()']")
	public static WebElement deletebutton;
	
	@FindBy(xpath = "//span[@data-ng-click='form.cancel();']")
	public static WebElement cancel;
	
	@FindBy(xpath = "//span[@data-ng-click='confirm.yes()']")
	public static WebElement leaveButton;
	
	@FindBy(xpath = "//*[@data-target='#action-dropdown-1']")
	public static WebElement emptyEllipsisIcon;
	
	@FindBy(xpath = "//*[@data-target='#action-dropdown-2']")
	public static WebElement editedEllipsisIcon;
	
	@FindBy(xpath = "//*[@data-target='#action-dropdown-2']")
	public static WebElement copy_importedFormEllipsisIcon;
	
	@FindBy(xpath = "//i[@class='icon icon-ellipsis-v action-btn-icon']")
	public static WebElement importedEllipsisIcon;
	
	@FindBy(xpath = "//*[@data-target='#action-dropdown-2']")
	public static WebElement sanityEllipsisIcon;
	
	@FindBy(xpath = "//ul[@class='cs-table-body']")
	public static WebElement bodyOfContentListPage;

	@FindBy(xpath = "//span[@class='edit-icon']")
	public static WebElement editicon;
     	 
	@FindBy(xpath = "//*[@id='action-dropdown-1']/div[1]/span")
	public static WebElement exportLink;
     	 
	@FindBy(xpath = "//*[@id='action-dropdown-2']/div[2]/span")
	public static WebElement exportLink1;
	
	
	@FindBy(xpath = "//i[@class='icon-trash']")
	public static List<WebElement> deleteIcon1;
	
	
	@FindBy(xpath = "//*[@id='action-dropdown-2']/a[3]/span")
	public static WebElement delete;
	
	@FindBy(xpath = "//span[contains(.,'Copy Content Type')]")
	public static WebElement copyContentType;
	
	@FindBy(xpath = "//input[@data-ng-model='formCreate.form.title']")
	public static WebElement contentTypeTitle;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement createAndSave;
	
	@FindBy(xpath = "//span[@class='btn cs-btn-success left']")
	public static WebElement deleteOnWarningBox;
	
	@FindBy(xpath = "//img[@class='logo-normal']")
	public static WebElement logo;
	

	@FindBy(xpath = "//img[@class='icon-upload-image']")
	public static WebElement importIcon;
	
	@FindBy(xpath = "//div[@class='pipe-line']")
	public static WebElement importIconOnWarningBox;
	
	@FindBy(xpath = "//input[@name='content_type']")
	public static WebElement browse;
	
	@FindBy(xpath = "//button[@data-ng-click='upload()']")
	public static WebElement importedIconOnWarningBox;
	
	@FindBy(xpath = "//span[contains(.,'Imported Form')]")
	public static WebElement importedForm;
	
	@FindBy(xpath = "//span[contains(.,'sanity form')]")
	public static WebElement sanityForm;
	
	@FindBy(xpath = "//span[contains(.,'copy_of_Imported Form')]")
	public static WebElement copyOfImportedForm;

	@FindBy(xpath = "//*[@id='action-dropdown-0']/a/span")
	public static WebElement editForm;
	
	@FindBy(xpath = "//*[@id='action-dropdown-2']/a/span")
	public static WebElement editContentType;

	
	//Copy content
	
	
	@FindBy(xpath = "//input[@auto-select='true']")
	public static WebElement titleOfCopyForm;

	@FindBy(xpath = "//input[@data-ng-model='form.uid']")
	public static WebElement uniqId;

	@FindBy(xpath = "//label[contains(text(),'Title *')]")
	public static WebElement tilte;

	@FindBy(xpath = "//label[contains(text(),'URL *')]")
	public static WebElement url;

	@FindBy(xpath = "//label[contains(.,'Text_01 ')]")
	public static WebElement text1;

	@FindBy(xpath = "//label[contains(.,'Text_02 ')]")
	public static WebElement text2;

	@FindBy(xpath = "//label[contains(text(),'Text_03')]")
	public static WebElement text3;

	@FindBy(xpath = "//label[contains(text(),'Text_04')]")
	public static WebElement text4;

	@FindBy(xpath = "//label[contains(text(),'Text_05')]")
	public static WebElement text5;

	@FindBy(xpath = "//label[contains(text(),'Text_06')]")
	public static WebElement text6;

	@FindBy(xpath = "//label[@class='field-label ng-binding group-head']")
	public static WebElement group1;

	@FindBy(xpath = "//label[contains(.,'group_field')]")
	public static WebElement grptitle;

	@FindBy(xpath = "//label[contains(.,'GRP_RTE ')]")
	public static WebElement grpRte;

	@FindBy(xpath = "//label[contains(.,'GRP_upload ')]")
	public static WebElement grpUpload;

	@FindBy(xpath = "//label[contains(.,'Grp_number ')]")
	public static WebElement grpNumber;

	@FindBy(xpath = "//label[contains(.,'GRP_boolean ')]")
	public static WebElement grpboolean;

	@FindBy(xpath = "//label[contains(.,'UPLOADS ')]")
	public static WebElement uploads;

	@FindBy(xpath = "//label[contains(.,'Link_field ')]")
	public static WebElement link1;

	@FindBy(xpath = "//label[contains(.,'Date_field ')]")
	public static WebElement date1;

	@FindBy(xpath = "//label[contains(.,'Boolean ')]")
	public static WebElement booleanFiels;

	@FindBy(xpath = "//label[contains(.,'Number_field ')]")
	public static WebElement number1;

	@FindBy(xpath = "//span[contains(.,'Save')]")
	public static WebElement saveButton;


	
	//URl PATTERN
	
	@FindBy(xpath = "//span[@class='instruction-val ng-binding ng-scope']")
	public static WebElement defaultURl;
	
	@FindBy(xpath = "//div[@class='cs-checkbox']/label[1]/input")
	public static WebElement titlePattern;
	
	@FindBy(xpath = "//div[@class='cs-checkbox']/label[2]/input")
	public static WebElement dateAndTimePattern;
	
	@FindBy(xpath = "//div[@class='cs-checkbox']/label[3]/input")
	public static WebElement monthAndDatePattern;
	
	@FindBy(xpath = "//div[@class='cs-checkbox']/label[4]/input")
	public static WebElement customPattern;
	
	@FindBy(xpath = "//div[@class='cs-checkbox']/label[4]/input")
	public static WebElement disable;
	
	
	@FindBy(xpath = "//span[@class='pattern-preview mr-2 ng-binding ng-scope']")
	public static WebElement title;
	
	@FindBy(xpath = "//span[@data-ng-bind='form.title']")
	public static WebElement firstCT;
	
	@FindBy(xpath = "//span[contains(.,'copy_of_Ttile URl pattern')]")
	public static WebElement copyOFCT;
	
	@FindBy(xpath = "//*[@class='lbl']")
	public static List <WebElement>  redioButton;
	

	@FindBy(xpath = "//input[@placeholder='URL Prefix (optional)']")
	public static WebElement prefix;
	
	
	@FindBy(xpath = "//input[@data-ng-model='form.customPattern']")
	public static WebElement customUrlInputBox;
	
	
	
	
	
	
	//Entry
	
	
	@FindBy(xpath = "//input[contains(@name,'title')]")
	public static WebElement entrytitle;
	
	@FindBy(xpath = "//input[contains(@name,'url')]")
	public static WebElement entryurl;

	@FindBy(xpath = "//input[@name='multiple_single_line_0']")
	public static WebElement entrysingleLine;
	
	@FindBy(xpath = "//textarea[@name='multiple_multi_line_0']")
	public static WebElement multiline;
	
	@FindBy(xpath = "//i[@title='Edit']")
	public static WebElement titleEdit;
	
	@FindBy(xpath = "//*[@data-target='#action-dropdown-1']")
	public static WebElement secondCTEllipsisIcon;
	
	@FindBy(xpath = "//*[@data-target='#action-dropdown-0']")
	public static WebElement firstTEllipsisIcon;
	

	@FindBy(xpath = "//i[@title='Delete']")
	public static WebElement deleteCt;
	
	@FindBy(xpath = "//i[@title='Ok']")
	public static WebElement ok;

	@FindBy(xpath = "//*[@class='table-cell-column ng-scope']/span")
	public static WebElement urlTextOnentryListPage;
	
	@FindBy(xpath = "//*[@class='icon-ok ng-scope']")
	public static WebElement savebutton;
	
	@FindBy(xpath = "//input[@name='multiple_single_line_0']")
	public static WebElement EntrysingleLine;
	
	
	@FindBy(xpath = "//span[@data-ng-click='saveEntry.cancel()']")
	public static WebElement entryCancel;
	
	@FindBy(xpath = "//*[@class='cs-filters-list cs-publish-list']/div/span[2]")
	public static WebElement entryID;
	
	@FindBy(xpath = "//span[@class='invalid ng-binding']")
	public static WebElement errorMSZ;
	
	@FindBy(xpath = "//i[@class='icon-ok']")
	public static WebElement leave;
	
	
	@FindBy(xpath = "//span[contains(.,'verify URL patten')]")
	public static WebElement firstEntry;
	
	@FindBy(xpath = "//i[@class='icon icon-ellipsis-v action-btn-icon']")
	public static WebElement ellipssisIconOfEntry;
	
	@FindBy(xpath = "//img[@class='icon-export-image']")
	public static WebElement exportEntry;
	
	@FindBy(xpath = "//i[@title='Copy']")
	public static WebElement copyIcon;
	
	@FindBy(xpath = "//i[@title='Delete']")
	public static WebElement deleteEntry;
	
	@FindBy(xpath = "//input[@id='entryTitle']")
	public static WebElement entryTitle;
	

	@FindBy(xpath = "//*[@class='table-cell-column ng-scope']/span")
	public static WebElement copyiedEntryURL;
	
	@FindBy(xpath = "//*[@data-target='#action-dropdown-0']")
	public static WebElement CopiedEntryelipsesICon;
	
	
	
	
}

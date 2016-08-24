package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContentBlockObjects {

	

	@FindBy(xpath = "//img[@class='cs-plus-icon']")
	public static WebElement newContentType;
	
	
	@FindBy(xpath = "//img[@class='cs-plus-icon']")
	public static WebElement addNewForm;
	
	@FindBy(xpath = "//div[@class='btn cs-border-btn mt-10']")
	public static WebElement createWebPage;
	
	@FindBy(xpath = "//span[contains(.,'Content Block')]")
	public static WebElement createBlock;
	
	@FindBy(xpath = "//span[contains(.,'Sets (allow multiple entries e.g. media contacts)')]")
	public static WebElement createSet;

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
	
	
	@FindBy(xpath = "//*[@class='ngdialog-close']")
	public static WebElement popup;

	
	
	
	//Fields
	                 
	@FindBy(xpath = "//img[@src='https://contentstack-static.built.io/images/single_line.png']")
	public static WebElement singleLine;

	@FindBy(xpath = "//img[@src='https://contentstack-static.built.io/images/multi_line.png']")
	public static WebElement multipleFieled;
	                            
	@FindBy(xpath = "//img[@src='https://contentstack-static.built.io/images/rich_text_editor.png']")
	public static WebElement rte;
	
	@FindBy(xpath = "//img[@src='https://contentstack-static.built.io/images/markdown.png']")
	public static WebElement markDown;

	@FindBy(xpath = "//img[@src='https://contentstack-static.built.io/images/number.png']")
	public static WebElement number;
	
	@FindBy(xpath = "//img[@src='https://contentstack-static.built.io/images/boolean.png']")
	public static WebElement booleanfield;
	
	
	@FindBy(xpath = "//img[@src='https://contentstack-static.built.io/images/reference.png']")
	public static WebElement reference;
	
	@FindBy(xpath = "//img[@src='https://contentstack-static.built.io/images/group.png']")
	public static WebElement group;


	
	
/*	@FindBy(xpath = "//img[@src='https://stag-contentstack-static.built.io/images/single_line.png']")
	public static WebElement singleLine;

	@FindBy(xpath = "//img[@src='https://stag-contentstack-static.built.io/images/multi_line.png']")
	public static WebElement multipleFieled;
	                            
	@FindBy(xpath = "//img[@src='https://stag-contentstack-static.built.io/images/rich_text_editor.png']")
	public static WebElement rte;
	
	@FindBy(xpath = "//img[@src='https://stag-contentstack-static.built.io/images/markdown.png']")
	public static WebElement markDown;

	@FindBy(xpath = "//img[@src='https://stag-contentstack-static.built.io/images/number.png']")
	public static WebElement number;
	
	@FindBy(xpath = "//img[@src='https://stag-contentstack-static.built.io/images/boolean.png']")
	public static WebElement booleanfield;
	
	
	@FindBy(xpath = "//img[@src='https://stag-contentstack-static.built.io/images/reference.png']")
	public static WebElement reference;
	
	@FindBy(xpath = "//img[@src='https://stag-contentstack-static.built.io/images/group.png']")
	public static WebElement group;
	
	

	

	/*@FindBy(xpath = "//img[@src='http://static-dev.contentstack.io/images/single_line.png']")
	public static WebElement singleLine;

	@FindBy(xpath = "//img[@src='http://static-dev.contentstack.io/images/multi_line.png']")
	public static WebElement multipleFieled;
	                            
	@FindBy(xpath = "//img[@src='http://static-dev.contentstack.io/images/rich_text_editor.png']")
	public static WebElement rte;
	
	@FindBy(xpath = "//img[@src='http://static-dev.contentstack.io/images/markdown.png']")
	public static WebElement markDown;

	@FindBy(xpath = "//img[@src='http://static-dev.contentstack.io/images/number.png']")
	public static WebElement number;
	
	@FindBy(xpath = "//img[@src='http://static-dev.contentstack.io/images/boolean.png']")
	public static WebElement booleanfield;
	
	
	@FindBy(xpath = "//img[@src='http://static-dev.contentstack.io/images/reference.png']")
	public static WebElement reference;
	
	@FindBy(xpath = "//img[@src='http://static-dev.contentstack.io/images/group.png']")
	public static WebElement group;
	
*/
	
	
	
	
	
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
	public static WebElement cancelEntry;
	
	@FindBy(xpath = "//span[@data-ng-click='confirm.yes()']")
	public static WebElement leaveButton;
	
	@FindBy(xpath = "//*[@data-target='#action-dropdown-1']")
	public static WebElement emptyEllipsisIcon;
	
	@FindBy(xpath = "//*[@data-target='#action-dropdown-2']")
	public static WebElement editedEllipsisIcon;
	
	@FindBy(xpath = "//*[@data-target='#action-dropdown-2']")
	public static WebElement copy_importedFormEllipsisIcon;
	
	@FindBy(xpath = "//*[@data-target='#action-dropdown-1']")
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
		
	
	
	@FindBy(xpath = "//input[@data-ng-model='formCreate.form.title']")
	public static WebElement contentTypeTitle;
	

	@FindBy(xpath = "//span[@class='btn cs-btn-success left']")
	public static WebElement deleteOnWarningBox;
	
	@FindBy(xpath = "//img[@class='icon-upload-image']")
	public static WebElement importIcon;
	
	@FindBy(xpath = "//div[@class='pipe-line']")
	public static WebElement importIconOnWarningBox;
	
	@FindBy(xpath = "//input[@name='content_type']")
	public static WebElement browse;
	
	@FindBy(xpath = "//input[@name='file']")
	public static WebElement browse1;
	
	@FindBy(xpath = "//span[contains(.,'Imported Form')]")
	public static WebElement importedForm;
	
	@FindBy(xpath = "//span[contains(.,'sanity form')]")
	public static WebElement sanityForm;
	
	@FindBy(xpath = "//span[contains(.,'copy_of_Imported Form')]")
	public static WebElement copyOfImportedForm;

	@FindBy(xpath = "//span[contains(.,'Edited contenttype')]")
	public static WebElement editForm;
	


	
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

	@FindBy(xpath = "//button[@data-ng-click='form.save();']")
	public static WebElement saveButton1;
	
	
	//search 
	
	@FindBy(xpath = "//input[@placeholder='Search content types']")
	public static WebElement searchAllContentType;
	
	@FindBy(xpath = "//i[@class='icon-close']")
	public static WebElement clodeIcon;
	
	//pagination
	
	@FindBy(xpath = "//label[contains(.,'Showing 3 Content Types')]")
	public static WebElement pagination;
	
	//Label view
	
	@FindBy(xpath = "//span[contains(.,'Apply Label')]")
	public static WebElement applyLableFor;
	
	@FindBy(xpath = "//label[contains(.,'Create Label')]")
	public static WebElement createNewLbel;
	
	@FindBy(xpath = "//input[@placeholder='Enter Label Name']")
	public static WebElement labelName;

	@FindBy(xpath = "//label[contains(.,'Create Label')]")
	public static WebElement createNewLable;
	

	@FindBy(xpath = "//div[@class='ngdialog-close']")
	public static WebElement labelClose;
	
	
	@FindBy(xpath = "//button[@data-ng-click='saveLabel.apply = true;']")
	public static WebElement createApply;

	@FindBy(xpath = "//button[@data-ng-if='saveLabel.isEdit']")
	public static WebElement editLabelsvaeButton;

	@FindBy(xpath = "//span[@data-ng-if='setSelected']")
	public static WebElement alphabetical;

	@FindBy(xpath = "//label[contains(.,'Alphabetical')]")
	public static WebElement alphabeticalview;

	
	@FindBy(xpath = "//label[contains(.,'Label')]")
	public static WebElement labeloption;

	@FindBy(xpath = "//div[@translate='TABLE_HEADER.TITLE']")
	public static WebElement formTitle;
	
	
	@FindBy(xpath = "//div[@translate='TABLE_HEADER.MODIFIED']")
	public static WebElement modifyAt;

	@FindBy(xpath = "//span[contains(.,'Manage Label')]")
	public static WebElement manageLabel;
	
	@FindBy(xpath = "//label[contains(.,'Sanity label')]")
	public static WebElement sanityLabel;
	
	@FindBy(xpath = "//span[contains(.,'Empty form')]")
	public static WebElement emptyForm;
	
	@FindBy(xpath = "//h2[contains(.,'No Labels')]")
	public static WebElement noLabels;

	@FindBy(xpath = "//label[contains(.,'Apply')]")
	public static WebElement apply;
	
	@FindBy(xpath = "//span[@id='label-create-btn']")
	public static WebElement newLabel;
	
	
	@FindBy(xpath = "//button[@data-ng-if='!saveLabel.isEdit']")
	public static WebElement createLabel;
	
	@FindBy(xpath = "//i[@class='icon-pencil mr-5']")
	public static List<WebElement> labelEditIcon;
	
	
	@FindBy(xpath = "//div[@id='manage-label']/div[2]/ul/li/div/div/ul/li/ul/li/div/h2/span/i[2]")
	public static WebElement labelDeleteIcon;
	
	@FindBy(xpath = "//span[@data-ng-click='confirm.yes()']")
	public static WebElement deleteOnWarningbox;
	
	
	
	//Entry
	
	
	
	@FindBy(xpath = "//img[@class='cs-plus-icon']")
	public static WebElement addNewEntry1;
	
	@FindBy(xpath = "//input[contains(@name,'title')]")
	public static WebElement entryTitle;
	

	@FindBy(xpath = "//textarea[@name='multiple_multi_line_0']")
	public static WebElement multilineEntry;
	
	
	
	@FindBy(xpath = "//a[@aria-label='Insert Image']")
	public static WebElement Entry;


	

	//@FindBy(xpath = "//*[@id='wmd-image-button-1']")
	//public static WebElement mardownImg;

	@FindBy(xpath = "//*[@class='wmd-button']")
	public static List<WebElement> mardownImgEntry;

	
	
	@FindBy(xpath = "//*[@class='icon-eye-open']")
	public static WebElement preview;
	
	@FindBy(xpath = "//img[@alt='enter image description here']")
	public static WebElement imgverify;
	
	
	
	@FindBy(xpath = "//button[contains(.,'Now')]")
	public static WebElement now;
	
	
	
	
	//New
	
	
	
	@FindBy(xpath = "//span[@data-ng-bind='form.title']")
	public static WebElement firstCT;
	
	@FindBy(xpath = "//*[@data-target='#action-dropdown-0']")
	public static WebElement EllipsisIcon;

	@FindBy(xpath = "//*[@id='action-dropdown-0']/a[2]/span")
	public static WebElement copyCT;
	
	@FindBy(xpath = "//img[@title='Export']")
	public static WebElement exportCT;
	
	@FindBy(xpath = "//*[@data-target='#action-dropdown-1']")
	public static WebElement secondCTEllipsisIcon;
	
	@FindBy(xpath = "//button[@data-ng-click='form.save(true);']")
	public static WebElement createAndSave;
	
	@FindBy(xpath = "//*[@id='action-dropdown-1']/a[3]/span")
	public static WebElement deleteCt;
	
	@FindBy(xpath = "//*[@id='action-dropdown-0']/a[3]/span")
	public static WebElement delete1;
	
	
	
	@FindBy(xpath = "//span[contains(.,'copy_of_ContentBlockSingleImportedForm')]")
	public static WebElement secondCT;
	
	
	@FindBy(xpath = "//span[contains(.,'copy_of_ContentBlockMultipleImportedForm')]")
	public static WebElement secondCTForMultipleCT;
	
	@FindBy(xpath = "//span[contains(.,'copy_of_singleImported Form')]")
	public static WebElement secondCTForSingleWebPage;
	
	@FindBy(xpath = "//span[contains(.,'copy_of_Imported Form')]")
	public static WebElement secondCTForMultipleWebPage;
	
	@FindBy(xpath = "//*[@id='action-dropdown-0']/a[2]/span")
	public static WebElement copyContentType;
	
	@FindBy(xpath = "//button[@data-ng-if='!formCreate.isEdit']")
	public static WebElement addFiedls;
	
	@FindBy(xpath = "//*[@class='ngdialog-close']")
	public static WebElement popup1;

	@FindBy(xpath = "//*[@id='action-dropdown-1']/a/span")
	public static WebElement editContentType;
	
	@FindBy(xpath = "//button[@data-ng-if='formCreate.isEdit']")
	public static WebElement upDate;
	
	//Copy content type
	
	
	
	
	
	//=======================================Entry Objects=======================================
	
	
	//Entry Objects
	
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.CONTENT']")
	public static WebElement contentType;

	@FindBy(xpath = "//span[contains(.,'SingleContentblock')]")
	public static WebElement singleContentBlock;
	
	@FindBy(xpath = "//span[contains(.,'SetContentblock')]")
	public static WebElement setContentBlock;
	
	@FindBy(xpath = "//span[contains(text(),'Imported Form')]")
	public static WebElement imported;
	
	@FindBy(xpath = "//img[@class='cs-plus-icon']")
	public static WebElement addNewEntry;
	
	@FindBy(xpath = "//input[contains(@name,'title')]")
	public static WebElement title;
	
	@FindBy(xpath = "//input[contains(@name,'url')]")
	public static WebElement entryurl;

	@FindBy(xpath = "//input[@name='multiple_single_line_0']")
	public static WebElement entrySingleLine;
	
	@FindBy(xpath = "//textarea[@name='multiple_multi_line_0']")
	public static WebElement multiline;
	
	@FindBy(xpath = "//div[@class='redactor-editor']")
	public static WebElement entryRte;
	
	@FindBy(xpath = "//a[@aria-label='Insert Image']")
	public static WebElement rteImg;



	@FindBy(xpath = "//textarea[@name='multiple_markdown_0']")
	public static WebElement entryMarkDown;

	//@FindBy(xpath = "//*[@id='wmd-image-button-1']")
	//public static WebElement mardownImg;

	@FindBy(xpath = "//*[@class='wmd-button']")
	public static List<WebElement> mardownImg;

	
	@FindBy(xpath = "//input[@type='number']")
	public static WebElement numberEntry;

	@FindBy(xpath = "//input[@placeholder='Date [yyyy-mm-dd]']")
	public static WebElement dateEntry;
	
	
	@FindBy(xpath = "//input[@data-ng-model='field.value.title']")
	public static WebElement linkTitleInGroup;
	
	@FindBy(xpath = "//input[@data-ng-model='field.value.href']")
	public static WebElement linkUrl;

	@FindBy(xpath = "//span[@class='lbl']")
	public static WebElement booleanField;

	@FindBy(xpath = "//span[@class='btn btn-default form-control ui-select-toggle']")
	public static WebElement searchReference;
	
	@FindBy(xpath = "//input[@placeholder='Search Reference']")
	public static WebElement searchedEntry1;
	
	@FindBy(xpath = "//div[@class='ng-binding ng-scope']")
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
	public static WebElement saveEntry;

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
	
	@FindBy(xpath = "//button[@data-ng-click='upload()']")
	public static WebElement importedIconOnWarningBox1;
	
	
	
	//@FindBy(xpath = "//*[@class='table-cell-column min-w300']/span")
	//public static WebElement importedEntry;
	
	@FindBy(xpath = "//div[@class='table-cell-column min-w300']/span")
	public static WebElement importedEntry;
	
	
	
	
	@FindBy(xpath = "//span[@class='ng-binding']")
	public static WebElement importedEntry1;
	
	@FindBy(xpath = "//input[@name='text_01']")
	public static WebElement text1Entry;
	
	@FindBy(xpath = "//input[@name='multiple_text_03_0']")
	public static WebElement text2Entry;
	
	@FindBy(xpath = "//input[@name='entry']")
	public static WebElement browseEntry;

	@FindBy(xpath = "//button[@data-ng-click='upload()']")
	public static WebElement importedicon;
	
	@FindBy(xpath = "//div[@class='ui-pnotify-text']")
	public static List <WebElement> successMessage;
	
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
	public static WebElement uploadsEntry;

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
	
	@FindBy(xpath = "//span[contains(.,'Copy of Imported Entry')]")
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
	
	
	@FindBy(xpath = "//h3[contains(.,'Localise Entry')]")
	public static WebElement  headingOfLocaliseEntrywarningBox;

	@FindBy(xpath = "//span[@data-ng-click='confirm.yes()']")
	public static WebElement  saveOnwarningBox;
	
	@FindBy(xpath = "//div[@class='table-cell w-30']/span[2]")
	public static WebElement  languageNameIOnEntrylistPage;
	
	
	//Audit-logs
	
	
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
	
	
	
	
	
	
	
	
	
	
	
}

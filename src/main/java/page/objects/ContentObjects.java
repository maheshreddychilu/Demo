package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContentObjects {
	
	@FindBy(xpath = "//span[contains(.,' AUDIT LOG')]")
	public static WebElement auditLogIcon;

	@FindBy(xpath = "//img[@class='cs-plus-icon']")
	public static WebElement newContentType;
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.CONTENT']")
	public static WebElement contentType;
	
	@FindBy(xpath = "//img[@class='cs-plus-icon']")
	public static WebElement addNewForm;
	
	@FindBy(xpath = "//div[@class='btn cs-border-btn mt-10']")
	public static WebElement createWebPage;
	
	@FindBy(xpath = "//span[contains(.,'Content Block')]")
	public static WebElement createBlock;
	
	@FindBy(xpath = "//span[contains(.,'Multiple (allows to create multiple entries, e.g., blog posts, press releases)')]")
	public static WebElement createMultipleCt;

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

	
	//Fields
	                 
  /* @FindBy(xpath = "//img[@src='https://contentstack-static.built.io/images/single_line.png']")
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
*/

	
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



	
/*
   @FindBy(xpath = "//img[@src='http://static-dev.contentstack.io/images/single_line.png']")
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
	public static WebElement cancel;
	
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
	
	
	@FindBy(xpath = "//*[@id='action-dropdown-2']/a[3]/span")
	public static WebElement delete;
	
	@FindBy(xpath = "//*[@id='action-dropdown-1']/a[2]/span")
	public static WebElement copyContentType;
	
	@FindBy(xpath = "//input[@data-ng-model='formCreate.form.title']")
	public static WebElement contentTypeTitle;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement createAndSave;
	
	@FindBy(xpath = "//span[@class='btn cs-btn-success left']")
	public static WebElement deleteOnWarningBox;
	
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

	@FindBy(xpath = "//span[contains(.,'Edited contenttype')]")
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
	
	
	@FindBy(xpath = "//h2[@class='ng-binding']")
	public static WebElement sanityLabelPage;
	
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
	
	
	
	
	
}

package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReferenceObjects {

	@FindBy(xpath = "//span[@translate='NAV_BAR.CONTENT']")
	public static WebElement contentType;
	
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

	
	
	//entry 
	
	@FindBy(xpath = "//img[@class='cs-plus-icon']")
	public static WebElement addNewEntry;
	
	@FindBy(xpath = "//input[contains(@name,'title')]")
	public static WebElement title;
	
	@FindBy(xpath = "//input[contains(@name,'url')]")
	public static WebElement url;
	
	@FindBy(xpath = "//input[@name='text_01']")
	public static WebElement text1;
	
	@FindBy(xpath = "//input[@name='multiple_text_03_0']")
	public static WebElement text2;
	
	@FindBy(xpath = "//*[@class='icon-ok ng-scope']")
	public static WebElement saveEntry;

	@FindBy(xpath = "//button[@data-ng-click='saveEntry.remove()']")
	public static WebElement delete;

	@FindBy(xpath = "//span[@data-ng-click='saveEntry.cancel()']")
	public static WebElement cancel;
	
	@FindBy(xpath = "//div[@class='ui-pnotify-text']")
	public static List <WebElement> successMessage;
	
	@FindBy(xpath = "//div[@class='ui-pnotify-text']")
	public static WebElement successMessage1;
	
	@FindBy(xpath = "//span[contains(text(),'Imported Form')]")
	public static WebElement imported;
	
	
	
	
	
	
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
	

	
	@FindBy(xpath = "//*[@class='ngdialog-close']")
	public static WebElement popup;

	
	//==================fields
	
	
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
	
	@FindBy(xpath = "//span[contains(.,'Select Content Type')]")
	public static WebElement selectCtForreference;
	

	@FindBy(xpath = "//label[@class='lbl ng-binding ng-scope']")
	public static WebElement refrenceCt;
	
	
	
	@FindBy(xpath = "//img[@data-field-name='Group']")
	public static WebElement group;
	
	@FindBy(xpath = "//i[@class='icon-calendar']")
	public static WebElement dateCt;
	
	
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
	
	@FindBy(xpath = "//button[@data-ng-click='form.save();']")
	public static WebElement save;
	
	
	
	
	//==============Entry objects
	
	
	//Entry
	
			
			@FindBy(xpath = "//span[@class='lbl']")
			public static WebElement booleanField;
			
			@FindBy(xpath = "//input[@placeholder='Date [yyyy-mm-dd]']")
			public static WebElement dateEntry;
	
			@FindBy(xpath = "//button[contains(.,'Now')]")
			public static WebElement now;
			
			@FindBy(xpath = "//button[contains(.,'Done')]")
			public static WebElement done;

			@FindBy(xpath = "//input[@data-ng-model='multiple.title']")
			public static WebElement linkTitleEntry;
			
			@FindBy(xpath = "//input[@data-ng-model='multiple.href']")
			public static WebElement linkValue;

			@FindBy(xpath = "//span[@data-ng-bind='form.title']")
			public static WebElement firstCt;
			
			@FindBy(xpath = "//input[@type='number']")
			public static WebElement numberEntry;
			
			@FindBy(xpath = "//input[@name='multiple_single_line_0']")
			public static WebElement singleLineEntry;
			
			@FindBy(xpath = "//textarea[@data-ng-model='multiple.key']")
			public static WebElement multilineEntry;
			
			@FindBy(xpath = "//span[contains(.,'Save')]")
			public static WebElement saveButton;
			
			@FindBy(xpath = "//span[@data-ng-click='saveEntry.cancel()']")
			public static WebElement entryCancel;
	
			@FindBy(xpath = "//span[@class='ui-select-placeholder text-muted ng-binding']")
			public static WebElement clickToSelect;
			
			@FindBy(xpath = "//input[@aria-label='Select box']")
			public static WebElement startTypingToSearch;
			
			@FindBy(xpath = "//*[@id='ui-select-choices-row-0-1']/a")
			public static WebElement entry1;
			
			@FindBy(xpath = "//*[@id='ui-select-choices-row-0-2']/a")
			public static WebElement entry2;
			
			@FindBy(xpath = "//span[contains(.,'Contenttype A')]")
			public static WebElement contenttypeA;
			
			
			
			
			
			
			
			
			
			
			
			
			
}

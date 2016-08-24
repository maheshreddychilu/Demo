package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PublishModalObjects {
	
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
	
			@FindBy(xpath = "//input[contains(@name,'title')]")
			public static WebElement title;
			
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
	
	//=========================================================
			
			
			@FindBy(xpath = "//img[@class='cs-plus-icon']")
			public static WebElement add;
			
			@FindBy(xpath = "//span[contains(.,'Select Language')]")
			public static WebElement languageName;

			@FindBy(xpath = "//span[contains(.,'English  (United States) ')]")
			public static WebElement english;

			@FindBy(xpath = "//span[contains(.,'Default Language')]")
			public static WebElement defaultLanguage;

			@FindBy(xpath = "//div[@data-ng-bind='locale.locale_uid']")
			public static WebElement languageCode;
			
			@FindBy(xpath = "//input[@placeholder='Search Languages']")
			public static WebElement searchlanguage;
			
			@FindBy(xpath = "//label[@class='lbl ng-binding ng-scope']")
			public static WebElement selectLanguage;
			
			@FindBy(xpath = "//button[@class='btn cs-btn-success btn-large left']")
			public static WebElement addLanguage;
			
			@FindBy(xpath = "//*[contains(text(),'English  (Australia) ')]")
			public static WebElement addedLanguges;

			@FindBy(xpath = "//*[@data-target='#action-dropdown-3']")
			public static WebElement ellipsisOflan;
				
			@FindBy(xpath = "//*[@class='icon-trash bigger-160']")
			public static List<WebElement> deletelan1;
			
			@FindBy(xpath = "//span[@data-ng-click='env.yes()']")
			public static WebElement deleteButtonOfWarningDailogbox;
			
			@FindBy(xpath = "//span[@data-ng-click='language.yes()']")
			public static WebElement deleteButtonOfWarningDailogboxforlang;
			
			@FindBy(xpath = "//input[@placeholder='Search languages']")
			public static WebElement searchAllLanguages;
			
			@FindBy(xpath = "//*[contains(text(),'English  (Australia)')]")
			public static WebElement searchedLanguage;
			
			@FindBy(xpath = "//i[@class='icon-close']")
			public static WebElement searchCloseButton;
			
			@FindBy(xpath = "//span[@translate='NAV_BAR.SETTINGS']")
			public static WebElement settingsMenu;
			
			@FindBy(xpath = "//a[@translate='NAV_BAR.LANGUAGES']")
			public static WebElement languagesLink;
			
	//=============Localize entry
	
	
			@FindBy(xpath = "//*[@class='cs-filters-list cs-publish-list']/div/span[2]")
			public static WebElement  entryID;
			
			@FindBy(xpath = "//label[contains(.,'English  (United States)')]")
			public static WebElement  enUS;
			
			@FindBy(xpath = "//i[@class='icon-chevron-down']")
			public static WebElement  dropDownICon;
			
			
			
			
			
			
			@FindBy(xpath = "//label[contains(.,'Japanese  (Japan)')]")
			public static WebElement  jaJp;
			
			@FindBy(xpath = "//label[contains(.,'Telugu  (India)')]")
			public static WebElement  telugu;
				
			@FindBy(xpath = "//span[@data-ng-if='setSelected']")
			public static WebElement  localeDropdwon;
			
			@FindBy(xpath = "//h3[contains(.,'Localise Entry')]")
			public static WebElement  headingOfLocaliseEntrywarningBox;

			@FindBy(xpath = "//span[@data-ng-click='confirm.yes()']")
			public static WebElement  saveOnwarningBox;
			
			@FindBy(xpath = "//span[@class='locale-name ng-binding ng-scope']")
			public static WebElement  languageNameIOnEntrylistPage;
			
			@FindBy(xpath = "//button[contains(.,'Save')]")
			public static WebElement saveEntry;
			
			@FindBy(xpath = "//button[@data-ng-if='saveEntry.roles.publish']")
			public static WebElement publishButton;
			
			
	
			
	//====================Environments		
			
			
			@FindBy(xpath = "//input[@auto-focus='focusHere']")
			public static WebElement envName;
			
			@FindBy(xpath = "//input[@placeholder='Enter environment base URL']")
			public static WebElement envUrl;

			@FindBy(xpath = "//img[@data-ng-click='env.addPreviewUrl($index)']")
			public static WebElement serverPlus;

			@FindBy(xpath = "//button[@type='submit']")
			public static WebElement create;

			@FindBy(xpath = "//span[contains(.,'Advance')]")
			public static WebElement advced;
			
			@FindBy(xpath = "//span[contains(.,'Deploy Content to Server(s)')]")
			public static WebElement serversCheckBox;
			
			@FindBy(xpath = "//div[contains(text(),'stag')]")
			public static WebElement stagEnv;
			
			@FindBy(xpath = "//div[contains(text(),'blank')]")
			public static WebElement blankEnv;
				
			@FindBy(xpath = "//a[@translate='NAV_BAR.ENVIRONMENTS']")
			public static WebElement environmentsLink;
			
			@FindBy(xpath = "//a[@class='btn cs-btn-success ng-scope']")
			public static WebElement addNewEnvOnEnvPage;
			
			
			
			//================ Publish modal
			
	
			@FindBy(xpath = "//div[@class='ng-binding']")
			public static WebElement publishModalTitle;
			
			@FindBy(xpath = "//a[@class='selectall ng-scope']")
			public static WebElement selectAllUnlocalizedLan;
			
			@FindBy(xpath = "//*[@id='lang-en-us']")
			public static WebElement englishLocale;
			
			@FindBy(xpath = "//*[@id='lang-en-au']")
			public static WebElement englishAUS;
			
			@FindBy(xpath = "//*[@class='cs-checkbox checkbox-disabled']")
			public static WebElement jajp;
			
			@FindBy(xpath = "//*[@class='language-border scroll-bar-design']/li[4]/div[1]")
			public static WebElement teluguLocale;
			
			@FindBy(xpath = "//span[@class='circle-mm']")
			public static WebElement mHelpTExt;
			
			@FindBy(xpath = "//span[@class='circle-lm']")
			public static WebElement lHelpTExt;
			
			@FindBy(xpath = "//div[@class='popover-content']")
			public static WebElement lHelpTExtDes;
			
			@FindBy(xpath = "//button[@type='submit']")
			public static WebElement publishButtonOnModal;

			
		//Unlocalise
			
			@FindBy(xpath = "//button[@data-ng-click='saveEntry.unlocalize()']")
			public static WebElement unlocalizeButton;
			
			@FindBy(xpath = "//h3[@id='ngdialog2-aria-labelledby']")
			public static WebElement unlocalise;
			
			@FindBy(xpath = "//span[contains(.,'Unlocalizing the entry will cause it to fetch data from the master language. Are you sure you want to continue?')]")
			public static WebElement unlocaliseMsz;
			                  
			@FindBy(xpath = "//h3[contains(.,'Unlocalise Entry')]")
			public static WebElement titleOFunlocalizeModal;
			
			@FindBy(xpath = "//span[@data-ng-click='confirm.yes()']")
			public static WebElement unlocalizeButtonOnmodal;

			@FindBy(xpath = "//span[@data-placement='bottom']")
			public static WebElement unlocalizeButtonOnentryPage;	
			
			@FindBy(xpath = "//div[@class='ngdialog-close']")
			public static WebElement closePopUp;	
			
			
			
}

package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.built.io.automationframework.Driver;

public class AssetObjects {

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
	
	@FindBy(xpath = "//input[@maxlength='50']")
	public static WebElement tags1;
	
	@FindBy(xpath = "//*[@class='icon-ok ng-scope']")
	public static WebElement save;
	

	@FindBy(xpath = "//div[@class='ui-pnotify-text']")
	public static List <WebElement> successMessage;
	

	
	
	@FindBy(xpath = "//span[@title='char.jpg']")
	public static WebElement jpg;

	@FindBy(xpath = "//span[@title='contentstack.mp3']")
	public static WebElement mp3;

	@FindBy(xpath = "//span[@title='Freesample.svg']")
	public static WebElement svg;

	@FindBy(xpath = "//span[@title='IMG_8186.mp4']")
	public static WebElement mp4;

	@FindBy(xpath = "//span[@title='ImportForm.json']")
	public static WebElement json;

	@FindBy(xpath = "//span[@title='malnutrition_small.pcx']")
	public static WebElement pcx;

	@FindBy(xpath = "//span[@title='malnutrition_small.pgm']")
	public static WebElement pgm;

	@FindBy(xpath = "//span[@title='malnutrition_small.ras']")
	public static WebElement ras;

	@FindBy(xpath = "//span[contains(@title,'markdownsampleCode.txt')]")
	public static WebElement txt;

	@FindBy(xpath = "//span[@title='NewNameForm.pdf']")
	public static WebElement pdf;

	@FindBy(xpath = "//span[@title='Blog.docx']")
	public static WebElement doc;
	

	@FindBy(xpath = "//span[@title='Dhaval.jpg']")
	public static WebElement dhaval;
	
	@FindBy(xpath = "//span[@title='report.html']")
	public static WebElement html;
	
	@FindBy(xpath = "//span[@title='testdata.xls']")
	public static WebElement xls;
	
	@FindBy(xpath = "//span[@title='Contentstack.pptx']")
	public static WebElement ppt;
	
	
	@FindBy(xpath = "//span[@title='XENU.ZIP']")
	public static WebElement zip;
	
	@FindBy(xpath = "//i[@class='icon-chevron-right']")
	public static WebElement paginationIcon;
	
	
	
	@FindBy(xpath = "//input[@placeholder='Search assets']")
	public static WebElement searchInput;

	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/div[3]/ul[2]/li/div/div[1]/div[1]/div/span[1]")
	public static WebElement searchedAsset;
	
	@FindBy(xpath = "//i[@class='icon-close']")
	public static WebElement searchCloseButton;
	
	@FindBy(xpath = "//button[contains(.,'Delete')]")
	public static WebElement delete;

	
	
	
	@FindBy(xpath = "//span[@class='btn cs-btn-success left']")
	public static WebElement yes;
	
	@FindBy(xpath = "//button[contains(.,'Update')]")
	public static WebElement update;
	
	@FindBy(xpath = "//*[@class='icon-globe ng-scope']")
	public static WebElement publsih;
	

	@FindBy(xpath = "//span[@title='blank']")
	public static WebElement blank;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement publsihButtonOnpopup;
	
	
	@FindBy(xpath = "//div[@data-target='#action-dropdown-0']/i")
	public static WebElement assetsEllipsis;
	
	@FindBy(xpath = "//span[@class='file-name ng-binding']")
	public static WebElement downLoadedFile;
	
	
	@FindBy(xpath = "//*[@id='action-dropdown-0']/a[3]/span")
	public static WebElement download;
	
	@FindBy(xpath = "//*[@id='data_field']/li[1]/div[1]/div[1]/div[1]/span")
	public static WebElement xemZip;

	@FindBy(xpath = "//button[@class='btn btn-sm btn-white']")
	public static WebElement searchButton;

	@FindBy(xpath = "//a[contains(.,' Images')]")
	public static WebElement images;

	@FindBy(xpath = "//a[contains(.,' Videos')]")
	public static WebElement videos;

	@FindBy(xpath = "//a[contains(.,' All')]")
	public static WebElement all;

	@FindBy(xpath = "//span[contains(.,'download.jpg')]")
	public static WebElement downloadJpg;


	//filter
	
	@FindBy(xpath = "//span[contains(.,'Audio')]")
	public static WebElement audio;
	
	@FindBy(xpath = "//span[contains(.,'Documents')]")
	public static WebElement document;
	
	@FindBy(xpath = "//span[contains(.,'Images')]")
	public static WebElement image;
	
	
	@FindBy(xpath = "//span[contains(.,'PDFs')]")
	public static WebElement pdf1;
	
	@FindBy(xpath = "//span[contains(.,'Videos')]")
	public static WebElement video;
	
	
	@FindBy(xpath = "//span[contains(.,'Presentations')]")
	public static WebElement presentations;
	
	@FindBy(xpath = "//span[contains(.,'Spreadsheets')]")
	public static WebElement spreadsheet;
	

	@FindBy(xpath = "//span[contains(.,'Plain Text')]")
	public static WebElement plainText;
	
    
	//Tags
	
	@FindBy(xpath = "//span[contains(.,'xls')]")
	public static WebElement xlsTag;
	
	@FindBy(xpath = "//span[@class='lbl ng-binding']")
	public static WebElement pptTag;
	
	@FindBy(xpath = "//input[@placeholder='Search Tag']")
	public static WebElement searchTAg;
	
}

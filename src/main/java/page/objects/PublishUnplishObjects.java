package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PublishUnplishObjects {
	
	@FindBy(xpath = "//span[contains(.,'Verify Publishing Activities')]")
	public static WebElement verifyPublishApp;
	
	@FindBy(xpath = "//a[@href='#!/stack/blt78ae3882ac59091a/content-types']")
	public static WebElement verifyPublishAppOpen;

	
	@FindBy(xpath = "//span[contains(.,'Imported Entry')]")
	public static WebElement importedEntry;
	
	@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/ul[2]/li/div/i")
	public static WebElement ellipsisIcon;

/*	@FindBy(xpath = "//i[@class='icon-globe ng-scope']")
	public static WebElement publish;
	
	@FindBy(xpath = "//i[@class='icon-globe ng-scope']")
	public static WebElement publish;
	
	@FindBy(xpath = "//i[@class='icon-globe ng-scope']")
	public static WebElement publish;*/
	
}

package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderAndFooterObjects {
	
  //Header
	
	@FindBy(xpath = "//img[@title='Built.io.Contentstack']")
	public static WebElement logo;

	@FindBy(xpath = "//span[@data-ng-bind='stk.stack.name;']")
	public static WebElement stackName;
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.CONTENT']")
	public static WebElement forms;
	
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.ASSETS']")
	public static WebElement assets;
	
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.PUBLISH_QUEUE']")
	public static WebElement publishQueue;
	
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.AUDIT_LOG']")
	public static WebElement auditLog;
	
	@FindBy(xpath = "//span[@translate='NAV_BAR.SETTINGS']")
	public static WebElement settings;
	
	@FindBy(xpath = "/static/images/globe-icon.png")
	public static WebElement community;
	
	@FindBy(xpath = "//span[contains(@class,'user-name ng-binding')]")
	public static WebElement userName;
	
	@FindBy(xpath = "//a[contains(.,'Credentials')]")
	public static WebElement userCredentials;
	
	@FindBy(xpath = "//a[contains(.,'Billing')]")
	public static WebElement userbilling;
	
	@FindBy(xpath = "//img[@src='/static/images/help-icon-header.png']")
	public static WebElement helpLink;
	
	@FindBy(xpath = "//a[contains(.,'Profile')]")
	public static WebElement userProfile;
	
	
	@FindBy(xpath = "//img[@src='/static/images/globe-icon.png']")
	public static WebElement documentsLink;
	
	@FindBy(xpath = "//a[contains(.,'Sign Out')]")
	public static WebElement userSignOut;
	
	
 //Footer
	
	@FindBy(xpath = "//a[@href='mailto:support-contentstack@built.io']")
	public static WebElement support;
	
	@FindBy(xpath = "//a[@href='http://built.io/privacy.html']")
	public static WebElement privacy;
	
	@FindBy(xpath = "//a[contains(.,'Terms')]")
	public static WebElement terms;
	
	@FindBy(xpath = "//span[@class='copy-right']")
	public static WebElement copyRight;
	
	
	
}

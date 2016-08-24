package page.objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.built.io.automationframework.Driver;


public class LoginPageObjects {

	@FindBy(xpath = "//input[@id='email']")
	public static WebElement username;

	@FindBy(xpath = "//input[@id='pw']")
	public static WebElement password;

	@FindBy(xpath = "//button[@class='btn cs-btn-success enable ng-scope']")
	public static WebElement signin;
	
	@FindBy(xpath = "//a[@class='cs-link forget-pw ng-scope']")
	public static WebElement forgotPassword;
	
	@FindBy(xpath = "//a[@class='btn cs-btn-success learn-more ng-scope']")
	public static WebElement learnMore;
	
	@FindBy(xpath = "//span[contains(.,' AUDIT LOG')]")
	public static WebElement auditLogIcon;
	
	@FindBy(xpath = "//a[@class='cs-link']")
	public static WebElement signUp;
	
	@FindBy(xpath = "//a[contains(.,'terms & conditions')]")
	public static WebElement termAndCondition;
	
	@FindBy(xpath = "//a[contains(.,'privacy policy')]")
	public static WebElement privacy;
	
	@FindBy(xpath = "//a[@data-site-name='Test Site']")
	public static WebElement sinteName;
	
	@FindBy(xpath = "//img[@class='cs-plus-icon']")
	public static WebElement formICON;
	
}

	

package com.built.io.automationframework;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import page.actions.URLpatternActions;
import page.objects.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {
	public static ExtentTest extentTest;
	public static String baseDir;   
	public static String screenshotDirName;
	public static WebDriver driver; 
	public static ExtentReports report = null;
	public static ExcelUtils xlsUtil;

	@Parameters({ "environment", "browser", "url", "baseDirPath","platform",
			"screenshotDirName"})
	@BeforeSuite
	public static void setup(String environment, String browser, String url,
			String baseDirPath, String platform, String screenshotfolderName) throws Exception {
		baseDir = baseDirPath;
		System.out.println("base dir is " + baseDir);
		screenshotDirName = screenshotfolderName;
		System.out.println("base screenshot is " + screenshotfolderName);
		BasePageActions.currecntTime();
		URLpatternActions.Date();
		URLpatternActions.Date1();
		URLpatternActions.month();
		URLpatternActions.day();
		URLpatternActions.DateWithMonth();
		report = Reports.getReports(baseDirPath);
		report.addSystemInfo("Environment", environment);
		String excelPath = new File("src/main/resources/testdata.xls")
				.getAbsolutePath();
		System.out.println("excle path is " + excelPath);
		xlsUtil = new ExcelUtils(excelPath);
		xlsUtil.rowdictionary();
		driver = Driver.getDriver(browser);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	
	}

	@AfterSuite
	public static void tearDown() throws Exception {
		

	}

	@BeforeMethod
	public void nameBefore(Method method) {

		extentTest = report
				.startTest(
						method.getName(),
						method.getAnnotation(org.testng.annotations.Test.class)
								.description())
				.assignCategory(
						method.getAnnotation(org.testng.annotations.Test.class)
								.groups())
				.assignAuthor("Mahesh Reddy Chilumula");
		System.out.println("we are in " + method.getName());

	}

	@AfterMethod
	public void afterMethod(Method method) {
		report.endTest(extentTest);
		report.flush();
	}

	@BeforeClass
	public void beforeclass() {

		String className = this.getClass().getSimpleName();
		String[] parts = className.split("T", 2);
		String string1 = parts[0];

		System.out.println("Class name: " + string1);

		Class s;
		try {
			s = Class.forName("page.objects." + string1 + "Objects");
			Object t = s.newInstance();
			PageFactory.initElements(driver, t);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
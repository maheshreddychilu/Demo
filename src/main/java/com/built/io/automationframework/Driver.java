package com.built.io.automationframework;

import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import data.VerificationData;

public class Driver {
	
	public static WebDriver driver;

	public static WebDriver getDriver(String type) throws Exception {
		if(type.equalsIgnoreCase("firefox")){
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			 driver = new FirefoxDriver(capabilities);
			return driver;
		}else if(type.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",
					VerificationData.DriverPath.chromdriver);
			driver = new ChromeDriver();
			return driver;
		
		}else if(type.equalsIgnoreCase("ie")){
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.internetExplorer().setCapability("ignoreProtectedModeSettings",
					true);
			System.setProperty("webdriver.ie.driver",
					VerificationData.DriverPath.idDriver);
			cap.setCapability(CapabilityType.VERSION, "9");

			driver = new InternetExplorerDriver(cap);
			return driver;
	
		}else if(type.equalsIgnoreCase("phantom")){
			DesiredCapabilities phantomBeast = DesiredCapabilities.phantomjs();
			phantomBeast.setJavascriptEnabled(true);
			phantomBeast.setCapability("phantomjs.binary.path",VerificationData.DriverPath.phantomsjsWindows);
			phantomBeast.setJavascriptEnabled(true);
			phantomBeast.setCapability(PhantomJSDriverService.PHANTOMJS_PAGE_SETTINGS_PREFIX,"Y");
			phantomBeast.setCapability("takesScreenshot", true);
			driver = new PhantomJSDriver(phantomBeast);
			 driver.manage().window().setSize(new Dimension(1600, 1080));
			 
			  return driver;
		
		}else if(type.equalsIgnoreCase("grid")){  
		    DesiredCapabilities capabilities = new DesiredCapabilities();
		    capabilities.setBrowserName("firefox");
			  capabilities.setPlatform(Platform.WINDOWS);
			    driver = new RemoteWebDriver(
			            new URL("http://localhost:4444/wd/hub"),
			            capabilities);
			  return driver;
		
		}else if(type.equalsIgnoreCase("saucelabs")){
				  
			final String USERNAME = "mahesh_rc";
			 final String ACCESS_KEY = "c0d845bd-afbf-4446-b1d6-cf236a0ae72a";
		    final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
			
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			    caps.setCapability("platform", "Windows XP");
			    caps.setCapability("version", "43.0");
			 
			    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
				 
				  return driver;
			
			}else {
			throw new Exception("Invalid driver type " + type + "!");	
		}
	}
}
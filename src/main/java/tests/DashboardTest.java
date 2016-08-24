package tests;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.annotations.Test;

import page.actions.DashboardPageActions;
import page.actions.SettingPageActions;
import page.objects.DashboardObjects;

import com.built.io.automationframework.BasePageActions;
import com.built.io.automationframework.BaseTest;
import com.built.io.automationframework.ExcelUtils;
import com.built.io.automationframework.MailingReports;
import com.built.io.automationframework.Reports;


public class DashboardTest extends DashboardPageActions {
 
	@Test(priority = 1,groups = "Stacks", description = "Creating new site for sanity testing")
	public void createNewStack() throws AddressException, MessagingException, IOException {

		createStackActions(ExcelUtils.readCell(1, ExcelUtils.getCell("sitename")));



driver.get("https://contentstack.built.io/");
		LoginPageActions.login("mahesh.chilumula@raweng.com", "test123");
		DashboardPageActions.publishReport();
		System.out.println("mailing report");
     	MailingReports.mailReport();
		System.out.println("mail sent successfully ");





   }
	

}

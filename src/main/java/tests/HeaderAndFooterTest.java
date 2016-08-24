package tests;

import org.testng.annotations.Test;

import com.built.io.automationframework.BaseTest;
import com.built.io.automationframework.MailingReports;
import com.built.io.automationframework.Reports;

import page.actions.DashboardPageActions;
import page.actions.HeaderAndFooterActions;
import page.objects.EntryPageObjects;

public class HeaderAndFooterTest extends HeaderAndFooterActions {
	
	@Test(priority = 1, groups = "Header and footer")
	public void verifyHeader()  {

		verifyHeaderActions();
	}

	@Test(priority = 2, groups = "Header and footer")
	public void verifyFooter() {
		
		verifyFooterActions();
		
	}
	
}

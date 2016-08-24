package tests;

import org.testng.annotations.Test;

import page.actions.AuditLogActions;

public class AuditLogsTest extends AuditLogActions {
	
	
	@Test(priority = 1, groups = "Audit log")
	public void verifyAuditLogsOfCreateWebhookForAny()  {

		verifyAuditLogsForCreateWebhookAny();
	}

	/*@Test(priority = 2, groups = "Audit Log", description = "Audit Log Filter", enabled =false)
	public static void auditLog() {
		init();
		checkFilters();
		checkUsersFilter();
		checkActionsFilterCreate();
		checkActionsFilterDelete();
		checkActionsFilterUpdate();
		//checkActionsFilterImport();
		checkActionsFilterExport();
		checkActionsFilterShare();
		//checkActionsFilterUnshare();
		//checkModuleFilterForm();
		checkModuleFilterEntry();
		checkModuleFilterAsset();
		checkModuleFilterUser();
		checkModuleFilterLocale();
		//checkModuleFilterEnvironment();
		//checkModuleFilterSite();
		checkModuleFilterRoles();
		//checkModuleFilterWebhook();


      }*/
	}

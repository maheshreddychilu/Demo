package tests;

import org.testng.annotations.Test;

import com.built.io.automationframework.ExcelUtils;

import page.actions.AuditLogActions;
import page.actions.RolesActions;
import page.actions.SettingPageActions;
import page.objects.RolesObjects;
import page.objects.SettingsPageObjects;

public class RolesTest extends RolesActions {
	
	
	// Roles
	
@Test(priority = 1, groups = "Roles")
	public void verifyRolesPage() {

	      clickRolesLink();
		verifyRolesPageActions();
	}

	@Test(priority = 2, groups = "Roles")
	public void createNewRole()  {

		createRoleActions(ExcelUtils.readCell(1,
				ExcelUtils.getCell("role.name.newrole")));
		createRoleActions(ExcelUtils.readCell(1,
				ExcelUtils.getCell("role.name.fakerole")));
	}

	
	@Test(priority = 3, groups = "Roles")
	public void updateRole()  {

		updateRoleActions(RolesObjects.newRole, "Update role");
	}

	@Test(priority = 4, groups = "Roles")
	public void deleteRole()  {

		deleteRoleActions(RolesObjects.fakeRole,RolesObjects.ellipsisIconOfRole);
	}
	
	@Test(priority = 5, groups = "Audit log")
	public void verifyAuditLogsOfRoles() {

		AuditLogActions.verifyAuditLogForRoles();
	}

	@Test(priority = 6, groups = "Roles")
	public void createCustomRoleWithCreateContentTypeRight()  {

		 clickRolesLink();
		 waitForSometime(2000);
		 deleteUpadtedRoleActions() ;
		 waitForSometime(2000);
		 creatCustomRoleWithCreateContentTypeRightActions();
		
	}

	@Test(priority = 7, groups = "Roles")
	public void creatCustomRoleWithUpdateAndDeleteContentTypeRight()  {

		waitForSometime(4000);
		creatCustomRoleWithUpdateAndDeleteContentTypeRightActions();
		
	}
	
	@Test(priority = 8, groups = "Roles")
	public void creatCustomRoleWithDeleteAndPublsihContentTypeRight()  {

		waitForSometime(4000);
		creatCustomRoleWithDeleteAndPublsihContentTypeRightActions();
		
	}
}

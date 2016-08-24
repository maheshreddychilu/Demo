package page.actions;

import org.openqa.selenium.WebElement;

import com.built.io.automationframework.BasePageActions;

import page.objects.ContentObjects;
import page.objects.RolesObjects;
import page.objects.RolesObjects;
import data.VerificationData;

public class RolesActions extends BasePageActions {

	public static void clickRolesLink() {

		waitForSometime(4000);
		mousehover(RolesObjects.settingsMenu, "mouse hover on setting menu",
				"r-1");
		click(RolesObjects.rolesLink, "click on add new roles link", "r-2");

	}

	public static void verifyRolesPageActions() {


		verifyText(RolesObjects.addNewRole1, VerificationData.Setting.addrole,
				"verify add role text", "r3");

		verifyText(RolesObjects.contentManager,
				VerificationData.Setting.contentManager,
				"verify contentManager", "r4");

		verifyText(RolesObjects.developer, VerificationData.Setting.developer,
				"verify developer", "r5");

		verifyText(RolesObjects.decrip, VerificationData.Setting.description,
				"verify header as description", "r8");

		verifyText(RolesObjects.lastModified,
				VerificationData.Setting.lastModified,
				"verify header as actions", "r9");

	/*/	verifyText(RolesObjects.devoloperDescription,
				VerificationData.Setting.devDescription,
				"verify owner as description", "r10");
		verifyText(RolesObjects.contentManagerDescription,
				VerificationData.Setting.cmDescription,
				"verify header as name", "r6");*/

	}

	public static void createRoleActions(String roleName) {

		waitForSometime(3000);
		click(RolesObjects.addNewRole, "click on add new role button", "r-1");
		waitForSometime(500);
		sendkeys(RolesObjects.roleName, roleName,
				"enter role name in rolename inputbox", "r-2");
		waitForSometime(1000);
		sendkeys(RolesObjects.roleDescription, "this role for testing purpose",
				"enter  description  in role description inputbox", "r-3");
		//click(RolesObjects.formCreate, "select create form option", "r-4");

		click(RolesObjects.addRole, "click on add role button", "r-6");
		waitForSometime(500);
		verifyTextByindex(RolesObjects.successMessage,
				VerificationData.Setting.roleAddsuccessMessage,
				"verify role successfully added or not ", "r-7");
		//waitForSometime(4000);
		click(RolesObjects.cancelButton, "click on cancel button role", "r-8");

	}

	public static void updateRoleActions(WebElement element, String roleName) {

		click(element, "click role which one you want to update", "Ed-1");
	
		clear(RolesObjects.roleName, "remove the old role name", "Ed-2");
		waitForSometime(1000);
		sendkeys(RolesObjects.roleName, roleName,
				"enter new role name in rolename inputbox", "ed-3");
		sendkeys(RolesObjects.roleDescription, "Update role",
				"enter description  in role description inputbox", "ed-7");
		clickByindex(RolesObjects.formCreate, 0, "select create form option", "r-4");
		
		click(RolesObjects.addRoleButton, "click on add role button", "ed-5");
		waitForSometime(500);
		verifyTextByindex(ContentObjects.successMessage,
				VerificationData.Setting.roleUpdatesuccessMessage,
				"verify role successfully added or not ", "ed-6");
		click(RolesObjects.cancelButton, "click on cancel button role", "r-8");
	}

	public static void deleteRoleActions(WebElement element, WebElement element1) {

		mousehover(element, "mouse hover on elemenet which you want to delete",
				"dr-1");
		click(element1, "click roleellipsis icon ", "Ed-1");
		click(RolesObjects.deleteRoleLink, "click delete button ", "Ed-1");
		click(RolesObjects.deleteButtonOfWarningDailogbox,
				"click delete button of warning dialogbox ", "Ed-1");
		waitForSometime(500);
		verifyTextByindex(RolesObjects.successMessage,
				VerificationData.Setting.roleDeletesuccessMessage,
				"verify role successfully deleted or not ", "ed-6");
	}

	public static void creatCustomRoleWithCreateContentTypeRightActions() {

		click(RolesObjects.addNewRole, "click on add new role button", "r-1");
		sendkeys(RolesObjects.roleName,
				"create custom role with create conteten type right",
				"enter role name in rolename inputbox", "r-2");
		waitForSometime(700);
		sendkeys(RolesObjects.roleDescription, "this role for testing purpose",
				"enter  description  in role description inputbox", "r-3");
		clickByindex(RolesObjects.formCreate, 0, "select create form option", "r-4");
		
	//	waitForSometime(7000);

		elementIsChecked(RolesObjects.formRead,
			"verify read option selected or not", "r-4");

		elementIsChecked(RolesObjects.formUpdate,
			"verify update option selected or not", "r-4");

		click(RolesObjects.addRole, "click on add role button", "r-6");
		waitForSometime(500);
		verifyTextByindex(RolesObjects.successMessage,
				VerificationData.Setting.roleAddsuccessMessage,
				"verify role successfully added or not ", "r-7");
		waitForSometime(1000);
		click(RolesObjects.cancelButton, "click on cancel button role", "r-8");

	}

	public static void creatCustomRoleWithUpdateAndDeleteContentTypeRightActions() {

		click(RolesObjects.addNewRole, "click on add new role button", "r-1");
		sendkeys(
				RolesObjects.roleName,
				"create custom role with areate and update contetent type right",
				"enter role name in rolename inputbox", "r-2");
		waitForSometime(700);
		sendkeys(RolesObjects.roleDescription, "this role for testing purpose",
				"enter  description  in role description inputbox", "r-3");
		clickByindex(RolesObjects.formCreate, 2, "select Update form option", "r-4");
		clickByindex(RolesObjects.formCreate, 3, "select delete form option", "r-4");
	   elementIsChecked(RolesObjects.formRead,
			"verify read option selected or not", "r-4");
		click(RolesObjects.addRole, "click on add role button", "r-6");
		waitForSometime(500);
		verifyTextByindex(RolesObjects.successMessage,
				VerificationData.Setting.roleAddsuccessMessage,
				"verify role successfully added or not ", "r-7");
		waitForSometime(1000);
		click(RolesObjects.cancelButton, "click on cancel button role", "r-8");

	}

	public static void creatCustomRoleWithDeleteAndPublsihContentTypeRightActions() {

		click(RolesObjects.addNewRole, "click on add new role button", "r-1");
		sendkeys(
				RolesObjects.roleName,
				"create custom role with delete and publish contetent type right",
				"enter role name in rolename inputbox", "r-2");
		waitForSometime(700);
		sendkeys(RolesObjects.roleDescription, "this role for testing purpose",
				"enter  description  in role description inputbox", "r-3");
		clickByindex(RolesObjects.formCreate, 3, "select delete form option", "r-4");	
		clickByindex(RolesObjects.formCreate, 4, "select publish option form option", "r-4");
		elementIsChecked(RolesObjects.formRead,
				"verify read option selected or not", "r-4");
		click(RolesObjects.addRole, "click on add role button", "r-6");
		waitForSometime(500);
		verifyTextByindex(RolesObjects.successMessage,
				VerificationData.Setting.roleAddsuccessMessage,
				"verify role successfully added or not ", "r-7");
		waitForSometime(1000);
		click(RolesObjects.cancelButton, "click on cancel button role", "r-8");

	}
	
	public static void deleteUpadtedRoleActions() {

		mousehover(RolesObjects.updatedrole, "mouse hover on elemenet which you want to delete",
				"dr-1");
		click(RolesObjects.escIconupdatedrole, "click roleellipsis icon ", "Ed-1");
		click(RolesObjects.deleteButton, "click delete button ", "Ed-1");
		click(RolesObjects.deleteButtonOfWarningDailogbox,
				"click delete button of warning dialogbox ", "Ed-1");
		waitForSometime(500);
		verifyTextByindex(RolesObjects.successMessage,
				VerificationData.Setting.roleDeletesuccessMessage,
				"verify role successfully deleted or not ", "ed-6");
	}

}

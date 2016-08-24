package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RolesObjects {
	
	//Roles
	
	
	   @FindBy(xpath = "//span[@translate='NAV_BAR.SETTINGS']")
	   public static WebElement settingsMenu;
	
	   @FindBy(xpath = "//a[@translate='NAV_BAR.ROLES']")
		public static WebElement rolesLink;
	
	    @FindBy(xpath = "//div[contains(text(),'Roles')]")
		public static WebElement roles;
	   
	  
		
		@FindBy(xpath = "//div[contains(text(),'Description')]")
		public static WebElement description;
		

		@FindBy(xpath = "//div[contains(text(),'Description')]")
		public static WebElement decrip;

		  @FindBy(xpath = "//div[@class='ui-pnotify-text']")
			public static List <WebElement> successMessage;
			
		@FindBy(xpath = "//div[contains(text(),'Last Modified By')]")
		public static WebElement lastModifiedBy;
		
		
		@FindBy(xpath = "//span[contains(.,'Developer')]")
		public static WebElement developer;
		
		
		@FindBy(xpath = "//span[contains(.,'Content Manager')]")
		public static WebElement contentManager;
		
		
		@FindBy(xpath = "//div[@data-ng-bind='_role.description']")
		public static WebElement devDescription;
		
		@FindBy(xpath = "//span[@data-ng-click='_role.yes()']")
		public static WebElement deleteButtonOfWarningDailogbox;
		
		@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/ul[2]/li[2]/div/a/div[2]")
		public static WebElement cmDescription;
		
		@FindBy(xpath = "//img[@class='cs-plus-icon']")
		public static WebElement addNewRole;
		
		@FindBy(xpath = "//div[@data-ng-click='role.add();']")
		public static WebElement addNewRole1;
		
		
		@FindBy(xpath = "//input[@data-ng-disabled='role.builtInRole']")
		public static WebElement roleName;
		
		@FindBy(xpath = "//textarea[@data-ng-model='role.description']")
		public static WebElement roleDescription;
		
			
		@FindBy(xpath = "//*[@class='lbl']")
		public static List <WebElement> formCreate;
		
		
		@FindBy(xpath = "//button[@class='btn cs-btn-success btn-large left']")
		public static WebElement addRoleButton;
		
		
		@FindBy(xpath = "//span[@data-ng-click='role.cancel()']")
		public static WebElement cancelButton;

		@FindBy(xpath = "//*[@data-target='#action-dropdown-0']/i")
		public static WebElement ellipsisIconOfRole;
		
		
		@FindBy(xpath = "//span[contains(.,'Delete')]")
		public static WebElement deleteRole;

		
		@FindBy(xpath = "//input[@placeholder='Search all roles']")
		public static WebElement searchRole;
		
		
		@FindBy(xpath = "//span[contains(.,'fake role')]")
		public static WebElement fakeRole;
		
		
		@FindBy(xpath = "//span[contains(.,'custom ')]")
		public static WebElement custom;
		
		
		@FindBy(xpath = "//span[contains(.,'new role')]")
		public static WebElement newRole;
		
		@FindBy(xpath = "//div[contains(text(),'Modified By')]")
		public static WebElement lastModified;
		
		@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/div/ul[2]/li[1]/div/a/div[2]")
		public static WebElement devoloperDescription;

		@FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div/div/div/ul[2]/li[2]/div/a/div[2]")
		public static WebElement contentManagerDescription;
		
		
		@FindBy(xpath = "//button[@class='btn cs-btn-success btn-large left']")
		public static WebElement addRole;
		
		
		@FindBy(xpath = "//*[@id='action-dropdown-0']/a/span")
		public static WebElement deleteRoleLink;
		
		
		@FindBy(xpath = "//span[contains(.,'Update role')]")
		public static WebElement updatedrole;
		
		@FindBy(xpath = "//*[@data-target='#action-dropdown-0']")
		public static WebElement escIconupdatedrole;
		
		@FindBy(xpath = "//*[@id='action-dropdown-0']/a/span")
		public static WebElement deleteButton;
		
	//custom roles	
		
		@FindBy(xpath = "//*[@class='cs-table-head']/li/div[3]/div/label/input")
		public static WebElement formRead;
		
		@FindBy(xpath = "//*[@class='cs-table-head']/li/div[4]/div/label/input")
		public static WebElement formUpdate;
		
		
		@FindBy(xpath = "//*[@class='cs-table-head']/li/div[5]/div/label/input")
		public static WebElement formDelete;
		
		
		@FindBy(xpath = "//*[@class='cs-table-head']/li/div[6]/div/label/input")
		public static WebElement formPublish;
		
		
		


}

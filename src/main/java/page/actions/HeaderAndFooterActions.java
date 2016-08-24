package page.actions;

import com.built.io.automationframework.BasePageActions;

import page.objects.HeaderAndFooterObjects;
import page.objects.LoginPageObjects;
import page.objects.SettingsPageObjects;
import data.VerificationData;

public class HeaderAndFooterActions extends BasePageActions{
	
	 public static void verifyHeaderActions() {
		  
		  waitForSometime(5000);
	
		  verifyText(HeaderAndFooterObjects.stackName,VerificationData.Header.stackName,"verify stack link text on header","h-1") ;
		   verifyText(HeaderAndFooterObjects.forms,VerificationData.Header.forms,"verify content link text on header","h-3") ;
		   verifyText(HeaderAndFooterObjects.assets,VerificationData.Header.assets,"verify assets link text on header","h-4") ;
		   verifyText(HeaderAndFooterObjects.publishQueue,VerificationData.Header.publishQueue,"verify publishQueue link text on header","h-5") ;
		   verifyText(HeaderAndFooterObjects.auditLog,VerificationData.Header.auditLog,"verify auditLog link text on header","h-6") ;
		   verifyText(HeaderAndFooterObjects.settings,VerificationData.Header.setting,"verify setting link text on header","h-7") ;
	  
		   
		   click(HeaderAndFooterObjects.userName, "click on username dropdown", "tc-3");
		   verifyText(HeaderAndFooterObjects.userName,VerificationData.Header.userName,"verify username link text on header","h-8") ;
		   verifyText(HeaderAndFooterObjects.userProfile,VerificationData.Header.profile,"verify profile link text on header","h-9") ;
		 //  verifyText(HeaderAndFooterObjects.userbilling,VerificationData.Header.billing,"verify billing link text on header","h-10") ;
		   verifyText(HeaderAndFooterObjects.userCredentials,VerificationData.Header.credentials,"verify credentials link text on header","h-11") ;
		   verifyText(HeaderAndFooterObjects.userSignOut,VerificationData.Header.signout,"verify signout link text on header","h-12") ;
		   
		   
		 //  getHref(HeaderAndFooterObjects.userProfile,VerificationData.Header.profileHref,"verify profile link text on header","h-13") ;
		 // getHref(HeaderAndFooterObjects.userCredentials,VerificationData.Header.credintialsHref,"verify credentials link text on header","h-14") ;
		   
		  // getHref(HeaderAndFooterObjects.community,VerificationData.Header.community,"verify community  href on header","h-15") ;
		  // getHref(HeaderAndFooterObjects.helpLink,VerificationData.Header.help,"verify help href on header","h-16") ;
		   
		
	 }
	 
	 public static void verifyFooterActions() {
		  
		
		   verifyText(HeaderAndFooterObjects.copyRight,VerificationData.Header.copyRight,"verify copyRight link text on header","h-8") ;
		   verifyText(HeaderAndFooterObjects.support,VerificationData.Header.support,"verify support link text on header","h-9") ;

	 }

}

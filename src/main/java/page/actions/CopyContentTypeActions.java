package page.actions;

import com.built.io.automationframework.BasePageActions;

import page.objects.ContentObjects;
import page.objects.CopyContentTypeObjects;
import data.VerificationData;

public class CopyContentTypeActions extends BasePageActions {
	
	public static void verifyCopiedContetTypeActionsActions() {

		  waitForSometime(3000);
		System.out.println("we r in copy form action page");
		//verifyText(ContentObjects.url, VerificationData.CopyForm.url,
		//		"verify success message", "tc-2.4");
		
		verifyText(ContentObjects.text1, VerificationData.CopyForm.text1,
				"verify text1 field of copy form", "tc-2.4");
		verifyText(ContentObjects.text2, VerificationData.CopyForm.text2,
				"verify text2 field of copy form", "tc-2.4");
		verifyText(ContentObjects.text3, VerificationData.CopyForm.text3,
				"verify text3 field of copy form", "tc-2.4");
		verifyText(ContentObjects.text4, VerificationData.CopyForm.text4,
				"verify text4 field of copy form", "tc-2.4");
		verifyText(ContentObjects.text5, VerificationData.CopyForm.text5,
				"verify text5 field of copy form", "tc-2.4");
		verifyText(ContentObjects.text6, VerificationData.CopyForm.text6,
				"verify text6 field of copy form", "tc-2.4");
		verifyText(ContentObjects.group1, VerificationData.CopyForm.group,
				"verify group field of copy form", "tc-2.4");
		// text(CopyFormObjects.grptitle,
		// TestData.CopyForm.grpTitle,"verify success message", "tc-2.4");
		verifyText(ContentObjects.grpRte, VerificationData.CopyForm.grpRte,
				"verify group Rt field of copy form text", "tc-2.4");
		verifyText(ContentObjects.grpUpload, VerificationData.CopyForm.grpUpload,
				"verify group upload field of copy form", "tc-2.4");
		verifyText(ContentObjects.grpboolean, VerificationData.CopyForm.grpBoolean,
				"verify group boolean field of copy form", "tc-2.4");
		verifyText(ContentObjects.grpNumber, VerificationData.CopyForm.grpNumber,
				"verify group number field of copy form", "tc-2.4");
		verifyText(ContentObjects.uploads, VerificationData.CopyForm.uploads,
				"verify file  field of copy form", "tc-2.4");
		verifyText(ContentObjects.link1, VerificationData.CopyForm.link,
				"verify link  field of copy form", "tc-2.4");
		verifyText(ContentObjects.booleanFiels, VerificationData.CopyForm.booleanfield,
				"verify boolean  field of copy form", "tc-2.4");
		verifyText(ContentObjects.number1, VerificationData.CopyForm.number,
				"verify number  field of copy form", "tc-2.4");
		verifyText(ContentObjects.date1, VerificationData.CopyForm.date,
				"verify date field of copy form", "tc-2.4");
		
		  waitForSometime(4000);
		click(ContentObjects.saveButton, "click on save button", "tc-3");
		  waitForSometime(4000);
		
		

	}

}

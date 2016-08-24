package tests;

import org.testng.annotations.Test;

import page.actions.RTEActions;


public class RteTest extends RTEActions {
	@Test(priority = 1, groups = "RTE")
	public void moreThanOneCodeTagUnderPtag(){
		
		createFormWithRTE() ;
		moreThanOneCodeTagUnderPtagAction() ;
	}
	
	@Test(priority = 2, groups = "RTE")
	public void ImageUploadedSuccessfullyButNotAbleToGetThroughRTE(){
		
		ImageUploadedSuccessfullyButNotAbleToGetThroughRTEActions();
	}
	
	@Test(priority = 3, groups = "RTE")
	public void AlignmentOptionIsMissingFromBasicRTE(){
		
		AlignmentOptionIsMissingFromBasicRTEAction();
	}
	
	@Test(priority = 4, groups = "RTE")
	public void VersionDifferenceForMultipleRTE(){
		
		versionDifferenceForMultipleRTEAction();
	}
	
	@Test(priority = 5, groups = "RTE")
	public void applyFontColorToHeader(){
		
		applyFontColorToHeaderAction();
	}
	
	@Test(priority = 6, groups = "RTE")
	public void horizontalRuleInRTEDoesntGetSaved(){
		
		horizontalRuleInRTEDoesntGetSavedAction();
	}
	
	@Test(priority = 7, groups = "RTE")
	public void boldUnderlineAreNotWorkingProperly(){
		
		boldUnderlineAreNotWorkingProperlyActions();
	}
	
	@Test(priority = 8, groups = "RTE")
	public void when3alphabetsEnteredItAppendsTheDeletedURL(){
		
		when3alphabetsEnteredItAppendsTheDeletedURLAction();
	}
	
	@Test(priority = 9, groups = "RTE")
	public void insertVideo(){
		
		insertVideoActions();
	}
	
	@Test(priority = 10, groups = "RTE")
	public void formattingAndAlignmentNanAotBeDoneWhenBulletsAreApplied(){
		
		formattingAndAlignmentNanAotBeDoneWhenBulletsAreAppliedAction();
	}
	
	@Test(priority = 11, groups = "RTE")
	public void VersionExceedForImageInRTE(){
		
		VersionExceedForImageInRTEActions() ;
	}
	
	@Test(priority = 12, groups = "RTE")
	public void imageInsertedTwiceOnDoubleclickOnImageFromChoose(){
		
		imageInsertedTwiceOnDoubleclickOnImageFromChooseActions() ;
	}
	
	@Test(priority = 13, groups = "RTE")
	public void verifyFontsizeOFtheText(){
		
		verifyFontsizeOFtheTextACtions() ;
	}
	
	@Test(priority = 14, groups = "RTE")
	public void pastingTextCopiedFromTheRTEIntoTheRTE_TheBoldTagWithinTheListDisappears(){
		
		pastingTextCopiedFromTheRTEIntoTheRTE_TheBoldTagWithinTheListDisappearsAction() ;
	}
	
	@Test(priority = 15, groups = "RTE")
	public void formattingAndAlignmentCanNotBeDoneWhenBulletsAreApplied(){
		
		formattingAndAlignmentCanNotBeDoneWhenBulletsAreAppliedACtions() ;
	}
	
	@Test(priority = 16, groups = "RTE")
	public void LinkOptionIsMissingFromInsertImageModal(){
		
		LinkOptionIsMissingFromInsertImageModalACtions() ;
	}
	
	@Test(priority = 17, groups = "RTE")
	public void inRTE_Ddata_sys_asset_uid_IsMissingFromTheFileWhichIsUploadedFromTheSystem(){
		
		inRTE_Ddata_sys_asset_uid_IsMissingFromTheFileWhichIsUploadedFromTheSystemACtions() ;
	}
	
	

	@Test(priority = 18, groups = "RTE")
	public void searchNameGetsDisappearedFrom_choose_from_uploads_option(){
		
		searchNameGetsDisappearedFrom_choose_from_uploads_optionACtions() ;
	}
	
}

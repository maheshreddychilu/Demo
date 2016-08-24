package tests;

import java.io.File;

import org.testng.annotations.Test;

import com.built.io.automationframework.BasePageActions;
import com.built.io.automationframework.ExcelUtils;

import data.VerificationData;
import page.actions.DashboardPageActions;
import page.actions.URLpatternActions;
import page.objects.URLpatternObjects;

public class URLpatternTest extends URLpatternActions {
	

	@Test(priority = 1, groups = "URL pattern")
	public void verifyTitleURlpattern()  {
		addContentBlogForSingle("Ttile URl pattern", "1") ;
		closePopUp() ;
		createContentType() ;
		verifyTitlePatternActions(URLpatternObjects.firstCT) ;
		deleteContentTypeAction() ;
		
	}
	
	/*@Test(priority = 2, groups = "URL pattern")
	public void verifyDateAndTitleURlpattern()  {
  
		addContentBlogForSingle("URl pattern", "1") ;
		createContentType() ;
		applyAndVerifyURlpattern(URLpatternObjects.redioButton,1,VerificationData.SanitycontentType.prieewDate,VerificationData.SanitycontentType.previeTitlewithdate) ;
		deleteContentTypeAction() ;
		
	}*/
	
	@Test(priority = 3, groups = "URL pattern")
	public void verifyMonthAndTitleURlpattern()  {
  
		addContentBlogForSingle("URl pattern", "1") ;
		createContentType() ;
		applyAndVerifyURlpattern(URLpatternObjects.redioButton,2,VerificationData.SanitycontentType.prieewMonth,VerificationData.SanitycontentType.previeTitlewithMonth) ;
		deleteContentTypeAction() ;
		
	}
	
	@Test(priority = 4, groups = "URL pattern")
	public void verifyTitlePatternActionsWithPrefix()  {
  
		addContentBlogForSingle("Ttile URl pattern", "1") ;
		createContentType() ;
		verifyTitlePatternActionsWithPrefixActions() ;
		deleteContentTypeAction() ;
		
	}
	
	/*@Test(priority = 5, groups = "URL pattern")
	public void verifyDateAndTitleURlpatternWithPrefix()  {
  
		addContentBlogForSingle("URl pattern", "1") ;
		createContentType() ;
		applyAndVerifyURlpatternWithPrefix(URLpatternObjects.redioButton,1,VerificationData.SanitycontentType.prieewDate,VerificationData.SanitycontentType.previeTitlewithdateWithPrefix) ;
		deleteContentTypeAction() ;
		
	}*/
	
	@Test(priority = 6, groups = "URL pattern")
	public void verifyMonthAndTitleURlpatternWithPrefix()  {
  
		addContentBlogForSingle("URl pattern", "1") ;
		createContentType() ;
		applyAndVerifyURlpatternWithPrefix(URLpatternObjects.redioButton,2,VerificationData.SanitycontentType.prieewMonth,VerificationData.SanitycontentType.previeTitlewithMonthWithPrefix) ;
		deleteContentTypeAction() ;
		
	}

	@Test(priority = 7, groups = "URL pattern", enabled=false)
	public void customURlPatternWithtitle()  {
  
		addContentBlogForSingle("URl pattern", "1") ;
		createContentType() ;
		applyCustomURLPattern(URLpatternObjects.redioButton,3,":title ",VerificationData.SanitycontentType.prieewTitle,VerificationData.SanitycontentType.onlyTitle) ;
		deleteContentTypeAction() ;
		
	}
	
	/*@Test(priority = 8, groups = "URL pattern")
	public void customURlPatternWithUniqueID()  {
  
		addContentBlogForSingle("URl pattern", "1") ;
		createContentType() ;
		applyCustomURLEntryID(URLpatternObjects.redioButton,3,":unique_id",VerificationData.SanitycontentType.customTitleEntryID,"") ;
		deleteContentTypeAction() ;
		
	}*/
	
	@Test(priority = 9, groups = "URL pattern")
	public void customURlPatternWithYear()  {
	
		addContentBlogForSingle("URl pattern", "1") ;
		createContentType() ;
		applyCustomURLPattern(URLpatternObjects.redioButton,3,":year ",VerificationData.SanitycontentType.customTitleYear,VerificationData.SanitycontentType.customWithYEar) ;
		deleteContentTypeAction() ;
	}
	
	@Test(priority = 10, groups = "URL pattern")
	public void customURlPatternWithYearShort()  {
	
		addContentBlogForSingle("URl pattern", "1") ;
		createContentType() ;
		applyCustomURLPattern(URLpatternObjects.redioButton,3,":year_short",VerificationData.SanitycontentType.customTitleYearShort,VerificationData.SanitycontentType.customWithYEarShort) ;
		deleteContentTypeAction() ;	
	}

	@Test(priority = 11, groups = "URL pattern")
	public void customURlPatternWithMonth()  {
	
		addContentBlogForSingle("URl pattern", "1") ;
		createContentType() ;
		applyCustomURLPattern(URLpatternObjects.redioButton,3,":month",VerificationData.SanitycontentType.customTitleMonth, VerificationData.SanitycontentType.customWithYmonth) ;
		deleteContentTypeAction() ;
	}
	
	@Test(priority = 12, groups = "URL pattern")
	public void customURlPatternWithDay()  {
		addContentBlogForSingle("URl pattern", "1") ;
		createContentType() ;
		applyCustomURLPattern(URLpatternObjects.redioButton,3,"/:day",VerificationData.SanitycontentType.customTitleDay, VerificationData.SanitycontentType.customWithYDay) ;
		deleteContentTypeAction() ;
		
	}

	
	@Test(priority = 13, groups = "URL pattern")
	public void customURlPatternTitleWithPrefix()  {
		addContentBlogForSingle("URl pattern", "1") ;
		createContentType() ;
		applyCustomURLPatternWithPrefix(3,":title",VerificationData.SanitycontentType.prieewTitle, VerificationData.SanitycontentType.customTitleWithPRefix) ;
		deleteContentTypeAction() ;
		
	}

	@Test(priority = 14, groups = "URL pattern")
	public void customURlPatternYearWithPrefix()  {
		addContentBlogForSingle("URl pattern", "1") ;
		createContentType() ;
		applyCustomURLPatternWithPrefix(3,":year",VerificationData.SanitycontentType.customTitleYear, VerificationData.SanitycontentType.customYearWithPRefix) ;
		deleteContentTypeAction() ;
		
	}
	

	@Test(priority = 15, groups = "URL pattern")
	public void customURlPatternYearShortWithPrefix()  {
		addContentBlogForSingle("URl pattern", "1") ;
		createContentType() ;
		applyCustomURLPatternWithPrefix(3,":year_short",VerificationData.SanitycontentType.customTitleYearShort, VerificationData.SanitycontentType.customWithYEarShortWithPrefix) ;
		deleteContentTypeAction() ;
		
	}
	
	/*@Test(priority = 16, groups = "URL pattern")
	public void customURlPatternMonthWithPrefix()  {
		addContentBlogForSingle("URl pattern", "1") ;
		createContentType() ;
		applyCustomURLPatternWithPrefix(3,":month",VerificationData.SanitycontentType.customTitleMonth, VerificationData.SanitycontentType.customWithYDayWithPrefix) ;
		deleteContentTypeAction() ;
		
	}*/

	
	@Test(priority = 17, groups = "URL pattern")
	public void customURlPatternDayWithPrefix()  {
		addContentBlogForSingle("URl pattern", "1") ;
		createContentType() ;
		applyCustomURLPatternWithPrefix(3,"/:day",VerificationData.SanitycontentType.customTitleDay, VerificationData.SanitycontentType.customWithYDayWithPrefix) ;
		deleteContentTypeAction() ;	
	}
	
	@Test(priority = 18, groups = "URL pattern")
	public void verifyDisiableURLpattern()  {
		addContentBlogForSingle("URl pattern", "1") ;
		createContentType() ;
		applyDisableURLPatternWithPrefix(4) ;
		deleteContentTypeAction() ;
		
		
	}

	
	/*@Test(priority = 19, groups = "URL pattern")
	public void verifyURlpatternInCopiedCT()  {
		addContentBlogForSingle("Ttile URl pattern", "1") ;
		createContentType();
		copyContentTypeAction() ;
		verifyTitlePatternActions(URLpatternObjects.copyOFCT) ;
		deleteContentTypeAction();
		deleteContentTypeAction();
		
	}

	@Test(priority = 20, groups = "URL pattern")
	public void verifyURlpatternInImportCT()  {
		
		String importedForm = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("Entry.CT.UrlPAttern")))
 		.getAbsolutePath();
 		importContentType(URLpatternObjects.browse, importedForm) ;
 		EditContentTypeAction() ;
		verifyTitlePatternActions(URLpatternObjects.firstCT) ;
		deleteContentTypeAction();
		
	}

	/*@Test(priority = 21, groups = "URL pattern")
	public void verifyEditURlpattern()  {
  
		addContentBlogForSingle("Ttile URl pattern", "1") ;
		createContentType() ;
		verifyTitlePatternActions(URLpatternObjects.firstCT) ;
		EditContentTypeAction() ;
		applyAndVerifyURlpattern(URLpatternObjects.redioButton,1,VerificationData.SanitycontentType.prieewDate,VerificationData.SanitycontentType.previeTitlewithdate) ;
		
		
	}
	
	@Test(priority = 22, groups = "URL pattern")
	public void customURlPatternWithmultipleAtributes()  {
		addContentBlogForSingle("URl pattern", "1") ;
		createContentType() ;
		applyCustomURLEntryID(URLpatternObjects.redioButton,3,"/:title/:year/:unique_id",VerificationData.SanitycontentType.multipleCustoTitle, VerificationData.SanitycontentType.customWithYMultiple) ;
		//deleteContentTypeAction() ;
		
	}
	
	@Test(priority = 23, groups = "URL pattern")
	public void exportEntryWithURLpattern()  {
		
		exportEntryAction() ;
	}
	
	@Test(priority = 24, groups = "URL pattern")
	public void copyEntryWithURLpattern() {
		
		copyEntryAction() ;
	}
	
	@Test(priority = 25, groups = "URL pattern")
	public void deleteEntryWithURLpattern() {
		
		DeleteEntryAction() ;
		deleteContentTypeAction() ;
	}
*/

}

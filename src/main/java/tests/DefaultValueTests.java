package tests;

import org.testng.annotations.Test;

import page.actions.DefaultValueActions;
import page.objects.URLpatternObjects;

public class DefaultValueTests extends DefaultValueActions{

	@Test(priority = 1, groups = "Default Value")
	public void verifyDefaultValueOfTextbox()  {
		
		addContentBlogForSingle("TextField default value", "1") ;
	//	closePopUp() ;
		createContentType() ;
		verifyDefaultValueOfTextboxActions() ;
		//deleteContentTypeAction() ;
	}
		
	@Test(priority = 2, groups = "Default Value")
	public void verifyDefaultValueIncopiedContentType()  {

		verifyDefaultValueIncopiedActions() ;
		deleteContentTypeAction();
	
	}

	@Test(priority = 4, groups = "Default Value")
	public void verifyDefaultValueInEditedContentType()  {

		verifyDefaultValueInEditedContentTypeActions() ;
		deleteContentTypeAction();
	}
	
   @Test(priority = 3, groups = "Default Value")
	public void verifyDefaultValueInImportedContentType()  {

		verifyDefaultValueInImportedContentTypeActions() ;
		deleteContentTypeAction();
	}
   @Test(priority = 4, groups = "Default Value")
	public void verifyDefaultValuesIncopiedEntry()  {

		verifyDefaultValueIncopiedActions() ;
		deleteContentTypeAction();
	}

}

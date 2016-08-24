package tests;

import org.testng.annotations.Test;

import com.built.io.automationframework.ExcelUtils;

import page.actions.ColumnViewActions;
import page.objects.ColumnViewObjects;

public class ColumnViewTest extends ColumnViewActions  {
	
	@Test(priority = 1, groups = "Column view")
	public void verifyNumberFieldColumnview() throws InterruptedException  {

		addContentTypeForSingle(ExcelUtils.readCell(1, ExcelUtils.getCell("columnview.contenttype")),ExcelUtils.readCell(1, ExcelUtils.getCell("form.description")),"af1") ;
	//	closePopUp();
		createContentType() ;
		createEntryAction(ColumnViewObjects.firstCt) ;
		verifyColumnViewAction(ColumnViewObjects.numberColumnView,ColumnViewObjects.numberHeader,ColumnViewObjects.numberValue,"NUMBER","25") ;

	}
	
	@Test(priority = 2, groups = "Column view")
	public void verifySingleLineTextFieldColumnview() throws InterruptedException  {

		verifyColumnViewAction(ColumnViewObjects.singleLineTextBox,ColumnViewObjects.singleHeader,ColumnViewObjects.singleValue,"SINGLE LINE TEXTBOX","builtio") ;
	}
	
	@Test(priority = 3, groups = "Column view")
	public void verifyMultiLineTextFieldColumnview() throws InterruptedException  {

		verifyColumnViewAction(ColumnViewObjects.multiLineTextBox,ColumnViewObjects.multiLineHeader,ColumnViewObjects.multiLineValue,"MULTI LINE TEXTBOX","contentstack") ;
	}
	
	@Test(priority = 4, groups = "Column view")
	public void verifyBooleanFieldColumnview() throws InterruptedException  {

		verifyColumnViewAction(ColumnViewObjects.booleanColumnView,ColumnViewObjects.booleanHeader,ColumnViewObjects.booleanText,"BOOLEAN","true") ;
		deleteContentTypeAction() ;
	}
	
	/*@Test(priority = 5, groups = "Column view")
	public void verifyDateFieldColumnview() throws InterruptedException  {

		verifyColumnViewAction(ColumnViewObjects.dateColumnView,ColumnViewObjects.dateHeader,ColumnViewObjects.dateText,"DATE","true") ;
		deleteContentTypeAction() ;
	}*/

}

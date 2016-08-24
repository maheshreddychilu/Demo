package tests;

import java.io.File;

import org.testng.annotations.Test;

import com.built.io.automationframework.ExcelUtils;

import page.actions.ReferenceActions;
import page.objects.ReferenceObjects;

public class ReferenceTest extends ReferenceActions {

	@Test(priority = 1, groups = "Assets")
	public void verifyTopLevelReference() throws InterruptedException  {

		System.out.println("file path"+ExcelUtils.readCell(1, ExcelUtils.getCell("Imported.form")));
		//importContentType(ContentObjects.browse,  ExcelUtils.readCell(1, ExcelUtils.getCell("Imported.form"))) ;	
		String importedForm = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("Imported.form")))
		.getAbsolutePath();
		System.out.println("content type path " +importedForm);
		importContentType(ReferenceObjects.browse, importedForm) ;
		
		for(int a=1 ;a <3 ; a++){
			createEntriesInImportedForm(a) ;
		}
		addContentTypeForSingle(ExcelUtils.readCell(1, ExcelUtils.getCell("contenttype.reference")),ExcelUtils.readCell(1, ExcelUtils.getCell("form.description")),"af1") ;
		createContentType() ;
		createEntryAction(ReferenceObjects.contenttypeA) ;
	}
}

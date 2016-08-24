package tests;

import org.testng.annotations.Test;

import page.actions.PublishModalActions;
import page.objects.ColumnViewObjects;
import page.objects.PublishModalObjects;
import page.objects.SettingsPageObjects;

import com.built.io.automationframework.ExcelUtils;

public class PublishModalTest extends PublishModalActions{
	
	@Test(priority = 1, groups = "Entry")
	public void localiseEntry() throws InterruptedException  {

		clickOnLanguageTab();
		addNewLanguage(ExcelUtils.readCell(1,ExcelUtils.getCell("language.name.first")));
		addNewLanguage(ExcelUtils.readCell(1,
				ExcelUtils.getCell("second.language.name")));
		addNewLanguage(ExcelUtils.readCell(1,
				ExcelUtils.getCell("third.language.name")));
		clickOnEnvironmentTab();
		createBlankEnv(PublishModalObjects.addNewEnvOnEnvPage,ExcelUtils.readCell(1,
				ExcelUtils.getCell("env.name.blank"))) ;
		addContentTypeForSingle(ExcelUtils.readCell(1, ExcelUtils.getCell("columnview.contenttype")),ExcelUtils.readCell(1, ExcelUtils.getCell("form.description")),"af1") ;
		createContentType() ;
		createEntryAction(PublishModalObjects.firstCt) ;	
		LocaliseActions(PublishModalObjects.dropDownICon,PublishModalObjects.jaJp) ;
		LocaliseEntryInTeluguLocale() ;
		
	}
	
	@Test(priority = 2, groups = "Entry")
	public void verifyPublishingModal() throws InterruptedException  {

		verifyPublishingModalActions() ;
	}
	
	
	@Test(priority = 3, groups = "Entry")
	public void unlocalizeEntry() throws InterruptedException  {

		verifyUnlocalizeEntryActions() ;
	}

}

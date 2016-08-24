package page.actions;

import org.openqa.selenium.WebElement;

import com.built.io.automationframework.BasePageActions;





import data.VerificationData;
import page.objects.AuditLogsObjects;
import page.objects.AuditLogsObjects;
import page.objects.ContentObjects;
import page.objects.WebHookObjects;


public class AuditLogActions extends BasePageActions {
	

	public static void verifyAuditlogsForLanguagesActions()  {

		click(AuditLogsObjects.auditLogIcon, "click on auditLog Icon", "a-1");

		verifyText(AuditLogsObjects.userName6, VerificationData.auditLogs.userName,
				"verify usename of japanese locale", "a2");
		verifyText(AuditLogsObjects.action6, VerificationData.auditLogs.delete,
				"verify action of japanese locale", "a3");
		verifyText(AuditLogsObjects.module6, VerificationData.auditLogs.moduleLocale,
				"verify module of japanese locale", "a4");
		verifyText(AuditLogsObjects.title6, VerificationData.auditLogs.title1,
				"verify text of japanese locale", "a5");

		verifyText(AuditLogsObjects.userName7, VerificationData.auditLogs.userName,
				"verify usename of English - Australia locale", "a7");
		verifyText(AuditLogsObjects.action7, VerificationData.auditLogs.create,
				"verify action of English - Australia locale", "a8");
		verifyText(AuditLogsObjects.module7, VerificationData.auditLogs.moduleLocale,
				"verify module of English - Australia locale", "a9");
		verifyText(AuditLogsObjects.title7, VerificationData.auditLogs.title2,
				"verify text of English - Australia locale", "a10");

		verifyText(AuditLogsObjects.userName8, VerificationData.auditLogs.userName,
				"verify usename of Telugu - India locale", "a12");
		verifyText(AuditLogsObjects.action8, VerificationData.auditLogs.create,
				"verify action of Telugu - India locale", "a13");
		verifyText(AuditLogsObjects.module8, VerificationData.auditLogs.moduleLocale,
				"verify module of Telugu - India locale", "a14");
		verifyText(AuditLogsObjects.title8, VerificationData.auditLogs.title3,
				"verify text of Telugu - India locale", "a15");

		verifyText(AuditLogsObjects.userName8, VerificationData.auditLogs.userName,
				"verify usename of Telugu - India locale", "a12");
		verifyText(AuditLogsObjects.action8, VerificationData.auditLogs.create,
				"verify action of Telugu - India locale", "a13");
		verifyText(AuditLogsObjects.module8, VerificationData.auditLogs.moduleLocale,
				"verify module of Telugu - India locale", "a14");
		verifyText(AuditLogsObjects.title8, VerificationData.auditLogs.title3,
				"verify text of Telugu - India locale", "a15");
	}

	public static void verifyAuditLogsForEnviromentActions()  {

		click(AuditLogsObjects.auditLogIcon, "click on auditLog Icon", "a-1");

		verifyText(AuditLogsObjects.userName1, VerificationData.auditLogs.userName,
				"verify usename of test Enviroment", "a17");
		verifyText(AuditLogsObjects.action1, VerificationData.auditLogs.delete,
				"verify action of test Enviroment", "a18");
		verifyText(AuditLogsObjects.module1, VerificationData.auditLogs.moduleEnv,
				"verify module of test Enviroment", "a19");
		verifyText(AuditLogsObjects.title1, VerificationData.auditLogs.envTitle5,
				"verify text of production Enviroment", "a20");

		verifyText(AuditLogsObjects.userName2, VerificationData.auditLogs.userName,
				"verify usename of blank Enviroment", "a22");
		verifyText(AuditLogsObjects.action2, VerificationData.auditLogs.update,
				"verify action of blank Enviroment", "a23");
		verifyText(AuditLogsObjects.module2, VerificationData.auditLogs.moduleEnv,
				"verify module of blank Enviroment", "a24");
		verifyText(AuditLogsObjects.title2, VerificationData.auditLogs.envTitle1,
				"verify text of blank Enviroment", "a25");

		verifyText(AuditLogsObjects.userName3, VerificationData.auditLogs.userName,
				"verify usename of test Enviroment", "a27");
		verifyText(AuditLogsObjects.action3, VerificationData.auditLogs.create,
				"verify action of test Enviroment", "a");
		verifyText(AuditLogsObjects.module3, VerificationData.auditLogs.moduleEnv,
				"verify module of test Enviroment", "a");
		verifyText(AuditLogsObjects.title3, VerificationData.auditLogs.envTitle2,
				"verify text of test Enviroment", "a30");

		verifyText(AuditLogsObjects.userName4, VerificationData.auditLogs.userName,
				"verify usename of development Enviroment", "a32");
		verifyText(AuditLogsObjects.action4, VerificationData.auditLogs.create,
				"verify action of development Enviroment", "a33");
		verifyText(AuditLogsObjects.module4, VerificationData.auditLogs.moduleEnv,
				"verify module of development Enviroment", "a34");
		verifyText(AuditLogsObjects.title4, VerificationData.auditLogs.envTitle5,
				"verify text of development Enviroment", "a35");

		verifyText(AuditLogsObjects.userName5, VerificationData.auditLogs.userName,
				"verify usename of production Enviroment", "a37");
		verifyText(AuditLogsObjects.action5, VerificationData.auditLogs.create,
				"verify action of development Enviroment", "a38");
		verifyText(AuditLogsObjects.module5, VerificationData.auditLogs.moduleEnv,
				"verify module of production Enviroment", "a39");
		verifyText(AuditLogsObjects.title5, VerificationData.auditLogs.envTitle6,
				"verify text of production Enviroment", "a40");

	
	}


	// content Type
	

	public static void verifyAuditLogForCreateSanityForm()  {

		verifyText(AuditLogsObjects.userName2, VerificationData.auditLogs.userName,
				"verify usename of edit form", "a93");
		verifyText(AuditLogsObjects.action2, VerificationData.auditLogs.update,
				"verify action of edit form", "a94");
		verifyText(AuditLogsObjects.module2, VerificationData.auditLogs.form,
				"verify module of edit form", "a95");
		verifyText(AuditLogsObjects.title2, VerificationData.auditLogs.sanityFormTest,
				"verify text of webhook for edit form", "a96");
		
		verifyText(AuditLogsObjects.userName3, VerificationData.auditLogs.userName,
				"verify usename of sanity form", "a82");
		verifyText(AuditLogsObjects.action3, VerificationData.auditLogs.create,
				"verify action of sanity form", "a83");
		verifyText(AuditLogsObjects.module3, VerificationData.auditLogs.form,
				"verify module of sanity form", "a84");
		verifyText(AuditLogsObjects.title3, VerificationData.auditLogs.sanityFormTest,
				"verify text of webhook for sanity form", "a85");
	
	}
	
	
	
	public static void verifyAuditLogForDelete()  {

		
		verifyText(AuditLogsObjects.userName4, VerificationData.auditLogs.userName,
				"verify usename of delete form", "a98");
		verifyText(AuditLogsObjects.action4, VerificationData.auditLogs.delete,
				"verify action of delete form", "a99");
		verifyText(AuditLogsObjects.module4, VerificationData.auditLogs.form,
				"verify module of delete formt", "a100");
		verifyText(AuditLogsObjects.title4, VerificationData.auditLogs.editedform,
				"verify text of  delete form", "a101");
	}
	
	public static void verifyExportFormAuditLogs()  {

		click(AuditLogsObjects.auditLogIcon, "click on auditLog Icon", "a-1");
		
		verifyText(AuditLogsObjects.userName1, VerificationData.auditLogs.userName,
				"verify usename of export form", "a72");
		verifyText(AuditLogsObjects.action1, VerificationData.auditLogs.exprot,
				"verify action of export formt", "a73");
		verifyText(AuditLogsObjects.module1, VerificationData.auditLogs.form,
				"verify module of  export form", "a74");
		verifyText(AuditLogsObjects.title1, VerificationData.auditLogs.sanityFormTest,
				"verify text of export form", "a75");
	}
	
	public static void verifyAuditLogForEditForm()  {

		verifyText(AuditLogsObjects.userName5, VerificationData.auditLogs.userName,
				"verify usename of export form", "a72");
		verifyText(AuditLogsObjects.action5, VerificationData.auditLogs.update,
				"verify action of export formt", "a73");
		verifyText(AuditLogsObjects.module5, VerificationData.auditLogs.form,
				"verify module of  export form", "a74");
		verifyText(AuditLogsObjects.title5, VerificationData.auditLogs.editedform,
				"verify text of export form", "a75");

		

		
	}

	
	public static void verifyAuditLogForCopyForm()  {

	
		verifyText(AuditLogsObjects.userName2, VerificationData.auditLogs.userName,
				"verify usename of edit form", "a93");
		verifyText(AuditLogsObjects.action2, VerificationData.auditLogs.update,
				"verify action of edit form", "a94");
		verifyText(AuditLogsObjects.module2, VerificationData.auditLogs.form,
				"verify module of edit form", "a95");
		verifyText(AuditLogsObjects.title2, VerificationData.auditLogs.copyOfImported,
				"verify text of webhook for edit form", "a96");
		
		verifyText(AuditLogsObjects.userName3, VerificationData.auditLogs.userName,
				"verify usename of edit form", "a93");
		verifyText(AuditLogsObjects.action3, VerificationData.auditLogs.create,
				"verify action of edit form", "a94");
		verifyText(AuditLogsObjects.module3, VerificationData.auditLogs.form,
				"verify module of edit form", "a95");
		verifyText(AuditLogsObjects.title3, VerificationData.auditLogs.copyOfImported,
				"verify text of webhook for edit form", "a96");
		
	}
	
	public static void verifyIportFormAuditLogs()  {

		verifyText(AuditLogsObjects.userName4, VerificationData.auditLogs.userName,
				"verify usename of  import form", "a67");
		verifyText(AuditLogsObjects.action4, VerificationData.auditLogs.importentry,
				"verify action of import form", "a68");
		verifyText(AuditLogsObjects.module4, VerificationData.auditLogs.form,
				"verify module of  import form", "a69");
		verifyText(AuditLogsObjects.title4, VerificationData.auditLogs.moduleImport1,
				"verify text of  import form", "a70");

	}
	
	                  
	public static void verifyAuditLogForCreateEmptyContentType()  {

		verifyText(AuditLogsObjects.userName1, VerificationData.auditLogs.userName,
				"verify usename of edit form", "a93");
		verifyText(AuditLogsObjects.action1, VerificationData.auditLogs.update,
				"verify action of edit form", "a94");
		verifyText(AuditLogsObjects.module1, VerificationData.auditLogs.form,
				"verify module of edit form", "a95");
		verifyText(AuditLogsObjects.title1, VerificationData.auditLogs.emptyContentType,
				"verify text of webhook for edit form", "a96");
		
		
		
		verifyText(AuditLogsObjects.userName3, VerificationData.auditLogs.userName,
				"verify usename of sanity form", "a82");
		verifyText(AuditLogsObjects.action3, VerificationData.auditLogs.create,
				"verify action of sanity form", "a83");
		verifyText(AuditLogsObjects.module3, VerificationData.auditLogs.form,
				"verify module of sanity form", "a84");
		verifyText(AuditLogsObjects.title3, VerificationData.auditLogs.emptyContentType,
				"verify text of webhook for sanity form", "a85");
		  waitForSometime(3000);
		
		click(ContentObjects.contentType, "click on contenttype  Icon", "a-51");
		
	}
	
	
	
	public static void verifyAuditLogForDeleteLabel()  {
	
		click(AuditLogsObjects.auditLogIcon, "click on auditLog Icon", "a-1");
		
		verifyText(AuditLogsObjects.userName1, VerificationData.auditLogs.userName,
				"verify usename of edit form", "a93");
		verifyText(AuditLogsObjects.action1, VerificationData.auditLogs.delete,
				"verify action of edit form", "a94");
		verifyText(AuditLogsObjects.module1, VerificationData.auditLogs.label,
				"verify module of edit form", "a95");
		verifyText(AuditLogsObjects.title1, VerificationData.auditLogs.editLabel,
				"verify name of the deleted label", "a96");
		
	}
	
	
	public static void verifyAuditLogForUpdateLabel()  {

	
		
		verifyText(AuditLogsObjects.userName2, VerificationData.auditLogs.userName,
				"verify usename of edit form", "a93");
		verifyText(AuditLogsObjects.action2, VerificationData.auditLogs.update,
				"verify action of edit form", "a94");
		verifyText(AuditLogsObjects.module2, VerificationData.auditLogs.label,
				"verify module of edit form", "a95");
		verifyText(AuditLogsObjects.title2, VerificationData.auditLogs.editLabel,
				"verify text of webhook for edit form", "a96");
		
	}
	
	
	public static void verifyAuditLogForCreateLabel()  {

		
		
		verifyText(AuditLogsObjects.userName3, VerificationData.auditLogs.userName,
				"verify usename of edit form", "a93");
		verifyText(AuditLogsObjects.action3, VerificationData.auditLogs.create,
				"verify action of edit form", "a94");
		verifyText(AuditLogsObjects.module3, VerificationData.auditLogs.label,
				"verify module of edit form", "a95");
		verifyText(AuditLogsObjects.title3, VerificationData.auditLogs.childLabel,
				"verify text of webhook for edit form", "a96");
		
	}
	
	
	public static void verifyAuditLogForImportForm()  {

		click(AuditLogsObjects.rightNavigationIcon, "click on Pagenavigation Icon", "a-81");
		
		verifyText(AuditLogsObjects.userName1, VerificationData.auditLogs.userName,
				"verify usename of edit form", "a93");
		verifyText(AuditLogsObjects.action1, VerificationData.auditLogs.importentry,
				"verify action of edit form", "a94");
		verifyText(AuditLogsObjects.module1, VerificationData.auditLogs.form,
				"verify module of edit form", "a95");
		verifyText(AuditLogsObjects.title1, VerificationData.auditLogs.moduleImport1,
				"verify text of webhook for edit form", "a96");
		
	}
	

	public static void verifyAuditLogForEmptyContentType()  {

		verifyText(AuditLogsObjects.userName2, VerificationData.auditLogs.userName,
				"verify usename of edit form", "a93");
		verifyText(AuditLogsObjects.action2, VerificationData.auditLogs.update,
				"verify action of edit form", "a94");
		verifyText(AuditLogsObjects.module2, VerificationData.auditLogs.form,
				"verify module of edit form", "a95");
		verifyText(AuditLogsObjects.title2, VerificationData.auditLogs.emptyContentType,
				"verify text of webhook for edit form", "a96");
		
		verifyText(AuditLogsObjects.userName4, VerificationData.auditLogs.userName,
				"verify usename of edit form", "a93");
		verifyText(AuditLogsObjects.action4, VerificationData.auditLogs.update,
				"verify action of edit form", "a94");
		verifyText(AuditLogsObjects.module4, VerificationData.auditLogs.form,
				"verify module of edit form", "a95");
		verifyText(AuditLogsObjects.title4, VerificationData.auditLogs.emptyContentType,
				"verify text of webhook for edit form", "a96");
		
	}

	public static void verifyAuditLogForsanityLabel()  {

		  waitForSometime(3000);
		
		click(AuditLogsObjects.auditLogIcon, "click on auditLog Icon", "a-51");
		
		verifyText(AuditLogsObjects.userName2, VerificationData.auditLogs.userName,
				"verify usename of edit form", "a93");
		verifyText(AuditLogsObjects.action2, VerificationData.auditLogs.create,
				"verify action of edit form", "a94");
		verifyText(AuditLogsObjects.module2, VerificationData.auditLogs.label,
				"verify module of edit form", "a95");
		verifyText(AuditLogsObjects.title2, VerificationData.auditLogs.sanityLabel,
				"verify text of webhook for edit form", "a96");
		
	}
	
	
	
	public static void verifyAuditLogForCreateSingleContentBlock()  {

		verifyText(AuditLogsObjects.userName1, VerificationData.auditLogs.userName,
				"verify usename of edit form", "a93");
		verifyText(AuditLogsObjects.action1, VerificationData.auditLogs.update,
				"verify action of edit form", "a94");
		verifyText(AuditLogsObjects.module1, VerificationData.auditLogs.form,
				"verify module of edit form", "a95");
		verifyText(AuditLogsObjects.title1, VerificationData.auditLogs.setContentblock,
				"verify text of webhook for edit form", "a96");
		
		
		
		verifyText(AuditLogsObjects.userName2, VerificationData.auditLogs.userName,
				"verify usename of sanity form", "a82");
		verifyText(AuditLogsObjects.action2, VerificationData.auditLogs.create,
				"verify action of sanity form", "a83");
		verifyText(AuditLogsObjects.module2, VerificationData.auditLogs.form,
				"verify module of sanity form", "a84");
		verifyText(AuditLogsObjects.title2, VerificationData.auditLogs.setContentblock,
				"verify text of webhook for sanity form", "a85");
	
		
		  waitForSometime(3000);
		
		
		
	}
	
	
	
	
	public static void verifyAuditLogForCreateSetContentBlock()  {

		click(AuditLogsObjects.auditLogIcon, "click on auditLog Icon", "a-51");
		
		verifyText(AuditLogsObjects.userName3, VerificationData.auditLogs.userName,
				"verify usename of edit form", "a93");
		verifyText(AuditLogsObjects.action3, VerificationData.auditLogs.update,
				"verify action of edit form", "a94");
		verifyText(AuditLogsObjects.module3, VerificationData.auditLogs.form,
				"verify module of edit form", "a95");
		verifyText(AuditLogsObjects.title3, VerificationData.auditLogs.singleContentblock,
				"verify text of webhook for edit form", "a96");
		
		
		
		verifyText(AuditLogsObjects.userName4, VerificationData.auditLogs.userName,
				"verify usename of sanity form", "a82");
		verifyText(AuditLogsObjects.action4, VerificationData.auditLogs.create,
				"verify action of sanity form", "a83");
		verifyText(AuditLogsObjects.module4, VerificationData.auditLogs.form,
				"verify module of sanity form", "a84");
		verifyText(AuditLogsObjects.title4, VerificationData.auditLogs.singleContentblock,
				"verify text of webhook for sanity form", "a85");
		  waitForSometime(3000);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Assets
	
	public static void verifyAuditLogForCreateAssets()  {

		click(AuditLogsObjects.auditLogIcon, "click on auditLog Icon", "a-130");
		
		verifyText(AuditLogsObjects.userName1, VerificationData.auditLogs.userName,
				"verify usename of Blog.docx asset", "a131");
		verifyText(AuditLogsObjects.action1, VerificationData.auditLogs.create,
				"verify action of Blog.docx asset", "a132");
		verifyText(AuditLogsObjects.module1, VerificationData.auditLogs.asset,
				"verify module of  Blog.docx asset", "a133");
		verifyText(AuditLogsObjects.title1, VerificationData.auditLogs.blog,
		 "verify text of Blog.docx asset", "a134");

		
		
		verifyText(AuditLogsObjects.userName2, VerificationData.auditLogs.userName,
				"verify usename of report.html asset ", "a135");
		verifyText(AuditLogsObjects.action2, VerificationData.auditLogs.create,
				"verify action ofreport.html asset ", "a136");
		verifyText(AuditLogsObjects.module2, VerificationData.auditLogs.asset,
				"verify module of report.html asset ", "a137");
		verifyText(AuditLogsObjects.title2, VerificationData.auditLogs.html,
		 "verify text of report.html asset ", "a138");

		
		
		verifyText(AuditLogsObjects.userName3, VerificationData.auditLogs.userName,
				"verify usename of testdata.xls asset ", "a135");
		verifyText(AuditLogsObjects.action3, VerificationData.auditLogs.create,
				"verify action of testdata.xls asset ", "a136");
		verifyText(AuditLogsObjects.module3, VerificationData.auditLogs.asset,
				"verify module of testdata.xls asset ", "a137");
		verifyText(AuditLogsObjects.title3, VerificationData.auditLogs.xls,
		 "verify text of testdata.xls asset ", "a138");

		
		
		verifyText(AuditLogsObjects.userName4, VerificationData.auditLogs.userName,
				"verify usename ofContentstack.pptx asset ", "a135");
		verifyText(AuditLogsObjects.action4, VerificationData.auditLogs.create,
				"verify action ofContentstack.pptx asset ", "a136");
		verifyText(AuditLogsObjects.module4, VerificationData.auditLogs.asset,
				"verify module of Contentstack.pptx asset ", "a137");
		verifyText(AuditLogsObjects.title4, VerificationData.auditLogs.ppt,
		 "verify text of Contentstack.pptx asset ", "a138");

		
		
		verifyText(AuditLogsObjects.userName5, VerificationData.auditLogs.userName,
				"verify usename of XENU.ZIP asset ", "a135");
		verifyText(AuditLogsObjects.action5, VerificationData.auditLogs.create,
				"verify action of XENU.ZIP asset ", "a136");
		verifyText(AuditLogsObjects.module5, VerificationData.auditLogs.asset,
				"verify module of  XENU.ZIP asset ", "a137");
		verifyText(AuditLogsObjects.title5, VerificationData.auditLogs.xENU,
		 "verify text of  XENU.ZIP asset ", "a138");

	
		
		verifyText(AuditLogsObjects.userName6, VerificationData.auditLogs.userName,
				"verify usename of NewNameForm.pdf asset ", "a135");
		verifyText(AuditLogsObjects.action6, VerificationData.auditLogs.create,
				"verify action of NewNameForm.pdf asset ", "a136");
		verifyText(AuditLogsObjects.module6, VerificationData.auditLogs.asset,
				"verify module of NewNameForm.pdf asset ", "a12");
		verifyText(AuditLogsObjects.title6, VerificationData.auditLogs.newNameForm,
		 "verify text of NewNameForm.pdf asset ", "a138");

		
		
		verifyText(AuditLogsObjects.userName7, VerificationData.auditLogs.userName,
				"verify usename of malnutrition_small.ras asset ", "a135");
		verifyText(AuditLogsObjects.action7, VerificationData.auditLogs.create,
				"verify action of malnutrition_small.rasasset ", "a136");
		verifyText(AuditLogsObjects.module7, VerificationData.auditLogs.asset,
				"verify module of  malnutrition_small.ras asset ", "a137");
		verifyText(AuditLogsObjects.title7, VerificationData.auditLogs.markdownsampleCode,
		 "verify text of malnutrition_small.ras asset ", "a138");
		
	
		
		verifyText(AuditLogsObjects.userName8, VerificationData.auditLogs.userName,
				"verify usename of Freesample.svg asset ", "a135");
		verifyText(AuditLogsObjects.action8, VerificationData.auditLogs.create,
				"verify action of Freesample.svg asset ", "a136");
		verifyText(AuditLogsObjects.module8, VerificationData.auditLogs.asset,
				"verify module of  Freesample.svg asset ", "a137");
		verifyText(AuditLogsObjects.title8, VerificationData.auditLogs.malnutrition_small,
		 "verify text of  Freesample.svg asset ", "a138");

		
		verifyText(AuditLogsObjects.userName9, VerificationData.auditLogs.userName,
				"verify usename of malnutrition_small.pgm asset ", "a135");
		verifyText(AuditLogsObjects.action9, VerificationData.auditLogs.create,
				"verify action of malnutrition_small.pgm asset ", "a136");
		verifyText(AuditLogsObjects.module9, VerificationData.auditLogs.asset,
				"verify module of malnutrition_small.pgm asset ", "a137");
		verifyText(AuditLogsObjects.title9, VerificationData.auditLogs.malnutrition_smallPgm,
		 "verify text of malnutrition_small.pgm asset ", "a138");

	
		verifyText(AuditLogsObjects.userName10, VerificationData.auditLogs.userName,
				"verify usename of malnutrition_small.pcx asset ", "a135");
		verifyText(AuditLogsObjects.action10, VerificationData.auditLogs.create,
				"verify action of malnutrition_small.pcx asset ", "a136");
		verifyText(AuditLogsObjects.module10, VerificationData.auditLogs.asset,
				"verify module of malnutrition_small.pcx asset ", "a137");
		verifyText(AuditLogsObjects.title10, VerificationData.auditLogs.malnutrition_smallPgm,
		 "verify text of malnutrition_small.pcx asset ", "a138");
	     
		waitForSometime(1000) ;
		
		click(AuditLogsObjects.rightNavigationIcon, "click on right button of pagination", "a-51");
		waitForSometime(1000) ;
		verifyText(AuditLogsObjects.userName1, VerificationData.auditLogs.userName,
				"verify usename of ImportForm.json asset ", "a135");
		verifyText(AuditLogsObjects.action1, VerificationData.auditLogs.create,
				"verify action of ImportForm.json asset ", "a136");
		verifyText(AuditLogsObjects.module1, VerificationData.auditLogs.asset,
				"verify module of ImportForm.json asset ", "a137");
		verifyText(AuditLogsObjects.title1, VerificationData.auditLogs.importEntryJson,
		 "verify text of ImportForm.json asset ", "a138");
		
		
		verifyText(AuditLogsObjects.userName2, VerificationData.auditLogs.userName,
				"verify usename of IMG_8186.mp4 asset ", "a135");
		verifyText(AuditLogsObjects.action2, VerificationData.auditLogs.create,
			"verify action of IMG_8186.mp4 asset ", "a136");
		verifyText(AuditLogsObjects.module2, VerificationData.auditLogs.asset,
				"verify module of IMG_8186.mp4 asset ", "a137");
		verifyText(AuditLogsObjects.title2, VerificationData.auditLogs.IMG_8186,
		 "verify text of IMG_8186.mp4 asset ", "a138");
		
		
		verifyText(AuditLogsObjects.userName3, VerificationData.auditLogs.userName,
				"verify usename of Freesample.svg asset ", "a135");
		verifyText(AuditLogsObjects.action3, VerificationData.auditLogs.create,
				"verify action of Freesample.svg asset ", "a136");
		verifyText(AuditLogsObjects.module3, VerificationData.auditLogs.asset,
				"verify module of Freesample.svg asset ", "a137");
		verifyText(AuditLogsObjects.title3, VerificationData.auditLogs.Freesample,
		 "verify text of  Freesample.svg asset ", "a138");
		
		
		verifyText(AuditLogsObjects.userName4, VerificationData.auditLogs.userName,
				"verify usename of contentstack.mp3 asset ", "a135");
		verifyText(AuditLogsObjects.action4, VerificationData.auditLogs.create,
				"verify action of contentstack.mp3 asset ", "a136");
		verifyText(AuditLogsObjects.module4, VerificationData.auditLogs.asset,
				"verify module of  contentstack.mp3 asset ", "a137");
		verifyText(AuditLogsObjects.title4, VerificationData.auditLogs.contentstackMp3,
		 "verify text of contentstack.mp3 asset ", "a138");
		
		verifyText(AuditLogsObjects.userName5, VerificationData.auditLogs.userName,
				"verify usename of char.jpg asset ", "a135");
		verifyText(AuditLogsObjects.action5, VerificationData.auditLogs.create,
				"verify action of char.jpg asset ", "a136");
		verifyText(AuditLogsObjects.module5, VerificationData.auditLogs.asset,
				"verify module of  char.jpg asset ", "a137");
		verifyText(AuditLogsObjects.title5, VerificationData.auditLogs.charImg,
		 "verify text of  char.jpg asset ", "a138");
	
	}
	
	
	public static void verifyAuditLogForUpdateAsset()  {

		verifyText(AuditLogsObjects.userName2, VerificationData.auditLogs.userName,
				"verify usename of newNameForm asset", "a131");
		verifyText(AuditLogsObjects.action2, VerificationData.auditLogs.update,
				"verify action of newNameForm asset", "a132");
		verifyText(AuditLogsObjects.module2, VerificationData.auditLogs.asset,
				"verify module of  newNameForm asset", "a133");
		verifyText(AuditLogsObjects.title2, VerificationData.auditLogs.dhawal,
		 "verify text of  newNameForm asset", "a134");
	}
	
	public static void verifyAuditLogForDeleteAsset()  {

		click(AuditLogsObjects.auditLogIcon, "click on auditLog Icon", "a-130");
		
		verifyText(AuditLogsObjects.userName1, VerificationData.auditLogs.userName,
				"verify usename of newNameForm asset", "a131");
		verifyText(AuditLogsObjects.action1, VerificationData.auditLogs.delete,
				"verify action of newNameForm asset", "a132");
		verifyText(AuditLogsObjects.module1, VerificationData.auditLogs.asset,
				"verify module of  newNameForm asset", "a133");
		verifyText(AuditLogsObjects.title1, VerificationData.auditLogs.dhawal,
		 "verify text of  newNameForm asset", "a134");
	}
	
//Web hook
	
	public static void verifyAuditLogsForCreateWebhookAny()  {

		
		System.out.println("in webhook");
		
		click(AuditLogsObjects.auditLogIcon, "click on auditLog Icon", "a-51");
		
		verifyText(AuditLogsObjects.userName1, VerificationData.auditLogs.userName,
				"verify usename of webhook for any Asset action", "a52");
		verifyText(AuditLogsObjects.action1, VerificationData.auditLogs.create,
				"verify action of webhook for any Asset", "a53");
		verifyText(AuditLogsObjects.module1, VerificationData.auditLogs.moduleWebhook,
				"verify module of webhook for any Asset", "a54");
		verifyText(AuditLogsObjects.title1, VerificationData.auditLogs.webHookForAnyAsset,
				"verify text of webhook for any Asset", "a55");

		
		verifyText(AuditLogsObjects.userName2, VerificationData.auditLogs.userName,
				"verify usename of webhook for any Entry action", "a57");
		verifyText(AuditLogsObjects.action2, VerificationData.auditLogs.create,
				"verify action of webhook for any Entry", "a58");
		verifyText(AuditLogsObjects.module2, VerificationData.auditLogs.moduleWebhook,
				"verify module of webhook for any Entry", "a59");
		verifyText(AuditLogsObjects.title2, VerificationData.auditLogs.webHookForAnyEntry,
				"verify text of webhook for any Entry", "a60");

		
		verifyText(AuditLogsObjects.userName3, VerificationData.auditLogs.userName,
				"verify usename of webhook for any form action", "a62");
		verifyText(AuditLogsObjects.action3, VerificationData.auditLogs.create,
				"verify action of webhook for any form", "a63");
		verifyText(AuditLogsObjects.module3, VerificationData.auditLogs.moduleWebhook,
				"verify module of webhook for any form", "a64");
		verifyText(AuditLogsObjects.title3, VerificationData.auditLogs.webHookForAnyForm,
				"verify text of webhook for any form", "a65");
		//click(FormList.formIcon, "click on form Icon", "a-612");*/

	}
	
	
	
	
    public static void verifyAuditLogsForCreateWebhookForAspecificContentType()  {

		click(AuditLogsObjects.auditLogIcon, "click on auditLog Icon", "a-51");
		verifyText(AuditLogsObjects.userName1, VerificationData.auditLogs.userName,
				"verify usename of webhook for any Asset action", "a52");
		verifyText(AuditLogsObjects.action1, VerificationData.auditLogs.create,
				"verify action of webhook for any Asset", "a53");
		verifyText(AuditLogsObjects.module1, VerificationData.auditLogs.moduleWebhook,
				"verify module of webhook for any Asset", "a54");
		verifyText(AuditLogsObjects.title1, VerificationData.auditLogs.webHookForSpecificForm,
				"verify text of webhook for any Asset", "a55");

	
	}

	
	//Roles

	
	public static void verifyAuditLogForRoles()  {

		click(AuditLogsObjects.auditLogIcon, "click on auditLog Icon", "a-130");
		verifyText(AuditLogsObjects.userName1, VerificationData.auditLogs.userName,
				"verify usename of newNameForm asset", "a131");
		verifyText(AuditLogsObjects.action1, VerificationData.auditLogs.delete,
				"verify action of newNameForm asset", "a132");
		verifyText(AuditLogsObjects.module1, VerificationData.auditLogs.roles,
				"verify module of  newNameForm asset", "a133");
		verifyText(AuditLogsObjects.title1, VerificationData.auditLogs.fakeRole,
		 "verify text of  newNameForm asset", "a134");

		verifyText(AuditLogsObjects.userName2, VerificationData.auditLogs.userName,
				"verify usename of markdownsampleCode.txt asset ", "a135");
		verifyText(AuditLogsObjects.action2, VerificationData.auditLogs.update,
				"verify action of markdownsampleCode.txt asset ", "a136");
		verifyText(AuditLogsObjects.module2, VerificationData.auditLogs.roles,
				"verify module of  markdownsampleCode.txt asset ", "a137");
		verifyText(AuditLogsObjects.title2, VerificationData.auditLogs.updaterole,
				"verify text of  markdownsampleCode.txt asset ", "a138");

		verifyText(AuditLogsObjects.userName3, VerificationData.auditLogs.userName,
				"verify usename of malnutrition_small.ras asset ", "a135");
		verifyText(AuditLogsObjects.action3, VerificationData.auditLogs.create,
				"verify action of malnutrition_small.ras asset ", "a136");
		verifyText(AuditLogsObjects.module3, VerificationData.auditLogs.roles,
				"verify module of  malnutrition_small.ras asset ", "a137");
		verifyText(AuditLogsObjects.title3, VerificationData.auditLogs.fakeRole,
				"verify text of  malnutrition_small.ras asset ", "a138");

		verifyText(AuditLogsObjects.userName4, VerificationData.auditLogs.userName,
				"verify usename of malnutrition_small.ras asset ", "a135");
		verifyText(AuditLogsObjects.action4, VerificationData.auditLogs.create,
				"verify action of malnutrition_small.ras asset ", "a136");
		verifyText(AuditLogsObjects.module4, VerificationData.auditLogs.roles,
				"verify module of  malnutrition_small.ras asset ", "a137");
		verifyText(AuditLogsObjects.title4, VerificationData.auditLogs.newrole,
				"verify text of  malnutrition_small.ras asset ", "a138");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void verifyAuditLogForUsers()  {
		verifyText(AuditLogsObjects.userName6, VerificationData.auditLogs.userName,
				"verify usename of IportEntry.json asset ", "a135");
		verifyText(AuditLogsObjects.action6, VerificationData.auditLogs.update,
				"verify action of IportEntry.json asset ", "a136");
		verifyText(AuditLogsObjects.module6, VerificationData.auditLogs.userRoles,
				"verify module of  IportEntry.json asset ", "a137");
		verifyText(AuditLogsObjects.title6, VerificationData.auditLogs.abhinav1,
				"verify text of  IportEntry.json asset ", "a138");

		verifyText(AuditLogsObjects.userName7, VerificationData.auditLogs.userName,
				"verify usename of IMG_8186.mp4 asset ", "a135");
		verifyText(AuditLogsObjects.action7, VerificationData.auditLogs.update,
				"verify action of IMG_8186.mp4 asset ", "a136");
		verifyText(AuditLogsObjects.module7, VerificationData.auditLogs.userRoles,
				"verify module of  IMG_8186.mp4 asset ", "a137");
		verifyText(AuditLogsObjects.title7, VerificationData.auditLogs.abhinav1,
				"verify text of  IMG_8186.mp4 asset ", "a138");

		verifyText(AuditLogsObjects.userName8, VerificationData.auditLogs.userName,
				"verify usename of Freesample.svg asset ", "a135");
	//	verifyText(AuditLogsObjects.action8, VerificationData.auditLogs.share,
	//			"verify action of Freesample.svg asset ", "a136");
		verifyText(AuditLogsObjects.module8, VerificationData.auditLogs.user,
				"verify module of  Freesample.svg asset ", "a137");
		verifyText(AuditLogsObjects.title8, VerificationData.auditLogs.abhinav1,
				"verify text of  Freesample.svg asset ", "a138");

		verifyText(AuditLogsObjects.userName9, VerificationData.auditLogs.userName,
				"verify usename of contentstack.mp3 asset ", "a135");
	//	verifyText(AuditLogsObjects.action9, VerificationData.auditLogs.share,
	//			"verify action of contentstack.mp3 asset ", "a136");
		verifyText(AuditLogsObjects.module9, VerificationData.auditLogs.user,
				"verify module of  contentstack.mp3 asset ", "a137");
		verifyText(AuditLogsObjects.title9, VerificationData.auditLogs.abhinav1,
				"verify text of  contentstack.mp3 asset ", "a138");

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	
	public static void verifyAuditLogsForCreateWebhookForSpecificForm()
			 {

		click(AuditLogsObjects.auditLogIcon, "click on auditLog Icon", "a-76");
		verifyText(AuditLogsObjects.userName1, VerificationData.auditLogs.userName,
				"verify usename of a specific form action", "a77");
		verifyText(AuditLogsObjects.action1, VerificationData.auditLogs.create,
				"verify action of a specific form", "a78");
		verifyText(AuditLogsObjects.module1, VerificationData.auditLogs.moduleWebhook,
				"verify module of a specific form", "a79");
		verifyText(AuditLogsObjects.title1, VerificationData.auditLogs.webHookForSpecificForm,
				"verify text of webhook for a specific form", "a80");
	}

	
	public static void verifyAuditLogForImportEntry()  {

		verifyText(AuditLogsObjects.userName6, VerificationData.auditLogs.userName,
				"verify usename of imported entry", "a103");
		verifyText(AuditLogsObjects.action6, VerificationData.auditLogs.importentry,
				"verify action of imported entry", "a104");
		verifyText(AuditLogsObjects.module6, VerificationData.auditLogs.entry,
				"verify module of imported entry", "a105");
		// text(AuditLogs.title6, VerificationData.auditLogs.editedform,
		// "verify text of imported entry", "a106");
	}

	public static void verifyAuditLogForexportEntry()  {

		verifyText(AuditLogsObjects.userName5, VerificationData.auditLogs.userName,
				"verify usename of export entry", "a104");
		verifyText(AuditLogsObjects.action5, VerificationData.auditLogs.exprot,
				"verify action of export entry", "a105");
		verifyText(AuditLogsObjects.module5, VerificationData.auditLogs.entry,
				"verify module of  export entry", "a106");
		// text(AuditLogs.title5, VerificationData.auditLogs.editedform,
		// "verify text of  export entry", "a107");
	}

	public static void verifyAuditLogForCopyOfImportedEntry()  {

		verifyText(AuditLogsObjects.userName4, VerificationData.auditLogs.userName,
				"verify usename of copy of imported entry", "a105");
		verifyText(AuditLogsObjects.action4, VerificationData.auditLogs.create,
				"verify action of copy of imported entry", "a106");
		verifyText(AuditLogsObjects.module4, VerificationData.auditLogs.entry,
				"verify module of copy of imported entry", "a107");
		// text(AuditLogs.title4, VerificationData.auditLogs.copyOfImportedEntry,
		// "verify text of copy of imported entry", "a108");
	}

	public static void verifyAuditLogForEditEntry()  {

		verifyText(AuditLogsObjects.userName3, VerificationData.auditLogs.userName,
				"verify usename of edit entry", "a110");
		verifyText(AuditLogsObjects.action3, VerificationData.auditLogs.update,
				"verify action of edit entry", "a111");
		verifyText(AuditLogsObjects.module3, VerificationData.auditLogs.entry,
				"verify module of  edit entry", "a112");
		// text(AuditLogs.title3, VerificationData.auditLogs.editedEntry,
		// "verify text of  export entry", "a113");
	}

	public static void verifyAuditLogForDeleteEntry()  {

		verifyText(AuditLogsObjects.userName2, VerificationData.auditLogs.userName,
				"verify usename of delete entry", "a110");
		verifyText(AuditLogsObjects.action2, VerificationData.auditLogs.delete,
				"verify action of delete entry", "a111");
		verifyText(AuditLogsObjects.module2, VerificationData.auditLogs.entry,
				"verify module of  delete entry", "a112");
		// text(AuditLogs.title2, VerificationData.auditLogs.editedEntry,
		// "verify text of  delete entry", "a113");
	}

	public static void verifyAuditLogForCreateEntry()  {

		click(AuditLogsObjects.auditLogIcon, "click on auditLog Icon", "a-114");
		verifyText(AuditLogsObjects.userName1, VerificationData.auditLogs.userName,
				"verify usename of create entry", "a115");
		verifyText(AuditLogsObjects.action1, VerificationData.auditLogs.create,
				"verify action of create entry", "a116");
		verifyText(AuditLogsObjects.module1, VerificationData.auditLogs.entry,
				"verify module of  create entry", "a117");
		// text(AuditLogs.title1, VerificationData.auditLogs.importEntry,
		// "verify text of  create entry", "a118");
	}

	public static void verifyAuditLogForCreateEntryInSanityForm()
			 {

		click(AuditLogsObjects.auditLogIcon, "click on auditLog Icon", "a-120");
		verifyText(AuditLogsObjects.userName1, VerificationData.auditLogs.userName,
				"verify usename of sanity form entry", "a121");
		verifyText(AuditLogsObjects.action1, VerificationData.auditLogs.create,
				"verify action of sanity form entry", "a122");
		verifyText(AuditLogsObjects.module1, VerificationData.auditLogs.entry,
				"verify module of  sanity form entry", "a123");
		// text(AuditLogs.title1, VerificationData.auditLogs.importEntry,
		// "verify text of  sanity form entry", "a124");

		verifyText(AuditLogsObjects.userName2, VerificationData.auditLogs.userName,
				"verify usename of download asset ", "a125");
		verifyText(AuditLogsObjects.action2, VerificationData.auditLogs.create,
				"verify action of download asset ", "a126");
		verifyText(AuditLogsObjects.module2, VerificationData.auditLogs.asset,
				"verify module of  download asset ", "a127");
		// text(AuditLogs.title2, VerificationData.auditLogs.downloadJpg,
		// "verify text of  download asset ", "a128");
	}



	public static void verifyAuditLogForEditAsset()  {

		click(AuditLogsObjects.auditLogIcon, "click on auditLog Icon", "a-120");
		verifyText(AuditLogsObjects.userName1, VerificationData.auditLogs.userName,
				"verify usename of char.jpg asset", "a121");
		verifyText(AuditLogsObjects.action1, VerificationData.auditLogs.update,
				"verify action of char.jpg asset", "a122");
		verifyText(AuditLogsObjects.module1, VerificationData.auditLogs.asset,
				"verify module of  char.jpg asset", "a123");
		verifyText(AuditLogsObjects.title1, VerificationData.auditLogs.charImg,
				"verify text of  char.jpg asset", "a124");

		verifyText(AuditLogsObjects.userName2, VerificationData.auditLogs.userName,
				"verify usename of XENU.ZIP asset ", "a125");
		verifyText(AuditLogsObjects.action2, VerificationData.auditLogs.create,
				"verify action of XENU.ZIP asset ", "a126");
		verifyText(AuditLogsObjects.module2, VerificationData.auditLogs.asset,
				"verify module of  XENU.ZIP asset ", "a127");
		verifyText(AuditLogsObjects.title2, VerificationData.auditLogs.xENU,
				"verify text of  XENU.ZIP asset ", "a128");
	}

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//============================================================================================================================================
	
	
	
	
	//Filters	
	
	
	
	public static void init() {
		
		mousehover(AuditLogsObjects.mouseHoverStack, "Mouse hover on stack to open the app", "image1");
		click(AuditLogsObjects.clickOnStack, "Click on stack to open the app", "image2");
		click(AuditLogsObjects.clickOnAuditLog, "Click on audit log tab", "image3");
		
	}
	
	public static void checkFilters() {		
		verifyText(AuditLogsObjects.filters, "FILTERS", "Verifies the text is present or not", "tc-21");
		elementIsPresent(AuditLogsObjects.hideFilterIcon, "Filter image is present or not", "tc-22");
		//click(AuditLogsObjects.hideFilterIcon, "Click on Filter image", "tc-23");
		elementIsPresent(AuditLogsObjects.showFilterIcon, "Verifies the open filter window image", "tc-24");
		//click(AuditLogsObjects.showFilterIcon, "Click on Show filter icon to display the filter window", "tc-25");
	}

	public static void checkUsersFilter() {
		verifyText(AuditLogsObjects.usersText, "USERS", "Verifies text 'Users' is present or not", "tc-34");
		verifyText(AuditLogsObjects.usersMe, "Me", "Verifies Me checkbox present or not", "tc-26");
		click(AuditLogsObjects.usersMe, "Click on Me checkbox", "tc-27");
		
		verifyText(AuditLogsObjects.usernameDashboard, "USERNAME", "Verifies the text is present or not", "tc-28");
		verifyText(AuditLogsObjects.usernameValue1, "Me", "Verifies the text is present or not", "tc-29");
		verifyText(AuditLogsObjects.usernameValue2, "Me", "Verifies the text is present or not", "tc-30");
		verifyText(AuditLogsObjects.usernameValue3, "Me", "Verifies the text is present or not", "tc-31");
		verifyText(AuditLogsObjects.usernameValue4, "Me", "Verifies the text is present or not", "tc-32");
		verifyText(AuditLogsObjects.usernameValue5, "Me", "Verifies the text is present or not", "tc-33");
	
		
		click(AuditLogsObjects.usersMe, "Click on Me checkbox to uncheck", "tc-27");
	}
	
	public static void checkActionsFilterCreate() {
		verifyText(AuditLogsObjects.actionText, "ACTIONS", "Verifies text 'Actions' is present or not", "tc-35");
		verifyText(AuditLogsObjects.createAction, "Create", "Verifies text 'Create' is present or not", "tc-36");
		click(AuditLogsObjects.createAction, "Click on Create checkbox", "tc-37");
		
		verifyText(AuditLogsObjects.actionDashboard, "ACTION", "Verifies the text is present or not", "tc-38");
		verifyText(AuditLogsObjects.actionValue1, "Create", "Verifies the text is present or not", "tc-39");
		verifyText(AuditLogsObjects.actionValue2, "Create", "Verifies the text is present or not", "tc-40");
		verifyText(AuditLogsObjects.actionValue3, "Create", "Verifies the text is present or not", "tc-41");
		verifyText(AuditLogsObjects.actionValue4, "Create", "Verifies the text is present or not", "tc-42");
		verifyText(AuditLogsObjects.actionValue5, "Create", "Verifies the text is present or not", "tc-43");
		
		
		click(AuditLogsObjects.createAction, "Click on Create checkbox to uncheck", "tc-43");
		
	}
	
	public static void checkActionsFilterDelete() {
		verifyText(AuditLogsObjects.deleteAction, "Delete", "Verifies text 'Delete' is present or not", "tc-44");
		click(AuditLogsObjects.deleteAction, "Click on Delete checkbox", "tc-45");
		
		verifyText(AuditLogsObjects.actionDashboard, "ACTION", "Verifies the text is present or not", "tc-46");
		verifyText(AuditLogsObjects.actionValue1, "Delete", "Verifies the text is present or not", "tc-47");
		verifyText(AuditLogsObjects.actionValue2, "Delete", "Verifies the text is present or not", "tc-48");
		verifyText(AuditLogsObjects.actionValue3, "Delete", "Verifies the text is present or not", "tc-49");
		verifyText(AuditLogsObjects.actionValue4, "Delete", "Verifies the text is present or not", "tc-50");
		verifyText(AuditLogsObjects.actionValue5, "Delete", "Verifies the text is present or not", "tc-51");
		
		click(AuditLogsObjects.deleteAction, "Click on Delete checkbox to uncheck", "tc-52");
		
	}
		
	public static void checkActionsFilterUpdate() {
		verifyText(AuditLogsObjects.updateAction, "Update", "Verifies text 'Update' is present or not", "tc-53");
		click(AuditLogsObjects.updateAction, "Click on Update checkbox", "tc-54");
		
		verifyText(AuditLogsObjects.actionDashboard, "ACTION", "Verifies the text is present or not", "tc-55");
		verifyText(AuditLogsObjects.actionValue1, "Update", "Verifies the text is present or not", "tc-56");
		verifyText(AuditLogsObjects.actionValue2, "Update", "Verifies the text is present or not", "tc-57");
		verifyText(AuditLogsObjects.actionValue3, "Update", "Verifies the text is present or not", "tc-58");
		verifyText(AuditLogsObjects.actionValue4, "Update", "Verifies the text is present or not", "tc-59");
		
		
		click(AuditLogsObjects.updateAction, "Click on Update checkbox to uncheck", "tc-61");
		
	}
	
	public static void checkActionsFilterImport() {
		verifyText(AuditLogsObjects.importAction, "Import", "Verifies text 'Import' is present or not", "tc-62");
		click(AuditLogsObjects.importAction, "Click on Import checkbox", "tc-63");
		
		verifyText(AuditLogsObjects.actionDashboard, "ACTION", "Verifies the text is present or not", "tc-64");
		verifyText(AuditLogsObjects.actionValue1, "Import", "Verifies the text is present or not", "tc-65");
		verifyText(AuditLogsObjects.actionValue2, "Import", "Verifies the text is present or not", "tc-66");
		verifyText(AuditLogsObjects.actionValue3, "Import", "Verifies the text is present or not", "tc-67");
		verifyText(AuditLogsObjects.actionValue4, "Import", "Verifies the text is present or not", "tc-68");
		verifyText(AuditLogsObjects.actionValue5, "Import", "Verifies the text is present or not", "tc-69");
		
		click(AuditLogsObjects.importAction, "Click on Import checkbox to uncheck", "tc-70");
		
	}
	
	public static void checkActionsFilterExport() {
		verifyText(AuditLogsObjects.exportAction, "Export", "Verifies text 'Export' is present or not", "tc-71");
		click(AuditLogsObjects.exportAction, "Click on Export checkbox", "tc-72");
		
		verifyText(AuditLogsObjects.actionDashboard, "ACTION", "Verifies the text is present or not", "tc-73");
		verifyText(AuditLogsObjects.actionValue1, "Export", "Verifies the text is present or not", "tc-74");
		verifyText(AuditLogsObjects.actionValue2, "Export", "Verifies the text is present or not", "tc-75");
		
		
		click(AuditLogsObjects.exportAction, "Click on Export checkbox to uncheck", "tc-79");
		
	}
	
	public static void checkActionsFilterShare() {
		verifyText(AuditLogsObjects.shareAction, "Share", "Verifies text 'Share' is present or not", "tc-80");
		click(AuditLogsObjects.shareAction, "Click on Share checkbox", "tc-81");
		
		verifyText(AuditLogsObjects.actionDashboard, "ACTION", "Verifies the text is present or not", "tc-82");
		verifyText(AuditLogsObjects.actionValue1, "Share", "Verifies the text is present or not", "tc-83");
		/*verifyText(AuditLogsObjects.actionValue2, "Share", "Verifies the text is present or not", "tc-84");
		verifyText(AuditLogsObjects.actionValue3, "Share", "Verifies the text is present or not", "tc-85");
		verifyText(AuditLogsObjects.actionValue4, "Share", "Verifies the text is present or not", "tc-86");
		verifyText(AuditLogsObjects.actionValue5, "Share", "Verifies the text is present or not", "tc-87");
		*/
		click(AuditLogsObjects.shareAction, "Click on Share checkbox to uncheck", "tc-88");
		
	}
	
	public static void checkActionsFilterUnshare() {
		verifyText(AuditLogsObjects.unshareAction, "Unshare", "Verifies text 'Share' is present or not", "tc-89");
		click(AuditLogsObjects.unshareAction, "Click on Unshare checkbox", "tc-90");
		
		verifyText(AuditLogsObjects.actionDashboard, "ACTION", "Verifies the text is present or not", "tc-91");
		verifyText(AuditLogsObjects.actionValue1, "Unshare", "Verifies the text is present or not", "tc-92");
		verifyText(AuditLogsObjects.actionValue2, "Unshare", "Verifies the text is present or not", "tc-93");
		verifyText(AuditLogsObjects.actionValue3, "Unshare", "Verifies the text is present or not", "tc-94");
		verifyText(AuditLogsObjects.actionValue4, "Unshare", "Verifies the text is present or not", "tc-95");
		verifyText(AuditLogsObjects.actionValue5, "Unshare", "Verifies the text is present or not", "tc-96");
		
		click(AuditLogsObjects.unshareAction, "Click on Unshare checkbox to uncheck", "tc-97");
		
	}
	
	
	
	public static void checkModuleFilterForm() {
		verifyText(AuditLogsObjects.modulesText, "MODULES", "Verifies text 'Modules' is present or not", "img1");
		verifyText(AuditLogsObjects.modulesForm, "Form", "Verifies text 'Form' is present or not", "img2");
		click(AuditLogsObjects.modulesForm, "Click on Form checkbox", "img3");
		
		verifyText(AuditLogsObjects.moduleDashboard, "MODULE", "Verifies the text is present or not", "img4");
		verifyText(AuditLogsObjects.moduleValue1, "Content Type", "Verifies the text is present or not", "img5");
		verifyText(AuditLogsObjects.moduleValue2, "Content Type", "Verifies the text is present or not", "img6");
		verifyText(AuditLogsObjects.moduleValue3, "Content Type", "Verifies the text is present or not", "img7");
		verifyText(AuditLogsObjects.moduleValue4, "Content Type", "Verifies the text is present or not", "img8");
		verifyText(AuditLogsObjects.moduleValue5, "Content Type", "Verifies the text is present or not", "img9");
		
		click(AuditLogsObjects.modulesForm, "Click on Content Type checkbox to uncheck", "img10");
		
	}
	
	public static void checkModuleFilterEntry() {
		verifyText(AuditLogsObjects.modulesEntry, "Entry", "Verifies text 'Entry' is present or not", "img11");
		click(AuditLogsObjects.modulesEntry, "Click on Entry checkbox", "img12");
		
		verifyText(AuditLogsObjects.moduleDashboard, "MODULE", "Verifies the text is present or not", "img13");
		verifyText(AuditLogsObjects.moduleValue1, "Entry", "Verifies the text is present or not", "img14");
		verifyText(AuditLogsObjects.moduleValue2, "Entry", "Verifies the text is present or not", "img15");
		verifyText(AuditLogsObjects.moduleValue3, "Entry", "Verifies the text is present or not", "img16");
		verifyText(AuditLogsObjects.moduleValue4, "Entry", "Verifies the text is present or not", "img17");
		verifyText(AuditLogsObjects.moduleValue5, "Entry", "Verifies the text is present or not", "img18");
		
		click(AuditLogsObjects.modulesEntry, "Click on Entry checkbox to uncheck", "img19");
		
	}
	
	public static void checkModuleFilterAsset() {
		verifyText(AuditLogsObjects.modulesAsset, "Asset", "Verifies text 'Asset' is present or not", "img20");
		click(AuditLogsObjects.modulesAsset, "Click on Asset checkbox", "img21");
		
		verifyText(AuditLogsObjects.moduleDashboard, "MODULE", "Verifies the text is present or not", "img22");
		verifyText(AuditLogsObjects.moduleValue1, "Asset", "Verifies the text is present or not", "img23");
		verifyText(AuditLogsObjects.moduleValue2, "Asset", "Verifies the text is present or not", "img24");
	/*	verifyText(AuditLogsObjects.moduleValue3, "Asset", "Verifies the text is present or not", "img25");
		verifyText(AuditLogsObjects.moduleValue4, "Asset", "Verifies the text is present or not", "img26");
		verifyText(AuditLogsObjects.moduleValue5, "Asset", "Verifies the text is present or not", "img27");
	*/	
		click(AuditLogsObjects.modulesAsset, "Click on Entry checkbox to uncheck", "img28");
		
	}
	
	public static void checkModuleFilterUser() {
		verifyText(AuditLogsObjects.modulesUser, "User", "Verifies text 'User' is present or not", "img29");
		click(AuditLogsObjects.modulesUser, "Click on User checkbox", "img30");
		
		verifyText(AuditLogsObjects.moduleDashboard, "MODULE", "Verifies the text is present or not", "img31");
		verifyText(AuditLogsObjects.moduleValue1, "User", "Verifies the text is present or not", "img32");
	/*	verifyText(AuditLogsObjects.moduleValue2, "User", "Verifies the text is present or not", "img33");
		verifyText(AuditLogsObjects.moduleValue3, "User", "Verifies the text is present or not", "img34");
		verifyText(AuditLogsObjects.moduleValue4, "User", "Verifies the text is present or not", "img35");
		verifyText(AuditLogsObjects.moduleValue5, "User", "Verifies the text is present or not", "img36");
	*/	
		click(AuditLogsObjects.modulesUser, "Click on User checkbox to uncheck", "img37");
		
	}
	
	public static void checkModuleFilterLocale() {
		verifyText(AuditLogsObjects.modulesLocale, "Locale", "Verifies text 'Locale' is present or not", "img38");
		click(AuditLogsObjects.modulesLocale, "Click on Locale checkbox", "img39");
		
		verifyText(AuditLogsObjects.moduleDashboard, "MODULE", "Verifies the text is present or not", "img40");
		verifyText(AuditLogsObjects.moduleValue1, "Locale", "Verifies the text is present or not", "img41");
		verifyText(AuditLogsObjects.moduleValue2, "Locale", "Verifies the text is present or not", "img42");
		verifyText(AuditLogsObjects.moduleValue3, "Locale", "Verifies the text is present or not", "img43");
		verifyText(AuditLogsObjects.moduleValue4, "Locale", "Verifies the text is present or not", "img44");
		verifyText(AuditLogsObjects.moduleValue5, "Locale", "Verifies the text is present or not", "img45");
		
		click(AuditLogsObjects.modulesLocale, "Click on User checkbox to uncheck", "img46");
		
	}
	
	public static void checkModuleFilterEnvironment() {
		verifyText(AuditLogsObjects.modulesEnvironment, "Environment", "Verifies text 'Environment' is present or not", "img47");
		click(AuditLogsObjects.modulesEnvironment, "Click on Environment checkbox", "img48");
		
		verifyText(AuditLogsObjects.moduleDashboard, "MODULE", "Verifies the text is present or not", "img49");
		verifyText(AuditLogsObjects.moduleValue1, "Environment", "Verifies the text is present or not", "img50");
		verifyText(AuditLogsObjects.moduleValue2, "Environment", "Verifies the text is present or not", "img51");
		verifyText(AuditLogsObjects.moduleValue3, "Environment", "Verifies the text is present or not", "img52");
		verifyText(AuditLogsObjects.moduleValue4, "Environment", "Verifies the text is present or not", "img53");
		verifyText(AuditLogsObjects.moduleValue5, "Environment", "Verifies the text is present or not", "img54");
		
		click(AuditLogsObjects.modulesEnvironment, "Click on Environment checkbox to uncheck", "img55");
		
	}
	
	public static void checkModuleFilterSite() {
		verifyText(AuditLogsObjects.modulesSite, "Site", "Verifies text 'Site' is present or not", "img56");
		click(AuditLogsObjects.modulesSite, "Click on Site checkbox", "img57");
		
		verifyText(AuditLogsObjects.moduleDashboard, "MODULE", "Verifies the text is present or not", "img58");
		verifyText(AuditLogsObjects.moduleValue1, "Site", "Verifies the text is present or not", "img59");
	/*	verifyText(AuditLogsObjects.moduleValue2, "Site", "Verifies the text is present or not", "img60");
		verifyText(AuditLogsObjects.moduleValue3, "Site", "Verifies the text is present or not", "img61");
		verifyText(AuditLogsObjects.moduleValue4, "Site", "Verifies the text is present or not", "img62");
		verifyText(AuditLogsObjects.moduleValue5, "Site", "Verifies the text is present or not", "img63");
	*/	
		click(AuditLogsObjects.modulesSite, "Click on Site checkbox to uncheck", "img64");
		
	}
	
	public static void checkModuleFilterRoles() {
		verifyText(AuditLogsObjects.modulesRoles, "Roles", "Verifies text 'Roles' is present or not", "img65");
		click(AuditLogsObjects.modulesRoles, "Click on Roles checkbox", "img66");
		
		verifyText(AuditLogsObjects.moduleDashboard, "MODULE", "Verifies the text is present or not", "img67");
		verifyText(AuditLogsObjects.moduleValue1, "Roles", "Verifies the text is present or not", "img68");
		verifyText(AuditLogsObjects.moduleValue2, "Roles", "Verifies the text is present or not", "img69");
		verifyText(AuditLogsObjects.moduleValue3, "Roles", "Verifies the text is present or not", "img70");
		verifyText(AuditLogsObjects.moduleValue4, "Roles", "Verifies the text is present or not", "img71");
		verifyText(AuditLogsObjects.moduleValue5, "Roles", "Verifies the text is present or not", "img72");
		
		click(AuditLogsObjects.modulesRoles, "Click on Roles checkbox to uncheck", "img73");
		
	}
	
	public static void checkModuleFilterWebhook() {
		verifyText(AuditLogsObjects.modulesWebhook, "Webhook", "Verifies text 'Webhook' is present or not", "img74");
		click(AuditLogsObjects.modulesWebhook, "Click on Webhook checkbox", "img75");
		
		verifyText(AuditLogsObjects.moduleDashboard, "MODULE", "Verifies the text is present or not", "img76");
		verifyText(AuditLogsObjects.moduleValue1, "Webhook", "Verifies the text is present or not", "img77");
		verifyText(AuditLogsObjects.moduleValue2, "Webhook", "Verifies the text is present or not", "img78");
		verifyText(AuditLogsObjects.moduleValue3, "Webhook", "Verifies the text is present or not", "img79");
		verifyText(AuditLogsObjects.moduleValue4, "Webhook", "Verifies the text is present or not", "img80");
		verifyText(AuditLogsObjects.moduleValue5, "Webhook", "Verifies the text is present or not", "img81");
		
		click(AuditLogsObjects.modulesWebhook, "Click on Webhook checkbox to uncheck", "img82");
		
	}
	
	
	
	
}

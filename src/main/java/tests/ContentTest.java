package tests;

import java.awt.AWTException;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.built.io.automationframework.BasePageActions;
import com.built.io.automationframework.ExcelUtils;

import data.VerificationData;
import page.actions.AuditLogActions;
import page.actions.ContentTypeActions;
import page.actions.CopyContentTypeActions;
import page.actions.WebHookActions;
import page.objects.ContentObjects;
import page.objects.CopyContentTypeObjects;
import page.objects.DashboardObjects;

public class ContentTest extends ContentTypeActions {
	
	
	@Test(priority = 1, groups = "Content type")
	public static void createEmptyContentTYpe()  {

		addContentType(ExcelUtils.readCell(1, ExcelUtils.getCell("Dummy.form")),ExcelUtils.readCell(1, ExcelUtils.getCell("form.description")),"af1") ;
		createLebel() ;
		saveSchemaActions("df2");
		waitForSometime(1000);
		
	}

	@Test(priority = 2, groups = "Audit log")
	public static void verifyauditlogOfCreateSanityLabel()  {	

		AuditLogActions.verifyAuditLogForsanityLabel() ;
	}
	
	@Test(priority = 3, groups = "Audit log")
	public static void verifyauditlogOfCreateEmptyContentType()  {	

		AuditLogActions.verifyAuditLogForCreateEmptyContentType() ;
	}
	
	@Test(priority = 4, groups = "Content type")
	public static void importContentType() throws Throwable {
		
	
		System.out.println("file path"+ExcelUtils.readCell(1, ExcelUtils.getCell("Imported.form")));
		//importContentType(ContentObjects.browse,  ExcelUtils.readCell(1, ExcelUtils.getCell("Imported.form"))) ;	
		String importedForm = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("Imported.form")))
		.getAbsolutePath();
		System.out.println("content type path " +importedForm);
		importContentType(ContentObjects.browse, importedForm) ;
	}


	
  @Test(priority = 5, groups = "Content type")
	public static void copyContentType()  {	
		
		copyContentTypeAction() ;
		CopyContentTypeActions.verifyCopiedContetTypeActionsActions() ;
		cancelSchema() ;
	
	}
	
  @Test(priority = 6, groups = "Webhook")
  public static void createWebhookForAspecificContenttype()  {	
	  WebHookActions.clickOnWebhookTab();
	  WebHookActions.createWebhookForAspecificForm() ;
  }
	
  @Test(priority = 7, groups = "Webhook")
  public static void verifyAuditLogsForCreateWebhookForAspecificContentType()  {	
	
	  AuditLogActions.verifyAuditLogsForCreateWebhookForAspecificContentType() ;
  }
	@Test(priority = 8, groups = "Audit log")
	public static void verifyauditlogOfCopyContentType()  {	

		AuditLogActions.verifyAuditLogForCopyForm() ;
	}
	
	@Test(priority = 9, groups = "Audit log")
	public static void verifyauditlogOfImportContentType()  {	

		AuditLogActions.verifyIportFormAuditLogs() ;
	}
  
  
   @Test(priority = 10, groups = "Content type")
	public static void editContentType()  {	
		editContentTypeAction();
		//deleteField(ContentObjects.text1,"df1") ;
		 waitForSometime(1000);
		saveSchemaActions("df2");
		
	}
	
	/*@Test(priority = 11, groups = "Content type")
	public static void exportContenType() throws AWTException  {	
		//exportContentTypeActions() ;
	}*/
	
	@Test(priority = 12, groups = "Content type")
	public static void searchContenType()  {	
		searchContentTypeAction() ;
	}
	
	@Test(priority = 13, groups = "Content type")
	public static void paginationOfContentType()  {	

		verifyPaginationOfContenttypeActions() ;
	}
	
	@Test(priority = 14, groups = "Content type")
	public static void deleteContentType()  {	

		deleteContentTypeAction() ;
	}


	@Test(priority = 15, groups = "Content type")
	public void createContentType() throws InterruptedException  {

	
		addContentTypeForSingle(ExcelUtils.readCell(1, ExcelUtils.getCell("form.name")),ExcelUtils.readCell(1, ExcelUtils.getCell("form.description")),"af1") ;
		
		 waitForSometime(1000);
		
		addField(ContentObjects.singleLine,ContentObjects.singleLineLabel,"add single line field","f1") ;
	
		addField(ContentObjects.multipleFieled,ContentObjects.multipleFieledLabel,"add muliline field","f2") ;
	    waitForSometime(1000);
	    addRTEField(ContentObjects.rte,ContentObjects.rteLabel,"add rte field","f4") ;
		// waitForSometime(1000);
		addField(ContentObjects.markDown,ContentObjects.markDownLabel,"add markdown field","f5") ;
		// waitForSometime(1000);
		addField(ContentObjects.number,ContentObjects.numberLabel,"add number field","f6") ;
		// waitForSometime(1000);
		
		BasePageActions.dragAndDrop(ContentObjects.booleanfield, ContentObjects.dropfield, "add boolean field", "7");
		// waitForSometime(1000);
		BasePageActions.dragAndDrop(ContentObjects.date, ContentObjects.dropfield, "add boolean field", "7");
		
		//addField(ContentObjects.date,ContentObjects.dateLabel,"add date field","f8") ;
		// waitForSometime(1000);
		addField(ContentObjects.file,ContentObjects.fileLabel,"add file field","f9") ;
		// waitForSometime(1000);
		addField(ContentObjects.link,ContentObjects.linkLabel,"add link field","f10") ;
		// waitForSometime(1000);
	
		// waitForSometime(1000);
		
		//BasePageActions.dragAndDrop(ContentObjects.reference, ContentObjects.dropfield, "add boolean field", "7");
		//addReferenceField() ;
		
		// waitForSometime(1000);
		/*BasePageActions.dragAndDrop(ContentObjects.group, ContentObjects.dropfield, "add boolean field", "7");
		
		 waitForSometime(1000);
		BasePageActions.dragAndDrop(ContentObjects.link, ContentObjects.groupElement, "add boolean field", "7");
		// waitForSometime(1000);*/
		saveSchemaActions("f13") ;
		 //waitForSometime(2000);
	
	   }
	
	
		@Test(priority = 16, groups = "Content type")
		public static void exportContenTypeWithEntry() throws AWTException  {	
			exportContentTypeWithEntryActions() ;
		}
		
	
		@Test(priority = 17, groups = "Audit log")
		public static void verifyauditlogOfExportContentType()  {	

			AuditLogActions.verifyExportFormAuditLogs() ;
		}
		
		
		@Test(priority = 18, groups = "Audit log")
		public static void verifyauditlogOfCreateContentType()  {	

			AuditLogActions.verifyAuditLogForCreateSanityForm() ;
		}
		
		
		@Test(priority = 19, groups = "Audit log")
		public static void verifyauditlogOfDeleteContentType()  {	

			AuditLogActions.verifyAuditLogForDelete() ;
		}

		@Test(priority = 20, groups = "Audit log")
		public static void verifyauditlogOfUpdateContentType()  {	

			AuditLogActions.verifyAuditLogForEditForm() ;
		}
		
    
		@Test(priority = 21, groups = "Label view")
		public static void verifyLabelViewPage()  {	
		
			verifyLabelViewPageActions() ;
		}
	
		@Test(priority = 22, groups = "Label view")
		public static void createChildLabel()  {	
			
			createLebelFromLabelView() ;
		}
		
		@Test(priority = 23, groups = "Label view")
		public static void editLabe()  {	
			
			editLableActions() ;
		}
		
		@Test(priority = 24, groups = "Label view")
		public static void deletedLabel()  {	
			
			deleteLableActions() ;
	   }
	
		@Test(priority = 25, groups = "Audit log")
		public static void verifyauditlogOfDeleteLabel()  {	

			AuditLogActions.verifyAuditLogForDeleteLabel() ;
		}
		
		@Test(priority = 26, groups = "Audit log")
		public static void verifyauditlogOfUpdateLabel()  {	

			AuditLogActions.verifyAuditLogForUpdateLabel() ;
		}
		
		@Test(priority = 27, groups = "Audit log")
		public static void verifyauditlogOfCreateLabel()  {	

			AuditLogActions.verifyAuditLogForCreateLabel() ;
		}
		

		@Test(priority = 28, groups = "Content type")
		public static void createSingleContentBlock()  {	

			addContentBlogForSingle(ExcelUtils.readCell(1, ExcelUtils.getCell("Content.block.single")),"cb1") ;
			 waitForSometime(4000);
			addField(ContentObjects.singleLine,ContentObjects.singleLineLabel,"add single line field","cb2") ;
		
			addField(ContentObjects.multipleFieled,ContentObjects.multipleFieledLabel,"add muliline field","cb3") ;
			
			 
			addRTEField(ContentObjects.rte,ContentObjects.rteLabel,"add rte field","cb5") ;
				 waitForSometime(1000);
				addField(ContentObjects.markDown,ContentObjects.markDownLabel,"add markdown field","cb6") ;
				// waitForSometime(1000);
				addField(ContentObjects.number,ContentObjects.numberLabel,"add number field","cb7") ;
				// waitForSometime(1000);
				
				BasePageActions.dragAndDrop(ContentObjects.booleanfield, ContentObjects.dropfield, "add boolean field", "7");
				// waitForSometime(1000);
				BasePageActions.dragAndDrop(ContentObjects.date, ContentObjects.dropfield, "add boolean field", "7");
				
				//addField(ContentObjects.date,ContentObjects.dateLabel,"add date field","f8") ;
				// waitForSometime(1000);
				addField(ContentObjects.file,ContentObjects.fileLabel,"add file field","f9") ;
				// waitForSometime(1000);
				addField(ContentObjects.link,ContentObjects.linkLabel,"add link field","f10") ;
				// waitForSometime(1000);
			
				// waitForSometime(1000);
				
				BasePageActions.dragAndDrop(ContentObjects.reference, ContentObjects.dropfield, "add boolean field", "7");
				addReferenceField() ;
				
				// waitForSometime(1000);
				/*BasePageActions.dragAndDrop(ContentObjects.group, ContentObjects.dropfield, "add boolean field", "7");
				
				 waitForSometime(1000);
				BasePageActions.dragAndDrop(ContentObjects.link, ContentObjects.groupElement, "add boolean field", "7");
				// waitForSometime(1000);*/
		    saveSchemaActions("f13") ;
				 //waitForSometime(2000);
	
		
		
		}
		
		@Test(priority = 29, groups = "Content type")
		public static void createMultiplecontentBlock()  {	

			addContentBlogForSingle(ExcelUtils.readCell(1, ExcelUtils.getCell("Content.block.set")),"23") ;
			 waitForSometime(4000);
			addField(ContentObjects.singleLine,ContentObjects.singleLineLabel,"add single line field","f1") ;
			addField(ContentObjects.multipleFieled,ContentObjects.multipleFieledLabel,"add muliline field","f2") ;
			addRTEField(ContentObjects.rte,ContentObjects.rteLabel,"add rte field","f4") ;
			 waitForSometime(1000);
			addField(ContentObjects.markDown,ContentObjects.markDownLabel,"add markdown field","f5") ;
			// waitForSometime(1000);
			addField(ContentObjects.number,ContentObjects.numberLabel,"add number field","f6") ;
			// waitForSometime(1000);
			BasePageActions.dragAndDrop(ContentObjects.booleanfield, ContentObjects.dropfield, "add boolean field", "7");
			// waitForSometime(1000);
			BasePageActions.dragAndDrop(ContentObjects.date, ContentObjects.dropfield, "add boolean field", "7");
			
			//addField(ContentObjects.date,ContentObjects.dateLabel,"add date field","f8") ;
			// waitForSometime(1000);
			addField(ContentObjects.file,ContentObjects.fileLabel,"add file field","f9") ;
			// waitForSometime(1000);
			addField(ContentObjects.link,ContentObjects.linkLabel,"add link field","f10") ;
			// waitForSometime(1000);
		
			// waitForSometime(1000);
			
			BasePageActions.dragAndDrop(ContentObjects.reference, ContentObjects.dropfield, "add boolean field", "7");
			addReferenceField() ;
			
			// waitForSometime(1000);
			/*BasePageActions.dragAndDrop(ContentObjects.group, ContentObjects.dropfield, "add boolean field", "7");
			
			 waitForSometime(1000);
			BasePageActions.dragAndDrop(ContentObjects.link, ContentObjects.groupElement, "add boolean field", "7");
			// waitForSometime(1000);*/
		saveSchemaActions("f13") ;
			 //waitForSometime(2000);
			
		}
		
		
		@Test(priority = 30, groups = "Audit log")
		public static void verifyAuditLogsOfCreateSetContentBlock()  {	

			AuditLogActions.verifyAuditLogForCreateSetContentBlock();
		}
		
		@Test(priority = 31, groups = "Audit log")
		public static void verifyAuditLogsOfCreateSingleContentBlock()  {	

			AuditLogActions.verifyAuditLogForCreateSingleContentBlock();
		}
		
}

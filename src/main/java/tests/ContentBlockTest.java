package tests;

import java.awt.AWTException;
import java.io.File;

import org.testng.annotations.Test;

import page.actions.CopyContentTypeActions;
import page.actions.ContentBlockActions;
import page.objects.ContentBlockObjects;
import page.objects.ContentObjects;
import page.objects.EntryPageObjects;

import com.built.io.automationframework.BasePageActions;
import com.built.io.automationframework.ExcelUtils;

import data.VerificationData;

public class ContentBlockTest extends ContentBlockActions {
		
	@Test(priority = 1, groups = "Content Block")
	public static void importSingleContentBlock() throws Throwable {
		String importedForm = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("import.single.contentblock")))
		.getAbsolutePath();
		System.out.println("content type path " +importedForm);
		importContentType( importedForm) ;
	}
	
	
	 @Test(priority = 2, groups = "Content Block")
		public static void exportSingleContentBlock() throws AWTException  {	
			
		 exportContentType() ;
	}
	
	 @Test(priority = 3, groups = "Content Block")
		public static void copySingleContentBlock()  {	
			
			copyContentTypeAction(VerificationData.CopyForm.formTitlt1) ;
			verifyCopiedContetTypeActionsActions() ;
	}
	 
	 @Test(priority = 4, groups = "Content Block")
		public static void editSingleContentBlock()  {	
			
		 editContentTypeAction(ContentBlockObjects.secondCT) ;
	}
	
	 @Test(priority = 5, groups = "Content Block")
		public static void deleteSingleContentBlock()  {	
			
		 deleteContentTypeAction(ContentBlockObjects.secondCT) ;
		 deleteFirstContentTypeAction(ContentBlockObjects.firstCT) ;
	}
	 
	 
	/* @Test(priority = 6, groups = "Audit Log")
		public static void verifyAuditLogOfDeleteContentBlock() throws AWTException  {	
			
		 verifyAuditLogOFDeleteSingleContentBlock() ;
	}
	 
	 @Test(priority = 7, groups = "Audit Log")
		public static void verifyAuditLogOfEditContentBlock() throws AWTException  {	
			
		 verifyAuditLogOFEditSingleContentBlock() ;
	}
	 
	 @Test(priority = 8, groups = "Audit Log")
		public static void verifyAuditLogOfCopyContentBlock() throws AWTException  {	
			
		 verifyAuditLogOFCopySingleContentBlock() ;
	}
	 
	 @Test(priority = 9, groups = "Audit Log")
		public static void verifyAuditLogOfExportContentBlock() throws AWTException  {	
			
		 verifyAuditLogOFExportSingleContentBlock() ;
	}
	 
	 @Test(priority = 10, groups = "Audit Log")
		public static void verifyAuditLogOfImportContentBlock() throws AWTException  {	
			
		 verifyIportFormAuditLogs() ;
	}
	 
	 */ 
	   @Test(priority = 11, groups = "Content type")
		public static void createSingleContentBlock()  {	

			addContentBlogForSingle(ExcelUtils.readCell(1, ExcelUtils.getCell("Content.block.single")),"23") ;	
			createContentType() ;
		
		}
		

	   @Test(priority = 12, groups = "Content type")
		public static void createEntryInSingleContentBlock()  {	

		   
		   createEntryAction(ContentBlockObjects.firstCT ,ExcelUtils.readCell(1, ExcelUtils.getCell("Entry.single.contentblock"))) ;
		
		}
	   
	/*   @Test(priority = 13, groups = "Audit Log")
		public static void verifyAuditLogOfCreateContentBlock() throws AWTException  {	
			
		   verifyAuditLogOFCreateSingleContentBlock() ;
	  }
	 */
	   
	   
	 
	 
	 
 @Test(priority = 14, groups = "Content Block")
		public static void importMultipleContentBlock() throws Throwable {
			String importedForm = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("import.multiple.contentblock")))
			.getAbsolutePath();
			System.out.println("content type path " +importedForm);
			importContentType( importedForm) ;
		}
		
		
		 @Test(priority = 15, groups = "Content Block")
			public static void exportMultipleContentBlock() throws AWTException  {	
				
			 exportContentType() ;
		}
		
		 @Test(priority = 16, groups = "Content Block")
			public static void copyMultipleContentBlock()  {	
				
				copyContentTypeAction(VerificationData.CopyForm.formTitlt2) ;
				verifyCopiedContetTypeActionsActions() ;
		}
		 
		 @Test(priority = 17, groups = "Content Block")
			public static void editMultipleContentBlock()  {	
				
			 editContentTypeAction(ContentBlockObjects.secondCTForMultipleCT) ;
		}
		
		 @Test(priority = 18, groups = "Content Block")
			public static void deleteMultipleContentBlock()  {	
				
			 deleteContentTypeAction(ContentBlockObjects.secondCTForMultipleCT) ;
			 deleteFirstContentTypeAction(ContentBlockObjects.firstCT) ;
		}
	
		 @Test(priority = 19, groups = "Web Page")
			public static void importSingleWebPage() throws Throwable {
				String importedForm = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("import.single.webpage")))
				.getAbsolutePath();
				System.out.println("content type path " +importedForm);
				importContentType( importedForm) ;
			}
			
			
			 @Test(priority = 20, groups = "Web Page")
				public static void exportSingleWebPage() throws AWTException  {	
					
				 exportContentType() ;
			}
			
			 @Test(priority = 21, groups = "Web Page")
				public static void copySingleWebPage()  {	
					
					copyContentTypeAction(VerificationData.CopyForm.formTitlt3) ;
					verifyCopiedContetTypeActionsActions() ;
			}
			 
			 @Test(priority = 22, groups = "Web Page")
				public static void editSingleWebPage()  {	
					
				 editContentTypeAction(ContentBlockObjects.secondCTForSingleWebPage) ;
			}
			
			 @Test(priority = 23, groups = "Web Page")
				public static void deleteSingleWebPage()  {	
					
				 deleteContentTypeAction(ContentBlockObjects.secondCTForSingleWebPage) ;
				 deleteFirstContentTypeAction(ContentBlockObjects.firstCT) ;
			}
			 
			 
			 @Test(priority = 24, groups = "Web Page")
				public static void importMultipleWebPage() throws Throwable {
					String importedForm = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("Imported.form")))
					.getAbsolutePath();
					System.out.println("content type path " +importedForm);
					importContentType( importedForm) ;
				}
				
				
				 @Test(priority = 25, groups = "Web Page")
					public static void exportMultipleWebPage() throws AWTException  {	
						
					 exportContentType() ;
				}
				
				 @Test(priority = 26, groups = "Web Page")
					public static void copyMultipleWebPage()  {	
						
						copyContentTypeAction(VerificationData.CopyForm.formTitlt4) ;
						verifyCopiedContetTypeActionsActions() ;
				}
				 
				 @Test(priority = 27, groups = "Web Page")
					public static void editMultipleWebPage()  {	
						
					 editContentTypeAction(ContentBlockObjects.secondCTForMultipleWebPage) ;
				}
				
				 @Test(priority = 28, groups = "Web Page")
					public static void deleteMultipleWebPage()  {	
						
					 deleteContentTypeAction(ContentBlockObjects.secondCTForMultipleWebPage) ;
					 deleteFirstContentTypeAction(ContentBlockObjects.firstCT) ;
				}
			 
			 
	
			 
			 
			 
			 
			 
}

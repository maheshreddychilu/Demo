package tests;

import java.awt.AWTException;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import page.actions.AssetsAction;
import page.actions.AuditLogActions;
import page.actions.PublishQueueActions;
import page.objects.AssetObjects;

import com.built.io.automationframework.ExcelUtils;

public class AssetTest extends AssetsAction {
	
	@Test(priority = 1, groups = "Assets")
	public void uploadAssets()  {

		clicOnkAssetLink() ;
		
		String jpg = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("asset.jpg")))
		.getAbsolutePath();
		
		uploadAssets(jpg, "Uploading Image File","jpg",
				"A-1");
		String mp3 = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("asset.mp3")))
		.getAbsolutePath();
		uploadAssets(mp3, "Uploading MP3 File","mp3", "A-2");
		
		String svg = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("asset.svg")))
		.getAbsolutePath();
		
		uploadAssets(svg, "Uploading SVG File","svg", "A-3");
		
		String mp4 = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("asset.mp4")))
		.getAbsolutePath();
	
		uploadAssets(mp4, "Uploading MP4 File","mp4", "A-4");
		
		String json = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("asset.json")))
		.getAbsolutePath();
		
		
		
		uploadAssets(json, "Uploading JSON File","json",
				"A-5");
		
		String pcx = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("asset.pcx")))
		.getAbsolutePath();
		
		uploadAssets(pcx, "Uploading PCX_Image File","pcx",
				"A-6");
		
		
		String pgm = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("asset.pgm")))
		.getAbsolutePath();
		
		
		uploadAssets(pgm, "Uploading PGM_Image File","pgm",
				"A-7");
		
		String ras = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("asset.ras")))
		.getAbsolutePath();
	
		
		uploadAssets(ras, "Uploading RAS_Image File","ras",
				"A-8");
		
		String txt = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("asset.txt")))
		.getAbsolutePath();
		
		uploadAssets(txt, "Uploading Text File","txt",
				"A-9");
		String pdf = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("asset.pdf")))
		.getAbsolutePath();
		
		uploadAssets(pdf, "Uploading PDF File","pdf",
				"A-10");
		
		String zip = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("asset.zip")))
		.getAbsolutePath();
		
		uploadAssets(zip, "Uploading ZIP File","zip",
				"A-11");
		
		String ppt = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("asset.ppt")))
		.getAbsolutePath();
		
		uploadAssets(ppt, "Uploading ppt File","ppt",
				"A-12");	
		

		String xls = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("asset.xls")))
		.getAbsolutePath();
		
		uploadAssets(xls, "Uploading xls File","xls",
				"A-13");
		
		String html = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("asset.html")))
		.getAbsolutePath();
		
		uploadAssets(html, "Uploading html File","html",
				"A-14");	
		
		String docx = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("asset.docx")))
		.getAbsolutePath();
	
		uploadAssets(docx, "Uploading doc File","docx",
				"A-15");	
	
		verifyAssetsActions() ;
	}

	@Test(priority = 2, groups = "Assets")
	public void searchAsset()  {

		searchAssetsActions(xlsUtil.readCell(1, xlsUtil.getCell("search.asset")));
	}
	
	@Test(priority = 3, groups = "Assets")
	public void verifyAuditlogsofCreateAssets()  {
		AuditLogActions.verifyAuditLogForCreateAssets() ;
	}

	@Test(priority = 4, groups = "Assets")
	public void editAsset()  {

		String editAsset = new File(ExcelUtils.readCell(1, ExcelUtils.getCell("edit.asset")))
		.getAbsolutePath();
		
		editAssetsActions(AssetObjects.jpg,editAsset);
	}
	
	@Test(priority = 5, groups = "Assets")
	public void deleteAssets()  {
		deleteAssetsActions(AssetObjects.dhaval);
	}
	
	
/*	@Test(priority = 6, groups = "Assets")
	public void downloadAssets() throws AWTException  {
		downloadAssetsActions(AssetObjects.assetsEllipsis);
	}*/
	
	@Test(priority = 7, groups = "Assets")
	public void verifyAuditlogsofDeleteAssetAssets()  {
		AuditLogActions.verifyAuditLogForDeleteAsset() ;
	}
	
	@Test(priority = 8, groups = "Assets")
	public void verifyAuditlogsofUpdateAssetAssets()  {
		AuditLogActions.verifyAuditLogForUpdateAsset() ;
	}
	
	
	@Test(priority = 9, groups = "Assets")
	public void verifyFiltersByStatus()  {
		filterAssets();
	}
	
	@Test(priority = 10, groups = "Assets")
	public void publishAsset()  {
		publishAssetActions();
	}
	

	/*@Test(priority = 11, groups = "Assets")
	public void verifyPublishActionsOfAssets()  {
		PublishQueueActions.publishQueueAssetActions();
	}*/
	
	
}

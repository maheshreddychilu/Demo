package data;

import page.actions.URLpatternActions;


import com.built.io.automationframework.BasePageActions;

public class VerificationData {

	public class DriverPath {

		public static final String chromdriver = "D:\\softwares\\chromedriver.exe";
		public static final String idDriver = "D:\\ContenstackWorkspace\\ContentStackUIAutomation\\src\\main\\resources\\Drivers\\IEDriverServer.exe";
		public static final String phantomsjsWindows = "D:\\ContenstackWorkspace\\ContentStackUIAutomation\\src\\main\\resources\\phantomjs\\bin\\phantomjs.exe";
		public static final String phantomsjsLinux = "/opt/phantomjs-linux/bin/phantomjs";
		

	}

	public class ReportData {

		public static final String reportTitle = "Built.io Contentstack | UI Automation Report";
		public static final String reportHeadline = " : Contentstack UI Automation Report";
		public static final String style = "nav span.right { display: none; }";
		public static final String seleniumVersion = "2.53";
		public static final String reportName = "contentstack-ui-report-";
	}

	public class Header {

		public static final String stackName = "Test Site";
		
		public static final String stack = "Stack";
		public static final String environment = "Environments";
		public static final String languages = "Languages";
		public static final String users = "Users";
		public static final String roles = "Roles";
		public static final String webhook = "Webhooks";
		
		
		public static final String logoSrc = "/static/images/logo-icon.png";
		public static final String forms = "CONTENT";
		public static final String forms1 = "Content Types";
		public static final String assets = "ASSETS";
		public static final String publishQueue = "PUBLISH QUEUE";
		public static final String auditLog = "AUDIT LOG";
		public static final String setting = "SETTINGS";
		public static final String community = "http://contentstack-community.built.io/";
		public static final String help = "http://docs.contentstack.io/";
		public static final String userName = "Mahesh";
		public static final String profile = "Profile";
		public static final String credentials = "Credentials";
		public static final String billing = "Billing";
		public static final String signout = "Sign Out";
		
		public static final String copyRight = "support-contentstack@built.io | Copyright © 2012-2016 Built.io. All Rights Reserved.";
		public static final String supportHref = "mailto:support@built.io";
		public static final String privacy = "Privacy";
		public static final String support = "support-contentstack@built.io";
		public static final String privacyhref = "http://built.io/privacy.html";
		public static final String terms = "Terms";
		public static final String termsHref = "http://built.io/termsofservice.html";
			
		
		
	   public static final String credintialsHref = "https://contentstack.built.io/#!/user/change-credentials";
	  public static final String profileHref = "https://contentstack.built.io/#!/user/profile";
		
	//	public static final String credintialsHref = "https://stag-contentstack.built.io/#!/user/change-credentials";
	//	public static final String profileHref = "https://stag-contentstack.built.io/#!/user/profile";
		
		
	//	public static final String credintialsHref = "http://dev-manage.contentstack.io/#!/user/change-credentials ";
	//	public static final String profileHref = "http://dev-manage.contentstack.io/#!/user/profile";
	}
	
	public class Stack {

		public static final String stack = "Stack";
		public static final String general = "GENERAL";
		public static final String adminEmail = "mahesh.chilumula@raweng.com";
		public static final String dateFormat = "Do MMMM, YYYY ";
		public static final String save = "Save";
		public static final String delete = "Delete Stack";
		public static final String transferOwner = "Transfer Ownership";
		public static final String siteUpdateuccessMessage = "Site updated successfully.";
		public static final String sitedeletedsuccessMessage = "Site deleted successfully!";
		
		public static final String siteCreatedsuccessMessage = "Stack created successfully.";
	
				
	}

	public static class SanitycontentType {

		public static final String contentTypeSuccessMsz = "Content Type updated successfully!";
		public static final String contentTypeCreatedSuccessMsz = "Content Type created successfully!";
		public static final String paginationText= "Showing 3 Content Types";
		
		public static final String importformSuccessMsz = "Content Type imported successfully.";
		public static final String importedForm = "Imported Form";
		public static final String pagination = "Showing 4 Content Types";
		public static final String siteDescription = "This form for sanity testing";
		public static final String textFiledDisplayNameMultiline = "Text field";
		public static final String textFiledDisplayNameRichText = "Text field rich text";
		public static final String textFiledDisplayNameRichTextbasic = "Text field basic rich text";
		public static final String groupFiledDisplayName = "group field";
		public static final String fileFiledDisplayName = "file field";
		public static final String referenceFiledDisplayName = "reference field";
		public static final String booleanFiledDisplayName = "boolean field";
		public static final String linkFiledDisplayName = "link field";
		public static final String numberFiledDisplayName = "number field";
		public static final String dateFiledDisplayName = "date field";
		public static final String markdownFiledDisplayName = "mark down field";
		public static final String groupRtDisplayname = "Rt in group";
		public static final String groupFileDisplayname = "file in group";
		public static final String subgroupingroupeDisplayname = "sub group in group";
	
		
		
		//Labels
		
		public static final String lebelCreatedSuccessMsz = "Label created and applied successfully.";
		public static final String lebelUpdateSuccessMsz = "Label updated successfully.";
		
		public static final String labelCreatedMsz = "Label created successfully.";
		
		public static final String title = "TITLE";
		public static final String discription = "DESCRIPTION";
		public static final String ModifiedAt = "MODIFIED AT";
		public static final String manageLabel = "Manage Label";
		public static final String emptyForm = "Empty form";
		public static final String noLabels = "No Labels";
		public static final String sanityLabel = "Sanity label";
	
	// URL pattern
	
		public static final String prieewTitle = "/:title";	
		public static final String prieewDate = "/:year/:month/:day/:title";	
		public static final String prieewMonth = "/:year/:month/:title";	
		public static String previeTitlewithdate = "/"+URLpatternActions.date1+"/verify-url-patten" ;	
		public static String previeTitlewithMonth = "/"+URLpatternActions.date2+"/verify-url-patten" ;
		public static final String customTitleEntryID = "/:unique_id";	
		public static final String customTitleYear = "/:year";
		public static final String customTitleYearShort = "/:year_short";
		public static final String customTitleMonth = "/:month";	
		
		public static final String customTitleDay = "/:day";
		
		public static final String multipleCustoTitle = "/:title/:year/:unique_id";
		
		
		
		
		
		public static String previeTitlewithdateWithPrefix = "/sanity/"+URLpatternActions.date1+"/verify-url-patten";
		public static String previeTitlewithMonthWithPrefix = "/sanity/"+URLpatternActions.date2+"/verify-url-patten";
		public static final String customWithYEar = "/2016";
		public static final String customWithYEarShort = "/16";
		public static final String onlyTitle = "/verify-url-patten";
		
		public static final String customWithYDate = "/"+URLpatternActions.date3;
		public static final String customWithYmonth = URLpatternActions.month1;	
		public static final String customWithYDay = URLpatternActions.day1;
		
		
		public static String customTitleWithPRefix = "/sanity/verify-url-patten";	
		public static String customYearWithPRefix = "/sanity/2016";
		public static final String customWithYEarShortWithPrefix = "/sanity/16";
		public static final String customWithYDayWithPrefix = "/sanity"+URLpatternActions.day1;
		
		public static final String verifyErrorMSZ = "Please enter URL";
		
		public static final String customWithYMultiple = "/verify-url-patten/2016";
	
		public static final String todayDate = URLpatternActions.date1;
		
		
	}

	public class CopyForm {

		public static final String formTitlt = "copy_of_Ttile URl pattern";
		public static final String formTitlt1 = "copy_of_ContentBlockSingleImportedForm";
		public static final String formTitlt2 = "copy_of_ContentBlockMultipleImportedForm";
		public static final String formTitlt3 = "copy_of_singleImported Form";
		public static final String formTitlt4 = "copy_of_Imported Form";
		public static final String uniqueId = "copy_of_Imported Form";
		
		public static final String copyFormAction = "copy_of_Imported Form";
		
		
		
		public static final String title = "Title";
		public static final String url = "URL";
		public static final String text1 = "Text_01";
		public static final String text2 = "Text_02";
		public static final String text3 = "Text_03 *";
		public static final String text4 = "Text_04";
		public static final String text5 = "Text_05";
		public static final String text6 = "Text_06";
		public static final String group = "Group_field";
		public static final String grpTitle = "Title";
		public static final String grpRte = "GRP_RTE";
		public static final String grpUpload = "GRP_upload";
		public static final String grpBoolean = "GRP_boolean";
		public static final String grpNumber = "Grp_number";
		public static final String uploads = "UPLOADS";
		public static final String link = "Link_field";
		public static final String booleanfield = "Boolean";
		public static final String date = "Date_field";
		public static final String number = "Number_field";
	}

	public class EditForm {
		public static final String formTitlt = "Edited form";
		public static final String editedFormTitle = "Edited form";
	}

	public class Entry {
		public static final String successMsz = "Entry updated successfully.";
		public static final String entryCreatedSuccesmsz = "Entry created successfully.";
		public static final String importedEntry = "Imported entry";
		public static final String editedEntry = "Edited entry";
		public static final String deleteMSz = "1 entry(ies) were deleted successfully.";
		public static final String localiseEntry = "Localise Entry";
		public static final String engUS = "English  (United States)";
		public static final String unlocaliseEntry = "Unlocalise Entry";
		
		public static final String unlocaliseEntrySuccessMsz = "The entry unlocalized successfully.";
		
		public static final String publishModalTitle = "'UntitledSanity Entry";
		
		public static final String masterLocaleHelpText = "‘M’ represents entries in master locale, i.e., English US.";
		public static final String forignLocaleHelpText = "‘L’ represents localized entries. These entries are independent and do not fetch data from the master locale, i.e., English (US)";
		
		public static final String Unlocalized  = "Unlocalized ";
	}

	public class SanityFormEnty {

		public static final String publish = "Entry sent for publishing.";
		
	}

	public class CopyEntry {

		public static final String titleValue = "Copy of Imported Entry";
		public static final String url = "URL";
		public static final String text1 = "Text_01";
		public static final String text2 = "Text_02";
		public static final String text3 = "Text_03";
		public static final String text4 = "Text_04";
		public static final String text5 = "Text_05";
		public static final String text6 = "Text_06";
		public static final String group = "Group_field";
		public static final String grpTitle = "Title";
		public static final String grpRte = "GRP_RTE";
		public static final String grpUpload = "GRP_upload";
		public static final String grpBoolean = "GRP_boolean";
		public static final String grpNumber = "Grp_number";
		public static final String uploads = "UPLOADS";
		public static final String link = "Link_field";
		public static final String booleanfield = "Boolean";
		public static final String date = "Date_field";
		public static final String number = "Number_field";
	}

	public class EditEtry {

		public static final String entryTitlt = "Edited Entry";
		public static final String entryurl = "//Edited_entry";
	}

	public class Setting {
		public static final String environments = "Environments";
		public static final String information = "Information";
		public static final String languages = "Languages";
		public static final String users = "Users";
		public static final String roles = "Roles";
		public static final String webhooks = "Webhooks";
		public static final String settings = "Settings";

		public static final String envNameStag = "stag";
		public static final String envNameDev = "development";
		public static final String envNameprod = "production ";
		public static final String envNametest = "test ";
		public static final String server1 = "server1";
		public static final String server2 = "server2";
		public static final String envBlank = "blank ";
		
		public static final String deleteMSz = "Environment deleted successfully.";
		public static final String envCreatedSuccessmsz = "Environment created successfully.";
		public static final String updateSuccesMsz = "Environment updated successfully.";
		

		public static final String endPointStag = "http://localhost:4000";
		public static final String endPointProd = "http://localhost:5000";
		public static final String endPointdev = "http://localhost:6000";
		public static final String endPointserver1 = "http://localhost:7000";
		public static final String endPointserver2 = "http://localhost:7000";

		public static final String user1 = "abhinav.bajpai@raweng.com";
		public static final String user2 = "abhinav.bajpai+1@raweng.com";

		public static final String contentManager = "Content Manager";
		public static final String developer = "Developer";
		public static final String mahesh = "mahesh.chilumula@raweng.com";
		public static final String name = "Name";
		public static final String owner = "Owner";
		public static final String description = "DESCRIPTION";
		public static final String lastModified = "MODIFIED BY";
		public static final String actions = "Actions";
		public static final String custom = "custom";
		public static final String delete = "fake role";
		public static final String addrole = "New Role";
		
		
		public static final String devDescription ="Developers can perform all Content Manager actions, view audit logs, create roles, invite users, & manage forms, languages, & environments.";
		public static final String cmDescription ="Content Managers can view all forms, upload assets, create & publish entries. They cannot edit forms or access site Settings.";

		
		
		public static final String lunguageAddsuccessMessage = "Language added successfully.";
		public static final String defaultLanguageName = "English (United States) Default";
		public static final String addLanguages = "Add Language";
		public static final String addNewLanguages = "Add New Language";
		public static final String lunguagedeletedsuccessMessage = "English (Australia) language removed successfully.";
		
		
		public static final String envNameProd = "prod";
		public static final String envNamestag = "stag";
		public static final String envNameblank = "prod";
		
		
		public static final String urlStag = "https://www.google.co.in/";
		public static final String urlProd = "http://csold.builtapp.io/#!/sites";
		public static final String devProd = "http://www.gochirp.in";
		
		
		
		
		public static final String roleAddsuccessMessage = "The role was created successfully.";
		public static final String roleUpdatesuccessMessage = "The role was updated successfully.";
		public static final String roleDeletesuccessMessage = "The role was deleted successfully.";
		
	
		
		public static final String defaultLanguageText= "LANGUAGE";
		public static final String defaultLanguage = "English (United States) Default";
		public static final String languageCode = "CODE";
		public static final String defaultLanguageCode = "en-us";

	}

	public class Assets {
		public static final String jpg = "char.jpg";
		public static final String mp3 = "contentstack.mp3";
		public static final String svg = "Freesample.svg";
		public static final String mp4 = "IMG_8186.mp4";
		public static final String json = "ImportForm.json";
		public static final String pcx = "malnutrition_small.pcx";
		public static final String pgm = "malnutrition_small.pgm";
		public static final String blog = "Blog.docx";
		
		public static final String ras = "malnutrition_small.ras";
		public static final String txt = "markdownsampleCode.txt";
		public static final String pdf = "NewNameForm.pdf";
		public static final String zip = "poi-bin-3.12-beta1-20150228.zip";
		public static final String xenuzip = "XENU.ZIP";
		
		public static final String html = "report.html";
		public static final String xls = "testdata.xls";
		public static final String ppt = "Contentstack.pptx";
		
		public static final String downloadJpg = "download.jpg";
		public static final String createAssetSuccessMessage = "Woot! File created successfully.";
		public static final String deleteAssetSuccessMessage = "File deleted successfully.";
		public static final String UpdateAssetSuccessMessage = "Woot! File updated successfully.";
		
		public static final String publishAssetSuccessMessage = "Asset sent for publishing.";
		public static final String unPublishAssetSuccessMessage = "Asset sent for Unpublishing.";
		public static final String publishEntrySuccessMessage = "Entry sent for publishing.";
		public static final String unPublishEntrySuccessMessage = "Entry sent for Unpublishing.";
		
		
	}

	public class PublishQueue {
		public static final String time = "TIME";
		public static final String form = "CONTENT TYPE";
		public static final String entry = "ENTRY";
		public static final String version = "VERSION";
		public static final String language = "LANGUAGE";
		public static final String usename = "USER";
		public static final String env = "ENVIRONMENT(S)";
		public static final String status = "STATUS";
		public static final String versionNumber = "1";
		public static final String langName = "English (United States)";
		public static final String user = "Me";
		public static final String envName = "blank";
		public static final String statusOfEntry = "Published";
		
		public static final String scheduledToPublish = "Scheduled to publish";
		public static final String statusOfEntry1 = "Unpublished";
		public static final String contentTypeName = "Imported Form";
		public static final String entryName = "Imported Entry";
		public static final String assetName = "Dhaval.jpg";
		public static final String contentTypeName1 = "Asset";
		public static final String language1 = "English (United States)";
		public static final String envName1 = "testenv";
		public static final String envProdName = "production";
		public static final String envStagName = "stag";
		public static final String envDevName = "development";

	}

	public class WebHook {
		public static final String name = "webhook for any content type";
		public static final String url = "http://inspectb.in/9a5d6f88";
		public static final String webhookForAnyForm = "webhook for any contentType";
		public static final String nameForWebhook = "webhook for a specific contentType";
		public static final String nameOfWebhookForAnyEntry = "webhook for any entry";
		public static final String nameOfWebhookForSpecificEntry = "webhook for specific Entry";

		public static final String nameOfWebhookForAnyAsset = "webhook for any asset";
		public static final String nameOfWebhookForSpecificAsset = "webhook for specific Asset";
	}

	public class auditLogs {

		public static final String userName = "Me";
		public static final String create = "Create";
		public static final String delete = "Delete";
		public static final String update = "Update";
		public static final String entry = "Entry";
		public static final String editedContentType = "Edited contenttype";
		public static final String exprot = "Export";
		public static final String importentry = "Import";
		public static final String localmoduleName = "Locale";
		public static final String title1 = "English - Australia";
		public static final String remoteAcess = "115.248.175.50";
		public static final String title2 = "English - Australia";
		public static final String title3 = "Japanese - Japan";
		public static final String title4 = "Telugu - India";
		public static final String moduleEnv = "Environment";
		public static final String moduleLocale = "Language";
		public static final String moduleWebhook = "Webhook";
		public static final String moduleImport = "Imported";
		public static final String moduleImport1 = "Imported Form";
		public static final String moduleExport = "test";
		public static final String form = "Content Type";
		public static final String label = "Label";
		public static final String copyOfImportedEntry = "Copy of Imported Entry";
		public static final String envTitle1 = "updatedenv";
		public static final String envTitle2 = "blank";
		public static final String envTitle3 = "test";
		public static final String envTitle4 = "development";
		public static final String envTitle5 = "production";
		public static final String envTitle6 = "stag";
		public static final String siteTitle = "Test Site";
		public static final String moduleSite = "Site";
		public static final String webHookForAnyAsset = "webhook for any asset";
		public static final String webHookForAnyEntry = "webhook for any entry";
		public static final String webHookForAnyForm = "webhook for any contentType";
		public static final String webHookForSpecificForm = "webhook for a specific contentType";
		public static final String sanityFormTest = "sanity form";
		public static final String emptyContentType = "Empty form";
		public static final String copyOfImported = "copy_of_Imported Form";
		public static final String editedform = "Edited contenttype";
		public static final String editedEntry = "Edited Entry";
		public static final String importEntry = "Import Entry";
		public static final String sanityEntry = "Sanity Entry";
		public static final String asset = "Asset";
		public static final String blog = "Blog.docx";
		public static final String dhawal = "Dhaval.jpg";

		public static final String newNameForm = "NewNameForm.pdf";
		public static final String markdownsampleCode = "markdownsampleCode.txt";
		public static final String malnutrition_small = "malnutrition_small.ras";
		public static final String malnutrition_smallPgm = "malnutrition_small.pgm";
		public static final String malnutrition_smallPcx = "malnutrition_small.pcx";
		public static final String importEntryJson = "ImportForm.json";
		public static final String IMG_8186 = "IMG_8186.mp4";
		public static final String Freesample = "Freesample.svg";
		public static final String contentstackMp3 = "contentstack.mp3";
		public static final String charImg = "char.jpg";
		public static final String xENU = "XENU.ZIP";
		public static final String html = "report.html";
		public static final String xls = "testdata.xls";
		public static final String ppt = "Contentstack.pptx";
		
		public static final String userRoles = "Roles";
		public static final String abhinav1 = "abhinav.bajpai+1@raweng.com";
		public static final String roles = "Roles";
		public static final String rolesRights = "Roles.rights";
		public static final String updaterole = "Update role";
		public static final String fakeRole = "fake role";
		public static final String newrole = "new role";
		public static final String user = "custom";
		public static final String editLabel = "Editlabel";
		public static final String childLabel = "Childlabel";
		public static final String sanityLabel = "Sanity label";
	
		public static final String setContentblock = "SetContentblock";
		public static final String singleContentblock = "SingleContentblock";
	
		public static final String CBimport = "ContentBlockSingleImportedForm";
		public static final String copyOfCB = "copy_of_ContentBlockSingleImportedForm";
		
		public static final String singleCB = "SingleContentblock";

		


	}

	public class user {

		public static final String userName = "abhinav.bajpai@raweng.com";
		public static final String password = "test123";

	}
	
	
	
	public class EntryForCompare {

		public static final String title = "new Entry";
		public static final String url = "http://raweng.com";
		public static final String singleline = "Single line text";
		public static final String rtText = "We apologize for the inconvenience caused to you. We would like to inform you that your Paytm wallet has been credited with the cashback amount INR. 5849 on 6 Jan 2016 ";
		public static final String groupTitle = "team contentstack";
		public static final String groupRt = "We build enterprise apps for iOS, Android, Windows and Blackberry using cutting edge mobile technologies.";
		public static final String link = "built.io";
		public static final String linkUrl = "https://stag-manage.contentstack.io/#!/";
		public static final String number = "52";
		public static final String markdDown = "* this one is long" + " * that one"
				+ "/n" + "* the other one";

		public static final String heading = "Compare Version";
		public static final String version2 = "Version 2";
		public static final String version1 = "Version 1";
		public static final String openVersion = "Open This Version";
		public static final String currentVersion = "Current Version";

	}
	
	public class contenttype {

		public static final String successMSZ = "Content Type imported successfully.";
		public static final String password = "test123";

	}
	
	
	
	
}

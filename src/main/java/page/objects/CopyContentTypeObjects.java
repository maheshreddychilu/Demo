package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.built.io.automationframework.Driver;

public class CopyContentTypeObjects {
	

	
	public static void initiatePageoject() {
		PageFactory.initElements(Driver.driver, CopyContentTypeObjects.class);

	}
	

}

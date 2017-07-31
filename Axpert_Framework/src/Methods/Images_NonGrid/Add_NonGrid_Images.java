package Methods.Images_NonGrid;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class Add_NonGrid_Images extends TestBase {

	public void AddNonGridImage() throws Exception
	{
	SidebarMenu(getWebElement("Image_NonGrid_Menu"), getWebElement("Image_NonGrid_submenu"));
	
	SidebarMenu(getWebElement("Image_NonGrid_submenu"), getWebElement("image_NonGrid_submenu1"));
	
	SwitchFrame(getWebElement("Image_NonGrid_frame"));
	
	String ExpectedPage= "NonGrid_Image";
	
	String ActualPage= getWebElement("Image_NonGrid_Pagetitle").getText();
	
	if(ActualPage.equalsIgnoreCase(ExpectedPage))
	{
		Reporter.log("Page Title is: "+ActualPage);
	}
	else{
		Reporter.log("Page NOt Correct, correct Page is:"+ExpectedPage);
	}
		getWebElement("Image_NonGrid_Name").sendKeys(Repository.getProperty("ImageNG_Name"));
		
		String ParentWindow= driver.getWindowHandle();
		
		getWebElement("Image_NonGrid_Image").click();
		
		ChildWindowHandle();
		
		getWebElement("Image_NonGrid_BrowseButton").click();
		
		Runtime.getRuntime().exec("D:\\ViratGupta\\Axpert 9_ViratGupta\\Axpert_Framework\\ImagesUpload.exe");
		
		implicitWait(2);
		
		getWebElement("Image_NonGrid_UploadButton").click();
		
		driver.switchTo().window(ParentWindow);
		
		SwitchFrame(getWebElement("Image_NonGrid_frame"));
		
		getWebElement("Image_NonGrid_save").click();
		
		driverwait(2);
		
		getWebElement("Image_NonGrid_Listview").click();
		
		implicitWait(2);
		
		getWebElement("Image_NonGrid_OpenRecord").click();
		
		implicitWait(2);
		
		WebElement TestImage= getWebElement("Image_NonGrid_Image");
		
		 Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", TestImage);
	      if (!ImagePresent || getWebElement("Image_NonGrid_Name").getText().equals(Repository.getProperty("ImageNG_Name")))
	      {
	          Reporter.log("TESTCASE FAIL");
	          
	    	  Reporter.log("Image not displayed.");
	    	  
	    	  Assert.fail();
	    	
	      }
	      else
	      {
	    	  Reporter.log("TESTCASE PASS");
	    	  
	          Reporter.log("Image is Displaying");
	          
	      }
	}
	
}

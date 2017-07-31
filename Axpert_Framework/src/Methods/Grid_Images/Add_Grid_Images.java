package Methods.Grid_Images;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class Add_Grid_Images extends TestBase {
	
	public void Grid_Image_Tstruct() throws Exception
	{
		SidebarMenu(getWebElement("Image_Grid_Menu"), getWebElement("Image_Grid_submenu"));
		
		SidebarMenu(getWebElement("Image_Grid_submenu"), getWebElement("image_Grid_submenu1"));
		
		SwitchFrame(getWebElement("Image_Grid_frame"));
		
		String ExpectedPage= "Grid_Image";
		
		String ActualPage= getWebElement("Image_Grid_Pagetitle").getText();
		
		if(ActualPage.equalsIgnoreCase(ExpectedPage))
		{
			Reporter.log("Page Title is: "+ActualPage);
		}
		else{
			Reporter.log("Page Not Correct, correct Page is:"+ExpectedPage);
		}
			getWebElement("Image_Grid_TstructName").sendKeys(Repository.getProperty("ImageNG_Name"));
			
			getWebElement("Image_Grid_ImageName").sendKeys(Repository.getProperty("GridImageName"));
			
			getWebElement("Image_Grid_ImagePath").sendKeys(Repository.getProperty("ImagePath"));
			
			String ParentWindow= driver.getWindowHandle();
			
			getWebElement("Image_Grid_Attach").click();
			
			ChildWindowHandle();
			
			getWebElement("Image_Grid_BrowseButton").click();
			
			Runtime.getRuntime().exec("D:\\ViratGupta\\Axpert 9_ViratGupta\\Axpert_Framework\\ImagesUpload.exe");
			
			driverwait(3);
			
			getWebElement("Image_Grid_AttachButton").click();
			
			getWebElement("Image_Grid_CloseWindow").click();
			
			driver.switchTo().window(ParentWindow);
			
			SwitchFrame(getWebElement("Image_Grid_frame"));
			
			getWebElement("Image_Grid_save").click();
			
			driverwait(2);
			
			getWebElement("Image_Grid_Listview").click();
			
			implicitWait(2);
			
			getWebElement("Image_Grid_OpenRecord").click();
			
			implicitWait(3);
			
			String ViewImageLink= getWebElement("Image_Grid_ViewImage").getText();
			
			if(ViewImageLink.contains(".jpg"))
			{
				Reporter.log("TESTCASE PASS");
				
				Reporter.log("Attached File Name is "+ViewImageLink);
				
			}
			else
			{
				Reporter.log("TESTCASE FAIL");
				
				Assert.fail();
			
			}
		
	}

}

package Methods.GenMap_NG2G;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class GenMap_NG2G_NewMode_ctrlField_NO extends TestBase {
	
	public void NG2G_Child() throws Exception
	{	
		SidebarMenu(getWebElement("GenMap_NG2G_Menu"), getWebElement("GenMap_NG2G_Child_SubMenu"));
		
		String ExpectedPageTitle= "NG2Gchild";
		
		SwitchFrame(getWebElement("GenMap_NG2G_Frame"));
		
		String ActualPageTitle= getWebElement("GenMap_NG2G_Child_PageTitle").getText();
		
		implicitWait(10);
		
		if(ActualPageTitle.equalsIgnoreCase(ExpectedPageTitle))
		{
			System.out.println("GenMap_NG2G_Child Page is :::::"+ActualPageTitle);
		}
		else
		{
			System.out.println("Page Not Correct:) Required Page is::::::"+ExpectedPageTitle);
		}
		
		//SwitchFrame(getWebElement("GenMap_NG2G_Frame"));
		
		WebElement EmpName= getWebElement("GenMap_NG2G_EmpName");
		
		Reporter.log("Entering Employee Name in Employee Field");
		
		EmpName.sendKeys(Repository.getProperty("NG2G_Child_EmpName"));
		
		WebElement DOJ= getWebElement("GenMap_NG2G_DOJ");
		
		DOJ.clear();
		
		Reporter.log("Entering Employee Date of Joining in DOJ Field");
		
		DOJ.sendKeys(Repository.getProperty("NG2G_Child_DOJ"));
		
		WebElement DOB= getWebElement("GenMap_NG2G_DOB");
		
		Reporter.log("Entering Employee Date of Birth in DOB Field");
		
		DOB.sendKeys(Repository.getProperty("NG2G_Child_DOB"));
		
		WebElement Address= getWebElement("GenMap_NG2G_Address");
		
		Reporter.log("Entering Employee Address in Address Field");
		
		Address.sendKeys(Repository.getProperty("NG2G_Child_Address"));
		
		selectDropDownValue(getWebElement("GenMap_NG2G_UpdateType"), "NO");
		
		getWebElement("GenMap_NG2G_save").click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
	}
	
	//Checking Data is Storing in MAster or not

	public void NG2G_CheckMaster() throws Exception
	{
		SidebarMenu(getWebElement("GenMap_NG2G_Menu"), getWebElement("GenMap_NG2G_Master_Submenu"));
		
		String ExpectedPageTitle= "NG2Gmaster";
		
		SwitchFrame(getWebElement("GenMap_NG2G_Frame"));
		
		String ActualPageTitle= getWebElement("GenMap_NG2G_Master_PageTitle").getText();
		
		implicitWait(10);
		
		if(ActualPageTitle.equalsIgnoreCase(ExpectedPageTitle))
		{
			System.out.println("GenMap_NG2G_Master Page is :::::"+ActualPageTitle);
		}
		else
		{
			System.out.println("Page Not Correct:) Required Page is::::::"+ExpectedPageTitle);
		}
		
		getWebElement("GenMap_NG2G_NG2G_Listview").click();
		
		implicitWait(15);
		
		WebElement TotalRows= getWebElement("GenMap_NG2G_TotalRows");
		
		String ExpectedRows= "No records available";
		
		String ActualRows= TotalRows.getText();
		
		if(ActualRows.equalsIgnoreCase(ExpectedRows)){
		
			System.out.println("TestCase PASS:::GENMAP NG2G_NEW MODE_CTRL FIELD_NO");
			
			System.out.println("ExpectedResult "+ExpectedRows+"====ActualResult "+ActualRows);
			
			System.out.println("-------------------------------------------------------------");
		}
		
		else
		{
			System.out.println("Expected Result = "+ExpectedRows);
			
			System.out.println("Actual Result   = "+ActualRows);
			
			System.out.println("Testcase FAIL");
			
			System.out.println("-------------------------------------------------------------");
			
			Assert.fail();
		}
		}


}

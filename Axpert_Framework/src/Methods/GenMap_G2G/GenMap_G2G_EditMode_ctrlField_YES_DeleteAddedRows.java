package Methods.GenMap_G2G;

import org.testng.Assert;

import Axpert_Operations.TestBase;

public class GenMap_G2G_EditMode_ctrlField_YES_DeleteAddedRows extends TestBase {
	
	public void DeleteAddedRowFromSource() throws Exception
	{
		SwitchFrame(getWebElement("GenMap_G2G_Frame"));
		
		getWebElement("GenMap_G2G_Child_Listview").click();
		
		implicitWait(10);
		
		getWebElement("GenMap_G2G_EditRecord").click();
		
		implicitWait(10);
		
		getWebElement("GenMap_G2G_DeleteRow3").click();
		
		driver.switchTo().alert().accept();
		
		getWebElement("GenMap_G2G_EditSave").click();
		
		implicitWait(10);
		
		getWebElement("GenMap_G2G_CloseButton").click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
	}
	
	public void CheckDeletedRowInMaster() throws Exception
	{
		SidebarMenu(getWebElement("GenMap_G2G_Menu"), getWebElement("GenMap_G2G_Master_Submenu"));
		
		String ExpectedPageTitle= "G2Gmaster";
		
		SwitchFrame(getWebElement("GenMap_G2G_Frame"));
		
		String ActualPageTitle= getWebElement("GenMap_G2G_Master_PageTitle").getText();
		
		implicitWait(10);
		
		if(ActualPageTitle.equalsIgnoreCase(ExpectedPageTitle))
		{
			System.out.println("GenMap_G2G_Master Page is :::::"+ActualPageTitle);
		}
		else
		{
			System.out.println("Page Not Correct:) Required Page is::::::"+ExpectedPageTitle);
		}
		
		getWebElement("GenMap_G2G_MasterListview").click();
		
		implicitWait(15);
		
		getWebElement("GenMap_G2G_EditMasterRecord").click();
		
		implicitWait(15);
		
		String Expected_EmpName= "2";
		
		String Actual_EmpName= getWebElement("GenMap_G2G_RowsAfterDelete").getText();
		
		if(Actual_EmpName.equalsIgnoreCase(Expected_EmpName))
		{
			System.out.println("TESTCASE PASS::::::DELETED ROW IS REMOVED FROM MASTER");
			
			System.out.println("ExpectedResult "+Expected_EmpName+"====ActualResult "+Actual_EmpName);
			
			System.out.println("=======================================================");
		}
		
		else
		{
			System.out.println("TESTCASE FAIL::::::DELETED ROW IS NOT REMOVED OR ANYTHING ELSE");
			System.out.println("Actual Result is:::::"+Actual_EmpName);
			System.out.println("Expected result is ::::"+Expected_EmpName);
			System.out.println("======================================================");
			Assert.fail();
			
		}
	
		
	}

}

package Methods.GenMap_G2NG;

import org.testng.Assert;

import Axpert_Operations.TestBase;

public class GenMap_G2NG_EditMode_ctrlField_YES_DeleteAddedRows extends TestBase {
	
	public void DeleteAddedRowFromSource() throws Exception
	{
		SwitchFrame(getWebElement("GenMap_G2NG_Frame"));
		
		getWebElement("GenMap_G2NG_Child_Listview").click();
		
		implicitWait(10);
		
		getWebElement("GenMap_G2NG_EditRecord").click();
		
		implicitWait(10);
		
		getWebElement("GenMap_G2NG_DeleteRow3").click();
		
		driver.switchTo().alert().accept();
		
		getWebElement("GenMap_G2NG_EditSave").click();
		
		implicitWait(10);
		
		getWebElement("GenMap_G2NG_CloseButton").click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
	}
	
	public void CheckDeletedRowInMaster() throws Exception
	{
		SidebarMenu(getWebElement("GenMap_G2NG_Menu"), getWebElement("GenMap_G2NG_Master_Submenu"));
		
		String ExpectedPageTitle= "G2NGmaster";
		
		SwitchFrame(getWebElement("GenMap_G2NG_Frame"));
		
		String ActualPageTitle= getWebElement("GenMap_G2NG_Master_PageTitle").getText();
		
		implicitWait(10);
		
		if(ActualPageTitle.equalsIgnoreCase(ExpectedPageTitle))
		{
			System.out.println("GenMap_G2NG_Master Page is :::::"+ActualPageTitle);
		}
		else
		{
			System.out.println("Page Not Correct:) Required Page is::::::"+ExpectedPageTitle);
		}
		
		getWebElement("GenMap_G2NG_MasterListview").click();
		
		implicitWait(15);
		
		String EmpNo1= getWebElement("GenMap_G2NG_MasterDetails1").getText();
		
		String EmpNo2= getWebElement("GenMap_G2NG_MasterDetails2").getText();
		
		String TotalRowsInMaster= getWebElement("GenMap_G2NG_TotalRows").getText();
		
		String ExpectedTotalRows= "Total rows: 2";
		
		if(EmpNo1.equalsIgnoreCase(EmpNo2)&&(TotalRowsInMaster.equalsIgnoreCase(ExpectedTotalRows)))
		{
			System.out.println("TESTCASE PASS::::::DELETED ROW IS REMOVED FROM MASTER");
			
			System.out.println("EmpNo1= "+EmpNo1+" EmpNo2= "+EmpNo2);
			
			System.out.println("ExpectedResult= "+ExpectedTotalRows+" ActualResult= "+TotalRowsInMaster);
			
			System.out.println("=======================================================");
		}
		
		else
		{
			System.out.println("TESTCASE FAIL::::::DELETED ROW IS NOT REMOVED OR ANYTHING ELSE");

			System.out.println("======================================================");
			
			Assert.fail();
			
		}
	
		
	}


}

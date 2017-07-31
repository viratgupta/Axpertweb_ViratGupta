package Methods.Grid_Add_And_Delete;

import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class Grid_DeleteGrid extends TestBase {
	
	public void DeleteGridRow() throws Exception
	{
		getWebElement("Grid_deleteRecord").click();
		
		driver.switchTo().alert().accept();
		
		driverwait(4);
		
		getWebElement("Grid_Save").click();
		
		expliciteWait(getWebElement("Grid_CloseButton"), 3);
		
		getWebElement("Grid_Listview").click();
		
		getWebElement("Grid_editRecord").click();
		
		String ExpectedResult= "4"; 
		
		String ActualResult= getWebElement("Grid_LastRow_RowNo").getText();
		
		if(ExpectedResult.equalsIgnoreCase(ActualResult))
		{
			Reporter.log("Delete Row Successfully");
			
			Reporter.log("Delete Grid Row-->> TESTCASE PASS");
			
			Reporter.log("Delete 5th Row, Now Last row is: "+ActualResult);
			
			Reporter.log("====================================================");
		}
		else{
		Reporter.log("Delete Grid Row-->TESTCASE FAIL");
		
		Reporter.log("Row Not Deleted, Expected last row is: "+ExpectedResult);
		
		Reporter.log("=========================================================");
			
			Assert.fail();
		}
		
	}

}

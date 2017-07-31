package Methods.GenMap_G2NG;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class GenMap_G2NG_EditMode_ctrlField_YES_AddRows extends TestBase {
	
public void AddRowsInChildEditModeCFYes() throws Exception{
		
		SwitchFrame(getWebElement("GenMap_G2NG_Frame"));
		
		implicitWait(10);
		
		getWebElement("GenMap_G2NG_Child_Listview").click();
		
		implicitWait(10);
		
		getWebElement("GenMap_G2NG_EditRecord").click();
		
		//Adding TWO More Rows
		
		getWebElement("GenMap_G2NG_AddRows").click();
		
		implicitWait(5);
		
		WebElement EmpName2= getWebElement("GenMap_G2NG_EmpName_Row2");
		
		Reporter.log("Entering Employee Name in Employee Field Row 2");
		
		EmpName2.sendKeys(Repository.getProperty("G2NG_EditChild_EmpName"));
		
		WebElement DOJ2= getWebElement("GenMap_G2NG_DOJ_Row2");
		
		DOJ2.clear();
		
		Reporter.log("Entering Employee Date of Joining in DOJ Field Row 2");
		
		DOJ2.sendKeys(Repository.getProperty("G2NG_EditChild_DOJ"));
		
		WebElement DOB2= getWebElement("GenMap_G2NG_DOB_Row2");
		
		Reporter.log("Entering Employee Date of Birth in DOB Field in Row 2");
		
		DOB2.sendKeys(Repository.getProperty("G2NG_EditChild_DOB"));
		
		WebElement Address2= getWebElement("GenMap_G2NG_Address_Row2");
		
		Reporter.log("Entering Employee Address in Address Field in Row 2");
		
		Address2.sendKeys(Repository.getProperty("G2NG_EditChild_Address"));
		
		getWebElement("GenMap_G2NG_UpdateType_Row2").click();
		
		//Adding New Row--Row3
		
		getWebElement("GenMap_G2NG_AddRows").click();
		
		implicitWait(5);
		
		WebElement EmpName3= getWebElement("GenMap_G2NG_EmpName_Row3");
		
		Reporter.log("Entering Employee Name in Employee Field Row 3");
		
		EmpName3.sendKeys(Repository.getProperty("G2NG_EditChild_EmpName"));
		
		WebElement DOJ3= getWebElement("GenMap_G2NG_DOJ_Row3");
		
		DOJ3.clear();
		
		Reporter.log("Entering Employee Date of Joining in DOJ Field Row 3");
		
		DOJ3.sendKeys(Repository.getProperty("G2NG_EditChild_DOJ"));
		
		WebElement DOB3= getWebElement("GenMap_G2NG_DOB_Row3");
		
		Reporter.log("Entering Employee Date of Birth in DOB Field in Row 3");
		
		DOB3.sendKeys(Repository.getProperty("G2NG_EditChild_DOB"));
		
		WebElement Address3= getWebElement("GenMap_G2NG_Address_Row3");
		
		Reporter.log("Entering Employee Address in Address Field in Row 3");
		
		Address3.sendKeys(Repository.getProperty("G2NG_EditChild_Address"));
		
		getWebElement("GenMap_G2NG_UpdateType_Row3").click();
		
		//selectDropDownValue(getWebElement("GenMap_G2NG_UpdateType"), "YES");
		
		getWebElement("GenMap_G2NG_EditSave").click();
		
		implicitWait(10);
		
		getWebElement("GenMap_G2NG_CloseButton").click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
	}

	public void CheckAddedRowsInEditRecordinMaster() throws Exception
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
		
		String EmpNo3= getWebElement("GenMap_G2NG_MasterDetails3").getText();
		
		if(EmpNo1.equalsIgnoreCase(EmpNo2)&&(EmpNo2.equalsIgnoreCase(EmpNo3)))
		{
			System.out.println("TESTCASE PASS::::::ADDED ROWS IS DISPLAYING IN MASTER");
			
			System.out.println("EmpNo1= "+EmpNo1+ " EmpNo2= "+EmpNo2+ " EmpNo3= "+EmpNo3);
			
			//System.out.println("ExpectedResult "+Expected_EmpNo+"====ActualResult "+Actual_EmpNo);
			
			System.out.println("=======================================================");
		}
		
		else
		{
			System.out.println("TESTCASE FAIL::::::ADDED ROW IS NOT DISPLAYING");
			//System.out.println("Actual Result is:::::"+Actual_EmpName);
		//	System.out.println("Expected result is ::::"+Expected_EmpName);
			System.out.println("======================================================");
			Assert.fail();
			
		}
		
	}

}

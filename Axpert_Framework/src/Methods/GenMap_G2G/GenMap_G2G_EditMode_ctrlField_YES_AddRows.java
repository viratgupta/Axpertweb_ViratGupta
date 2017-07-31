package Methods.GenMap_G2G;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class GenMap_G2G_EditMode_ctrlField_YES_AddRows extends TestBase {
	
public void AddRowsInChildEditModeCFYes() throws Exception{
		
		SwitchFrame(getWebElement("GenMap_G2G_Frame"));
		
		implicitWait(10);
		
		getWebElement("GenMap_G2G_Child_Listview").click();
		
		implicitWait(10);
		
		getWebElement("GenMap_G2G_EditRecord").click();
		
		//Adding TWO More Rows
		
		getWebElement("GenMap_G2G_AddRows").click();
		
		implicitWait(5);
		
		WebElement EmpName2= getWebElement("GenMap_G2G_EmpName_Row2");
		
		Reporter.log("Entering Employee Name in Employee Field Row 2");
		
		EmpName2.sendKeys(Repository.getProperty("G2G_EditChild_EmpName"));
		
		WebElement DOJ2= getWebElement("GenMap_G2G_DOJ_Row2");
		
		DOJ2.clear();
		
		Reporter.log("Entering Employee Date of Joining in DOJ Field Row 2");
		
		DOJ2.sendKeys(Repository.getProperty("G2G_EditChild_DOJ"));
		
		WebElement DOB2= getWebElement("GenMap_G2G_DOB_Row2");
		
		Reporter.log("Entering Employee Date of Birth in DOB Field in Row 2");
		
		DOB2.sendKeys(Repository.getProperty("G2G_EditChild_DOB"));
		
		WebElement Address2= getWebElement("GenMap_G2G_Address_Row2");
		
		Reporter.log("Entering Employee Address in Address Field in Row 2");
		
		Address2.sendKeys(Repository.getProperty("G2G_EditChild_Address"));
		
		WebElement Organisation2= getWebElement("GenMap_G2G_Organisation_Row2");
		
		Reporter.log("Entering Employee Organization Name in Row 2");
		
		Organisation2.sendKeys(Repository.getProperty("G2G_Child_Organisation"));
		
		getWebElement("GenMap_G2G_UpdateType_Row2").click();
		
		//Adding New Row--Row3
		
		getWebElement("GenMap_G2G_AddRows").click();
		
		implicitWait(5);
		
		WebElement EmpName3= getWebElement("GenMap_G2G_EmpName_Row3");
		
		Reporter.log("Entering Employee Name in Employee Field Row 3");
		
		EmpName3.sendKeys(Repository.getProperty("G2G_EditChild_EmpName"));
		
		WebElement DOJ3= getWebElement("GenMap_G2G_DOJ_Row3");
		
		DOJ3.clear();
		
		Reporter.log("Entering Employee Date of Joining in DOJ Field Row 3");
		
		DOJ3.sendKeys(Repository.getProperty("G2G_EditChild_DOJ"));
		
		WebElement DOB3= getWebElement("GenMap_G2G_DOB_Row3");
		
		Reporter.log("Entering Employee Date of Birth in DOB Field in Row 3");
		
		DOB3.sendKeys(Repository.getProperty("G2G_EditChild_DOB"));
		
		WebElement Address3= getWebElement("GenMap_G2G_Address_Row3");
		
		Reporter.log("Entering Employee Address in Address Field in Row 3");
		
		Address3.sendKeys(Repository.getProperty("G2G_EditChild_Address"));
		
		WebElement Organisation3= getWebElement("GenMap_G2G_Organisation_Row3");
		
		Reporter.log("Entering Employee Organization Name in Row 3");
		
		Organisation3.sendKeys(Repository.getProperty("G2G_Child_Organisation"));
		
		getWebElement("GenMap_G2G_UpdateType_Row3").click();
		
		//selectDropDownValue(getWebElement("GenMap_G2G_UpdateType"), "YES");
		
		getWebElement("GenMap_G2G_EditSave").click();
		
		implicitWait(10);
		
		getWebElement("GenMap_G2G_CloseButton").click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
	}

	public void CheckAddedRowsInEditRecordinMaster() throws Exception
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
		
		//getWebElement("GenMap_G2G_EditRecord").click();
		
		//getWebElement("GenMap_G2G_PageViews").click();
		
		//getWebElement("GenMap_G2G_AllColumns").click();
		
		getWebElement("GenMap_G2G_EditMasterRecord").click();
		
		implicitWait(15);
		
		String Expected_EmpName= "3";
		
		String Actual_EmpName= getWebElement("GenMap_G2G_AddedRow").getText();
		
		if(Actual_EmpName.equalsIgnoreCase(Expected_EmpName))
		{
			System.out.println("TESTCASE PASS::::::ADDED ROW IS DISPLAYING IN MASTER");
			
			System.out.println("ExpectedResult "+Expected_EmpName+"====ActualResult "+Actual_EmpName);
			
			System.out.println("=======================================================");
		}
		
		else
		{
			System.out.println("TESTCASE FAIL::::::ADDED ROW IS NOT DISPLAYING");
			System.out.println("Actual Result is:::::"+Actual_EmpName);
			System.out.println("Expected result is ::::"+Expected_EmpName);
			System.out.println("======================================================");
			Assert.fail();
			
		}
		
	}

}

package Methods.GenMap_NG2NG;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class GenMap_NG2NG_EditMode_ctrlField_YES extends TestBase {

	public void ChildEditModeCFYes() throws Exception
	{
		SwitchFrame(getWebElement("GenMap_NG2NG_Frame"));
		
		implicitWait(10);
		
		getWebElement("GenMap_NG2NG_Child_Listview").click();
		
		implicitWait(10);
		
		getWebElement("GenMap_NG2NG_EditRecord").click();
		
		WebElement EmpName= getWebElement("GenMap_NG2NG_EmpName");
		
		EmpName.clear();
		
		Reporter.log("Entering Employee Name in Employee Field");
		
		EmpName.sendKeys(Repository.getProperty("NG2NG_EditChild_EmpName"));
		
		WebElement DOJ= getWebElement("GenMap_NG2NG_DOJ");
		
		DOJ.clear();
		
		Reporter.log("Entering Employee Date of Joining in DOJ Field");
		
		DOJ.sendKeys(Repository.getProperty("NG2NG_EditChild_DOJ"));
		
		WebElement DOB= getWebElement("GenMap_NG2NG_DOB");
		
		DOB.clear();
		
		Reporter.log("Entering Employee Date of Birth in DOB Field");
		
		DOB.sendKeys(Repository.getProperty("NG2NG_EditChild_DOB"));
		
		WebElement Address= getWebElement("GenMap_NG2NG_Address");
		
		Address.clear();
		
		Reporter.log("Entering Employee Address in Address Field");
		
		Address.sendKeys(Repository.getProperty("NG2NG_EditChild_Address"));
		
		selectDropDownValue(getWebElement("GenMap_NG2NG_UpdateType"), "YES");
		
		getWebElement("GenMap_NG2NG_EditSave").click();
		
		implicitWait(10);
		
		getWebElement("GenMap_NG2NG_CloseButton").click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
	}
	
	public void CheckEditRecordinMaster() throws Exception
	{
		SidebarMenu(getWebElement("GenMap_NG2NG_Menu"), getWebElement("GenMap_NG2NG_Master_Submenu"));
		
		String ExpectedPageTitle= "NG2NGmaster";
		
		SwitchFrame(getWebElement("GenMap_NG2NG_Frame"));
		
		String ActualPageTitle= getWebElement("GenMap_NG2NG_Master_PageTitle").getText();
		
		implicitWait(10);
		
		if(ActualPageTitle.equalsIgnoreCase(ExpectedPageTitle))
		{
			System.out.println("GenMap_NG2NG_Master Page is :::::"+ActualPageTitle);
		}
		else
		{
			System.out.println("Page Not Correct:) Required Page is::::::"+ExpectedPageTitle);
		}
		
		getWebElement("GenMap_NG2NG_NG2NG_Listview").click();
		
		implicitWait(15);
		
		//getWebElement("GenMap_NG2NG_EditRecord").click();
		
		String Expected_EmpName= Repository.getProperty("NG2NG_EditChild_EmpName");
		
		String Actual_EmpName= getWebElement("GenMap_NG2NG_EditedEmpName").getText();
		
		if(Actual_EmpName.equalsIgnoreCase(Expected_EmpName))
		{
			System.out.println("TESTCASE PASS::::::EDITED NAME MATCH");
			
			System.out.println("ExpectedResult "+Expected_EmpName+"====ActualResult "+Actual_EmpName);
			
			System.out.println("==============================================");
		}
		
		else
		{
			System.out.println("TESTCASE FAIL::::::NAME NOT MATCH");
			System.out.println("Actual Result is:::::"+Actual_EmpName);
			System.out.println("Expected result is ::::"+Expected_EmpName);
			System.out.println("============================================");
			Assert.fail();
			
		}
		
	}
		
		
		
	}
	


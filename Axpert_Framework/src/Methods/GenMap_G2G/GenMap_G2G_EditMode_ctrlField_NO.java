package Methods.GenMap_G2G;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class GenMap_G2G_EditMode_ctrlField_NO extends TestBase {
	
	public void ChildEditModeCF_No() throws Exception
	{
		SwitchFrame(getWebElement("GenMap_G2G_Frame"));
		
		implicitWait(10);
		
		getWebElement("GenMap_G2G_Child_Listview").click();
		
		implicitWait(10);
		
		getWebElement("GenMap_G2G_EditRecord").click();
		
		WebElement EmpName= getWebElement("GenMap_G2G_EmpName");
		
		EmpName.clear();
		
		Reporter.log("Entering Employee Name in Employee Field");
		
		EmpName.sendKeys(Repository.getProperty("G2G_EditChild_EmpName"));
		
		WebElement DOJ= getWebElement("GenMap_G2G_DOJ");
		
		DOJ.clear();
		
		Reporter.log("Entering Employee Date of Joining in DOJ Field");
		
		DOJ.sendKeys(Repository.getProperty("G2G_EditChild_DOJ"));
		
		WebElement DOB= getWebElement("GenMap_G2G_DOB");
		
		DOB.clear();
		
		Reporter.log("Entering Employee Date of Birth in DOB Field");
		
		DOB.sendKeys(Repository.getProperty("G2G_EditChild_DOB"));
		
		WebElement Address= getWebElement("GenMap_G2G_Address");
		
		Address.clear();
		
		Reporter.log("Entering Employee Address in Address Field");
		
		Address.sendKeys(Repository.getProperty("G2G_EditChild_Address"));
		
		WebElement Organisation= getWebElement("GenMap_G2G_Organisation");
		
		Reporter.log("Entering Employee Organization Name");
		
		Organisation.sendKeys(Repository.getProperty("G2G_Child_Organisation"));
		
		//selectDropDownValue(getWebElement("GenMap_G2G_UpdateType"), "NO");
		
		getWebElement("GenMap_G2G_UpdateType").click();
		
		getWebElement("GenMap_G2G_EditSave").click();
		
		implicitWait(10);
		
		getWebElement("GenMap_G2G_CloseButton").click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
	}
	
	public void CheckEditedRecordCF_NO() throws Exception
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
		
		getWebElement("GenMap_G2G_G2G_Listview").click();
		
		implicitWait(15);
		
		//getWebElement("GenMap_G2G_EditRecord").click();
		
		WebElement TotalRows= getWebElement("GenMap_G2G_TotalRows");
		
		String Expected_EmpName= "No records available";
		
		String Actual_EmpName= TotalRows.getText();
		
		if(Actual_EmpName.equalsIgnoreCase(Expected_EmpName))
		{
			System.out.println("TESTCASE PASS::::::GENMAP G2G_EDIT MODE_CTRL FIELD_NO");
			System.out.println("ExpectedResult "+Expected_EmpName+"====ActualResult "+Actual_EmpName);
			System.out.println("========================================================");
		}
		
		else
		{
			System.out.println("TESTCASE FAIL");
			System.out.println("Actual Result is:::::"+Actual_EmpName);
			System.out.println("Expected result is ::::"+Expected_EmpName);
			System.out.println("=========================================================");
			Assert.fail();
			
		}
		
	}

}

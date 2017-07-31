package Methods.GenMap_NG2G;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class GenMap_NG2G_EditMode_ctrlField_YES extends TestBase {
	
	public void ChildEditModeCFYes() throws Exception{
		
	SwitchFrame(getWebElement("GenMap_NG2G_Frame"));
	
	implicitWait(10);
	
	getWebElement("GenMap_NG2G_Child_Listview").click();
	
	implicitWait(10);
	
	getWebElement("GenMap_NG2G_EditRecord").click();
	
	WebElement EmpName= getWebElement("GenMap_NG2G_EmpName");
	
	EmpName.clear();
	
	Reporter.log("Entering Employee Name in Employee Field");
	
	EmpName.sendKeys(Repository.getProperty("NG2G_EditChild_EmpName"));
	
	WebElement DOJ= getWebElement("GenMap_NG2G_DOJ");
	
	DOJ.clear();
	
	Reporter.log("Entering Employee Date of Joining in DOJ Field");
	
	DOJ.sendKeys(Repository.getProperty("NG2G_EditChild_DOJ"));
	
	WebElement DOB= getWebElement("GenMap_NG2G_DOB");
	
	DOB.clear();
	
	Reporter.log("Entering Employee Date of Birth in DOB Field");
	
	DOB.sendKeys(Repository.getProperty("NG2G_EditChild_DOB"));
	
	WebElement Address= getWebElement("GenMap_NG2G_Address");
	
	Address.clear();
	
	Reporter.log("Entering Employee Address in Address Field");
	
	Address.sendKeys(Repository.getProperty("NG2G_EditChild_Address"));
	
	selectDropDownValue(getWebElement("GenMap_NG2G_UpdateType"), "YES");
	
	getWebElement("GenMap_NG2G_EditSave").click();
	
	implicitWait(10);
	
	getWebElement("GenMap_NG2G_CloseButton").click();
	
	Thread.sleep(5000);
	
	driver.switchTo().defaultContent();
}

public void CheckEditRecordinMaster() throws Exception
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
	
	//getWebElement("GenMap_NG2G_EditRecord").click();
	
	getWebElement("GenMap_NG2G_PageViews").click();
	
	getWebElement("GenMap_NG2G_AllColumns").click();
	
	implicitWait(15);
	
	String Expected_EmpName= Repository.getProperty("NG2G_EditChild_EmpName");
	
	String Actual_EmpName= getWebElement("GenMap_NG2G_EditedEmpName").getText();
	
	if(Actual_EmpName.equalsIgnoreCase(Expected_EmpName))
	{
		System.out.println("TESTCASE PASS::::::EDITED NAME MATCH");
		
		System.out.println("ExpectedResult "+Expected_EmpName+"====ActualResult "+Actual_EmpName);
		
		System.out.println("=======================================================");
	}
	
	else
	{
		System.out.println("TESTCASE FAIL::::::NAME NOT MATCH");
		System.out.println("Actual Result is:::::"+Actual_EmpName);
		System.out.println("Expected result is ::::"+Expected_EmpName);
		System.out.println("======================================================");
		Assert.fail();
		
	}
	
}
	
	
	

}

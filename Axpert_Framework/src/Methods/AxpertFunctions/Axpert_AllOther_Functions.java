package Methods.AxpertFunctions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class Axpert_AllOther_Functions extends TestBase {

	public void Axpert_OthersFun() throws Exception
	{
		SidebarMenu(getWebElement("AxpertFun_MainMenu"), getWebElement("AxpertFun_SubMenu"));
		
		SwitchFrame(getWebElement("AxpertFun_Frame"));
		
		String ExpectedPageTitle= "Axpert Function";
		
		String ActualPageTitle= getWebElement("AxpertFun_PageTitle").getText();
		
		if(ExpectedPageTitle.equalsIgnoreCase(ActualPageTitle))
		{
			Reporter.log("Page Title is-->> "+ActualPageTitle);
			
		}
		else{
			Reporter.log("Page not Correct.. Required Page id : "+ExpectedPageTitle);
		}
		for(int i=1; i<=5; i++)
		{
			getWebElement("AxpertFun_AddRows").click();
		}
			WebElement Name1= getWebElement("AxpertFun_Row1Name");
			
			Name1.sendKeys(Repository.getProperty("AXP_ROWNAME_A"));
			
			WebElement Name2= getWebElement("AxpertFun_Row2Name");
			
			Name2.sendKeys(Repository.getProperty("AXP_ROWNAME_B"));
			
			WebElement Name3= getWebElement("AxpertFun_Row3Name");
			
			Name3.sendKeys(Repository.getProperty("AXP_ROWNAME_A"));
			
			WebElement Name4= getWebElement("AxpertFun_Row4Name");
			
			Name4.sendKeys(Repository.getProperty("AXP_ROWNAME_C"));
			
			WebElement Name5= getWebElement("AxpertFun_Row5Name");
			
			Name5.sendKeys(Repository.getProperty("AXP_ROWNAME_A"));
			
			WebElement Amt1= getWebElement("AxpertFun_Row1amt");
			
			Amt1.sendKeys(Repository.getProperty("AXP_ROWAMT_A"));
			
			WebElement Amt2= getWebElement("AxpertFun_Row2amt");
			
			Amt2.sendKeys(Repository.getProperty("AXP_ROWAMT_B"));
			
			WebElement Amt3= getWebElement("AxpertFun_Row3amt");
			
			Amt3.sendKeys(Repository.getProperty("AXP_ROWAMT_A"));
			
			WebElement Amt4= getWebElement("AxpertFun_Row4amt");
			
			Amt4.sendKeys(Repository.getProperty("AXP_ROWAMT_C"));
			
			WebElement Amt5= getWebElement("AxpertFun_Row5amt");
			
			Amt5.sendKeys(Repository.getProperty("AXP_ROWAMT_A"));
			
			implicitWait(10);
			
			getWebElement("AxpertFun_save").click();
			
			getWebElement("AxpertFun_closebtn").click();
			
			driverwait(4);
			
			getWebElement("AxpertFun_Listview").click();
			
			getWebElement("AxpertFun_EditRecord").click();
			
			String ActualRowCount= getWebElement("AxpertFun_RowCount").getAttribute("value");
			
			String ExpectedRowCount= getWebElement("AxpertFun_LastRow").getText();
			
			if(ExpectedRowCount.equalsIgnoreCase(ActualRowCount)){
				
				Reporter.log("RowCount--> TESTCASE PASS");
				
				Reporter.log("Expected Result = "+ExpectedRowCount+" Actual Result= "+ActualRowCount);
				
				Reporter.log("=============================================================");
			}
			else{
				Reporter.log("RowCount--> TESTCASE FAIL");
				
				Reporter.log("=============================================================");
				
				Assert.fail();
			}
			
			String ActualRowNo= getWebElement("AxpertFun_RowNo").getAttribute("value");
			
			scrollUp();
			
			String ExpectedRowNo= getWebElement("AxpertFun_FourthRow").getText();
			
			if(ExpectedRowNo.equalsIgnoreCase(ActualRowNo)){
				
				Reporter.log("RowNo--> TESTCASE PASS");
				
				Reporter.log("Expected Result = "+ExpectedRowNo+" Actual Result= "+ActualRowNo);
				
				Reporter.log("=============================================================");
			}
			else{
				Reporter.log("RowNo--> TESTCASE FAIL");
	
				Reporter.log("=============================================================");
				
				Assert.fail();
			}
				
			String ActualGetValueFromRow= getWebElement("AxpertFun_GetValueFromRow").getAttribute("value");
			
			String ExpectedGetValueFromRow= getWebElement("AxpertFun_Row4Name").getAttribute("value");
			
			if(ExpectedGetValueFromRow.equalsIgnoreCase(ActualGetValueFromRow)){
				
				Reporter.log("Get Value From Row--> TESTCASE PASS");
				
				Reporter.log("Expected Result = "+ExpectedGetValueFromRow+" Actual Result= "+ActualGetValueFromRow);

				Reporter.log("=============================================================");
			}
			else{
				Reporter.log("Get Value From Row--> TESTCASE FAIL");
			
				Reporter.log("=============================================================");
				
				Assert.fail();
			}
			
			String ActualAddValuesString= getWebElement("AxpertFun_AddValue").getAttribute("value");
			
			int ActualAddValues= Integer.parseInt(ActualAddValuesString);
			
			int Row1Amt= Integer.parseInt(getWebElement("AxpertFun_Row1amt").getAttribute("value"));
			
			int Row3Amt= Integer.parseInt(getWebElement("AxpertFun_Row3amt").getAttribute("value"));
			
			int Row5Amt= Integer.parseInt(getWebElement("AxpertFun_Row5amt").getAttribute("value"));
			
			int ExpectedAddValues= Row1Amt + Row3Amt + Row5Amt; 
			
			if(ExpectedAddValues==ActualAddValues){
				
				Reporter.log("ADD VAlues Function--> TESTCASE PASS");
				
				Reporter.log("Expected Result = "+ExpectedAddValues+" Actual Result= "+ActualAddValues);
				
				Reporter.log("=============================================================");
			}
			else{
				Reporter.log("ADD VAlues Function--> TESTCASE FAIL");
			
				Reporter.log("=============================================================");
				
				Assert.fail();
			}
			
			String ActualAddValTillRowNoStr= getWebElement("AxpertFun_AddValuesTillRowNo").getAttribute("value");
			
			int ActualAddValTillRowNo= Integer.parseInt(ActualAddValTillRowNoStr);
			
			int ExpectedAddValTillRowNo= Row1Amt + Row3Amt;
			
			if(ExpectedAddValTillRowNo == ActualAddValTillRowNo){
				
				Reporter.log("Add Value Till Row No.--> TESTCASE PASS");
				
				Reporter.log("Expected Result = "+ExpectedAddValTillRowNo+" Actual Result= "+ActualAddValTillRowNo);
				
				Reporter.log("=============================================================");
			}
			else{
				Reporter.log("Add Value Till Row No.--> TESTCASE FAIL");
			
				Reporter.log("=============================================================");
				
				Assert.fail();
			}
			
			
			
	}
	
}

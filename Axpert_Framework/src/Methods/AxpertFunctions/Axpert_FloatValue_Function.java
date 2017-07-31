package Methods.AxpertFunctions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class Axpert_FloatValue_Function extends TestBase {
	
	public void AxpertFloatvalueFun() throws Exception
	{
		
		SidebarMenu(getWebElement("AxpertFun_MainMenu"), getWebElement("AxpertFun_SubMenu"));
		
		SwitchFrame(getWebElement("AxpertFun_Frame"));
		
		String ExpectedPageTitle= "Axpert Function";
		
		String actualPageTitle= getWebElement("AxpertFun_PageTitle").getText();
		
		if(actualPageTitle.equalsIgnoreCase(ExpectedPageTitle))
		{
			Reporter.log("PageTitle is:: "+actualPageTitle);
			
		}
		else{
			Reporter.log("Page not correct--> Required Page is :"+ExpectedPageTitle);
			
		}
		implicitWait(10);
		
		WebElement FloatValue= getWebElement("AxpertFun_FloatValue");
		
		Reporter.log("Entering Floating Value in Float Value Field");
		
		FloatValue.sendKeys(Repository.getProperty("AXP_FLOATVALUE"));
		
		getWebElement("AxpertFun_save").click();
		
		driverwait(4);
		
		getWebElement("AxpertFun_Listview").click();
		
		getWebElement("AxpertFun_EditRecord").click();
		
		String ActGreaterFloattoInt= getWebElement("AxpertFun_FloattoInt_Greater").getAttribute("value");
		
		int ActualFloatIntValueGreater= Integer.parseInt(ActGreaterFloattoInt);
		
		String ActLesserFloatInt= getWebElement("AxpertFun_FloatToInt_Lesser").getAttribute("value");
		
		int ActualFloatIntValueLower= Integer.parseInt(ActLesserFloatInt);
		
		String FloatValueForRslt= Repository.getProperty("AXP_FLOATVALUE");
		
		String ExpectedGreaterValue= FloatValueForRslt.substring(0, FloatValueForRslt.indexOf("."));
		
		int ExpectedGreaterFloat2IntValue= Integer.parseInt(ExpectedGreaterValue);
		
		int ExpectedResultGreater= ExpectedGreaterFloat2IntValue+1;
		
		String ExpectedLesserOREqualValue= FloatValueForRslt.substring(0, FloatValueForRslt.indexOf("."));
		
		int ExpectedResultLesser= Integer.parseInt(ExpectedLesserOREqualValue);
		
		if((ExpectedResultGreater==ActualFloatIntValueGreater)&&(ExpectedResultLesser==ActualFloatIntValueLower))
		{
			Reporter.log("TESTCASE PASS-->> ");
			
			Reporter.log("Actual Float Value= "+FloatValueForRslt);
			
			Reporter.log("Expected Result GreaterIntValue= "+ExpectedResultGreater+" Actual Result GeaterIntValue= "+ActualFloatIntValueGreater);
			
			Reporter.log("Expected Result LowerIntValue= "+ExpectedResultLesser+" Actual Result LowerIntValue= "+ActualFloatIntValueLower);
			
		}
		
		else{
			
			Reporter.log("TESTCASE FAIL-->>");
			
			Reporter.log("Expected Result GreaterIntValue= "+ExpectedResultGreater+" Actual Result GeaterIntValue= "+ActualFloatIntValueGreater);
			
			Reporter.log("Expected Result LowerIntValue= "+ExpectedResultLesser+" Actual Result LowerIntValue= "+ActualFloatIntValueLower);
			
			Assert.fail();
		}
	}

}

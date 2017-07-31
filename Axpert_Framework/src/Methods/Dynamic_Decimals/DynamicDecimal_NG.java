package Methods.Dynamic_Decimals;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class DynamicDecimal_NG extends TestBase{
	
	public void DynamicDecimalNG() throws Exception
	{
		SidebarMenu(getWebElement("DynamicDec_MainMenu"), getWebElement("DynamicDec_Child_NG2NG_Submenu"));
		
		SwitchFrame(getWebElement("DynamicDec_Frame"));
		
		String ExpectedPage= "Currency Dec_ Non-Grid";
		
		String ActualPage= getWebElement("DynamicDec_ChildPage").getText();
		
		if(ActualPage.equalsIgnoreCase(ExpectedPage))
		{
			Reporter.log("Page Title is "+ActualPage);
		}
		else{
			Reporter.log("Page not correct, Expected Page is "+ExpectedPage);
		}
		selectDropDownValueUsingIndex(getWebElement("DynamicDec_CodeDropDown"), 4);
		
		driverwait(3);
		
		selectDropDownValue(getWebElement("DynamicDec_CountryDropDown"), "INDIA");
		
		WebElement qty= getWebElement("DynamicDec_quantity");
		
		qty.sendKeys(Repository.getProperty("Quantity"));
		
		WebElement qty1= getWebElement("DynamicDec_quantity1");
		
		qty1.sendKeys(Repository.getProperty("Quantity1"));
		
		String Rate= getWebElement("DynamicDec_rate").getAttribute("value");
		
		String Rate1= getWebElement("DynamicDec_rate1").getAttribute("value");
		
		getWebElement("DynamicDec_save").click();
		
		driverwait(4);
		
		getWebElement("DynamicDec_listview").click();
		
		getWebElement("DynamicDec_openRecord").click();
		
		String AftrRate= getWebElement("DynamicDec_rate").getAttribute("value");
		
		String AftrRate1= getWebElement("DynamicDec_rate1").getAttribute("value");
		
		if(Rate.equalsIgnoreCase(AftrRate))
		{
			Reporter.log("TESTCASE PASS");
			
			Reporter.log("Rate Fields are Mached "+Rate+" And "+AftrRate);
		}
		else{
			Reporter.log("TESTCASE FAIL");
			
			Reporter.log("Rate Field Not matched "+Rate+" And "+AftrRate);
			
		}
		if(Rate1.equalsIgnoreCase(AftrRate1)){
			
			Reporter.log("TESTCASE PASS");
			
			Reporter.log("Rate1 Fields matches "+Rate1+" And "+AftrRate1);
		}
		else{
			Reporter.log("TESTCASE FAIL");
			
			Reporter.log("Rate1 Fields not matches "+Rate1+" And "+AftrRate1);
			
			Assert.fail();
		}
		
	}

}

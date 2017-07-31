package Methods.Dynamic_Decimals;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class DynamicDecimal_Grid extends TestBase {
	
	public void DynamicDecimalGrid() throws Exception
	{
		SidebarMenu(getWebElement("DynamicDec_MainMenu"), getWebElement("DynamicDec_Grid_SubMenu"));
		
		SwitchFrame(getWebElement("DynamicDec_Frame"));
		
		String ExpectedPage= "Cur_Dec_Grid";
		
		String ActualPage= getWebElement("DynamicDec_ChildPage").getText();
		
		if(ActualPage.equalsIgnoreCase(ExpectedPage))
		{
			Reporter.log("Page Title is "+ActualPage);
		}
		else{
			Reporter.log("Page not correct, Expected Page is "+ExpectedPage);
		}
		selectDropDownValueUsingIndex(getWebElement("DynamicDec_CodeDropDown"), 2);
		
		driverwait(3);
		
		selectDropDownValue(getWebElement("DynamicDec_Grid_CountryDropDown"), "ARGENTINA");
		
		WebElement qty= getWebElement("DynamicDec_Grid_quantity");
		
		qty.sendKeys(Repository.getProperty("Quantity"));
		
		WebElement qty1= getWebElement("DynamicDec_Grid_quantity1");
		
		qty1.sendKeys(Repository.getProperty("Quantity1"));
		
		String Rate= getWebElement("DynamicDec_Grid_rate").getAttribute("value");
		
		String Rate1= getWebElement("DynamicDec_Grid_rate1").getAttribute("value");
		
		getWebElement("DynamicDec_save").click();
		
		driverwait(4);
		
		getWebElement("DynamicDec_listview").click();
		
		getWebElement("DynamicDec_openRecord").click();
		
		String AftrRate= getWebElement("DynamicDec_Grid_rate").getAttribute("value");
		
		String AftrRate1= getWebElement("DynamicDec_Grid_rate1").getAttribute("value");
		
		if(Rate.equalsIgnoreCase(AftrRate))
		{
			
		if(Rate1.equalsIgnoreCase(AftrRate1)){
			
			Reporter.log("TESTCASE PASS");
		}
		else{
			Reporter.log("TESTCASE FAIL");
			Reporter.log("Rate1 not matches "+Rate1+" And "+AftrRate1);
			
		}
		}
		else{
			Reporter.log("TESTCASE FAIL");
			Reporter.log("Rate Field Not matched "+Rate+" And "+AftrRate);
			
			Assert.fail();
		}
		
	}

}

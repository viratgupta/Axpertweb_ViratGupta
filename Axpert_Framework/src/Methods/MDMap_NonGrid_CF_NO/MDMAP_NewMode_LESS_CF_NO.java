package Methods.MDMap_NonGrid_CF_NO;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class MDMAP_NewMode_LESS_CF_NO extends TestBase{

	public void MDMap_NewMode_LESS_CF_NO_ATMTrans() throws Exception
	{
		SidebarMenu(getWebElement("MDMap_ADD_MainMenu"), getWebElement("MDMap_ADD_ChildSubMenu"));
		
		SwitchFrame(getWebElement("MDMap_ADD_Frame"));
		
		String ExpectedPage= "ATM Transaction";
		
		String ActualPage= getWebElement("MDMap_ADD_AtmTransaction").getText();
		
		if(ActualPage.equalsIgnoreCase(ExpectedPage))
		{
			System.out.println("ATM Transaction Page:::"+ ActualPage);
		}
		else
		{
			System.out.println("Page not correct Expected Page id::"+ ExpectedPage);
		}
		
		selectDropDownValue(getWebElement("MDMap_ADD_AccountNo"), "002");
		
		implicitWait(10);
		
		String MainBalance= getWebElement("MDMap_ADD_MainBalance").getAttribute("value");
		
		System.out.println("Current Main Balance(Before Deposit) is:::"+ MainBalance);
		
		driverwait(2);
		
		WebElement WithdrawnValue= getWebElement("MDMap_LESS_WithdrawnValue");
		
		Reporter.log("Entering Withdrawn value in Withdrawn field");
		
		WithdrawnValue.sendKeys(Repository.getProperty("MDMAP_LESS_WithDrawn"));
		
		implicitWait(10);
		
		selectDropDownValue(getWebElement("MDMap_LESS_WithdrawnUpdateType"), "NO");
		
		getWebElement("MDMap_ADD_Save").click();
		
		getWebElement("MDMap_CloseButton").click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
	//Checking Deposit value is Added in main Balance or not..
		
		SidebarMenu(getWebElement("MDMap_ADD_MainMenu"), getWebElement("MDMap_ADD_MasterSubMenu"));
		
		SwitchFrame(getWebElement("MDMap_ADD_Frame"));
		
		String ExpectedMasterpage= "Account Master";
		
		String ActualMasterPage= getWebElement("MDMap_ADD_AccountMaster").getText();
		
		if(ActualMasterPage.equalsIgnoreCase(ExpectedMasterpage))
		{
			System.out.println("Account Master is:::"+ActualMasterPage);
		}
		else
		{
			System.out.println("Page not Correct Expected Page is :::"+ExpectedMasterpage);
		}
		
		getWebElement("MDMap_ADD_MasterListview").click();
		
		implicitWait(10);
		
		getWebElement("MDMap_LESS_MasterAccountName").click();
		
		implicitWait(10);
		
		String ActualMainBalanceAfterWithdrawn= getWebElement("MDMap_ADD_MastermainBalance").getAttribute("value");
		
		int ActualMainbalanceafter= Integer.parseInt(ActualMainBalanceAfterWithdrawn);
		
		System.out.println("Actual Main Balance After Withdrawn"+ActualMainBalanceAfterWithdrawn);
		
		int mainbalance= Integer.parseInt(MainBalance);
		
		if(ActualMainbalanceafter==mainbalance)
		{
			System.out.println("TESTCASE PASS--> MainBalance is::"+ActualMainBalanceAfterWithdrawn);
			
			System.out.println("Expected Result: "+mainbalance+" Actual Result: "+ActualMainBalanceAfterWithdrawn);
			
			System.out.println("========================================================");
		}
		else{
			System.out.println("TESTCASE FAIL");
			
			System.out.println("Expected Result: "+mainbalance+" Actual Result: "+ActualMainBalanceAfterWithdrawn);
			
			System.out.println("========================================================");
			
			Assert.fail();
			
		}
	}
}

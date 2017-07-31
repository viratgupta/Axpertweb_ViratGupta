package Methods.MDMap_NonGrid_CF_NO;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class MDMAP_NewMode_LOWEST_CF_NO extends TestBase {
	
	public void MDMap_NewMode_LOW_CF_NO_ATMTrans() throws Exception
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
		
		selectDropDownValue(getWebElement("MDMap_ADD_AccountNo"), "004");
		
		implicitWait(10);
		
		String MainBalance= getWebElement("MDMap_ADD_MainBalance").getAttribute("value");
		
		System.out.println("Current Main Balance(Before) is:::"+ MainBalance);
		
		driverwait(3);
		
		WebElement LowValue= getWebElement("MDMap_LOW_LowestValue");
		
		Reporter.log("Entering Low value in Lower value field");
		
		LowValue.sendKeys(Repository.getProperty("MDMAP_LOW_LowerValue"));
		
		implicitWait(10);
		
		selectDropDownValue(getWebElement("MDMap_LOW_LowestUpdateType"), "NO");
		
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
		
		getWebElement("MDMap_LOW_MasterAccountName").click();
		
		implicitWait(10);
		
		String ActualMainBalanceAfterLowValue= getWebElement("MDMap_ADD_MastermainBalance").getAttribute("value");
		
		int ActualMainbalanceafter= Integer.parseInt(ActualMainBalanceAfterLowValue);
		
		System.out.println("Actual Main Balance After Low Value "+ActualMainbalanceafter);
		
		int mainbalance= Integer.parseInt(MainBalance);
		
			if(mainbalance==ActualMainbalanceafter)
			{
				System.out.println("TESTCASE PASS");
				System.out.println("ExpectedResult: "+mainbalance+ " ActualResult: "+ActualMainbalanceafter);
				System.out.println("=========================================================");
			}
			else
			{
				System.out.println("TESTCASE FAIL-->");
				System.out.println("ExpectedResult: "+mainbalance+ " ActualResult: "+ActualMainbalanceafter);
				System.out.println("=========================================================");
				Assert.fail();
			}
			
	}


}

package Methods.MDMap_NonGrid_CF_YES;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class MDMap_NewMode_CF_YES_REPLACE extends TestBase {
	
	public void MDMap_NewMode_REPLACE_CF_YES_ATMTrans() throws Exception
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
		
		selectDropDownValue(getWebElement("MDMap_ADD_AccountNo"), "007");
		
		implicitWait(10);
		
		String MainBalance= getWebElement("MDMap_ADD_MainBalance").getAttribute("value");
		
		System.out.println("Current Main Balance(Before) is:::"+ MainBalance);
		
		driverwait(3);
		
		WebElement ReplaceValue= getWebElement("MDMap_ReplaceValue");
		
		Reporter.log("Entering Replace value in Replace field");
		
		ReplaceValue.sendKeys(Repository.getProperty("MDMAP_REPLACE_ReplaceValue"));
		
		implicitWait(10);
		
		selectDropDownValue(getWebElement("MDMap_ReplaceUpdateType"), "YES");
		
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
		
		getWebElement("MDMap_REPLACE_MasterAccountName").click();
		
		implicitWait(10);
		
		String ActualMainBalanceAfterReplace= getWebElement("MDMap_ADD_MastermainBalance").getAttribute("value");
		
		int ActualMainbalanceafter= Integer.parseInt(ActualMainBalanceAfterReplace);
		
		System.out.println("Actual Main Balance After Replace "+ActualMainbalanceafter);
		
		int mainbalance= Integer.parseInt(MainBalance);
		
		int ReplaceBalance= Integer.parseInt(Repository.getProperty("MDMAP_REPLACE_ReplaceValue"));
		
		if(mainbalance!= ReplaceBalance)
			
		{
			System.out.println("Replace Balance after Trans is "+ ReplaceBalance);
			
			System.out.println("TESTCASE PASS");
			
			System.out.println("ExpectedResult: "+ReplaceBalance+ " ActualResult: "+ActualMainbalanceafter);
			
			System.out.println("=========================================================");
		}
		else{
			System.out.println("TESTCASE FAIL-->");
			
			System.out.println("Replace Balance after Trans is "+ReplaceBalance);
			
			System.out.println("ExpectedResult: "+ReplaceBalance+ " ActualResult: "+ActualMainbalanceafter);
			
			System.out.println("=========================================================");
		
			Assert.fail();
		}
										
		}
		
		
	}
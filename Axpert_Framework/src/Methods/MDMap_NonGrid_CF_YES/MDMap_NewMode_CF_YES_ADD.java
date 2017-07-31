package Methods.MDMap_NonGrid_CF_YES;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class MDMap_NewMode_CF_YES_ADD extends TestBase {

	public void MDMap_NewMode_ADD_CF_YES_ATMTrans() throws Exception
	{
		SidebarMenu(getWebElement("MDMap_ADD_MainMenu"), getWebElement("MDMap_ADD_ChildSubMenu"));
		
		SwitchFrame(getWebElement("MDMap_ADD_Frame"));
		
		String ExpectedPage= "ATM Transaction";
		
		String ActualPage= getWebElement("MDMap_ADD_AtmTransaction").getText();
		
		if(ActualPage.equalsIgnoreCase(ExpectedPage))
		{
			System.out.println("ATM Transactio Page:::"+ ActualPage);
		}
		else
		{
			System.out.println("Page not correct Expected Page id::"+ ExpectedPage);
		}
		
		selectDropDownValue(getWebElement("MDMap_ADD_AccountNo"), "001");
		
		implicitWait(10);
		
		String MainBalance= getWebElement("MDMap_ADD_MainBalance").getAttribute("value");
		
		System.out.println("Current Main Balance(Before Deposit) is:::"+ MainBalance);
		
		driverwait(3);
		
		WebElement depositvalue= getWebElement("MDMap_ADD_DepositValue");
		
		Reporter.log("Entering Deposit value in Deposit field");
		
		depositvalue.sendKeys(Repository.getProperty("MDMAP_ADD_Deposit"));
		
		implicitWait(10);
		
		selectDropDownValue(getWebElement("MDMap_ADD_DepositUpdateType"), "YES");
		
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
		
		getWebElement("MDMap_ADD_MasterAccountName").click();
		
		implicitWait(10);
		
		String ActualMainBalanceAfterDeposit= getWebElement("MDMap_ADD_MastermainBalance").getAttribute("value");
		
		int ActualMainbalanceafter= Integer.parseInt(ActualMainBalanceAfterDeposit);
		
		System.out.println("Actual Main Balance After Deposit"+ActualMainbalanceafter);
		
		int mainbalance= Integer.parseInt(MainBalance);
		
		int depositBalance= Integer.parseInt(Repository.getProperty("MDMAP_ADD_Deposit"));
		
		int Expected= mainbalance + depositBalance;
		
		if(ActualMainbalanceafter== Expected)
		{
			System.out.println("TESTCASE PASS--> MainBalance is::"+ActualMainbalanceafter);
			
			System.out.println("Expected Result: "+Expected+" Actual Result: "+ActualMainbalanceafter);
			
			System.out.println("========================================================");
		}
		else{
			System.out.println("TESTCASE FAIL");
			
			System.out.println("Expected Result: "+Expected+" Actual Result: "+ActualMainbalanceafter);
			
			System.out.println("========================================================");
			Assert.fail();
			
		}
	}
}

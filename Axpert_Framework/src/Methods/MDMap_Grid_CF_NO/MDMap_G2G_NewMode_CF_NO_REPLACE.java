package Methods.MDMap_Grid_CF_NO;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class MDMap_G2G_NewMode_CF_NO_REPLACE extends TestBase {
	
	public void MDMap_G2G_NewMode_REPLACE_CF_NO_ATMTrans() throws Exception
	{
		SidebarMenu(getWebElement("MDMap_G2G_ADD_MainMenu"), getWebElement("MDMap_G2G_ADD_ChildSubMenu"));
		
		SwitchFrame(getWebElement("MDMap_G2G_ADD_Frame"));
		
		String ExpectedPage= "G2G Child Transaction MDMap";
		
		String ActualPage= getWebElement("MDMap_G2G_ADD_AtmTransaction").getText();
		
		if(ActualPage.equalsIgnoreCase(ExpectedPage))
		{
			System.out.println("ATM Transaction Page:::"+ ActualPage);
		}
		else
		{
			System.out.println("Page not correct Expected Page id::"+ ExpectedPage);
		}
		
		selectDropDownValue(getWebElement("MDMap_G2G_ADD_AccountNo"), "007");
		
		implicitWait(10);
		
		String MainBalance= getWebElement("MDMap_G2G_ADD_MainBalance").getAttribute("value");
		
		int mainbalance= Integer.parseInt(MainBalance);
		
		System.out.println("Current Main Balance(Before) is:::"+ mainbalance);
		
		driverwait(3);
		
		WebElement ReplaceValue= getWebElement("MDMap_G2G_ReplaceValue");
		
		Reporter.log("Entering Replace value in Replace field");
		
		ReplaceValue.sendKeys(Repository.getProperty("MDMAP_REPLACE_ReplaceValue"));
		
		implicitWait(10);
		
		//getWebElement("MDMap_G2G_ReplaceUpdateType").click();
		
		getWebElement("MDMap_G2G_ADD_Save").click();
		
		getWebElement("MDMap_G2G_CloseButton").click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
	//Checking Deposit value is Added in main Balance or not..
		
		scrollUp();
		
		SidebarMenu(getWebElement("MDMap_G2G_ADD_MainMenu"), getWebElement("MDMap_G2G_ADD_MasterSubMenu"));
		
		SwitchFrame(getWebElement("MDMap_G2G_ADD_Frame"));
		
		String ExpectedMasterpage= "G2G Master Acc MDMap";
		
		String ActualMasterPage= getWebElement("MDMap_G2G_ADD_AccountMaster").getText();
		
		if(ActualMasterPage.equalsIgnoreCase(ExpectedMasterpage))
		{
			System.out.println("Account Master is:::"+ActualMasterPage);
		}
		else
		{
			System.out.println("Page not Correct Expected Page is :::"+ExpectedMasterpage);
		}
		
		getWebElement("MDMap_G2G_ADD_MasterListview").click();
		
		implicitWait(10);
		
		getWebElement("MDMap_G2G_REPLACE_MasterAccountName").click();
		
		implicitWait(10);
		
		String ActualMainBalanceAfterReplace= getWebElement("MDMap_G2G_ADD_MastermainBalance").getAttribute("value");
		
		int ActualMainbalanceafter= Integer.parseInt(ActualMainBalanceAfterReplace);
		
		System.out.println("Actual Main Balance After Replace "+ActualMainbalanceafter);
				
		int ReplaceBalance= Integer.parseInt(Repository.getProperty("MDMAP_REPLACE_ReplaceValue"));
		
		if(mainbalance== ActualMainbalanceafter)
			
		{
			System.out.println("Replace Balance after Trans is "+ ReplaceBalance);
			
			System.out.println("TESTCASE PASS");
			
			System.out.println("ExpectedResult: "+mainbalance+ " ActualResult: "+ActualMainbalanceafter);
			
			System.out.println("=========================================================");
		}
		else{
			System.out.println("TESTCASE FAIL-->");
			
			System.out.println("Replace Balance after Trans is "+ReplaceBalance);
			
			System.out.println("ExpectedResult: "+mainbalance+ " ActualResult: "+ActualMainbalanceafter);
			
			System.out.println("=========================================================");
		
			Assert.fail();
		}
										
		}


}

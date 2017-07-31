package Methods.MDMap_Grid_CF_YES;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class MDMap_Grid_SetValuesInMasterTransaction extends TestBase {
	
	public void MDMap_Grid_MasterTransMainBalance() throws Exception
	{
		SidebarMenu(getWebElement("MDMap_ADD_MainMenu"), getWebElement("MDMap_G2G_ADD_MasterSubMenu"));
		
		SwitchFrame(getWebElement("MDMap_G2G_ADD_Frame"));
		
		String ExpectedPage= "G2G Master Acc MDMap";
		
		String ActualPage= getWebElement("MDMap_G2G_ADD_AccountMaster").getText();
		
		if(ActualPage.equalsIgnoreCase(ExpectedPage))
		{
			System.out.println("Account Master Page is :"+ActualPage);
		}
		else
		{
			System.out.println("Page Not Correct: Required Page is: "+ExpectedPage);
			
		}
		
	}
	
		public void MainBalanceADD() throws Exception
		{
		getWebElement("MDMap_G2G_ADD_MasterListview").click();
		
		implicitWait(10);
		
		getWebElement("MDMap_G2G_ADD_MasterAccountName").click();
		
		implicitWait(5);
		
		WebElement MainBalanceField= getWebElement("MDMap_G2G_ADD_MastermainBalance");
		
		Reporter.log("Ënter value in 'ADD' MainBalance Field");
		
		MainBalanceField.clear();
		
		MainBalanceField.sendKeys(Repository.getProperty("MDMAP_ADD"));
		
		getWebElement("MDMap_G2G_ADD_Save").click();
		
		getWebElement("MDMap_G2G_CloseButton").click();
		
		implicitWait(10);
		}
		
		public void MainBalanceLESS() throws Exception
		{
		getWebElement("MDMap_G2G_ADD_MasterListview").click();
		
		implicitWait(10);
		
		getWebElement("MDMap_G2G_LESS_MasterAccountName").click();
		
		implicitWait(5);
		
		WebElement MainBalanceField= getWebElement("MDMap_G2G_ADD_MastermainBalance");
		
		Reporter.log("Ënter value in 'LESS' MainBalance Field");
		
		MainBalanceField.clear();
		
		MainBalanceField.sendKeys(Repository.getProperty("MDMAP_LESS"));
		
		getWebElement("MDMap_G2G_ADD_Save").click();
		
		getWebElement("MDMap_G2G_CloseButton").click();
		
		implicitWait(10);
		}
			
		public void MainBalanceHIGH() throws Exception
		{
			getWebElement("MDMap_G2G_ADD_MasterListview").click();
			
			implicitWait(10);
			
			getWebElement("MDMap_G2G_HIGH_MasterAccountName").click();
			
			implicitWait(5);
			
			WebElement MainBalanceField= getWebElement("MDMap_G2G_ADD_MastermainBalance");
			
			Reporter.log("Ënter value in 'HIGHEST' MainBalance Field");
			
			MainBalanceField.clear();
			
			MainBalanceField.sendKeys(Repository.getProperty("MDMAP_HIGH"));
			
			getWebElement("MDMap_G2G_ADD_Save").click();
			
			getWebElement("MDMap_G2G_CloseButton").click();
			
			implicitWait(10);
		}
		
		public void MainBalanceLOW() throws Exception
		{
			getWebElement("MDMap_G2G_ADD_MasterListview").click();
			
			implicitWait(10);
			
			getWebElement("MDMap_G2G_LOW_MasterAccountName").click();
			
			implicitWait(5);
			
			WebElement MainBalanceField= getWebElement("MDMap_G2G_ADD_MastermainBalance");
			
			Reporter.log("Ënter value in 'LOWEST' MainBalance Field");
			
			MainBalanceField.clear();
			
			MainBalanceField.sendKeys(Repository.getProperty("MDMAP_LOW"));
			
			getWebElement("MDMap_G2G_ADD_Save").click();
			
			getWebElement("MDMap_G2G_CloseButton").click();
			
			implicitWait(10);
		}
		
		public void MainBalanceINCREMENT() throws Exception
		{
			getWebElement("MDMap_G2G_ADD_MasterListview").click();
			
			implicitWait(10);
			
			getWebElement("MDMap_G2G_INC_MasterAccountName").click();
			
			implicitWait(5);
			
			WebElement MainBalanceField= getWebElement("MDMap_G2G_ADD_MastermainBalance");
			
			Reporter.log("Ënter value in 'INCREMENT' MainBalance Field");
			
			MainBalanceField.clear();
			
			MainBalanceField.sendKeys(Repository.getProperty("MDMAP_INCREMENT"));
			
			getWebElement("MDMap_G2G_ADD_Save").click();
			
			getWebElement("MDMap_G2G_CloseButton").click();
			
			implicitWait(10);
		}
		
		public void MainBalanceDECREMENT() throws Exception
		{
			getWebElement("MDMap_G2G_ADD_MasterListview").click();
			
			implicitWait(10);
			
			getWebElement("MDMap_G2G_DEC_MasterAccountName").click();
			
			implicitWait(5);
			
			WebElement MainBalanceField= getWebElement("MDMap_G2G_ADD_MastermainBalance");
			
			Reporter.log("Ënter value in 'DECREMENT' MainBalance Field");
			
			MainBalanceField.clear();
			
			MainBalanceField.sendKeys(Repository.getProperty("MDMAP_DECREMENT"));
			
			getWebElement("MDMap_G2G_ADD_Save").click();
			
			getWebElement("MDMap_G2G_CloseButton").click();
			
			implicitWait(10);
		}
		
		public void MainBalanceREPLACE() throws Exception
		{
			getWebElement("MDMap_G2G_ADD_MasterListview").click();
			
			implicitWait(10);
			
			getWebElement("MDMap_G2G_REPLACE_MasterAccountName").click();
			
			implicitWait(5);
			
			WebElement MainBalanceField= getWebElement("MDMap_G2G_ADD_MastermainBalance");
			
			Reporter.log("Ënter value in 'REPLACE' MainBalance Field");
			
			MainBalanceField.clear();
			
			MainBalanceField.sendKeys(Repository.getProperty("MDMAP_REPLACE"));
			
			getWebElement("MDMap_G2G_ADD_Save").click();
			
			getWebElement("MDMap_G2G_CloseButton").click();
			
			implicitWait(10);
		}

}

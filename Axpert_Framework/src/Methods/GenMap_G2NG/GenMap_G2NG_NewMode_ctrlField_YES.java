package Methods.GenMap_G2NG;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class GenMap_G2NG_NewMode_ctrlField_YES extends TestBase {
	
	public void G2NG_Master() throws Exception
	{
		SidebarMenu(getWebElement("GenMap_G2NG_Menu"), getWebElement("GenMap_G2NG_Master_Submenu"));
		
		String ExpectedPageTitle= "G2NGmaster";
		
		SwitchFrame(getWebElement("GenMap_G2NG_Frame"));
		
		String ActualPageTitle= getWebElement("GenMap_G2NG_Master_PageTitle").getText();
		
		implicitWait(10);
		
		if(ActualPageTitle.equalsIgnoreCase(ExpectedPageTitle))
		{
			System.out.println("GenMap_G2NG_Master Page is :::::"+ActualPageTitle);
		}
		else
		{
			System.out.println("Page Not Correct:) Required Page is::::::"+ExpectedPageTitle);
		}
		
		//SwitchFrame(getWebElement("GenMap_G2NG_Frame"));
		
		getWebElement("GenMap_G2NG_G2NG_Listview").click();
		
		implicitWait(15);
		
		WebElement TotalRows= getWebElement("GenMap_G2NG_TotalRows");
		
		String ExpectedRows= "No records available";
		
		String ActualRows= TotalRows.getText();
		
		if(ActualRows.equalsIgnoreCase(ExpectedRows)){
		
			// Switch to default frame
			
			driver.switchTo().defaultContent();
		}
		else{
			
		getWebElement("GenMap_G2NG_CheckAll").click();
		
		getWebElement("GenMap_G2NG_DeleteListview").click();
		
		driver.switchTo().alert().accept();
		
		//implicitWait(3);
		
		WaitForAlertBox();
		
		driver.switchTo().alert().accept();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
	}
	}
	
	//Navigate to CHILD G2NG GENMAP TSTRUCT WITH CF= YES
	
	public void G2NG_Child() throws Exception
	{
		SidebarMenu(getWebElement("GenMap_G2NG_Menu"), getWebElement("GenMap_G2NG_Child_SubMenu"));
		
		String ExpectedPageTitle= "G2NGchild";
		
		SwitchFrame(getWebElement("GenMap_G2NG_Frame"));
		
		String ActualPageTitle= getWebElement("GenMap_G2NG_Child_PageTitle").getText();
		
		implicitWait(10);
		
		if(ActualPageTitle.equalsIgnoreCase(ExpectedPageTitle))
		{
			System.out.println("GenMap_G2NG_Child Page is :::::"+ActualPageTitle);
		}
		else
		{
			System.out.println("Page Not Correct:) Required Page is::::::"+ExpectedPageTitle);
		}
		
		//SwitchFrame(getWebElement("GenMap_G2NG_Frame"));
		
		WebElement EmpName= getWebElement("GenMap_G2NG_EmpName");
		
		Reporter.log("Entering Employee Name in Employee Field");
		
		EmpName.sendKeys(Repository.getProperty("G2NG_Child_EmpName"));
		
		WebElement DOJ= getWebElement("GenMap_G2NG_DOJ");
		
		DOJ.clear();
		
		Reporter.log("Entering Employee Date of Joining in DOJ Field");
		
		DOJ.sendKeys(Repository.getProperty("G2NG_Child_DOJ"));
		
		WebElement DOB= getWebElement("GenMap_G2NG_DOB");
		
		Reporter.log("Entering Employee Date of Birth in DOB Field");
		
		DOB.sendKeys(Repository.getProperty("G2NG_Child_DOB"));
		
		WebElement Address= getWebElement("GenMap_G2NG_Address");
		
		Reporter.log("Entering Employee Address in Address Field");
		
		Address.sendKeys(Repository.getProperty("G2NG_Child_Address"));
		
		//selectDropDownValue(getWebElement("GenMap_G2NG_UpdateType"), "YES");
		
		getWebElement("GenMap_G2NG_UpdateType").click();
		
		getWebElement("GenMap_G2NG_save").click();
		
		getWebElement("GenMap_G2NG_CloseButton").click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
	}
	
	//Checking Data is Storing in MAster Tstructs or not

	public void G2NG_CheckMaster() throws Exception
	{
		SidebarMenu(getWebElement("GenMap_G2NG_Menu"), getWebElement("GenMap_G2NG_Master_Submenu"));
		
		String ExpectedPageTitle= "G2NGmaster";
		
		SwitchFrame(getWebElement("GenMap_G2NG_Frame"));
		
		String ActualPageTitle= getWebElement("GenMap_G2NG_Master_PageTitle").getText();
		
		implicitWait(10);
		
		if(ActualPageTitle.equalsIgnoreCase(ExpectedPageTitle))
		{
			System.out.println("GenMap_G2NG_Master Page is :::::"+ActualPageTitle);
		}
		else
		{
			System.out.println("Page Not Correct:) Required Page is::::::"+ExpectedPageTitle);
		}
		
		getWebElement("GenMap_G2NG_G2NG_Listview").click();
		
		implicitWait(15);
		
		WebElement TotalRows= getWebElement("GenMap_G2NG_TotalRows");
		
		String ExpectedRows= "Total rows: 1";
		
		String ActualRows= TotalRows.getText();
		
		if(ActualRows.equalsIgnoreCase(ExpectedRows)){
		
			System.out.println("TestCase PASS:::GENMAP G2NG_NEW MODE_CTRL FIELD_YES");
			
			System.out.println("ExpectedResult "+ExpectedRows+"====ActualResult "+ActualRows);
			
			System.out.println("-------------------------------------------------------------");
		}
		
		else
		{
			System.out.println("Expected Result = "+ExpectedRows);
			
			System.out.println("Actual Result   = "+ActualRows);
			
			System.out.println("Testcase FAIL");
			
			System.out.println("-------------------------------------------------------------");
			
			Assert.fail();
		}
		}

}

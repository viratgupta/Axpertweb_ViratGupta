package Methods.GenMap_G2G;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class GenMap_G2G_NewMode_ctrlField_NO_Parent_Child_GrandChild extends TestBase {
	
	String ActualRowChild;
	
	String ActualRowGrandChild;
	
	public void G2G_ParentPage_CF_NO() throws Exception
	{
		SidebarMenu(getWebElement("GenMap_G2G_Menu"), getWebElement("GenMap_G2G_ParentMenu"));
		
		String ExpectedPageTitle= "Parent";
		
		SwitchFrame(getWebElement("GenMap_G2G_Frame"));
		
		String ActualPageTitle= getWebElement("GenMap_G2G_Child_PageTitle").getText();
		
		implicitWait(10);
		
		if(ActualPageTitle.equalsIgnoreCase(ExpectedPageTitle))
		{
			System.out.println("GenMap_G2G_Parent Page Title is :::::"+ActualPageTitle);
		}
		else
		{
			System.out.println("Page Not Correct:) Required Page Title is::::::"+ExpectedPageTitle);
		}
		
		//SwitchFrame(getWebElement("GenMap_G2G_Frame"));
		
		WebElement EmpName= getWebElement("GenMap_G2G_EmpName");
		
		Reporter.log("Entering Employee Name in Employee Field");
		
		EmpName.sendKeys(Repository.getProperty("G2G_Child_EmpName"));
		
		WebElement DOJ= getWebElement("GenMap_G2G_DOJ");
		
		DOJ.clear();
		
		Reporter.log("Entering Employee Date of Joining in DOJ Field");
		
		DOJ.sendKeys(Repository.getProperty("G2G_Child_DOJ"));
		
		WebElement DOB= getWebElement("GenMap_G2G_DOB");
		
		DOB.clear();
		
		Reporter.log("Entering Employee Date of Birth in DOB Field");
		
		DOB.sendKeys(Repository.getProperty("G2G_Child_DOB"));
		
		WebElement Address= getWebElement("GenMap_G2G_Address");
		
		Reporter.log("Entering Employee Address in Address Field");
		
		Address.sendKeys(Repository.getProperty("G2G_Child_Address"));
		
		//selectDropDownValue(getWebElement("GenMap_G2G_UpdateType"), "YES");
		
		WebElement Organisation= getWebElement("GenMap_G2G_Organisation");
		
		Reporter.log("Entering Employee Organization Name");
		
		Organisation.sendKeys(Repository.getProperty("G2G_Child_Organisation"));
		
		//getWebElement("GenMap_G2G_UpdateType").click();
		
		getWebElement("GenMap_G2G_save").click();
		
		getWebElement("GenMap_G2G_CloseButton").click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
	}
	
	public void G2G_Check_Child_CF_NO() throws Exception
	{
		SidebarMenu(getWebElement("GenMap_G2G_Menu"), getWebElement("GenMap_G2G_ChildMenu"));
		
		String ExpectedPageTitle= "Child";
		
		SwitchFrame(getWebElement("GenMap_G2G_Frame"));
		
		String ActualPageTitle= getWebElement("GenMap_G2G_PageTitle").getText();
		
		implicitWait(10);
		
		if(ActualPageTitle.equalsIgnoreCase(ExpectedPageTitle))
		{
			System.out.println("GenMap_G2G_Child Page is :::::"+ActualPageTitle);
		}
		else
		{
			System.out.println("Page Not Correct:) Required Page is::::::"+ExpectedPageTitle);
		}
		
		getWebElement("GenMap_G2G_ChildListview").click();
		
		implicitWait(15);
		
		WebElement TotalRows= getWebElement("GenMap_G2G_TotalRows");
		
		String ExpectedRowsChild= "No records available";
		
		ActualRowChild= TotalRows.getText();
		
		if(ActualRowChild.equalsIgnoreCase(ExpectedRowsChild)){
		
			System.out.println("Parent Record is Updated in Child Tstruct");
			
			System.out.println("ExpectedResult "+ExpectedRowsChild+"====ActualResult "+ActualRowChild);
			
			driver.switchTo().defaultContent();
		}
		
		else
		{
			System.out.println("Parent Records are not Updated in Child Tstruct");
			
			System.out.println("Expected Result = "+ExpectedRowsChild);
			
			System.out.println("Actual Result   = "+ActualRowChild);
			
			Assert.fail();
		}
		}
	
	public void G2G_Check_GrandChild_CF_NO() throws Exception
	{
		SidebarMenu(getWebElement("GenMap_G2G_Menu"), getWebElement("GenMap_G2G_GrandChildMenu"));
		
		String ExpectedPageTitle= "Grand Child";
		
		SwitchFrame(getWebElement("GenMap_G2G_Frame"));
		
		String ActualPageTitle= getWebElement("GenMap_G2G_PageTitle").getText();
		
		implicitWait(10);
		
		if(ActualPageTitle.equalsIgnoreCase(ExpectedPageTitle))
		{
			System.out.println("GenMap_G2G_Grand Child Page is :::::"+ActualPageTitle);
		}
		else
		{
			System.out.println("Page Not Correct:) Required Page is::::::"+ExpectedPageTitle);
		}
		
		getWebElement("GenMap_G2G_GrandChildListview").click();
		
		implicitWait(15);
		
		WebElement TotalRows= getWebElement("GenMap_G2G_TotalRows");
		
		String ExpectedRowsGrandChild= "No records available";
		
		ActualRowGrandChild= TotalRows.getText();
		
		if(ActualRowGrandChild.equalsIgnoreCase(ExpectedRowsGrandChild)){
		
			System.out.println("Parent Record is Updated in Grant Child Tstruct");
			
			System.out.println("ExpectedResult "+ExpectedRowsGrandChild+"====ActualResult "+ActualRowGrandChild);
			
			driver.switchTo().defaultContent();
	
		}
		
		else
		{
			System.out.println("Parent Records are not Updated in Grand Child Tstruct");
			
			System.out.println("Expected Result = "+ExpectedRowsGrandChild);
			
			System.out.println("Actual Result   = "+ActualRowGrandChild);
			
			Assert.fail();
		}
		
		}
	
	public void ChildAndGrandChild()
	{
	if(ActualRowChild.equalsIgnoreCase(ActualRowGrandChild))
	{
		System.out.println("TESTCASE PASS");
		
		System.out.println("ActualChildRows= "+ActualRowChild+ " ActualGrandChildRows= "+ActualRowGrandChild);
		
	}
		
	}

}

package Methods.Grid_Add_And_Delete;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class Grid_AddGrid extends TestBase {
	
	public void AddGrid() throws Exception{
		
		SidebarMenu(getWebElement("Grid_MainMenu"), getWebElement("Grid_SubMenu"));
		
		SwitchFrame(getWebElement("Grid_Frame"));
		
		String ExpectedPageTitle= "GRID(ADD/DELETE)";
		
		String ActualPageTitle= getWebElement("Grid_PageTitle").getText();
		
		if(ExpectedPageTitle.equalsIgnoreCase(ActualPageTitle))
		{
			Reporter.log("Page Title is : "+ActualPageTitle);
			
		}
		else{
			Reporter.log("Page NOt correct, Required Page is: "+ExpectedPageTitle);
		}
		for(int i=1; i<5; i++)
		{
			getWebElement("Grid_AddRow").click();
		}
		implicitWait(10);
		
		WebElement Date1= getWebElement("Grid_DATE1");
		
		Date1.clear();
		
		Date1.sendKeys(Repository.getProperty("GRIDFIELD_DATE1"));
		
		WebElement Date2= getWebElement("Grid_DATE2");
		
		Date2.clear();
		
		Date2.sendKeys(Repository.getProperty("GRIDFIELD_DATE2"));
		
		WebElement Date3= getWebElement("Grid_DATE3");
		
		Date3.clear();
		
		Date3.sendKeys(Repository.getProperty("GRIDFIELD_DATE3"));
		
		WebElement Date4= getWebElement("Grid_DATE4");
		
		Date4.clear();
		
		Date4.sendKeys(Repository.getProperty("GRIDFIELD_DATE4"));
		
		WebElement Date5= getWebElement("Grid_DATE5");
		
		Date5.clear();
		
		Date5.sendKeys(Repository.getProperty("GRIDFIELD_DATE5"));
		
		WebElement Role1= getWebElement("Grid_ROLE1");
		
		Role1.sendKeys(Repository.getProperty("GRIDFIELD_ROLE1"));
		
		WebElement Role2= getWebElement("Grid_ROLE2");
		
		Role2.sendKeys(Repository.getProperty("GRIDFIELD_ROLE2"));
		
		WebElement Role3= getWebElement("Grid_ROLE3");
		
		Role3.sendKeys(Repository.getProperty("GRIDFIELD_ROLE3"));
		
		WebElement Role4= getWebElement("Grid_ROLE4");
		
		Role4.sendKeys(Repository.getProperty("GRIDFIELD_ROLE4"));
		
		WebElement Role5= getWebElement("Grid_ROLE5");
		
		Role5.sendKeys(Repository.getProperty("GRIDFIELD_ROLE5"));
		
		Reporter.log("Five Rows Added With Data");
		
		getWebElement("Grid_Save").click();
		
		driverwait(4);
		
		getWebElement("Grid_Listview").click();
		
		getWebElement("Grid_editRecord").click();
			
	}
	
	public void AddRowTestCase() throws Exception{
		
		String ExpectedResult= getWebElement("Grid_fifthRowNo").getText();
		
		if(ExpectedResult.equalsIgnoreCase("5"))
		{
			Reporter.log("GridRows Added-->>TESTCASE PASS");
			
			Reporter.log("======================================================");
		}
		else{
			Reporter.log("Grid Add Rows-->>TESTCASE FAIL");
			
			Reporter.log("=====================================================");
			
			Assert.fail();
		}
	}

}

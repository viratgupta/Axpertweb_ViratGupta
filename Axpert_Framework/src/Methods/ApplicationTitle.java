package Methods;

import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class ApplicationTitle extends TestBase {
	
	public void AppTitle() throws Exception
	{
		String ExpectedAppTitle= "Axpert Web Application";
		
		String ActualAppTitle= getWebElement("AppTitle").getText();
		
		if(ActualAppTitle.equalsIgnoreCase(ExpectedAppTitle))
		{
			Reporter.log("TESTCASE PASS");
			Reporter.log("Application Title is "+ActualAppTitle);
			Reporter.log("--------------------------------------------");
		}
		else{
			Reporter.log("TETSCASE FAIL-->");
			Reporter.log("ExpectedResult= "+ExpectedAppTitle +" ActualResult= "+ActualAppTitle);
			Reporter.log("--------------------------------------------");
			Assert.fail();
		}
	}
}

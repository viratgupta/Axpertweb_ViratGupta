package Methods.ExpressionDependencies;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class ExpressionDependencies extends TestBase {
	
	public void ExpDep() throws Exception
	{
		SidebarMenu(getWebElement("ExpDep_mainMenu"), getWebElement("ExpDep_SubMenu"));
		
		SwitchFrame(getWebElement("ExpDep_SwitchFrame"));
		
		String ExpectedPageTitle= "Exp3";
		
		String ActualPageTitle= getWebElement("ExpDep_PageTitle").getText();
		
		if(ExpectedPageTitle.equalsIgnoreCase(ActualPageTitle))
		{
			Reporter.log("Page Title is "+ActualPageTitle);
			
		}
		else{
			Reporter.log("Page Not Correct, Reqired Page is : "+ExpectedPageTitle);
		}
		WebElement F0_Field= getWebElement("ExpDep_F0_Field");
		
		F0_Field.sendKeys(Repository.getProperty("F0_FIELD_NAME"));
		
		getWebElement("ExpDep_AddRows").click();
		
		getWebElement("ExpDep_Save").click();
		
		expliciteWait(getWebElement("ExpDep_CloseButton"),4);
		
		getWebElement("ExpDep_Listview").click();
		
		getWebElement("ExpDep_EditRecord").click();
		
		//   FIRST FIELD::::::::::::F1
		
		driver.switchTo().defaultContent();

		String Expected_F1= getWebElement("ExpDep_UserName").getText().toLowerCase();
		
		SwitchFrame(getWebElement("ExpDep_SwitchFrame"));
		
		String Actual_F1= getWebElement("ExpDep_F1_field").getAttribute("value");
		
		if(Expected_F1.equalsIgnoreCase(Actual_F1))
		{
			Reporter.log("F1 Field Dependency-->>TESTCASE PASS");
			
			Reporter.log("ExpectedResult= "+Expected_F1+" Actual Result= "+Actual_F1);
			
			Reporter.log("====================================================");
		}
		else{
			Reporter.log("F1 Field Dependency-->>TESTCASE FAIL");
			
			Reporter.log("ExpectedResult= "+Expected_F1+" Actual Result= "+Actual_F1);
			
			Reporter.log("====================================================");
			
			Assert.fail();
		}
		//  SECOND FIELD::::::::F2
		
		String Expected_F2= "a";
			
		String Actual_F2= getWebElement("ExpDep_F2_field").getAttribute("value");
		
		if(Expected_F2.equalsIgnoreCase(Actual_F2))
		{
			Reporter.log("F2 Field Dependency-->>TESTCASE PASS");
			
			Reporter.log("ExpectedResult= "+Expected_F2+" Actual Result= "+Actual_F2);
			
			Reporter.log("====================================================");
		}
		else{
			Reporter.log("F2 Field Dependency-->>TESTCASE FAIL");
			
			Reporter.log("ExpectedResult= "+Expected_F2+" Actual Result= "+Actual_F2);
			
			Reporter.log("====================================================");
			
			Assert.fail();
		}
		
		// THIRD FIELD:::::::::F3
		
		String Expected_F3= getWebElement("ExpDec_F3_ExpRes").getText();
		
		String Actual_F3= getWebElement("ExpDep_F3_field").getAttribute("value");
		
		if(Expected_F3.equalsIgnoreCase(Actual_F3)){		

			Reporter.log("F3 Field Dependency-->>TESTCASE PASS");
			
			Reporter.log("Expected Result= "+Expected_F3+" Actual Result= "+Actual_F3);
			
			Reporter.log("====================================================");
		}
		else{
			Reporter.log("F3 Field Dependency-->>TESTCASE FAIL");
			
			Reporter.log("Expected Result= "+Expected_F3+" Actual Result= "+Actual_F3);
			
			Reporter.log("====================================================");
			
		}
	
		// FOURTH FIELD:::::::::::::::::: F4
		
		String Expected_F4= "demo"+ Actual_F3;
		
		String Actual_F4= getWebElement("ExpDep_F4_field").getAttribute("value");
		
		if(Expected_F4.equalsIgnoreCase(Actual_F4))
		{
			Reporter.log("F4 Field Dependency-->>TESTCASE PASS");
			
			Reporter.log("ExpectedResult= "+Expected_F4+" Actual Result= "+Actual_F4);
			
			Reporter.log("====================================================");
		}
		else{
			Reporter.log("F4 Field Dependency-->>TESTCASE FAIL");
			
			Reporter.log("ExpectedResult= "+Expected_F4+" Actual Result= "+Actual_F4);
			
			Reporter.log("====================================================");
			
			Assert.fail();
}
		// FIFTH FIELD :::::::::::::::::::::::  F5

		String Expected_F5_Row2= "grid2"+Actual_F3;
		
		String Actual_F5_Row2= getWebElement("ExpDep_F5_Row2").getAttribute("value");
		
		if(Expected_F5_Row2.equalsIgnoreCase(Actual_F5_Row2))
		{
			Reporter.log("F5 Row2 Field Dependency-->>TESTCASE PASS");
			
			Reporter.log("ExpectedResult= "+Expected_F5_Row2+" Actual Result= "+Actual_F5_Row2);
			
			Reporter.log("====================================================");
		}
		else{
			Reporter.log("F5 Field Dependency-->>TESTCASE FAIL");
			
			Reporter.log("ExpectedResult= "+Expected_F5_Row2+" Actual Result= "+Actual_F5_Row2);
			
			Reporter.log("====================================================");
			
			Assert.fail();
}
		
		// SIXTH FIELD :::::::::::::::::::::::  F6

		String Expected_F6_Row2= Actual_F3;
		
		String Actual_F6_Row2= getWebElement("ExpDep_F6_Row2").getAttribute("value");
		
		if(Expected_F6_Row2.equalsIgnoreCase(Actual_F6_Row2))
		{
			Reporter.log("F6 Row2 Field Dependency-->>TESTCASE PASS");
			
			Reporter.log("ExpectedResult= "+Expected_F6_Row2+" Actual Result= "+Actual_F6_Row2);
			
			Reporter.log("====================================================");
		}
		else{
			Reporter.log("F6 Field Dependency-->>TESTCASE FAIL");
			
			Reporter.log("ExpectedResult= "+Expected_F6_Row2+" Actual Result= "+Actual_F6_Row2);
			
			Reporter.log("====================================================");
			
			Assert.fail();
}
		// SEVENTH FIELD :::::::::::::::::::::::  F7

				String Expected_F7_Row2= "2";
				
				String Actual_F7_Row2= getWebElement("ExpDep_F7_Row2").getAttribute("value");
				
				if(Expected_F7_Row2.equalsIgnoreCase(Actual_F7_Row2))
				{
					Reporter.log("F7 Row2 Field Dependency-->>TESTCASE PASS");
					
					Reporter.log("ExpectedResult= "+Expected_F7_Row2+" Actual Result= "+Actual_F7_Row2);
					
					Reporter.log("====================================================");
				}
				else{
					Reporter.log("F7 Field Dependency-->>TESTCASE FAIL");
					
					Reporter.log("ExpectedResult= "+Expected_F7_Row2+" Actual Result= "+Actual_F7_Row2);
					
					Reporter.log("====================================================");
					
					Assert.fail();
				}
	}
	}
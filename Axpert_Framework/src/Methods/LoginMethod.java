package Methods;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class LoginMethod extends TestBase {
	
	public void loginToApplication() throws Exception{
		
		WebElement Project= getWebElement("SelectProject");
		
		selectDropDownValue(Project, Repository.getProperty("project"));
		
		WebElement userName = getWebElement("username");
		
		Reporter.log("entering userName to the userName textbox");
		
		userName.sendKeys(Repository.getProperty("userName"));
		
		WebElement password = getWebElement("password");
		
		Reporter.log("entering password to the password textbox");
		
		password.sendKeys(Repository.getProperty("Password"));
		
		Reporter.log("clicking on login button");
		
		getWebElement("loginButton").click();
		
		implicitWait(15);
		
		String ExpectedTitle= "Welcome admin";
		
		String ActualTitle= getWebElement("HomePage").getText();
		
		if(ActualTitle.equalsIgnoreCase(ExpectedTitle))
		{
			Reporter.log("Home Page:::::"+ActualTitle);
			
			Reporter.log("TestCase PASS::::LOGIN PASS(HOME PAGE IS DISPLAYING)");
			
			Reporter.log("------------------------------------------------");
		}
		else
		{
			Reporter.log("Home Page not Display");
			
			Reporter.log("TestCase FAIL:::: HOME PAGE NOT DISPLAYING");
			
			Reporter.log("----------------------------------------------");
		}
}
}
package Methods.AxpertFunctions;

import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import Axpert_Operations.TestBase;

public class Axpert_Date_Function extends TestBase {
	
	public void AxpertDateFun() throws Exception
	{
		SidebarMenu(getWebElement("AxpertFun_MainMenu"), getWebElement("AxpertFun_SubMenu"));
		
		SwitchFrame(getWebElement("AxpertFun_Frame"));
		
		String ExpectedPageTitle = "Axpert Function";
		
		String ActualPageTitle = getWebElement("AxpertFun_PageTitle").getText();
		
		if(ExpectedPageTitle.equalsIgnoreCase(ActualPageTitle))
		{
			Reporter.log("Page Title is ="+ActualPageTitle);
			
		}
		else{
			Reporter.log("Page NOt Correct::Expected Page is--> "+ExpectedPageTitle);	
		}
		WebElement Date1= getWebElement("AxpertFun_Date1");
		
		Reporter.log("Entering Date in Date1 Field");
		
		Date1.sendKeys(Repository.getProperty("AXP_DATE1"));
		
		WebElement Date2= getWebElement("AxpertFun_Date2");
		
		Reporter.log("Entering Date in Date2 Field");
		
		Date2.sendKeys(Repository.getProperty("AXP_DATE2"));
		
		implicitWait(10);
		
		getWebElement("AxpertFun_save").click();
		
		driverwait(5);
		
		getWebElement("AxpertFun_Listview").click();
		
		getWebElement("AxpertFun_EditRecord").click();
		
		SimpleDateFormat dateformat= new SimpleDateFormat("dd/MM/yy");
		
		
		String FirstDate= getWebElement("AxpertFun_Date1").getAttribute("value");
		Reporter.log(FirstDate);
		Date FstDate= dateformat.parse(FirstDate);
			
		String SecondDate= getWebElement("AxpertFun_Date2").getAttribute("value");
		Reporter.log(SecondDate);
		Date SecDate= dateformat.parse(SecondDate);
		
		String DiffBwDate1Date2= getWebElement("AxpertFun_DiffbtwGivenDates").getAttribute("value");
		Reporter.log(DiffBwDate1Date2);
		long diff= ChronoUnit.DAYS.between(FstDate.toInstant(), SecDate.toInstant());
		System.out.println("Days: "+diff);
	
		/*long diffdate= SecDate.getTime() - FstDate.getTime();
		System.out.println("Days: "+TimeUnit.DAYS.convert(diffdate, TimeUnit.MILLISECONDS));*/
		
		String DiffBwDates= getWebElement("AxpertFun_DiffbwDates").getAttribute("value");
		
		Reporter.log(DiffBwDates);
		
		String DiffBwDate1NdDate= getWebElement("AxpertFun_DiffbwDate2").getAttribute("value");
		
		Reporter.log(DiffBwDate1NdDate);
		
		String AddNoToDate= getWebElement("AxpertFun_AddtoDate").getAttribute("value");
		
		Reporter.log(AddNoToDate);
		
		String AddNoToDate1= getWebElement("AxpertFun_AddtoDate1").getAttribute("value");
		
		Reporter.log(AddNoToDate1);
		
		String AddNoToDate2= getWebElement("AxpertFun_AddtoDate2").getAttribute("value");
		
		Reporter.log(AddNoToDate2);
		
		String AddNoToMonth1= getWebElement("AxpertFun_AddtoMonth1").getAttribute("value");
		
		Reporter.log(AddNoToMonth1);
		
		String AddNoToMonth2= getWebElement("AxpertFun_AddtoMonth2").getAttribute("value");
		
		Reporter.log(AddNoToMonth2);
		
		String MonthYearOfDate1= getWebElement("AxpertFun_MonthYear1").getAttribute("value");
		
		Reporter.log(MonthYearOfDate1);
		
		String MonthYearOfDate= getWebElement("AxpertFun_MonthYear2").getAttribute("value");
		
		Reporter.log(MonthYearOfDate);
	
		String DiffInHrMinBwDate= getWebElement("AxpertFun_DiffInHourMin").getAttribute("value");
	
		Reporter.log(DiffInHrMinBwDate);
	}

}

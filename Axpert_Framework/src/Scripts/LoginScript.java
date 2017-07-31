package Scripts;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Axpert_Operations.TestBase;
import Methods.ApplicationTitle;
import Methods.LoginMethod;
import Methods.AxpertFunctions.Axpert_AllOther_Functions;
import Methods.AxpertFunctions.Axpert_Date_Function;
import Methods.AxpertFunctions.Axpert_FloatValue_Function;
import Methods.Dynamic_Decimals.DynamicDecimal_Grid;
import Methods.Dynamic_Decimals.DynamicDecimal_NG;
import Methods.Dynamic_Decimals.DynamicDecimal_NG_Listview;
import Methods.ExpressionDependencies.ExpressionDependencies;
import Methods.GenMap_G2G.GenMap_G2G_EditMode_ctrlField_NO;
import Methods.GenMap_G2G.GenMap_G2G_EditMode_ctrlField_YES;
import Methods.GenMap_G2G.GenMap_G2G_EditMode_ctrlField_YES_AddRows;
import Methods.GenMap_G2G.GenMap_G2G_EditMode_ctrlField_YES_DeleteAddedRows;
import Methods.GenMap_G2G.GenMap_G2G_NewMode_ctrlField_NO;
import Methods.GenMap_G2G.GenMap_G2G_NewMode_ctrlField_NO_Parent_Child_GrandChild;
import Methods.GenMap_G2G.GenMap_G2G_NewMode_ctrlField_YES;
import Methods.GenMap_G2G.GenMap_G2G_NewMode_ctrlField_YES_Parent_Child_GrandChild;
import Methods.GenMap_G2NG.GenMap_G2NG_EditMode_ctrlField_NO;
import Methods.GenMap_G2NG.GenMap_G2NG_EditMode_ctrlField_YES;
import Methods.GenMap_G2NG.GenMap_G2NG_EditMode_ctrlField_YES_AddRows;
import Methods.GenMap_G2NG.GenMap_G2NG_EditMode_ctrlField_YES_DeleteAddedRows;
import Methods.GenMap_G2NG.GenMap_G2NG_NewMode_ctrlField_NO;
import Methods.GenMap_G2NG.GenMap_G2NG_NewMode_ctrlField_YES;
import Methods.GenMap_NG2G.GenMap_NG2G_EditMode_ctrlField_NO;
import Methods.GenMap_NG2G.GenMap_NG2G_EditMode_ctrlField_YES;
import Methods.GenMap_NG2G.GenMap_NG2G_NewMode_ctrlField_NO;
import Methods.GenMap_NG2G.GenMap_NG2G_NewMode_ctrlField_YES;
import Methods.GenMap_NG2NG.GenMap_NG2NG_EditMode_ctrlField_NO;
import Methods.GenMap_NG2NG.GenMap_NG2NG_EditMode_ctrlField_YES;
import Methods.GenMap_NG2NG.GenMap_NG2NG_NewMode_ctrlField_NO;
import Methods.GenMap_NG2NG.GenMap_NG2NG_NewMode_ctrlField_YES;
import Methods.Grid_Add_And_Delete.Grid_AddGrid;
import Methods.Grid_Add_And_Delete.Grid_DeleteGrid;
import Methods.Grid_Images.Add_Grid_Images;
import Methods.Images_NonGrid.Add_NonGrid_Images;
import Methods.MDMap_Grid_CF_NO.MDMap_G2G_NewMode_CF_NO_ADD;
import Methods.MDMap_Grid_CF_NO.MDMap_G2G_NewMode_CF_NO_DECREMENT;
import Methods.MDMap_Grid_CF_NO.MDMap_G2G_NewMode_CF_NO_HIGHEST;
import Methods.MDMap_Grid_CF_NO.MDMap_G2G_NewMode_CF_NO_INCREMENT;
import Methods.MDMap_Grid_CF_NO.MDMap_G2G_NewMode_CF_NO_LESS;
import Methods.MDMap_Grid_CF_NO.MDMap_G2G_NewMode_CF_NO_LOWEST;
import Methods.MDMap_Grid_CF_NO.MDMap_G2G_NewMode_CF_NO_REPLACE;
import Methods.MDMap_Grid_CF_YES.MDMap_G2G_NewMode_CF_YES_ADD;
import Methods.MDMap_Grid_CF_YES.MDMap_G2G_NewMode_CF_YES_DECREMENT;
import Methods.MDMap_Grid_CF_YES.MDMap_G2G_NewMode_CF_YES_HIGHEST;
import Methods.MDMap_Grid_CF_YES.MDMap_G2G_NewMode_CF_YES_INCREMENT;
import Methods.MDMap_Grid_CF_YES.MDMap_G2G_NewMode_CF_YES_LESS;
import Methods.MDMap_Grid_CF_YES.MDMap_G2G_NewMode_CF_YES_LOWEST;
import Methods.MDMap_Grid_CF_YES.MDMap_G2G_NewMode_CF_YES_REPLACE;
import Methods.MDMap_Grid_CF_YES.MDMap_Grid_SetValuesInMasterTransaction;
import Methods.MDMap_NonGrid_CF_NO.MDMAP_NewMode_ADD_CF_NO;
import Methods.MDMap_NonGrid_CF_NO.MDMAP_NewMode_DECREMENT_CF_NO;
import Methods.MDMap_NonGrid_CF_NO.MDMAP_NewMode_HIGHEST_CF_NO;
import Methods.MDMap_NonGrid_CF_NO.MDMAP_NewMode_INCREMENT_CF_NO;
import Methods.MDMap_NonGrid_CF_NO.MDMAP_NewMode_LESS_CF_NO;
import Methods.MDMap_NonGrid_CF_NO.MDMAP_NewMode_LOWEST_CF_NO;
import Methods.MDMap_NonGrid_CF_NO.MDMAP_NewMode_REPLACE_CF_NO;
import Methods.MDMap_NonGrid_CF_YES.MDMap_NONGRID_SetValuesInMasterTransaction;
import Methods.MDMap_NonGrid_CF_YES.MDMap_NewMode_CF_YES_ADD;
import Methods.MDMap_NonGrid_CF_YES.MDMap_NewMode_CF_YES_DECREMENT;
import Methods.MDMap_NonGrid_CF_YES.MDMap_NewMode_CF_YES_HIGHEST;
import Methods.MDMap_NonGrid_CF_YES.MDMap_NewMode_CF_YES_INCREMENT;
import Methods.MDMap_NonGrid_CF_YES.MDMap_NewMode_CF_YES_LESS;
import Methods.MDMap_NonGrid_CF_YES.MDMap_NewMode_CF_YES_LOWEST;
import Methods.MDMap_NonGrid_CF_YES.MDMap_NewMode_CF_YES_REPLACE;
import Methods.MDMap_NonGrid_CF_YES.MDMap_NONGRID_SetValuesInMasterTransaction;

  public class LoginScript extends TestBase  {
	//virat gupta
//@BeforeClass
	  @Test
  public void LoadRepositories() throws Exception
	{
		test();
	}
	
  @Test//(priority=0)
  public void LoginToApp() throws Exception {
	  System.out.println("AXPERT LOGIN::");
	  LoginMethod LM=new LoginMethod();
	  LM.loginToApplication();
  }
  
  @Test//(priority=1)
  public void ApplicationTitle() throws Exception
  {
	  Reporter.log("Application Title of Application");
	  driver.switchTo().defaultContent();
	  Methods.ApplicationTitle Appttl= new ApplicationTitle();
	  Appttl.AppTitle();
  }
  
 /* @Test(priority=2)
  public void GenMap_NG2NG_Newode_CF_YES() throws Exception {
	  	System.out.println("GENMAP NON-GRID TO NON-GRID- NEW MODE- CONTROL FIELD= YES::");
		GenMap_NG2NG_NewMode_ctrlField_YES NGCFyes= new GenMap_NG2NG_NewMode_ctrlField_YES();
		NGCFyes.NG2NG_Master();
		NGCFyes.NG2NG_Child();
		NGCFyes.NG2NG_CheckMaster();
	}
  
    @Test(priority=3)
  public void GenMap_NG2NG_Newode_CF_NO() throws Exception
  {		
	  System.out.println("GENMAP NON-GRID TO NON-GRID- NEW MODE- CONTROL FIELD= NO::");
	  	driver.switchTo().defaultContent();
	  	GenMap_NG2NG_NewMode_ctrlField_YES NG= new GenMap_NG2NG_NewMode_ctrlField_YES();
		NG.NG2NG_Master();
		GenMap_NG2NG_NewMode_ctrlField_NO NGCFno= new GenMap_NG2NG_NewMode_ctrlField_NO();
		NGCFno.NG2NG_Child();
		NGCFno.NG2NG_CheckMaster();
  }
  
  @Test(priority=4)
  public void GenMap_NG2NG_EditMode_CF_YES() throws Exception
  {
	  System.out.println("GENMAP NON-GRID TO NON-GRID- EDIT MODE- CONTROL FIELD= YES::");
	  driver.switchTo().defaultContent();
	  GenMap_NG2NG_NewMode_ctrlField_YES NG1= new GenMap_NG2NG_NewMode_ctrlField_YES();
	  NG1.NG2NG_Master();
	  NG1.NG2NG_Child();
	  GenMap_NG2NG_EditMode_ctrlField_YES NGEditYes= new GenMap_NG2NG_EditMode_ctrlField_YES();
	  NGEditYes.ChildEditModeCFYes();
	  NGEditYes.CheckEditRecordinMaster();
  }
  
  @Test(priority=5)
  public void GEnMap_NG2NG_EditMode_CF_NO() throws Exception
  {
	  System.out.println("GENMAP NON-GRID TO NON-GRID- EDIT MODE- CONTROL FIELD= NO::");
	  driver.switchTo().defaultContent();
	  GenMap_NG2NG_NewMode_ctrlField_YES NG2= new GenMap_NG2NG_NewMode_ctrlField_YES();
	  NG2.NG2NG_Master();
	  NG2.NG2NG_Child();
	  GenMap_NG2NG_EditMode_ctrlField_NO NGEditNO= new GenMap_NG2NG_EditMode_ctrlField_NO();
	  NGEditNO.ChildEditModeCF_No();
	  NGEditNO.CheckEditedRecordCF_NO();
	  
  }
  
  @Test(priority=6)
  public void GenMap_NG2G_NewMode_CF_YES() throws Exception
  {
	  System.out.println("GENMAP NON-GRID TO GRID- NEW MODE- CONTROL FIELD= YES::");
	  driver.switchTo().defaultContent();
	  GenMap_NG2G_NewMode_ctrlField_YES NG2Gyes= new GenMap_NG2G_NewMode_ctrlField_YES();
	  NG2Gyes.NG2G_Master();
	  NG2Gyes.NG2G_Child();
	  NG2Gyes.NG2G_CheckMaster(); 
  }
  
  @Test(priority=7)
  public void GenMap_NG2G_Newode_CF_NO() throws Exception
  {
	  System.out.println("GENMAP NON-GRID TO GRID- NEW MODE- CONTROL FIELD= NO::");
	  	driver.switchTo().defaultContent();
	  	GenMap_NG2G_NewMode_ctrlField_YES NG2Gno= new GenMap_NG2G_NewMode_ctrlField_YES();
		NG2Gno.NG2G_Master();
		GenMap_NG2G_NewMode_ctrlField_NO NG2Gno1= new GenMap_NG2G_NewMode_ctrlField_NO();
		NG2Gno1.NG2G_Child();
		NG2Gno1.NG2G_CheckMaster();
		  }
  
  @Test(priority=8)
  public void GenMap_NG2G_EditMode_CF_YES() throws Exception
  {
	  System.out.println("GENMAP NON-GRID TO GRID- EDIT MODE- CONTROL FIELD= YES::");
	  driver.switchTo().defaultContent();
	  GenMap_NG2G_NewMode_ctrlField_YES NG2Gnewyes= new GenMap_NG2G_NewMode_ctrlField_YES();
	  NG2Gnewyes.NG2G_Master();
	  NG2Gnewyes.NG2G_Child();
	  GenMap_NG2G_EditMode_ctrlField_YES NG2Gedyes= new GenMap_NG2G_EditMode_ctrlField_YES();
	  NG2Gedyes.ChildEditModeCFYes();
	  NG2Gedyes.CheckEditRecordinMaster();
  }
  
  @Test(priority=9)
  public void NG2G_EditMode_CF_NO() throws Exception
  {
	  System.out.println("GENMAP NON-GRID TO GRID- EDIT MODE- CONTROL FIELD= NO::");
	  driver.switchTo().defaultContent();
	  GenMap_NG2G_NewMode_ctrlField_YES NG2GEdno= new GenMap_NG2G_NewMode_ctrlField_YES();
	  NG2GEdno.NG2G_Master();
	  NG2GEdno.NG2G_Child();
	  GenMap_NG2G_EditMode_ctrlField_NO NG2Gedno1= new GenMap_NG2G_EditMode_ctrlField_NO();
	  NG2Gedno1.ChildEditModeCF_No();
	  NG2Gedno1.CheckEditedRecordCF_NO();
	  
  }
  
  @Test(priority=10)
  public void GenMap_G2G_NewMode_CF_YES() throws Exception
  {
	  System.out.println("GENMAP GRID TO GRID- NEW MODE- CONTROL FIELD- YES::");
	  driver.switchTo().defaultContent();
	  GenMap_G2G_NewMode_ctrlField_YES G2Gyes= new GenMap_G2G_NewMode_ctrlField_YES();
	  G2Gyes.G2G_Master();
	  G2Gyes.G2G_Child();
	  G2Gyes.G2G_CheckMaster();
  }
  
  @Test(priority=11)
  public void GenMap_G2G_Newode_CF_NO() throws Exception
  {
	  System.out.println("GENMAP GRID TO GRID- NEW MODE- CONTROL FIELD- NO::");
	  driver.switchTo().defaultContent();
	  GenMap_G2G_NewMode_ctrlField_YES G2Gyesno= new GenMap_G2G_NewMode_ctrlField_YES();
	  G2Gyesno.G2G_Master();
	  GenMap_G2G_NewMode_ctrlField_NO G2Gno= new GenMap_G2G_NewMode_ctrlField_NO();
	  G2Gno.G2G_Child();
	  G2Gno.G2G_CheckMaster();
	  
  }
  
  @Test(priority=12)
  public void G2G_EditMode_CF_YES() throws Exception
  {
	  System.out.println("GENMAP GRID TO GRID- EDIT MODE- CONTROL FIELD- YES::");
	  driver.switchTo().defaultContent();
	  GenMap_G2G_NewMode_ctrlField_YES G2GEdyes= new GenMap_G2G_NewMode_ctrlField_YES();
	  G2GEdyes.G2G_Master();
	  G2GEdyes.G2G_Child();
	  GenMap_G2G_EditMode_ctrlField_YES G2Gedyes1= new GenMap_G2G_EditMode_ctrlField_YES();
	  G2Gedyes1.ChildEditModeCFYes();
	  G2Gedyes1.CheckEditRecordinMaster();
	  
  }
  
  @Test(priority=13)
  public void G2G_EditMode_CF_NO() throws Exception
  {
	  System.out.println("GENMAP GRID TO GRID- EDIT MODE- CONTROL FIELD- NO::");
	  driver.switchTo().defaultContent();
	  GenMap_G2G_NewMode_ctrlField_YES G2Gedno= new GenMap_G2G_NewMode_ctrlField_YES();
	  G2Gedno.G2G_Master();
	  G2Gedno.G2G_Child();
	  GenMap_G2G_EditMode_ctrlField_NO G2Gedno1= new GenMap_G2G_EditMode_ctrlField_NO();
	  G2Gedno1.ChildEditModeCF_No();
	  G2Gedno1.CheckEditedRecordCF_NO();
  }
  
  @Test(priority=14)
  public void G2G_EditMode_CF_YES_AddRows() throws Exception
  {
	  System.out.println("ADD ROW- GENMAP GRID TO GRID- EDIT MODE- CONTROL FIELD- YES::");
	  driver.switchTo().defaultContent();
	  GenMap_G2G_NewMode_ctrlField_YES G2GAddYes= new GenMap_G2G_NewMode_ctrlField_YES();
	  G2GAddYes.G2G_Master();
	  G2GAddYes.G2G_Child();
	  GenMap_G2G_EditMode_ctrlField_YES_AddRows G2GAdd= new GenMap_G2G_EditMode_ctrlField_YES_AddRows();
	  G2GAdd.AddRowsInChildEditModeCFYes();
	  G2GAdd.CheckAddedRowsInEditRecordinMaster();
	  
  }
  
  @Test(priority=15)
  public void G2G_EditMode_CF_YES_DeleteRow() throws Exception
  {
	  System.out.println("DELETE ROW- GENMAP GRID TO GRID- EDIT MODE- CONTROL FIELD- YES::");
	  driver.switchTo().defaultContent();
	  GenMap_G2G_NewMode_ctrlField_YES GenG2GNewDel= new GenMap_G2G_NewMode_ctrlField_YES();
	  GenG2GNewDel.G2G_Master();
	  GenG2GNewDel.G2G_Child();
	  GenMap_G2G_EditMode_ctrlField_YES_AddRows AddRow= new GenMap_G2G_EditMode_ctrlField_YES_AddRows();
	  AddRow.AddRowsInChildEditModeCFYes();
	  GenMap_G2G_EditMode_ctrlField_YES_DeleteAddedRows DelRow= new GenMap_G2G_EditMode_ctrlField_YES_DeleteAddedRows();
	  DelRow.DeleteAddedRowFromSource();
	  DelRow.CheckDeletedRowInMaster();
	  
  }
  
  @Test(priority=16)
  public void G2NG_NewMode_CF_YES() throws Exception
  {
	  System.out.println("GENMAP GRID TO NON GRID- NEW MODE- CONTROL FIELD- YES::");
	  driver.switchTo().defaultContent();
	  GenMap_G2NG_NewMode_ctrlField_YES G2NGNewyes= new GenMap_G2NG_NewMode_ctrlField_YES();
	  G2NGNewyes.G2NG_Master();
	  G2NGNewyes.G2NG_Child();
	  G2NGNewyes.G2NG_CheckMaster();
	  
  }
  
  @Test(priority=17)
  public void G2NG_NewMode_CF_NO() throws Exception
  {
	  System.out.println("GENMAP GRID TO NON GRID- NEW MODE- CONTROL FIELD- NO::");
	  driver.switchTo().defaultContent();
	  GenMap_G2NG_NewMode_ctrlField_YES G2NGCFyesno= new GenMap_G2NG_NewMode_ctrlField_YES();
	  G2NGCFyesno.G2NG_Master();
	  GenMap_G2NG_NewMode_ctrlField_NO G2NGCFno= new GenMap_G2NG_NewMode_ctrlField_NO();
	  G2NGCFno.G2NG_Child();
	  G2NGCFno.G2NG_CheckMaster();
  }
  
  @Test(priority=18)
  public void G2NG_EditMode_CF_YES() throws Exception
  {
	  System.out.println("GENMAP GRID TO NON GRID- EDIT MODE- CONTROL FIELD- YES::");
	  driver.switchTo().defaultContent();
	  GenMap_G2NG_NewMode_ctrlField_YES G2NGnewedityes= new GenMap_G2NG_NewMode_ctrlField_YES();
	  G2NGnewedityes.G2NG_Master();
	  G2NGnewedityes.G2NG_Child();
	  GenMap_G2NG_EditMode_ctrlField_YES G2NGedyes= new GenMap_G2NG_EditMode_ctrlField_YES();
	  G2NGedyes.ChildEditModeCFYes();
	  G2NGedyes.CheckEditRecordinMaster();
	  
  }
  
  @Test(priority=19)
  public void G2NG_EditMode_CF_NO() throws Exception
  {
	  System.out.println("GENMAP GRID TO NON GRID- EDIT MODE- CONTROL FIELD- NO::");
	  driver.switchTo().defaultContent();
	  GenMap_G2NG_NewMode_ctrlField_YES G2NGedyesno= new GenMap_G2NG_NewMode_ctrlField_YES();
	  G2NGedyesno.G2NG_Master();
	  G2NGedyesno.G2NG_Child();
	  GenMap_G2NG_EditMode_ctrlField_NO G2NGedCFno= new GenMap_G2NG_EditMode_ctrlField_NO();
	  G2NGedCFno.ChildEditModeCF_No();
	  G2NGedCFno.CheckEditedRecordCF_NO();
	  
  }
  
  @Test(priority=20)
  public void G2NG_EditMode_CF_YES_ADDROWS() throws Exception
  {
	  System.out.println("ADD ROW- GENMAP GRID TO NON GRID- EDIT MODE- CONTROL FIELD- YES::");
	  driver.switchTo().defaultContent();
	  GenMap_G2NG_NewMode_ctrlField_YES G2NGnewAddrows= new GenMap_G2NG_NewMode_ctrlField_YES();
	  G2NGnewAddrows.G2NG_Master();
	  G2NGnewAddrows.G2NG_Child();
	  GenMap_G2NG_EditMode_ctrlField_YES_AddRows G2NGAddRows= new GenMap_G2NG_EditMode_ctrlField_YES_AddRows();
	  G2NGAddRows.AddRowsInChildEditModeCFYes();
	  G2NGAddRows.CheckAddedRowsInEditRecordinMaster();

  }
  
  @Test(priority=21)
  public void G2NG_EditMode_CF_YES_DeleteAddedRows() throws Exception
  {
	  System.out.println("DELETE ADDED ROW- GENMAP GRID TO NON GRID- EDIT MODE- CONTROL FIELD- YES::");
	  driver.switchTo().defaultContent();
	  GenMap_G2NG_NewMode_ctrlField_YES G2NGnewyesdel1= new GenMap_G2NG_NewMode_ctrlField_YES();
	  G2NGnewyesdel1.G2NG_Master();
	  G2NGnewyesdel1.G2NG_Child();
	  GenMap_G2NG_EditMode_ctrlField_YES_AddRows G2NGedyesadddel= new GenMap_G2NG_EditMode_ctrlField_YES_AddRows();
	  G2NGedyesadddel.AddRowsInChildEditModeCFYes();
	  GenMap_G2NG_EditMode_ctrlField_YES_DeleteAddedRows G2NGedcfyesdel= new GenMap_G2NG_EditMode_ctrlField_YES_DeleteAddedRows();
	  G2NGedcfyesdel.DeleteAddedRowFromSource();
	  G2NGedcfyesdel.CheckDeletedRowInMaster();
	  
  }
  
  @Test(priority=22)
  public void Parent_Child_GrandChild_CF_YES() throws Exception
  {
	  System.out.println("PARENT, CHILD, GRANDCHILD DEPENDECY IN GRID TO GRID NEW MODE CONTROLFIELD--YES");
	  driver.switchTo().defaultContent();
	  GenMap_G2G_NewMode_ctrlField_YES_Parent_Child_GrandChild PCGC= new GenMap_G2G_NewMode_ctrlField_YES_Parent_Child_GrandChild();
	  PCGC.G2G_Delete_GrandChild_Record();
	  PCGC.G2G_Delete_Child_Record();
	  PCGC.G2G_ParentPage();
	  PCGC.G2G_Check_Child();
	  PCGC.G2G_Check_GrandChild();
	  PCGC.ChildAndGrandChild();
	  
  }
  
  @Test(priority=23)
  public void PArentChild_Grandchild_CF_NO() throws Exception
  {
	  System.out.println("PARENT, CHILD, GRANDCHILD DEPENDECY IN GRID TO GRID NEW MODE CONTROLFIELD--NO");
	  driver.switchTo().defaultContent();
	  GenMap_G2G_NewMode_ctrlField_YES_Parent_Child_GrandChild g2gcfyespcgc= new GenMap_G2G_NewMode_ctrlField_YES_Parent_Child_GrandChild();
	  g2gcfyespcgc.G2G_Delete_GrandChild_Record();
	  g2gcfyespcgc.G2G_Delete_Child_Record();
	  GenMap_G2G_NewMode_ctrlField_NO_Parent_Child_GrandChild g2gcfnopcgc= new GenMap_G2G_NewMode_ctrlField_NO_Parent_Child_GrandChild();
	  g2gcfnopcgc.G2G_ParentPage_CF_NO();
	  g2gcfnopcgc.G2G_Check_Child_CF_NO();
	  g2gcfnopcgc.G2G_Check_GrandChild_CF_NO();
	  g2gcfnopcgc.ChildAndGrandChild();
  }
  
  @Test(priority=24)
  public void MDMAP_NONGRID_AccountMAsterDetails() throws Exception
  {
	  System.out.println("MDMAP ACCOUNT MASTER DETAILS PAGE, ENTERING DETAILS IN ACCOUNT MASTER");
	  driver.switchTo().defaultContent();
	  MDMap_NONGRID_SetValuesInMasterTransaction AccountDetails= new MDMap_NONGRID_SetValuesInMasterTransaction();
	  AccountDetails.MDMap_MasterTransMainBalance();
	  AccountDetails.MainBalanceADD();
	  AccountDetails.MainBalanceLESS();
	  AccountDetails.MainBalanceHIGH();
	  AccountDetails.MainBalanceLOW();
	  AccountDetails.MainBalanceINCREMENT();
	  AccountDetails.MainBalanceDECREMENT();
	  AccountDetails.MainBalanceREPLACE();
  }
  
  @Test(priority=25)
  public void MDMAP_NewMode_ADD_CF_YES() throws Exception
  {
	  System.out.println("MDMAP NEW MODE DEPOSIT BALANCE TO MAIN BALANCE WHEN CF=YES");
	  driver.switchTo().defaultContent();
	  MDMap_NewMode_CF_YES_ADD MDMAPCFyesadd= new MDMap_NewMode_CF_YES_ADD();
	  MDMAPCFyesadd.MDMap_NewMode_ADD_CF_YES_ATMTrans();
	  
  }
  
  @Test(priority=26)
  public void MDMAP_LESS_CF_YES() throws Exception
  {
	  System.out.println("MDMAP NEW MODE WITHDRAWN BALANCE FROM MAIN BALANCE WHEN CF=YES");
	  driver.switchTo().defaultContent();
	  MDMap_NewMode_CF_YES_LESS MDMAPless= new MDMap_NewMode_CF_YES_LESS();
	  MDMAPless.MDMap_NewMode_LESS_CF_YES_ATMTrans();
	  
  }
  
  @Test(priority=27)
  public void MDMAP_HIGH_CF_YES() throws Exception
  {
	  System.out.println("MDMAP NEW MODE CHECK HIGH BALANCE VALUE WITH MAIN BALANCE WHEN CF=YES");
	  driver.switchTo().defaultContent();
	  MDMap_NewMode_CF_YES_HIGHEST MDMAPhigh= new MDMap_NewMode_CF_YES_HIGHEST();
	  MDMAPhigh.MDMap_NewMode_HIGH_CF_YES_ATMTrans();
  }
  
  @Test(priority=28)
  public void MDMAP_LOW_CF_YES() throws Exception
  {
	  System.out.println("MDMAP NEW MODE CHECK LOW BALANCE VALUE WITH MAIN BALANCE WHEN CF=YES");
	  driver.switchTo().defaultContent();
	  MDMap_NewMode_CF_YES_LOWEST MDMAPlow= new MDMap_NewMode_CF_YES_LOWEST();
	  MDMAPlow.MDMap_NewMode_LOW_CF_YES_ATMTrans();
  }
  
  @Test(priority=29)
  public void MDMAP_INCR_CF_YES() throws Exception
  {
	  System.out.println("MDMAP NEW MODE CHECK INCREMENT BALANCE VALUE WITH MAIN BALANCE WHEN CF=YES");
	  driver.switchTo().defaultContent();
	  MDMap_NewMode_CF_YES_INCREMENT MDMAPincr= new MDMap_NewMode_CF_YES_INCREMENT();
	  MDMAPincr.MDMap_NewMode_INCR_CF_YES_ATMTrans();
  }
  
  @Test(priority=30)
  public void MDMAP_DECR_CF_YES() throws Exception
  {
	  System.out.println("MDMAP NEW MODE CHECK DECREMENT BALANCE VALUE WITH MAIN BALANCE WHEN CF=YES");
	  driver.switchTo().defaultContent();
	  MDMap_NewMode_CF_YES_DECREMENT MDMAPdecr= new MDMap_NewMode_CF_YES_DECREMENT();
	  MDMAPdecr.MDMap_NewMode_DECR_CF_YES_ATMTrans();
  }
  
  @Test(priority=31)
  public void MDMAP_REPLACE_CF_YES() throws Exception
  {
	  System.out.println("MDMAP NEW MODE CHECK REPLACE BALANCE VALUE WITH MAIN BALANCE WHEN CF=YES");
	  driver.switchTo().defaultContent();
	  MDMap_NewMode_CF_YES_REPLACE MDMAPrepl= new MDMap_NewMode_CF_YES_REPLACE();
	  MDMAPrepl.MDMap_NewMode_REPLACE_CF_YES_ATMTrans();
  }
  
  @Test(priority=32)
  public void MDMAP_ADD_CF_NO() throws Exception
  {
	  System.out.println("MDMAP NEW MODE CHECK DEPOSIT BALANCE VALUE WITH MAIN BALANCE WHEN CF=NO");
	  driver.switchTo().defaultContent();
	  MDMAP_NewMode_ADD_CF_NO MDMAPaddno= new MDMAP_NewMode_ADD_CF_NO();
	  MDMAPaddno.MDMap_NewMode_ADD_CF_NO_ATMTrans();
  }
  
  @Test(priority=33)
  public void MDMAP_LESS_CF_NO() throws Exception
  {
	  System.out.println("MDMAP NEW MODE CHECK WITHDRAWN BALANCE VALUE WITH MAIN BALANCE WHEN CF=NO");
	  driver.switchTo().defaultContent();
	  MDMAP_NewMode_LESS_CF_NO MDMAPlessno= new MDMAP_NewMode_LESS_CF_NO();
	  MDMAPlessno.MDMap_NewMode_LESS_CF_NO_ATMTrans();
  }
  
  @Test(priority=34)
  public void MDMAP_HIGH_CF_NO() throws Exception
  {
	  System.out.println("MDMAP NEW MODE CHECK HIGHEST BALANCE VALUE WITH MAIN BALANCE WHEN CF=NO");
	  driver.switchTo().defaultContent();
	  MDMAP_NewMode_HIGHEST_CF_NO MDMAPhighno= new MDMAP_NewMode_HIGHEST_CF_NO();
	  MDMAPhighno.MDMap_NewMode_HIGH_CF_NO_ATMTrans();
  }
  
  @Test(priority=35)
  public void MDMAP_LOW_CF_NO() throws Exception
  {
	  System.out.println("MDMAP NEW MODE CHECK LOWEST BALANCE VALUE WITH MAIN BALANCE WHEN CF=NO");
	  driver.switchTo().defaultContent();
	  MDMAP_NewMode_LOWEST_CF_NO MDMAPlowno= new MDMAP_NewMode_LOWEST_CF_NO();
	  MDMAPlowno.MDMap_NewMode_LOW_CF_NO_ATMTrans();
  }
  
  @Test(priority=36)
  public void MDMAP_INCR_CF_NO() throws Exception
  {
	  System.out.println("MDMAP NEW MODE CHECK INCREMENT BALANCE VALUE WITH MAIN BALANCE WHEN CF=NO");
	  driver.switchTo().defaultContent();
	  MDMAP_NewMode_INCREMENT_CF_NO MDMAPinceno= new MDMAP_NewMode_INCREMENT_CF_NO();
	  MDMAPinceno.MDMap_NewMode_INCR_CF_NO_ATMTrans();
	 
  }
  
  @Test(priority=37)
  public void MDMAP_DECR_CF_NO() throws Exception
  {
	  System.out.println("MDMAP NEW MODE CHECK DECREMENT BALANCE VALUE WITH MAIN BALANCE WHEN CF=NO");
	  driver.switchTo().defaultContent();
	  MDMAP_NewMode_DECREMENT_CF_NO MDMAPdecrno= new MDMAP_NewMode_DECREMENT_CF_NO();
	  MDMAPdecrno.MDMap_NewMode_DECR_CF_NO_ATMTrans();
  }
  
  @Test(priority=38)
  public void MDMAP_REPLACE_CF_NO() throws Exception
  {
	  System.out.println("MDMAP NEW MODE CHECK REPLACE BALANCE VALUE WITH MAIN BALANCE WHEN CF=NO");
	  driver.switchTo().defaultContent();
	  MDMAP_NewMode_REPLACE_CF_NO MDMAPreplno= new MDMAP_NewMode_REPLACE_CF_NO();
	  MDMAPreplno.MDMap_NewMode_REPLACE_CF_NO_ATMTrans();
  } 
  
  @Test(priority=39)
  public void MDMAP_G2G_AccountMaster() throws Exception
  {
	  System.out.println("MDMAP GRID TO GRID ACCOUNT MASTER DETAILS, ENTERING MAIN BALANCE IN ACCOUNT MASTER PAGE");
	  driver.switchTo().defaultContent();
	  MDMap_Grid_SetValuesInMasterTransaction GridAccDetail= new MDMap_Grid_SetValuesInMasterTransaction();
	  GridAccDetail.MDMap_Grid_MasterTransMainBalance();
	  GridAccDetail.MainBalanceADD();
	  GridAccDetail.MainBalanceLESS();
	  GridAccDetail.MainBalanceHIGH();
	  GridAccDetail.MainBalanceLOW();
	  GridAccDetail.MainBalanceINCREMENT();
	  GridAccDetail.MainBalanceDECREMENT();
	  GridAccDetail.MainBalanceREPLACE();
	  
  }
  
 @Test(priority=40)
  public void MDMAP_G2G_ADD_CF_YES() throws Exception
  {
	  System.out.println("MDMAP GRID TO GRID NEW MODE CHECK DEPOSIT BALANCE VALUE WITH MAIN BALANCE WHEN CF=YES");
	  driver.switchTo().defaultContent();
	  MDMap_G2G_NewMode_CF_YES_ADD MDMAPg2gadd= new MDMap_G2G_NewMode_CF_YES_ADD();
	  MDMAPg2gadd.MDMap_G2G_NewMode_ADD_CF_YES_ATMTrans();  
  }
  
  @Test(priority=41)
  public void MDMAP_G2G_LESS_CF_YES() throws Exception 
  {
	  System.out.println("MDMAP GRID TO GRID NEW MODE CHECK WITHDRAWN BALANCE VALUE FROM MAIN BALANCE WHEN CF=YES");
	  driver.switchTo().defaultContent();
	  MDMap_G2G_NewMode_CF_YES_LESS MDMAPg2gless= new MDMap_G2G_NewMode_CF_YES_LESS();
	  MDMAPg2gless.MDMap_G2G_NewMode_LESS_CF_YES_ATMTrans();
  }
  
  @Test(priority=42)
  public void MDMAP_G2G_HIGH_CF_YES() throws Exception 
  {
	  System.out.println("MDMAP GRID TO GRID NEW MODE CHECK HIGHEST BALANCE VALUE WITH MAIN BALANCE WHEN CF=YES");
	  driver.switchTo().defaultContent();
	  MDMap_G2G_NewMode_CF_YES_HIGHEST MDMAPg2ghigh= new MDMap_G2G_NewMode_CF_YES_HIGHEST();
	  MDMAPg2ghigh.MDMap_G2G_NewMode_HIGH_CF_YES_ATMTrans();
  }
  
  @Test(priority=43)
  public void MDMAP_G2G_LOW_CF_YES() throws Exception
  {
	  System.out.println("MDMAP GRID TO GRID NEW MODE CHECK LOWER BALANCE VALUE WITH MAIN BALANCE WHEN CF=YES");
	  driver.switchTo().defaultContent();
	 MDMap_G2G_NewMode_CF_YES_LOWEST MDMAPg2glow= new MDMap_G2G_NewMode_CF_YES_LOWEST();
	 MDMAPg2glow.MDMap_G2G_NewMode_LOW_CF_YES_ATMTrans();
  }
  
  @Test(priority=44)
  public void MDMAP_G2G_INCR_CF_YES() throws Exception 
  {
	  System.out.println("MDMAP GRID TO GRID NEW MODE CHECK INCREMENT BALANCE VALUE WITH MAIN BALANCE WHEN CF=YES");
	  driver.switchTo().defaultContent();
	  MDMap_G2G_NewMode_CF_YES_INCREMENT MDMAPg2ginc= new MDMap_G2G_NewMode_CF_YES_INCREMENT();
	  MDMAPg2ginc.MDMap_G2G_NewMode_INCR_CF_YES_ATMTrans();
  }
  
  @Test(priority=45)
  public void MDMAP_G2G_DECR_CF_YES() throws Exception 
  {
	  System.out.println("MDMAP GRID TO GRID NEW MODE CHECK DECREMENT BALANCE VALUE WITH MAIN BALANCE WHEN CF=YES");
	  driver.switchTo().defaultContent();
	  MDMap_G2G_NewMode_CF_YES_DECREMENT MDMAPg2gdecr= new MDMap_G2G_NewMode_CF_YES_DECREMENT();
	  MDMAPg2gdecr.MDMap_G2G_NewMode_DECR_CF_YES_ATMTrans();
  }
  
  @Test(priority=46)
  public void MDMAP_G2G_REPLACE_CF_YES() throws Exception 
  {
	  System.out.println("MDMAP GRID TO GRID NEW MODE CHECK REPLACE BALANCE VALUE WITH MAIN BALANCE WHEN CF=YES");
	  driver.switchTo().defaultContent();
	  MDMap_G2G_NewMode_CF_YES_REPLACE MDMAPg2grepl= new MDMap_G2G_NewMode_CF_YES_REPLACE();
	  MDMAPg2grepl.MDMap_G2G_NewMode_REPLACE_CF_YES_ATMTrans();
  }
  
  @Test(priority=47)
  public void MDMAP_G2G_Add_CF_NO() throws Exception
  {
	  System.out.println("MDMAP GRID TO GRID NEW MODE CHECK ADD BALANCE VALUE WITH MAIN BALANCE WHEN CF=NO");
	  driver.switchTo().defaultContent();
	  MDMap_G2G_NewMode_CF_NO_ADD MDMAPg2gcfnoadd= new MDMap_G2G_NewMode_CF_NO_ADD();
	  MDMAPg2gcfnoadd.MDMap_G2G_NewMode_ADD_CF_NO_ATMTrans();
	  
  }
  
  @Test(priority=48)
  public void MDMAP_G2G_LESS_CF_NO() throws Exception
  {
	  System.out.println("MDMAP GRID TO GRID NEW MODE CHECK LESS BALANCE VALUE WITH MAIN BALANCE WHEN CF=NO");
	  driver.switchTo().defaultContent();
	  MDMap_G2G_NewMode_CF_NO_LESS MDMAPg2gcfnoless= new MDMap_G2G_NewMode_CF_NO_LESS();
	  MDMAPg2gcfnoless.MDMap_G2G_NewMode_LESS_CF_NO_ATMTrans();
	  
  }
  
  @Test(priority=49)
  public void MDMAP_G2G_HIGH_CF_NO() throws Exception
  {
	  System.out.println("MDMAP GRID TO GRID NEW MODE CHECK HIGHEST BALANCE VALUE WITH MAIN BALANCE WHEN CF=NO");
	  driver.switchTo().defaultContent();
	  MDMap_G2G_NewMode_CF_NO_HIGHEST MDMAPg2gcfnohigh= new MDMap_G2G_NewMode_CF_NO_HIGHEST();
	  MDMAPg2gcfnohigh.MDMap_G2G_NewMode_HIGH_CF_NO_ATMTrans();
	  
  }
  
  @Test(priority=50)
  public void MDMAP_G2G_LOW_CF_NO() throws Exception
  {
	  System.out.println("MDMAP GRID TO GRID NEW MODE CHECK LOWEST BALANCE VALUE WITH MAIN BALANCE WHEN CF=NO");
	  driver.switchTo().defaultContent();
	  MDMap_G2G_NewMode_CF_NO_LOWEST MDMAPg2gcfnolow= new MDMap_G2G_NewMode_CF_NO_LOWEST();
	  MDMAPg2gcfnolow.MDMap_G2G_NewMode_LOW_CF_NO_ATMTrans();
	  
  }
  
  @Test(priority=51)
  public void MDMAP_G2G_INCR_CF_NO() throws Exception
  {
	  System.out.println("MDMAP GRID TO GRID NEW MODE CHECK INCREMENT BALANCE VALUE WITH MAIN BALANCE WHEN CF=NO");
	  driver.switchTo().defaultContent();
	  MDMap_G2G_NewMode_CF_NO_INCREMENT MDMAPg2gcfnoinc= new MDMap_G2G_NewMode_CF_NO_INCREMENT();
	  MDMAPg2gcfnoinc.MDMap_G2G_NewMode_INCR_CF_NO_ATMTrans();
	  
  }
  
  @Test(priority=52)
  public void MDMAP_G2G_DECR_CF_NO() throws Exception
  {
	  System.out.println("MDMAP GRID TO GRID NEW MODE CHECK DECREMENT BALANCE VALUE WITH MAIN BALANCE WHEN CF=NO");
	  driver.switchTo().defaultContent();
	  MDMap_G2G_NewMode_CF_NO_DECREMENT MDMAPgrgcfnodcr= new MDMap_G2G_NewMode_CF_NO_DECREMENT();
	  MDMAPgrgcfnodcr.MDMap_G2G_NewMode_DECR_CF_NO_ATMTrans();
	  
  }
  
  @Test(priority=53)
  public void MDMAP_G2G_REPL_CF_NO() throws Exception
  {
	  System.out.println("MDMAP GRID TO GRID NEW MODE CHECK REPLACE BALANCE VALUE WITH MAIN BALANCE WHEN CF=NO");
	  driver.switchTo().defaultContent();
	  MDMap_G2G_NewMode_CF_NO_REPLACE MDMAPg2gcfnorepl= new MDMap_G2G_NewMode_CF_NO_REPLACE();
	  MDMAPg2gcfnorepl.MDMap_G2G_NewMode_REPLACE_CF_NO_ATMTrans();
	  
  }
  
  @Test(priority=54)
  public void Axpert_FloatValue() throws Exception
  {
	  Reporter.log("CONVERTING THE FLOAT VALUES TO INTEGER GREATER AND LOWER VALUES");
	  driver.switchTo().defaultContent();
	  Axpert_FloatValue_Function AxpFloatInt= new Axpert_FloatValue_Function();
	  AxpFloatInt.AxpertFloatvalueFun();
	  
  }
  
  @Test(priority=55)
  public void Axpert_DateFunctions() throws Exception
  {
	  Reporter.log("DIFFERENT TYPESOF FUNCTION ON DATES");
	  driver.switchTo().defaultContent();
	  Axpert_Date_Function AxpDateFun= new Axpert_Date_Function();
	  AxpDateFun.AxpertDateFun();
	  
  }
  
  @Test(priority=56)
  public void Axpert_OtherFunctions() throws Exception
  {
	  Reporter.log("CALCULATE 'ROW COUNT', 'ROW NUMBER', 'GET VALUE FROM ROW NUMBER', 'ADD VALUES', 'ADD VALUES TILL ROW NUMBER'");
	  driver.switchTo().defaultContent();
	  Axpert_AllOther_Functions AxpotherFun= new Axpert_AllOther_Functions();
	  AxpotherFun.Axpert_OthersFun();
	  
  }
  
  @Test(priority=57)
  public void AddGridRows() throws Exception
  {
	  Reporter.log("ADD 5 ROWS IN GRID TSTRUCT");
	  driver.switchTo().defaultContent();
	  Grid_AddGrid GridAddrow= new Grid_AddGrid();
	  GridAddrow.AddGrid();
	  GridAddrow.AddRowTestCase();
  }
  
  @Test(priority=58)
  public void DeleteRowGrid() throws Exception
  {
	  Reporter.log("DELETING ROWS FROM GRID TSTRUCT");
	  driver.switchTo().defaultContent();
	  Grid_AddGrid griddeladd= new Grid_AddGrid();
	  griddeladd.AddGrid();
	  Grid_DeleteGrid GridDel= new  Grid_DeleteGrid();
	  GridDel.DeleteGridRow();
	  
  }
  
  @Test(priority=59)
  public void ExpDep() throws Exception
  {
	  Reporter.log("EXPRESSION DEPENDENCIES BASED ON THEIR PARENTS");
	  driver.switchTo().defaultContent();
	  ExpressionDependencies expdep= new ExpressionDependencies();
	  expdep.ExpDep();
  }

  @Test(priority=60)
  public void DynamicDecimalNG() throws Exception
  {
	  Reporter.log("Dynmamic Decimal values in Non-Grid Tstruct");
	  driver.switchTo().defaultContent();
	  DynamicDecimal_NG Ddecng= new DynamicDecimal_NG();
	  Ddecng.DynamicDecimalNG();
  }
  
  @Test(priority=61)
  public void DynamicDecimalListview() throws Exception
  {
	  Reporter.log("Dynamic Decimal values in Non-Grid Listview");
	  driver.switchTo().defaultContent();
	  DynamicDecimal_NG_Listview DyDecLv= new DynamicDecimal_NG_Listview();
	  DyDecLv.DynamicDecimal_NG_Listview();  
  }

  @Test(priority=62)
  public void DynamicDecimalGrid() throws Exception
  {
	  Reporter.log("Dynamic Decimal values in Grid Tstruct");
	  driver.switchTo().defaultContent();
	  DynamicDecimal_Grid DyncDecGrid= new DynamicDecimal_Grid();
	  DyncDecGrid.DynamicDecimalGrid();
  }
  
  @Test(priority=63)
  public void NonGridImage() throws Exception
  {
	  Reporter.log("Upload Non-Grid Image in Tstruct");
	  driver.switchTo().defaultContent();
	  Add_NonGrid_Images nonGrid= new Add_NonGrid_Images();
	  nonGrid.AddNonGridImage();
  }
  
  @Test(priority=64)
  public void GridImage() throws Exception
  {
	  Reporter.log("UPloading Grid Attachment in Tstruct");
	  driver.switchTo().defaultContent();
	  Add_Grid_Images gridAttach= new Add_Grid_Images();
	  gridAttach.Grid_Image_Tstruct();
  }*/
  
 
  
 // @AfterClass
  public void close()
  {
	  System.out.println("CLOSE THE BROWSER::");
	  closeBrowser();
  }
}

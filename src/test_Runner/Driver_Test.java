package test_Runner;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;
import org.testng.annotations.Test;

import common.Setup_Teardown;
import pages.LoginPage;
import pages.LogoutPage;

public class Driver_Test extends Setup_Teardown{
	
	public Properties pr;
	
	@Test(priority = 1)
	public void login() throws Throwable {
		pr= new Properties();
		pr.load(new FileInputStream("/home/rnc/newSpace/POM_without_pFactory/files_Input/dataStore.properties"));
		
		String uName= pr.getProperty("uName");
		String uPass= pr.getProperty("uPass");
		
		LoginPage login= new LoginPage(dr);
		boolean loginRes= login.verifyLogin(uName, uPass);
		
		Reporter.log("login status :: "+loginRes);		
	}	
	
	@Test(priority = 2)
	public void logout() {
		LogoutPage ougout= new LogoutPage(dr);
		boolean outRes= ougout.verifyLogout();
		
		Reporter.log("logout status :: "+outRes);
	}
	
}

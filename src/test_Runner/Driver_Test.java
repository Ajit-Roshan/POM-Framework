package test_Runner;

import org.testng.Reporter;
import org.testng.annotations.Test;

import common.Setup_Teardown;
import pages.LoginPage;
import pages.LogoutPage;

public class Driver_Test extends Setup_Teardown{
	
	@Test(priority = 1)
	public void login() {
		LoginPage login= new LoginPage(dr);
		boolean loginRes= login.verifyLogin("Admin", "admin123");
		
		if(loginRes) {
			Reporter.log("Pass");
		}else {
			Reporter.log("Fail");
		}		
	}	
	
	@Test(priority = 2)
	public void logout() {
		LogoutPage ougout= new LogoutPage(dr);
		boolean outRes= ougout.verifyLogout();
		
		if(outRes) {
			Reporter.log("Pass");
		}else {
			Reporter.log("Fail");
		}	
	}
	
}

package test_Runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import common.Setup_Teardown;
import pages.Page1;

public class Driver_Test extends Setup_Teardown{
	
	Page1 page;
	
	@Test(dataProvider = "provider" , priority = 1)
	public void test1(String data) {
		page= new Page1(dr);
		page.testSearch(data);
	}

	@Test(priority = 2)
	public void test2() throws Throwable {	
		page.clearSearch();
	}
	
	
	@DataProvider(name = "provider")
	public Object[] dataStorage(){
		
		return new Object[][]{		
			{"ajit "},{" roshan"}		
		};
		
	}	
}

package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;

public class Setup_Teardown {
	
	public static WebDriver dr;	
	
	public static ExtentReports er;
	public static ExtentTest et;
	
	@Parameters("url")
	@BeforeTest
	public void setup(String url) {
		dr= new ChromeDriver();
		dr.manage().window().maximize();		
		dr.get(url);
		
		er= new ExtentReports();
		
	}

	//
	@AfterTest
	public void teardown() {
		dr.close();
	}

}

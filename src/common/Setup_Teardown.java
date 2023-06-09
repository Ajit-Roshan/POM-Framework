package common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Setup_Teardown {
	
	public static WebDriver dr;	
	
	@Parameters("url")
	@BeforeTest
	public void setup(String url) {
		dr= new ChromeDriver();
		dr.manage().window().maximize();		
		dr.get(url);
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	//
	@AfterTest
	public void teardown() {
		dr.close();
	}

}

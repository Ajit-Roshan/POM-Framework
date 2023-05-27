package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Page1 {
	
	WebDriver dr;
	By search= By.name("q");
		
	public void testSearch(String data) {
		dr.findElement(search).sendKeys(data , Keys.RETURN);
	}	
	
	public void clearSearch() throws Throwable {
		
		Thread.sleep(1000);		
		dr.findElement(search).clear();
	}
	
	
	//
	public Page1(WebDriver dr) {
		this.dr= dr;
	}	
}

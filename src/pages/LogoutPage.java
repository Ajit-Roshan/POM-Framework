package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	
	WebDriver dr;
	
	By logoutLable= By.xpath("//li[@class='oxd-userdropdown']");
	By logoutBtn= By.xpath("//a[contains(text(),'Logout')]");
	
	public boolean verifyLogout() {
		
		dr.findElement(logoutLable).click();
		dr.findElement(logoutBtn).click();
		
		if(dr.getTitle().contains("login")) {
			return true;
		}else {
			return false;
		}		
	}	
	
	public LogoutPage(WebDriver dr) {
		// TODO Auto-generated constructor stub
		this.dr= dr;
	}	
}

package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	
	WebDriver dr;
	
	By logoutLable= By.xpath("//li[@class='oxd-userdropdown']");
	By logoutBtn= By.xpath("//a[contains(text(),'Logout')]");
	
	public boolean verifyLogout() {
		
		boolean res;
		
		dr.findElement(logoutLable).click();
		dr.findElement(logoutBtn).click();
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		if(dr.getCurrentUrl().contains("login")) {
			res= true;
		}else {
			res= false;
		}	
		return res;
	}	
	
	public LogoutPage(WebDriver dr) {
		// TODO Auto-generated constructor stub
		this.dr= dr;
	}	
}

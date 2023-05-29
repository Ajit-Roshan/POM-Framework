package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver dr;

	By uNmae= By.name("username");
	By uPass= By.name("password");
	By loginBtn= By.xpath("//button[normalize-space()='Login']");

	public boolean verifyLogin(String name , String pass) {
		boolean res;
		
		dr.findElement(uNmae).sendKeys(name);
		dr.findElement(uPass).sendKeys(pass);
		dr.findElement(loginBtn).click();

		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		if(dr.getCurrentUrl().contains("index")) {
			res= true;
		}else {
			res= false;
		}
		return res;
	}

	public LoginPage(WebDriver dr) {
		// TODO Auto-generated constructor stub
		this.dr= dr;
	}
}

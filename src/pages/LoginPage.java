package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver dr;

	By uNmae= By.name("username");
	By uPass= By.name("password");
	By loginBtn= By.xpath("//button[normalize-space()='Login']");

	public boolean verifyLogin(String name , String pass) {

		dr.findElement(uNmae).sendKeys(name);
		dr.findElement(uPass).sendKeys(pass);
		dr.findElement(loginBtn).click();

		if(dr.getTitle().contains("dashboard")) {
			return true;
		}else {
			return false;
		}
	}

	public LoginPage(WebDriver dr) {
		// TODO Auto-generated constructor stub
		this.dr= dr;
	}
}

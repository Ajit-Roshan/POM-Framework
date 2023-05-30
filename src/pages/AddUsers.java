package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddUsers {

	WebDriver dr;

	By nav= By.xpath("(//a[@class='oxd-main-menu-item'])[2]");
	By addUser_Page= By.xpath("//button[normalize-space()='Add']");


	By f1= By.xpath("//input[@placeholder='First Name']");	
	By f2= By.xpath("//input[@placeholder='Middle Name']");
	By f3= By.xpath("//input[@placeholder='Last Name']");

	By saveBTN= By.xpath("//button[normalize-space()='Save']");	

	By verifyUser= By.xpath("(//h6)[2]"); // contain text


	public void addUser(String a, String b,String c) throws Throwable {
		dr.findElement(nav).click();
		dr.findElement(addUser_Page).click();

		Thread.sleep(5000);

		dr.findElement(f1).sendKeys(a);
		dr.findElement(f2).sendKeys(b);
		dr.findElement(f3).sendKeys(c);
		dr.findElement(saveBTN).click();			

		Thread.sleep(1000);
	}


	public AddUsers(WebDriver dr) {
		// TODO Auto-generated constructor stub
		this.dr= dr;
	}
}

package org.basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.baseutility;

public class EPFlogin {

	public static void main(String[] args) {
	System.out.println("Program starts");
	baseutility bu=new baseutility();
	String url="https://passbook.epfindia.gov.in/MemberPassBook/Login";
	WebDriver Driver= bu.startUp("ch", url);
	WebElement uNameField= Driver.findElement(By.id("username"));
	uNameField.sendKeys("100099374393");
	
	WebElement pwdField=Driver.findElement(By.id("password"));
	pwdField.sendKeys("Ganesh@123");
	
	WebElement captchaField=Driver.findElement(By.id("captcha"));
	captchaField.sendKeys("91");
	
	WebElement loginbtn=Driver.findElement(By.cssSelector("#loginButton>div]"));
    loginbtn.click();
	
	
	
	
	
	
	
	
	
	System.out.println("Program ends");

	}

}

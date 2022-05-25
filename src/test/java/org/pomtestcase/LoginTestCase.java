package org.pomtestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.baseutility;

public class LoginTestCase {
	private WebDriver Driver;
	baseutility bu=new baseutility();
	@BeforeMethod
	public void initialisebrowser() {
		System.out.println("Program starts");
        String url="http://localhost:1234/login.do";
	    Driver= bu.startUp("ch", url);
		System.out.println("Program ends");

	}   @Test 
	public void login() {
		Driver.findElement(By.id("username")).sendKeys("admin");
		Driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Driver.findElement(By.cssSelector("#loginButton>div")).click();
		bu.WaitForVisibilityofLocatedBy(Driver, "Xpath","//a[@id='logoutLink']", 10);

	}   @AfterMethod
		public void teardown() {
			Driver.close();
		}
	
}




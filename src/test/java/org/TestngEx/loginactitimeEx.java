package org.TestngEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.baseutility;

public class loginactitimeEx {
	private WebDriver Driver;
	baseutility bu=new baseutility();
	@Test(priority=1)
	public void openbrowser() {
		System.out.println("Program starts");
        String url="http://localhost:1234/login.do";
	    Driver= bu.startUp("ch", url);
		System.out.println("Program ends");

	}   @Test (priority=2)
	public void dologin() {
		Driver.findElement(By.id("username")).sendKeys("admin");
		Driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Driver.findElement(By.cssSelector("#loginButton>div")).click();
		bu.WaitForVisibilityofLocatedBy(Driver, "Xpath","//a[@id='logoutLink']", 10);

	}@Test(priority=3)
	public void dologout() {
		Driver.findElement(By.id("logoutLink")).click();

	}
}

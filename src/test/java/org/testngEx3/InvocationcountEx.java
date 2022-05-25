package org.testngEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.baseutility;

public class InvocationcountEx {  // for execute one test case multiple times
	@Test(invocationCount=3,threadPoolSize=2)
	public void login() {
		baseutility bu=new baseutility();
		String url="http://localhost:1234/login.do";
		WebDriver Driver= bu.startUp("ch", url);
		Driver.findElement(By.id("username")).sendKeys("admin");
		Driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Driver.findElement(By.cssSelector("#loginButton>div")).click();
	}
}

package org.basicprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.baseutility;

public class Actitimelogin2 {
	
	public static void main(String[] args) {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="http://localhost:1234/login.do";
		WebDriver Driver= bu.startUp("ch", url);
	    Driver.findElement(By.id("username")).sendKeys("admin");
		Driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Driver.findElement(By.cssSelector("#loginButton>div")).click();
		
//		WebDriverWait wt=new WebDriverWait (Driver,Duration.ofSeconds(10));
//	    wt.until(ExpectedConditions.visibilityOf( Driver.findElement(By.id("logout Link"))));
		
	//	bu.WaitForVisibilityofLocatedBy(Driver, "Xpath","//a[@id='logoutLink']", 10);
	    
	    Driver.findElement(By.id("logoutLink")).click();
		
		
		
 System.out.println("Program ends");
}
	public void WaitForVisibilityofwebelement(WebDriver Driver,WebElement ele ,int time) {
		WebDriverWait wt=new WebDriverWait (Driver,Duration.ofSeconds(time));
	    wt.until(ExpectedConditions.visibilityOf(ele));
	    
		
	}
}

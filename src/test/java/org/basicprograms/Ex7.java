package org.basicprograms;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.baseutility;

public class Ex7 {
	
	public static void main(String[] args) {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="http://localhost:1234/login.do";
		WebDriver Driver= bu.startUp("ch", url);
		
		String expUrl="http://localhost/login.do";
		String actUrl= Driver.getCurrentUrl();
		if(expUrl.equals(actUrl)) {
			System.out.println("login Url match");
		}else{System.out.println("login Url not match");}
	    Driver.findElement(By.id("username")).sendKeys("admin");
		Driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Driver.findElement(By.cssSelector("#loginButton>div]")).click();
		
	
		bu.WaitForVisibilityofLocatedBy(Driver, "Xpath","//a[@ id='logoutLink']", 10);
		
		expUrl="http://localhost/user/submit_tt.do";
		actUrl=Driver.getCurrentUrl();
	    if(expUrl.equals(actUrl)) {
	    	System.out.println("Dashboard URl matched");
	    }else {
	    	System.out.println("Dashboard URL not Matched");
	    }
		
		
 System.out.println("Program ends");
}
	public void WaitForVisibilityofwebelement(WebDriver Driver,WebElement ele ,int time) {
		WebDriverWait wt=new WebDriverWait (Driver,Duration.ofSeconds(time));
	    wt.until(ExpectedConditions.visibilityOf(ele));
	    
		
	}
}

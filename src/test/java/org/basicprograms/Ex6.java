package org.basicprograms;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.baseutility;

public class Ex6 {
	
	public static void main(String[] args) {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="http://localhost:1234/login.do";
		WebDriver Driver= bu.startUp("ch", url);
		
		String expTitle="actiTime-login";
		String actTitle= Driver.getTitle();
		if(expTitle.equals(actTitle)) {
			System.out.println("login title match");
		}else{System.out.println("login title not match");}
	    Driver.findElement(By.id("username")).sendKeys("admin");
		Driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Driver.findElement(By.cssSelector("#loginButton>div]")).click();
		
	
		bu.WaitForVisibilityofLocatedBy(Driver, "Xpath","//a[@ id='logoutLink']", 10);
		WebElement tabname=Driver.findElements(By.xpath("//a [div[text()='TIME-TRACK']]"));
		String attribValue=tabname.getAttribute("class");
	    if(attribValue.contains("selected")) {
	    	System.out.println("selected ele :"+tabname.getText());
	    	
	    }
	    //   Driver.findElement(By.id("logout Link")).click();	
 System.out.println("Program ends");
}
	public void WaitForVisibilityofwebelement(WebDriver Driver,WebElement ele ,int time) {
		WebDriverWait wt=new WebDriverWait (Driver,Duration.ofSeconds(time));
	    wt.until(ExpectedConditions.visibilityOf(ele));
	    
		
	}
}

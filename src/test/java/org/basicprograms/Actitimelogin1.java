package org.basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.baseutility;

public class Actitimelogin1 {
	
	public static void main(String[] args) {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="http://localhost/login.do";
		WebDriver Driver= bu.startUp("ch", url);
		WebElement uNameField= Driver.findElement(By.id("username"));
		uNameField.sendKeys("admin");
		
		WebElement pwdField=Driver.findElement(By.cssSelector("input[name='pwd']"));
		pwdField.sendKeys("manager");
		
		WebElement loginbtn=Driver.findElement(By.cssSelector("#loginButton>div]"));
	    loginbtn.click();
				
 System.out.println("Program ends");
}
	
}

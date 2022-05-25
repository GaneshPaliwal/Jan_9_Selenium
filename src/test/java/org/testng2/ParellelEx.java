package org.testng2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.baseutility;

public class ParellelEx {
	baseutility bu=new baseutility();
      @Test
	  public void CreatecustCH() {
    	  String url="http://localhost:1234/login.do";
  		WebDriver Driver= bu.startUp("ch", url);
  		Driver.findElement(By.id("username")).sendKeys("admin");
  		Driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
  		Driver.findElement(By.cssSelector("#loginButton>div")).click();
	 } @Test
	  public void CreatecustEdge() {
		 String url="http://localhost:1234/login.do";
			WebDriver Driver= bu.startUp("FF", url);
			Driver.findElement(By.id("username")).sendKeys("admin");
			Driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
			Driver.findElement(By.cssSelector("#loginButton>div")).click();
	 } 
	  
	  
	 
}

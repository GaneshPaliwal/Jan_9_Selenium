package org.testngEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.baseutility;

public class ParametersEx1 {
	@Parameters({"browsername","username","password"})
  @Test
  public void loginmethod(String bname, String uname,String pwd) {
		System.out.println("bname="+bname);
		System.out.println("uname="+uname);
		System.out.println("pwd="+pwd);
	  baseutility bu=new baseutility();
		String url="http://localhost:1234/login.do";
		WebDriver Driver= bu.startUp(bname, url);
		Driver.findElement(By.id("username")).sendKeys(uname);
		Driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(pwd);
		Driver.findElement(By.cssSelector("#loginButton>div")).click();
  }
}

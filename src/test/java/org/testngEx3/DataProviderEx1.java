package org.testngEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utilities.baseutility;

public class DataProviderEx1 {  // for execute one test case multiple Test data
	@Test(dataProvider="logincredentials")
	public void login(String username,String password) {
		System.out.println("username="+username);
		System.out.println("password="+password);
		baseutility bu=new baseutility();
		String url="http://localhost:1234/login.do";
		WebDriver Driver= bu.startUp("ch", url);
		Driver.findElement(By.id("username")).sendKeys(username);
		Driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(password);
		Driver.findElement(By.cssSelector("#loginButton>div")).click();
	}
	@DataProvider
	public Object [][]logincredentials() {
		Object [][] data=new Object [3] [2];
		data[0][0]="admin";
		data[0][1]="manager";
		
		data[1][0]="admin1";
		data[1][1]="manager1";
		
		data[2][0]="admin2";
		data[2][1]="manager2";
		return data;
				
	}
}

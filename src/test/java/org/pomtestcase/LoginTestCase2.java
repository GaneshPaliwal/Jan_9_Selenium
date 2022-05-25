package org.pomtestcase;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.pompages.Loginpage;
import org.propertiedreader.Configreader;
//import org.propertiedreader.Configreader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.utilities.baseutility;

public class LoginTestCase2 {
	private WebDriver Driver;
	private Configreader cr;
	private Loginpage ipobj=new Loginpage(Driver);
	private baseutility bu=new baseutility();
	
	@BeforeSuite
	public void initialiseObject() {
		 cr=new Configreader();
	}
	@BeforeMethod
	public void initialisebrowser() throws IOException {
		System.out.println("open browser");
	    Driver= bu.startUp(cr.getpropdata("BrowserName"), cr.getpropdata("url"));
		System.out.println("Program ends");

	}  @Test 
	public void verifyloginpage() {
		System.out.println("verify login page");
//		ipobj.isUserNameFieldDisplayed();
//		ipobj.isPasswordFieldDisplayed();
//		ipobj.keepMeLoggedInchkBoxDisplayed();
//		ipobj.isloginButtonDisplayed();
		ipobj.verifyloginpagefield();
		
	}
	@Test 
	public void login() throws IOException {
		System.out.println("login");
		ipobj.EnterUsername1(cr.getpropdata("username"));
		ipobj.EnterPassword(cr.getpropdata("password"));
		ipobj.clickloginButton();
		bu.WaitForVisibilityofLocatedBy(Driver, "Xpath","//a[@id='logoutLink']", 10);

	}   @AfterMethod
		public void teardown() {
			Driver.close();
		}
	
}




package org.pompages;

import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Loginpage {
	@SuppressWarnings("unused")
	private WebDriver Driver;
//1.Web Element
	// webElement uname=Driver.findElement(By.xpath(""));
	
	@FindBy(id="username")
	private WebElement uNameTextField;
	
	@FindBy(css="input[name='pwd']")
	private WebElement pwdTextField;
	
	@FindBy(xpath="//a[@id='loginButton']/div")
	private WebElement loginbtn;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepMeLoggedInchkBox;
	
//	@FindBy(xpath="")
//	private List<WebElement> MultipleElementsEx;
	
	// we can write by 2nd way but 1st is standerd way
//	By uNameTextField1=By.id("");
//	By pwdTextField1=By.cssSelector("");
//	By loginbtn1=By.xpath("");
	
	// constructor
	public Loginpage(WebDriver Driver) {     // initialize the webelement
		this.Driver=Driver;
		//PageFactory.initElements(Driver, Loginpage.class);
		     //or
		PageFactory.initElements(Driver, this);}
		
		//page action Methods
		public boolean isUserNameFieldDisplayed() {
			return uNameTextField.isDisplayed();
			
		}
		public boolean isPasswordFieldDisplayed() {
			return pwdTextField.isDisplayed();
			
		}
		public boolean isloginButtonDisplayed() {
			return loginbtn.isDisplayed();
			
		}
		public boolean keepMeLoggedInchkBoxDisplayed() {
			return keepMeLoggedInchkBox.isDisplayed();
			
	}
		public void verifyloginpagefield() {
			SoftAssert sa=new SoftAssert();
			sa.assertTrue(isUserNameFieldDisplayed(),"User Name is not displayed");
			sa.assertTrue(isPasswordFieldDisplayed(),"'password' is not displayed");
			sa.assertTrue(keepMeLoggedInchkBoxDisplayed(),"'keep me login check box' is not displayed");
			sa.assertTrue(isloginButtonDisplayed(),"'login Button' is not displayed");
			sa.assertAll();
		}
		public void EnterUsername1(String uName) {
			 uNameTextField.sendKeys(uName);
		}
		public void EnterPassword(String pwd) {
			 pwdTextField.sendKeys(pwd);
		}
		public void clickloginButton() {
			loginbtn.click();
		}
		public void EnterUsername(String uName, String pwd) {
			 uNameTextField.sendKeys(uName);
			 pwdTextField.sendKeys(pwd);
			 loginbtn.click();
		}
	
}

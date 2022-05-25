package org.dropdownhandling;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.baseutility;

public class withoutselectEx1 {
	
	public static void main(String[] args) {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="https://demoqa.com/select-menu";
		WebDriver Driver= bu.startUp("ch", url);
	
	   
	    WebElement ddlEle=Driver.findElement(By.cssSelector("#withOptGroup.css1hwfws3"));
	    ddlEle.click();
	    System.out.println(Driver.getPageSource());
	    
		 System.out.println("Program ends");}
	}

	
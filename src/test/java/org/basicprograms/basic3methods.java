package org.basicprograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.baseutility;

public class basic3methods {
	
	public static void main(String[] args) {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="https://demoqa.com/radio-button";
		WebDriver Driver= bu.startUp("ch", url);
	
	    WebElement noBtn=Driver.findElement(By.id("noRadio"));
	    System.out.println("enabled:"+noBtn.isEnabled());
	    
	    WebElement yesLabel=Driver.findElement(By.cssSelector("label[for='yesRadio']"));
	    System.out.println("displayed:"+yesLabel.isDisplayed());
	   
	    yesLabel.click();
	    WebElement yesBtn=Driver.findElement(By.id("yesRadio"));
	    System.out.println("selected:"+yesBtn.isSelected());
	    
		 System.out.println("Program ends");}
	}

	
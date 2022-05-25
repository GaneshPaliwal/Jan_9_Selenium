package org.dropdownhandling;


import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.baseutility;

public class MuitiselectEx2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="https://demoqa.com/select-menu";
		WebDriver Driver= bu.startUp("ch", url);
		
		Driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
	    Thread.sleep(1000);
	    
		WebElement multiDDL=Driver.findElement(By.id("cars"));
		
		Select sel=new Select(multiDDL);
	    sel.selectByVisibleText("Volvo");
	    sel.selectByIndex(3);
	    sel.selectByValue("opel");
	    List <WebElement> allselectedOption=sel.getAllSelectedOptions();
		WebElement colorele=null;
	    String color=null;
	    for(int i=0; i<allselOption.size(); i++) {
	    	colorEle =allselOption.get(i);
	    	color =colorEle.getText();
	    	System.out.println(color);
	    	//System.out.println(allselOption.get(i).getText());
	    }
	    		System.out.println("Program ends");}
	}

	
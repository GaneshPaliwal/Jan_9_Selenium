package org.dropdownhandling;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.baseutility;

public class MuitiselectEx3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="https://demoqa.com/select-menu";
		WebDriver Driver= bu.startUp("ch", url);
		Driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
	    Thread.sleep(1000);
	    WebElement multiDDL=Driver.findElement(By.id("cars"));
		Select sel=new Select(multiDDL);
		java.util.List<WebElement> allOptions=sel.getOptions();
		String str="";
		for(int i=0; i<allOptions.size(); i++) {
			str=allOptions.get(i).getText();
			System.out.println(str);
		//	if(str.equals("Audi")) {
			//	sel.selectByVisibleText("Audi");
	//			sel.selectByIndex(i);
		//	}
		} 
	    		System.out.println("Program ends");
	    	}
	 public <WebElements> ArrayList <String> getAllTextFromDDL(WebElement ele){
			Select sel=new Select(ele);
			ArrayList<String> ar=new ArrayList<String>();
			
			for(int i=0; i<sel.getOptions().size(); i++) {
				ar.add(sel.getOptions().get(i).getText());
				}return ar;
			
		 }
	
	
	// public <WebElements> ArrayList <String> getAllTextFromDDL(WebElement ele){
	//	Select sel=new Select(ele);
	//	ArrayList<String> ar=new ArrayList<String>();
	//	List<WebElements> allOptions=Sel.getOptions();
	//	for(int i=0; i<allOptions.size(); i++) {
	//		ar.add=allOptions.get(i).getText();
	//		}return ar;
		
	 }
	
  

	
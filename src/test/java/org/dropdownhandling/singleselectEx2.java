package org.dropdownhandling;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.baseutility;

public class singleselectEx2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="https://demoqa.com/select-menu";
		WebDriver Driver= bu.startUp("ch", url);
		
		WebElement singleDDL=Driver.findElement(By.id("oldSelectMenu"));
		Select sel=new Select(singleDDL);
		
	   WebElement selectOption=sel.getFirstSelectedOption();
	   String selectedColor=selectOption.getText();
	   System.out.println("Default color"+selectedColor);
	   
	   sel.selectByVisibleText("Purple");
	   
	    selectOption=sel.getFirstSelectedOption();
	    selectedColor=selectOption.getText();
	   System.out.println("User select color"+selectedColor);
	   
	   
		 System.out.println("Program ends");}
	}

	
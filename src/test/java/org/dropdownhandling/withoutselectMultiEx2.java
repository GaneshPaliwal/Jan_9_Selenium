package org.dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.baseutility;

public class withoutselectMultiEx2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="https://demoqa.com/select-menu";
		WebDriver Driver= bu.startUp("ch", url);
	   //scroll till dropdown
		Driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
	    Thread.sleep(1000);
        WebElement ddlEle=Driver.findElement(By.xpath("//div[p[b[text()='Multiselect drop down']]]//div[@class='css-1hwfws3']"));
	    ddlEle.click();
	    Thread.sleep(1000);
	    Driver.findElement(By.xpath("//[text()='Green']")).click();
	    Driver.findElement(By.xpath("//[text()='Red']")).click();
	    
	    
		 System.out.println("Program ends");}
	}

	
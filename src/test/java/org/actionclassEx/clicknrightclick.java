package org.actionclassEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.baseutility;

public class clicknrightclick {
	public static void main(String[] args)    {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="https://demoqa.com/links";
		WebDriver Driver= bu.startUp("ch", url);
		Actions act=new Actions (Driver);
		WebElement ele=Driver.findElement(By.id("simplelink"));
		act.doubleClick(ele).perform();  // for double click 
     //   act.click(ele).perform(); // for left click any web element
           //open new tab
		act.keyDown(Keys.LEFT_CONTROL)
		.click(ele)
		.keyUp(Keys.LEFT_CONTROL)
		.build()
		.perform();
		System.out.println("program ends");
		
		}
}

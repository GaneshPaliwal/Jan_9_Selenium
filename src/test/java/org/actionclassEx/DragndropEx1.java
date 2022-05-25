package org.actionclassEx;
 //import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.baseutility;

public class DragndropEx1 {
	public static void main(String[] args)    {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="https://demoqa.com/droppable";
		WebDriver Driver= bu.startUp("ch", url);
		 
		Actions act=new Actions (Driver);
		WebElement src=Driver.findElement(By.id("draggable"));
		
		act.dragAndDropBy(src , 180, 220).perform();
		 
		System.out.println("program ends");
		
		}// its a genric method
	
	//public void DragndropMethod(WebDriver Driver, WebElement src,WebElement des) {
			//Actions act=new Actions (Driver);
			//act.dragAndDrop(src, des).perform();  // this is genrics method for drag and drop
	//	}
	
}

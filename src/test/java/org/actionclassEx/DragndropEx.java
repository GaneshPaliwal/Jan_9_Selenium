package org.actionclassEx;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.baseutility;

public class DragndropEx {
	public static void main(String[] args)    {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="https://demoqa.com/droppable";
		WebDriver Driver= bu.startUp("ch", url);
		Actions act=new Actions (Driver);
		WebElement src=Driver.findElement(By.id("draggable"));
		WebElement des=Driver.findElement(By.id("droppable"));
		act.dragAndDrop(src, des).perform();
		 
		System.out.println("program ends");
		
		}//public void DragndropMethod(WebDriver Driver, WebElement src,WebElement des) {
			//Actions act=new Actions (Driver);
			//act.dragAndDrop(src, des).perform();  // this is genrics method for drag and drop
	//	}
	
}

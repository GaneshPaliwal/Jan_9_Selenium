package org.actionclassEx;

//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.baseutility;

public class TooltipEx {
	public static void main(String[] args) throws InterruptedException  {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="https://demoqa.com/tool-tips";
		WebDriver Driver= bu.startUp("ch", url);
		Thread.sleep(2000);
		WebElement btn=Driver.findElement(By.cssSelector(".btn.btn-success"));
		Actions act=new Actions (Driver);
		act.moveToElement(btn).perform();
		String tooltip=Driver.findElement(By.className("tooltip-inner")).getText();
		System.out.println("tooltip="+tooltip);
		
		 WebElement txtField=Driver.findElement(By.id("toolTipTextField"));
		act.moveToElement(txtField).perform();
		Thread.sleep(2000);
		WebElement textField=Driver.findElement(By.className("tooltip-inner"));
		String tooltip2=textField.getText();
		System.out.println("tooltip="+tooltip2);
		 
		System.out.println("program ends");
		

}
	
}

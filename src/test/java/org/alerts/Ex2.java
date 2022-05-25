package org.alerts;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.utilities.baseutility;

public class Ex2 {
public static void main(String[] args)    {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="https://demoqa.com/alerts";
		WebDriver Driver= bu.startUp("ch", url);
		Actions act=new Actions (Driver);
	    Driver.findElement(By.id("timerAlertButton")).click();
	  if(  bu.isAlertPresent(Driver,10)) {
	    Alert alt =Driver.switchTo().alert();
		System.out.println("text="+alt.getText());
		
		alt.accept();
		}else {
			System.out.println("alert is not displayed");
		}
		System.out.println("program ends");
		
		}
         


}

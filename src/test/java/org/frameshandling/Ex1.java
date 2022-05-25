package org.frameshandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.baseutility;

public class Ex1 {
	
		public static void main(String[] args)  {
			
			System.out.println("Program starts");
			baseutility bu=new baseutility();
			String url="https://demoqa.com/frames";
			WebDriver Driver= bu.startUp("ch", url);
			WebElement frame1=Driver.findElement(By.id("frame1"));
			Driver.switchTo().frame(frame1);
			String text=Driver.findElement(By.id("sampleHeading")).getText();
			System.out.println("text="+text);
			System.out.println("program ends");
		

}
}

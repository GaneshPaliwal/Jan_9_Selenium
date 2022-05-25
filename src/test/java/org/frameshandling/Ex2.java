package org.frameshandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.baseutility;

public class Ex2 {
	
		public static void main(String[] args)  {
			
			System.out.println("Program starts");
			baseutility bu=new baseutility();
			String url="https://demoqa.com/frames";
			WebDriver Driver= bu.startUp("ch", url);
			WebElement frame1=Driver.findElement(By.id("frame1"));
			Driver.switchTo().frame(frame1);
			String text=Driver.findElement(By.id("sampleHeading")).getText();
			System.out.println("text="+text);
			Driver.switchTo().defaultContent();
			
	//		WebElement frame2=Driver.findElement(By.id("frame1"));
			Driver.switchTo().frame("frame2");
			
			String text2=Driver.findElement(By.id("sampleHeading")).getText();
			System.out.println("text2="+text2);
			
			System.out.println("program ends");
		

}
}

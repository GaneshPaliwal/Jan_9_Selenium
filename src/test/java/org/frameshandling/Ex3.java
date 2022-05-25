package org.frameshandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.baseutility;

public class Ex3 {
	
		public static void main(String[] args)  {
			
			System.out.println("Program starts");
			baseutility bu=new baseutility();
			String url="https://demoqa.com/nestedframes";
			WebDriver Driver= bu.startUp("ch", url);
			
			Driver.switchTo().frame("frame1");
		
		 
		WebElement frame2=Driver.findElement(By.cssSelector("iframe[srdoc='<p>Child Iframe</p>']"));
			Driver.switchTo().frame("frame2");
			
			String text=Driver.findElement(By.tagName("p")).getText();
			System.out.println("text="+text);
			
			System.out.println("program ends");
		

}
}

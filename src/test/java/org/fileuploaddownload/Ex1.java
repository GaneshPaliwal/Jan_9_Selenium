package org.fileuploaddownload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.baseutility;

public class Ex1 {
public static void main(String[] args) throws IOException, InterruptedException  {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="https://demoqa.com/automation-practice-form";
		WebDriver Driver= bu.startUp("ch", url);
		WebElement uploadbtn=Driver.findElement(By.id("uploadPicture"));
		//bu.scrollTillElementByJs(uploadbtn,Driver);
		
		Driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
	    Thread.sleep(1000);
	    
		bu.clickByJs(uploadbtn, Driver);
		Thread.sleep(2000);
			
		Runtime.getRuntime().exec
		("\"D:\\Accelration\\New\\jan_9_Selenium\\Autoitfiles\\ChromeUpload.exe\"");

}
}
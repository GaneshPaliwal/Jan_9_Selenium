package org.fileuploaddownload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.baseutility;

public class GenricuploadEx {
public static void main(String[] args) throws IOException, InterruptedException  {
	// it is used for all browsers here we are used for firefox browser
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="https://demoqa.com/automation-practice-form";
		WebDriver Driver= bu.startUp("FF", url);
		
		//bu.scrollTillElementByJs(uploadbtn,Driver);
		
		Driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		WebElement uploadbtn=Driver.findElement(By.id("uploadPicture"));
	    Thread.sleep(1000);
	    
		bu.clickByJs(uploadbtn, Driver);
		try{Thread.sleep(2000);
		
		String filename="testfile.txt";
		Runtime.getRuntime().exec("./Autoitfiles/GenricUpload1.exe");
		} catch
			(Exception e)
			{
			e.printStackTrace();
			System.out.println("program ends");}
		}
		
}

package org.browseroperations;

import org.openqa.selenium.WebDriver;
import org.utilities.baseutility;

	public class Ex1 {
		
		public static void main(String[] args) throws InterruptedException {
			
			System.out.println("Program starts");
			baseutility bu=new baseutility();
			String url="https://www.google.com";
			WebDriver Driver= bu.startUp("ch", url);
			Driver.navigate().to("https://www.facebook.com");
			Thread.sleep(2000);
			Driver.navigate().back();// page backword
			Thread.sleep(2000);
			Driver.navigate().forward(); //page forword
			Thread.sleep(2000);
			Driver.navigate().refresh(); // page refresh
			
		    		System.out.println("Program ends");
		    	}
		
			 }
		
		

package org.basicprograms;

import org.openqa.selenium.WebDriver;

import org.utilities.baseutility;

public class Ex4 {
	
	public static void main(String[] args) {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="https://www.google.com";
		WebDriver Driver= bu.startUp("ch", url); //opens google browser
		String url1="https://firefox.com";
		WebDriver Driver1= bu.startUp("ff", url1); // opens firefox browser
		String url2="https://www.edgedriver.com";
		WebDriver Driver2= bu.startUp("edge", url2); // opens firefox browser
		
		
		
 System.out.println("Program ends");
}
	
}

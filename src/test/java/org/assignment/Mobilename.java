package org.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.utilities.baseutility;

public class Mobilename {
public static void main(String[] args) {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="https://www.amazon.in/";
		WebDriver Driver= bu.startUp("ch", url);
		Driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("mobiles");
		Driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
		
		
		
		System.out.println("Program ends");

}
}

package org.basicprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex2 {
	WebDriver Driver;
	String path =System.getProperty("user.dir");
	public static void main(String[] args) {
		
		System.out.println("Program starts");	
		
 System.out.println("Program ends");
}
	public void WebDriver(String bname) {
		switch (bname) {
		case "ch":
		case "CH":
		case "chrome":
		System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		Driver=new ChromeDriver();
		break;
		case "ff":
		case "FF":
		case "Firefox":

		
		System.setProperty("webdriver.gecko.driver",path+"\\drivers\\geckodriver.exe");
		FirefoxDriver obj1= new FirefoxDriver ();
		 Driver= new FirefoxDriver ();
		break;
		case "edge":
		case "Edge":
		
		
		System.setProperty("webdriver.Edge.driver",path+"\\drivers\\msedgedriver.exe");
		EdgeDriver obj =new EdgeDriver ();
		Driver=new EdgeDriver ();
		break;
		default:System.out.println("invalid browser");
		
	}return;
	}
}

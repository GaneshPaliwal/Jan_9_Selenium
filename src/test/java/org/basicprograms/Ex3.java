package org.basicprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex3 {
	WebDriver driver;
	String path=System.getProperty("user.dir");
    public static void main(String[] args) {
    	System.out.println("program starts");
    	Ex3 obj=new Ex3() ;
    	obj.openBrowser("ch");
		
    	System.out.println("program ends");

	}
    public WebDriver openBrowser (String bname) {
		
		if (bname.equalsIgnoreCase("ch") || bname.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
		driver=new ChromeDriver(); //upcasting
		} else if(bname.equalsIgnoreCase("ff") || bname.equalsIgnoreCase("firefox")) {
		
		System.setProperty("webdriver.gecko.driver",path+"\\drivers\\geckodriver.exe");
		 driver= new FirefoxDriver (); // upcasting
		} else if(bname.equalsIgnoreCase("edge")) {
			
		System.setProperty("webdriver.Edge.driver",path+"\\drivers\\msedgedriver.exe");
		driver=new EdgeDriver (); // upcasting
		}else
		{
			System.out.println("invalid browser");
		
	}
		return driver;
	
	}

	

}

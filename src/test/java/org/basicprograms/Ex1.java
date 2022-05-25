package org.basicprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("Program starts");
		String path =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				path+"\\drivers\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup(); // used for update exe files
		ChromeDriver obj=new ChromeDriver();
		Ex1 obj=new Ex1();
		obj.testff();
		obj.Edge();
	System.out.println("Program ends");
	}
	public void testff() {
		String path =System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",
				path+"\\drivers\\geckodriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		FirefoxDriver obj= new FirefoxDriver ();
	}
	public void Edge() {
		String path =System.getProperty("user.dir");
		System.setProperty("webdriver.Edge.driver",
				path+"\\drivers\\msedgedriver.exe");
		//WebDriverManager.edgedriver().setup();
		EdgeDriver obj=new EdgeDriver ();
	}

}

package org.windowhandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.baseutility;

public class Ex1 {
	
	public static void main(String[] args)  {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="https://demoqa.com/browser-windows";
		WebDriver Driver= bu.startUp("ch", url);
		String parentId1=Driver.getWindowHandle();
		System.out.println("parentId1="+parentId1);
		
		Driver.findElement(By.id("tabButton")).click();
		String parentId2=Driver.getWindowHandle();
		System.out.println("parentId2="+parentId2);
		
		Set<String> allwinids=Driver.getWindowHandles();
		Iterator<String> itr=allwinids.iterator();
		
		String id1=itr.next();
		System.out.println("id1="+id1);
		
		String id2=itr.next();
		System.out.println("id2="+id2);
		
		Driver.switchTo().window(id2);		
		String text =Driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("text="+text);
		
//		Driver.quit();
		Driver.close();
		Driver.switchTo().window(parentId1);
		Driver.close();
		
	}
}

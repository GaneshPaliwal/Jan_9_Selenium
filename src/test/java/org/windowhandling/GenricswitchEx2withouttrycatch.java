package org.windowhandling;

import java.awt.List;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.baseutility;

public class GenricswitchEx2withouttrycatch {
	
	public static void main(String[] args)  {
		
		System.out.println("Program starts");
		baseutility bu=new baseutility();
		String url="https://demoqa.com/browser-windows";
		WebDriver Driver= bu.startUp("ch", url);
		String parentId1=Driver.getWindowHandle();
		System.out.println("parentId1="+parentId1);
		
		Driver.findElement(By.id("windowButton")).click();
		
		Set<String> allwinids=Driver.getWindowHandles();
		Iterator<String> itr=allwinids.iterator();
		String id="";
		while(itr.hasNext()) {
			id=itr.next();
			if(!id.equals(parentId1)) {
				Driver.switchTo().window(id);
				List<WebElement> listEle=Driver.findElement(By.id("sampleHeading")).getText();
				if(!listEle.empty()) {
					String text=listEle.get(0).getText();
					System.out.println("text="+text);
					break;
						
				}
			
					System.out.println("Switching to next window");
			
			}
		}
		
		Driver.quit();
		
		
	}
}

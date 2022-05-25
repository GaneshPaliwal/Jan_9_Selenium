 package org.utilities;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseutility {
		public WebDriver startUp(String bname, String url) {
			@SuppressWarnings("unused")
			String path =System.getProperty("user.dir");
			WebDriver Driver = null;
			String path1 =System.getProperty("user.dir");
			if (bname.equalsIgnoreCase("ch") || bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",path1+"\\drivers\\chromedriver.exe");
			Driver=new ChromeDriver();
			} else if(bname.equalsIgnoreCase("ff") || bname.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",path1+"\\drivers\\geckodriver.exe");
			 Driver= new FirefoxDriver ();
			} else if(bname.equalsIgnoreCase("edge")) {
				
			System.setProperty("webdriver.Edge.driver",path1+"\\drivers\\msedgedriver.exe");
			Driver=new EdgeDriver ();
			}else
			{
				System.out.println("invalid browser");
			
		}Driver.manage().window().maximize();
		//slenium 4 onwords
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// upto selenum 3
		//Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Driver.manage().window().minimize();  // in version 1.4
	//	Driver.manage().window().setSize(new Dimension(800, 800));
		Driver.get(url);
			return Driver;
		
		}public void WaitForVisibilityofwebelement(WebDriver Driver,WebElement ele ,int time) {
			WebDriverWait wt=new WebDriverWait (Driver,Duration.ofSeconds(time));
		    wt.until(ExpectedConditions.visibilityOf(ele));
		    } 
		public void WaitForVisibilityofLocatedBy(WebDriver Driver,String loctype,String locator,int time) {
			WebDriverWait wt=new WebDriverWait (Driver,Duration.ofSeconds(time));
			switch(loctype) {
			case "Xpath":  wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("locator")));
			   break;
			case "css":  wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("locator")));
			   break;
			case "id":  wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("locator")));
			   break;  
			case "class":  wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("locator")));
			   break;
			}
			
		}
		public boolean isAlertPresent(WebDriver Driver, int time) {
       	 try {
       		 WebDriverWait wt=new WebDriverWait(Driver , Duration.ofSeconds(time));
       		 wt.until(ExpectedConditions.alertIsPresent());
       		 return true;
       		 
       	 }catch(Exception e) {
       		 return false;
       	 }
        }
		public void scrollTillElementByJs(WebElement ele, WebDriver Driver) {
			JavascriptExecutor js=(JavascriptExecutor)Driver;
			js.executeScript("arguments[0].scrollIntoView(true)", ele);
		}			
		public void clickByJs(WebElement ele, WebDriver Driver) {
			JavascriptExecutor js=(JavascriptExecutor)Driver;
			js.executeScript("arguments[0].click();", ele);
		}			
		

		

	}



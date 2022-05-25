package practicefolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.baseutility;

public class LoginHRM {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("program starts");
		baseutility bu=new baseutility();
		String url="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		WebDriver Driver=bu.startUp("ch", url);
		WebElement uName=Driver.findElement(By.id("txtUsername"));
		uName.sendKeys("Admin");
		
		WebElement password=Driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement login=Driver.findElement(By.cssSelector("input[type='submit']"));
		login.click();
		// for logout
		WebElement logout1=Driver.findElement(By.id("welcome"));
		logout1.click();
		
		WebElement logout2=Driver.findElement(By.xpath("//a[text()='Logout']"));
		logout2.click();
		Thread.sleep(10);
		
				
		System.out.println("program ends");
	}

}

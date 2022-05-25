package practicefolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.baseutility;

public class FBlogin {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("program starts");
		baseutility bt= new baseutility();
		String url="https://www.facebook.com/login/";
		WebDriver D=bt.startUp("ch", url);
		WebElement uname=D.findElement(By.cssSelector("input[type='text']"));
		uname.sendKeys("9595360731");
		
		WebElement pass=D.findElement(By.cssSelector("input[type='password']"));
		pass.sendKeys("134207");
		
		WebElement login=D.findElement(By.id("loginbutton"));
		login.click();
		Thread.sleep(3);
		
		WebElement logout1=D.findElement(By.cssSelector("svg[fill='currentColor']"));
		logout1.click();
		
		

	}

}

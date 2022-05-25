package practicefolder;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.baseutility;

public class FlipkartEx {
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("program start");
		baseutility bu=new baseutility();
		String url="https://www.flipkart.com";
		WebDriver driver = bu.startUp("ch", url);
		WebElement searchBt1=driver.findElement(By.xpath("//div[@class='_3OO5Xc']//input[@class='_3704LK']")); 
		searchBt1.sendKeys("Galaxy M32");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		WebElement nextVisible = driver.findElement(By.xpath("//nav[@class='yFHi8N']//a[@class='ge-49M _2Kfbh8']"));
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
		wt.until(ExpectedConditions.visibilityOf(nextVisible));
		List<WebElement> mobName=driver.findElements(By.xpath("//div[@class='_3pLy-c row']//div[starts-with(text(),'SAMSUNG Galaxy M32')]"));
	
		List<WebElement> mobPrize=driver.findElements(By.xpath("//div[@class='col col-5-12 nlI3QM']//div[@class='_25b18c']"));
		// for mobile names
		int count =0;
		for(int i=0;i<=mobName.size();i++)
		{
			for(WebElement ele:mobName)
				{
					
				ele.driver.findElements(By.xpath("//div[@class='_3pLy-c row']//div[starts-with(text(),'SAMSUNG Galaxy M32')]"));
					//System.out.println("MobileName="+ele.getText());
				
					
				}
		
					
		}
		}
		
		
		//System.out.println("count="+count);
		
}

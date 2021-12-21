package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import library.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class implicitTimeout {
	
	
		public void implicitTimeout() {
		
		// TODO Auto-generated method stub

		
			System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
			
		 	WebDriver driver = new ChromeDriver();
			driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
			
			
		//	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);//checks for the element visiblity alone but explicit will  have many options to check with 
		
			driver.getTitle();
			driver.manage().window().maximize();
		    
			
			
		   driver.findElement(By.xpath("//button[contains(text(),'Click me to start timer')]")).click();
		   
		   
		   WebDriverWait wait = new WebDriverWait(driver, 10);
		   
		   
		   WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //p[text()=\"WebDriver\"]")));
		   
		  // WebElement ele=driver.findElement(By.xpath(" //p[text()=\"WebDriver\"]"));
		   
		   boolean sts= ele.isDisplayed();
		   
		   if(sts)
			   
		   {
			   System.out.println("Element is Displayed");
		   }
		   else
		   {
			   System.out.println("Element is not Displayed");
		   }
		   
		   
	}

}

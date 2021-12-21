package day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import library.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import graphql.com.google.common.base.Function;


public class FluentWaitTimeOut
{
	
	
		public static void main(String args[]) {
		
		// TODO Auto-generated method stub

		
			System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
			
		 	WebDriver driver = new ChromeDriver();
			driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
			
			
		//	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);//checks for the element visiblity alone but explicit will  have many options to check with 
		
			driver.getTitle();
			driver.manage().window().maximize();
		    
			
			
		   driver.findElement(By.xpath("//button[contains(text(),'Click me to start timer')]")).click();
		   
		 
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(1))
			       .ignoring(NoSuchElementException.class);

			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			    	 
			    	 
			    	WebElement element= driver.findElement(By.xpath("//p[@id='demo']"));
			    	
			    	String x= element.getAttribute("innerHTML");
			    	if(x.equalsIgnoreCase("WebDriver"))
			    			{
			    		return element;
			    			}
			    	else {
			    		
			    		
			    		System.out.println("Element  Displayed is" +x);
						return null;
					}
			    	
			    	 
			    //   return driver.findElement(By.xpath("//p[text()='WebDriver']"));
			     }
			   });
			/*
			 * boolean sts= foo.isDisplayed();
			 * 
			 * if(sts)
			 * 
			 * { System.out.println("Element is Displayed"); } else {
			 * System.out.println("Element is not Displayed"); }
			 */
		   
	}

}

package day1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import library.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.AbstractParallelWorker.Arguments;

import graphql.com.google.common.base.Function;


public class WithoutSendKeysJsExecutor
{
	
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
		
	 	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/?YY=28789&order=down&sort=date&pos=0&.src=ym");
		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
		
		WebElement email=driver.findElement(By.name("username"));
	
		jsExecutor.executeScript("arguments[0].value=arguments[1]", email,"yaminibv@gmail.com");
	
		
	//	driver.findElement(By.xpath("//input[@id='persistent']")).click();
		
		// Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: element not interactable
		 // (Session info: chrome=96.0.4664.110)
		  
		  
		  jsExecutor.executeScript("document.getElementById('persistent').click()");
		  
		  
		  //another method
		  
		 // WebElement element=driver.findElement(By.xpath("//input[@id='persistent']"));
		  
		//  jsExecutor.executeScript("arguments[0].click();", element);
		  
		  //another method
		  
		  
		 // Actions act= new Actions(driver);
		 // act.moveToElement(driver.findElement(By.xpath("//input[@id='persistent']"))).click().build().perform();
		  
		
	}
	

}

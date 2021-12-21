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


public class Handlehidden
{
	
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
		
	 	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		
		//This will point out to the hidden element since it is present at first 
		//driver.findElement(By.xpath("male"));
		//so we have checked the x point and then we have  clicked
		
		
		List<WebElement> radio =  driver.findElements(By.name("male"));
		
		
		for(WebElement ele: radio)
		{
			
			int x=ele.getLocation().getX();
			if(x!=0)
			{
				ele.click();
			}
			
			
		}
		
	}
	
}

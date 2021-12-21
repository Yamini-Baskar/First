package day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import library.Utility;
import org.openqa.selenium.By;
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

import graphql.com.google.common.base.Function;


public class PerformMouseHover
{
	
	
		public static void main(String args[]) {
		
		// TODO Auto-generated method stub

		
			System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
			
		 	WebDriver driver = new ChromeDriver();
			driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
			
			driver.getTitle();
			driver.manage().window().maximize();	
			
		
			WebElement  mouse= driver.findElement(By.xpath("//button[text()=\"Automation Tools\"]"));
			
			Actions act= new Actions(driver);
			act.moveToElement(mouse).perform();
			
			List<WebElement> ref= driver.findElements(By.xpath("//div[@class=\"dropdown-content\"]//a"));
			
			
		    for(WebElement element:ref)
		    {
		    	System.out.println(element.getText());
		    }
		   
	
		   
	}

}

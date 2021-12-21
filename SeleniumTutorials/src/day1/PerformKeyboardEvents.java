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


public class PerformKeyboardEvents
{
	
	
		public static void main(String args[]) {
		
		// TODO Auto-generated method stub

		
			System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
			
		 	WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/key_presses?");
			
			driver.getTitle();
			driver.manage().window().maximize();	
			
			Actions act= new Actions(driver);
			act.sendKeys(Keys.ESCAPE).perform();
			boolean result=driver.findElement(By.xpath("//p[text()='You entered: ESCAPE']")).getText().contains("ESCAPE");
			if(result)
			{
				System.out.println("DONE");
			}
			
		    
		   
	
		   
	}

}

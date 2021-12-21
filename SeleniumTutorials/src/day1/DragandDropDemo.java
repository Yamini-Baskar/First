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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import graphql.com.google.common.base.Function;


public class DragandDropDemo
{
	
	
		public static void main(String args[]) {
		
		// TODO Auto-generated method stub

		
			System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
			
		 	WebDriver driver = new ChromeDriver();
			driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
			
			driver.getTitle();
			driver.manage().window().maximize();
			
			
			Actions act= new Actions(driver);
			
			WebElement srcElement= driver.findElement(By.xpath("//div//span[text()='Lawrence Block']"));
		
			WebElement destElement=driver.findElement(By.xpath("//div[@id=\"treeTarget\"]"));
			act.dragAndDrop(srcElement, destElement);

//			
//			act.clickAndHold(srcElement)
//			.pause(Duration.ofSeconds(2))
//		       .moveToElement(destElement)
//		       .pause(Duration.ofSeconds(2))
//		       .release()
//		       .build()
//		       .perform();
		   
		   
	
		   
	}

}

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


public class TestScrollIntoView
{
	
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
		
	 	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		// Pass application URL
		 
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		 
		 
		 
		// Create instance of Javascript executor
		 
		JavascriptExecutor je = (JavascriptExecutor) driver;
		 
		 
		 
		//Identify the WebElement which will appear after scrolling down
		 
		WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));
		 
		 
		 
		// now execute query which actually will scroll until that element is not appeared on page.
		 
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		 
		 
		 
		// Extract the text and verify
		 
		System.out.println(element.getText());
	
		
	}
	

}

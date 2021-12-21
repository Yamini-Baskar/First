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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class PageLoadTimeout {
	
	
		public void PageLoadTimeout() throws InterruptedException  {
		
		// TODO Auto-generated method stub

		
			System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
			
		 	WebDriver driver = new ChromeDriver();
			driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
			
			
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			
			driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);//mostly for ajax scripts ...read def as well
			driver.getTitle();
			driver.manage().window().maximize();
		    
			String parent = driver.getWindowHandle();//gets the parent id
			
		   
	}

}

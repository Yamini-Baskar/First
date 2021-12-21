package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Iframe {
	
	
	
		@Test
		public void Iframe() {
		
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
			
		      WebDriver driver = new ChromeDriver();
			driver.get("http://seleniumpractise.blogspot.com/2017/01/frames-in-selenium-webdriver.html");
			driver.getTitle();
			driver.manage().window().maximize();
			driver.switchTo().frame("myweb");
			driver.findElement(By.id("genesis-mobile-nav-primary")).click();
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//a[@title=\"author profile\"]")).click();
		   
		  
		   
		   
	}

}

package day1;

import java.io.File;
import java.io.IOException;
//import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import library.Utility;

public class Screenshot {
	
	
	
			@Test
			public void screenshot() throws IOException{
		
	
		
			System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
			
		 	WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			
		    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Yamini");
		    
		    Utility.captureScreenshot(driver);
		    
		    
		
			
		//	driver.quit();
		   
			
			   
			   
		   
		   
		   
	}

}

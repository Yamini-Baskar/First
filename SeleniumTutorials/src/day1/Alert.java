package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alert {
	
	
	
		@Test
		public void Alert() throws InterruptedException {
		
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver();
			driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
			driver.getTitle();
			driver.manage().window().maximize();
		    WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		    button.click();
		    
		    
		    Thread.sleep(10000);
		    
		//    Alert alt= driver.switchTo().alert();
		    
		    String str= driver.switchTo().alert().getText();
		    
		   driver.switchTo().alert().accept();
		   System.out.println(str);
		  
		    
		    driver.quit();
		   
		  
		   
		   
	}

}

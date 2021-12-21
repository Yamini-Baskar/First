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

public class BootstrapDD {
	
	
	
		@Test
		public void selectDDvalues() throws InterruptedException {
		
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver();
			driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
			driver.getTitle();
			driver.manage().window().maximize();
		    WebElement tools_dropdown = driver.findElement(By.xpath("//button[@id='menu1']"));
		    tools_dropdown.click();
		    
		   
		   List<WebElement> menu= driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]//li/a"));
		   
		   
		   for(WebElement ele : menu)
		   {
			   String x=ele.getAttribute("innerHTML");
			   
			   
			   if(x.equalsIgnoreCase("JavaScript"))
				   
			   {
				   ele.click();
				   break;
			   }
			   
			   
		   }
		   
		   
	}

}

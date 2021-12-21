package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import library.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class MultipleWindows {
	
	
		public void MultipleWindows() throws InterruptedException  {
		
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver();
			driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
			driver.getTitle();
			driver.manage().window().maximize();
		    
			String parent = driver.getWindowHandle();//gets the parent id
			
		    WebElement button = driver.findElement(By.xpath("//a[contains(@href,\"http://www.google.com\")]"));
		    button.click();
		    
		    
		 
		    
		   Set<String> allwindows=driver.getWindowHandles();
		   for(String x: allwindows)
		   {
			   if(!parent.equalsIgnoreCase(x))
			   {
				   driver.switchTo().window(x);
				   driver.findElement(By.name("q")).sendKeys("unicorn");
				   //library.Utility(driver);
				    Thread.sleep(3000);
				   driver.close();
				   
				   
			   }
			   
			   
		   }
	
		//to handle multiple pop up seperate windows ...
		   //convert set to array and then close them based on the index and get in to parent win
		
		   
	}

}

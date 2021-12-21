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

public class VerifyDD {
	
	
	
		@Test
		public void selectDDvalues() throws InterruptedException {
		
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver();
			driver.get("http://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
			driver.getTitle();
			driver.manage().window().maximize();
		    WebElement tools_dropdown = driver.findElement(By.id("tools"));
		    Select tools_dd= new Select(tools_dropdown);
		    
		    List<WebElement> toolsList= tools_dd.getOptions();
		    
		    ArrayList actual= new ArrayList();
		    ArrayList temp= new ArrayList();
		    
		    for(WebElement ele: toolsList)
		    {
		    	
		    	actual.add(ele.getText());    	
		    }
            temp.addAll(actual);
	       Collections.sort(actual);
	       
		   Assert.assertTrue(actual.equals(temp));
		
		
	}

}

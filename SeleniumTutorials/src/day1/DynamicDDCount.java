package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicDDCount {
	
	
	
		@Test
		public void selectDDvalues() throws InterruptedException {
		
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/reg/");
			driver.getTitle();
			driver.manage().window().maximize();
		    WebElement month_dropdown = driver.findElement(By.id("month"));
		    Select month_dd= new Select(month_dropdown);
		    
		    List<WebElement> monthList= month_dd.getOptions();
		    
		    
		    int tot_size=monthList.size();
		    
		    System.out.println("size is"+tot_size);
		    
		    Assert.assertEquals(tot_size, 12);
		    
		    
		    for(WebElement ele: monthList)
		    {
		    	System.out.println("Months are:"+ele.getText());
		    }
		    
		    
	
		    
		
		
	}

}

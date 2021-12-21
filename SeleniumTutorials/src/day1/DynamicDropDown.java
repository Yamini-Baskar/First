package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DynamicDropDown {
	
	
	
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
		    
		    WebElement selectedvalue = month_dd.getFirstSelectedOption();
		    System.out.println("Before selecting " + selectedvalue.getText());
		    
		    month_dd.selectByIndex(2);
		    Thread.sleep(3000);
		   
		    
		 //   month_dd.selectByValue("2");
		 //   Thread.sleep(3000);
		    
		    month_dd.selectByVisibleText("Aug");
		    Thread.sleep(3000);
		    WebElement selectedvalue1 = month_dd.getFirstSelectedOption();
		    System.out.println("After selecting August" + selectedvalue1.getText());
		    
		
		
	}

}

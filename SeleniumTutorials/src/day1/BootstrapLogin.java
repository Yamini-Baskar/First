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
public class BootstrapLogin {
	
	
		public void MultipleWindows() throws InterruptedException  {
		
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver();
			driver.get("http://seleniumpractise.blogspot.com/2016/11/handle-bootstrap-model-dialog-in.html");
			driver.getTitle();
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Click here to Login')]"));
		    button.click();
		    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Yamini");
		    
		 //if the bootstrap is used with i frame then use switchto,frame then provide the input
		  
	
		//to handle multiple pop up seperate windows ...
		   //convert set to array and then close them based on the index and get in to parent win
		
		   
	}

}

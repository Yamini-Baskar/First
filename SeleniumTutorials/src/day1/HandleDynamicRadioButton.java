package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
			driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
			driver.getTitle();
			driver.manage().window().maximize();
			
			List<WebElement> radio=driver.findElements(By.xpath("//input[@name='lang'  and @type='radio']"));

			for(WebElement ele: radio)
			{
				
				String x= ele.getAttribute("value");
				
				
				if(x.equalsIgnoreCase("RUBY"))
					
				{
				 ele.click();
				}
			}
				
			
			List<WebElement> checkbox=driver.findElements(By.xpath("//input[@name='lang'  and @type='checkbox']"));
	        for(int i=0;i<checkbox.size();i++)
	        {
	        	WebElement w=checkbox.get(i);
	        	String s=w.getAttribute("id");
	        	
	        	if(s.equalsIgnoreCase("code"))
	        		
	        	{
	        		w.click();
	        	}
	        	
	        }
			
			
	}

}

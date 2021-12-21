package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	    System.setProperty("webdriver.chrome.driver", "D:\\Software\\NewChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.getTitle();
		driver.manage().window().maximize();
		
		
		
		//1 id
		//returns the webelement
		WebElement uname= driver.findElement(By.id("twotabsearchtextbox"));
		uname.sendKeys("Unicorn");
		
		driver.get("https://www.facebook.com/reg/");
		
	
		
		//2 name
		By textbox = By.name("firstname");
		driver.findElement(textbox).sendKeys("Yamini");
		
		//3 className-may be common so choose wisely so check with name or any other locator
		//driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("abc");
		
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		
		
		//4 xpath
		driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("123@");
		driver.findElement(By.cssSelector("#u_0_l_FW")).sendKeys("Baskar");		
		driver.findElement(By.linkText("Already have an account?"));
		driver.findElement(By.partialLinkText("Already"));
	//	System.out.print(driver.findElements(By.tagName("img")));
		//driver.quit();
		
	}

}

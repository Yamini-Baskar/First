package library;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {


	public static void captureScreenshot(WebDriver driver) {
		// TODO Auto-generated method stub
		
			TakesScreenshot ts =(TakesScreenshot)driver;
	    
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    try {
			FileHandler.copy(source,new File("C:\\Screenshot\\FB.png"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    	    //older method
	    // FileUtils.copyFile(source, new File("./Screenshots/FB.png"));

	      System.out.println("Screenshot taken ");
		
		
		
	}
	
	
	
	
	

}

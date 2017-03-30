package pagestetsing;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LOGINYAHOO {

	public static void main(String args[]) throws InterruptedException
	{
	WebDriver driver;
	
	fblogin objlogin;
	

	
		driver = new FirefoxDriver();

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.yahoomail.com");
        driver.manage().window().maximize();
        
        

	
	
	
	
		objlogin=new fblogin(driver);
		
		objlogin.setdetails();
		
		//System.err.println("login successfull");
		
		
	
	
	}
}

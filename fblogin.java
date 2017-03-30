package pagestetsing;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class fblogin {
	
	WebDriver driver;
	
	By username=By.xpath("//input[@id='login-username']");
	By nextButton=By.xpath("//button[@name='signin']");
	By Pass=By.id("login-passwd");
	By signIn=By.name("signin");
	
	public  fblogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setdetails() throws InterruptedException
	{
		driver.findElement(username).sendKeys("appu_pavan");
		driver.findElement(nextButton).click();
		Thread.sleep(3500);
		driver.findElement(Pass).sendKeys("Bluestar2016+");
		Thread.sleep(10000);
		//Thread.sleep(10000);
		driver.findElement(signIn).click();	
		//test
	}

}

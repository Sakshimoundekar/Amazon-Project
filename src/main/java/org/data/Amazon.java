package org.data;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon extends Read {
	 
	public static void main(String[] args) throws IOException, AWTException {
		
		 //Configure the driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver.exe");
		
				//Launch the browser	
				WebDriver driver = new ChromeDriver();
		
				//to get the url
				driver.get("https://www.amazon.in/");
		
					
				//Locators
				
				WebElement signin=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div/span"));
				signin.click();
				
				WebElement txtMail=driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
				txtMail.sendKeys("9145185226");
				
				WebElement continuebtn =driver.findElement(By.xpath("//*[@id=\"continue\"]"));
				continuebtn.click();
				
				WebElement txtPwd=driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
				txtPwd.sendKeys("Amazon");
				
				WebElement submit=driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
				submit.click();
				
				//for Keyboard action
				
				Robot r = new Robot();
				String[] rw = getData();
							
	for(int i=0;i<=2;i++) 
	{
		
				
    //locator of search box 
		
	WebElement schrbox = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
	schrbox.sendKeys(rw[i]);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
	}
	
				


	}
}

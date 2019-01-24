package org.framework;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {
	
  @Test
  private void test(String name) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepak dk\\eclipse-workspace\\karthi\\framework\\driver\\chromedriver.exe");
	 
	  if (name.equals("chrome")) {
		  WebDriver d=new ChromeDriver();
		
	} else if(name.equals("ff")) {
		System.setProperty(null, null);
		

	}
	  
}
 
	
	
	
	
	

}

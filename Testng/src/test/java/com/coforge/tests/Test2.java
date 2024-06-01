package com.coforge.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {
	WebDriver driver;
	
	@BeforeClass
	public void setIntials() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().
	}.
	
  @Test
  public void verifySomeModule() {
	  System.out.println("Verifying some module");
  }
  
  @Test
  public void verifyTitle() {
	  String actTitle = driver.getTitle();
	  String expTitle = " ";
	  
	  
  }
}


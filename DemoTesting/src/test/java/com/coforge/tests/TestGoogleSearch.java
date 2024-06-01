package com.coforge.tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestGoogleSearch {
  
  WebDriver driver;
  
  
  public void setup() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
  }
  @Test

  public void f() {
	  driver.get("https://google.com");
	  driver.findElement(By.name("q")).sendKeys("Learning testing is so much fun");
	  driver.findElement(By.name("q")).submit();
	  String actTitle = driver.getTitle();
	  String expTitle = "Learning TestNG is so much fun - Google Search";
	  assertEquals(actTitle, expTitle);
	  
	  
  }
}

package com.coforge.tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGoogleSearch {
	
	WebDriver driver;
	
	@BeforeClass
	public void befClassMethod() {
		System.out.println("Initial settings at the class level before all the methods");
	}
	
	@BeforeTest
	public void befTestMeth() {
		System.out.println("This will execute even before the class...");
	}
	
	@BeforeSuite
	public void befSuite() {
		System.out.println("I'm the first....");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Closing resources");
		driver.quit();
	}
	
	@AfterClass
	public void aftClassmethod() {
		System.out.println("I'll execute after all the methods in the clss");
	}
	
	@AfterTest
	public void aftTest() {
		System.out.println("I'm at the last... Even after the class");
	}
	
	@AfterSuite
	public void aftSuuite() {
		System.out.println("I'm the last... ");
	}
	
	@Test
	public void test1() {
		System.out.println("Verifying inside the test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Verifying inside the test2");
	}
	
	@BeforeMethod
	public void setup() {
		System.out.println("Inside the before annotated method - the setup");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
	}
	
  @Test
  public void testGoogleSearch() {
	  driver.get("https://google.com");
	  driver.findElement(By.name("q")).sendKeys("Learning testng is so much fun");
	  driver.findElement(By.name("q")).submit();
	  String actTitle = driver.getTitle();
	  String expTitle = "Learning testng is so much fun - Google Search";
	  assertEquals(actTitle, expTitle);
  }
}
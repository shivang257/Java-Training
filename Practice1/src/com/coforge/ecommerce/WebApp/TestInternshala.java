package com.coforge.ecommerce.WebApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestInternshala {
	static WebDriver drv;
 
	public static void startApp() {
		drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		drv.get("https://internshala.com/");
	}
	
	public static void testInternshala() {
		WebElement search = drv.findElement(By.xpath("//*[@id=\"header\"]/div/nav/div[3]/button[1]"));
		search.click();
		WebElement input = drv.findElement(By.xpath("//*[@id=\"homepage-search-modal\"]/div/div/div/div[1]/form/div/div[1]/input"));
		input.sendKeys("Software Engineer");
		input.submit();

	}
	
	public static void main(String[] args) {
		startApp();
		testInternshala();
	}
}

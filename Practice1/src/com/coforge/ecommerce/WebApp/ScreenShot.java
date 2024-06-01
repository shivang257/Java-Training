package com.coforge.ecommerce.WebApp;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	static WebDriver drv;
	
	public static void startApp() {
		drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		drv.get("https://www.python.org/");
	}
	
	public static void screenShot() {
		
		
	}
}

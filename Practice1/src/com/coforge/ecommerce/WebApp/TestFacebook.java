package com.coforge.ecommerce.WebApp;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFacebook {
	static WebDriver drv;
	
	public static void startApp() {
		drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		drv.get("https://www.coforge.com/");
	}
	
	public static void testCoforge() {
		WebElement accept = drv.findElement(By.xpath("//*[@id=\"hs-eu-confirmation-button\"]"));
		accept.click();
		WebElement aboutUsLink = drv.findElement(By.xpath("//*[@id=\"navbarScrollingDropdown\"]"));
        aboutUsLink.click();
		WebElement search = drv.findElement(By.xpath("/html/body/div[2]/div[1]/header/nav/div/div[3]/i"));
		search.click();
		WebElement type = drv.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_site_search\"]/div/div/form/input[1]"));
		
		type.sendKeys("Ayodhya");
		
		type.submit();
	}
	
	public static void main(String[] args) {
		startApp();
		testCoforge();
	}
}
      
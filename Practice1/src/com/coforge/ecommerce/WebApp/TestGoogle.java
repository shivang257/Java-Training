package com.coforge.ecommerce.WebApp;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {
	static WebDriver driver;
	static Alert al;
	
	public static void testLinks() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("There are: "+links.size() + " links");
		
		driver.findElement(By.partialLinkText("4 interesting ")).click();
	}
	
	public static void startApp() {
		driver.get("https://google.com");
	}
	
	public static void testGoogleSearch() {
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium WebDriver is Fun");
		
		search.submit();
	}
	
	public static void closeApp() throws Exception {
		driver.get("C:\\Users\\Training\\eclipse-workspace1\\Practice1\\NewFile.html");
		Thread.sleep(2000);
		al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		String parenWin = driver.getWindowHandle();
		driver.findElement(By.linkText("Go To Google")).click();
		driver.findElement(By.linkText("Go To Rediff")).click();
		
		Set<String> wins = driver.getWindowHandles();
		
		int i = 0;
		for(String win : wins) {
			i++;
			if(i==2) {
				driver.switchTo().window(win);
				System.out.println(driver.getTitle());
				break;
			}
		}
		
		driver.quit();
		
	}
	
	public static void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		
	}
	
	public static void openMyWebApp() {
		
		driver.get("NewFile.html");

	}
	public static void main(String[] args) throws Exception{
		setup();
		closeApp();
	}
}

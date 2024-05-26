package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TittleUrl {
	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
	    driver.navigate().to("https://www.fb.com");
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	}

}

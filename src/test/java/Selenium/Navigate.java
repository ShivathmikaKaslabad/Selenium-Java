package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
	    driver.navigate().to("https://www.fb.com");
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
	}
}

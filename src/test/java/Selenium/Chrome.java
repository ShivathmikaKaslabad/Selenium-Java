package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver Naresh= new ChromeDriver();
		Naresh.get("https://www.google.com");
		Naresh.close();
		//Naresh.quit();
	}
}

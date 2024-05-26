package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MiniMax {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver Naresh= new ChromeDriver();
		Naresh.get("https://www.google.com");
		//Naresh.manage().window().minimize();
		Naresh.manage().window().maximize();
	}

}

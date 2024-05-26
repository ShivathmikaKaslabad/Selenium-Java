package Locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Id {
	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
	driver.navigate().to("https://www.fb.com");
driver.findElement(By.id("email")).sendKeys("testing@gmail.com");
System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
driver.findElement(By.name("pass")).sendKeys("test");
driver.findElement(By.name("pass")).clear();
driver.findElement(By.name("pass")).sendKeys("tesddssdsdsdst");
	}

}

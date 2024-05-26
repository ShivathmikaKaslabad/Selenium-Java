package Locators;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkText {
	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
	    driver.navigate().to("https://www.fb.com");
        driver.findElement(By.linkText("Forgotten password?")).click();
	}
}

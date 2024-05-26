package XPath;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StartsWith {
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.fb.com");
		
		//Syntax:--//input[Starts-with(@attribute,'value']
		
		driver.findElement(By.xpath("//button[starts-with(@data-testid,'royal')]"));
	}
}

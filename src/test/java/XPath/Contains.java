package XPath;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Contains {
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.fb.com");
		
		//Synax:--//tagname[contains(@attruide,'value')
		
 driver.findElement(By.xpath("//input[contains(@placeholder,'Email']"));
 driver.findElement(By.xpath("//input[contains(@name,'em']"));
	}
}

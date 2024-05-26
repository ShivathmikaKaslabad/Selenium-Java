package XPath;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative {
	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
	driver.navigate().to("https://www.fb.com");
	
	//Synax:-- //tagname[@attrude='value']
	
driver.findElement(By.xpath("//input[@name='email']"));
	}
}

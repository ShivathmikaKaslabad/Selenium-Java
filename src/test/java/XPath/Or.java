package XPath;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Or {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.fb.com");
		
		//Syntax:- //tagname[@attritude='value' or @attridue='value']
		
 driver.findElement(By.xpath("//input[@name='email' or @placeholder='Email address or phone number']"));
 driver.findElement(By.xpath("//input[@name='mahesh' or @placeholder='Email address or phone number']"));
 driver.findElement(By.xpath("//input[@name='mahesh' or @id='email']")).sendKeys("testing");
	}
}

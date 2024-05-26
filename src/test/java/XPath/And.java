package XPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class And {
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.fb.com");
		
		//Sytanx:- //tagname[@attritude='value'  and @attridue='value']
		
		//driver.findElement(By.xpath("//input[@name='mahesh' and @height='8' and @loc='hyd']"));
		driver.findElement(By.xpath("//input[@name='email' and @data-testid='royal_email']"));
	}
}

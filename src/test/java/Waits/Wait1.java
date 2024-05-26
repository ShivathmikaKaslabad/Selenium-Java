package Waits;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
	driver.get("https://www.google.com/");

	List<WebElement> alllinks=driver.findElements(By.tagName("a"));
	
	for(int i=0;i<=alllinks.size()-1;i++)
	{
		System.out.println(alllinks.get(i).getText());
	}
	
		}
}

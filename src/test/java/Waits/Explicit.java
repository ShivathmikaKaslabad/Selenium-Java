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

public class Explicit {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
	driver.get("https://www.facebook.com/");

	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	WebElement link= driver.findElement(By.xpath("//button[@name='login']"));
	
	wait.until(ExpectedConditions.elementToBeClickable(link));
	
	link.click();
	
		}
}

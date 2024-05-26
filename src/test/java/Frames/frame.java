package Frames;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class frame {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
	driver.get("https://demo.guru99.com/test/guru99home/");
	Thread.sleep(5000);
	
	driver.switchTo().frame("a077aa5e");
driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
	
		}
}

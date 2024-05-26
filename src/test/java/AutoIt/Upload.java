package AutoIt;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Upload {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	
Runtime.getRuntime().exec("C:\\Users\\admin\\Documents\\ll.exe");

		}
}

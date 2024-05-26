package Advance;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Calender {
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	driver.navigate().to("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//span[text()='April']//parent::div//parent::div//parent::div//a[text()='23']")).click();
	}
}

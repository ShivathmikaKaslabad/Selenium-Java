package Alerts;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Alert {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("2344");


driver.findElement(By.xpath("//input[@name='submit']")).click();
if("Do you really want to delete this Customer?".equals(driver.switchTo().alert().getText()))
		{
	driver.switchTo().alert().accept();

driver.switchTo().alert().accept();
		}
		}
//	OK---accepts
//	cancle-dismiss
//	gettext();
//	sendkeys();

}

package JS;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SendKeys {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
	driver.get("https://www.facebook.com/");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
  
	WebElement link= driver.findElement(By.xpath("//input[@name='email']"));

String enterdata="Naresh@gmail.com";
js.executeScript("arguments[0].value='"+enterdata+"';", link);


	}

}

package JS;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scroll {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
	driver.get("https://www.amazon.in/");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,10000)");
	Thread.sleep(5000);
	  js.executeScript("window.scrollBy(0,-10000)");
	}

}

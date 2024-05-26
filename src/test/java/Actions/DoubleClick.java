package Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DoubleClick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
WebElement link=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
Actions Act= new Actions(driver);
Act.doubleClick(link).build().perform();

	}

}

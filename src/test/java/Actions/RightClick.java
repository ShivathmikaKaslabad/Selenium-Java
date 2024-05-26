package Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RightClick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");

WebElement source=driver.findElement(By.xpath("//li[@data-id='5']/a"));
Actions Act= new Actions(driver);
Act.contextClick(source).build().perform();
	}

}

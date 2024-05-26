package Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RightClick1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	driver.navigate().to("https://www.amazon.in/");

WebElement source=driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_fresh']"));
Actions Act= new Actions(driver);
Act.contextClick(source).build().perform();
	}
}

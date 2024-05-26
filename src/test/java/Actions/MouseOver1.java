package Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseOver1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	driver.navigate().to("https://www.flipkart.com/");
WebElement link=driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
Actions Act= new Actions(driver);
Act.moveToElement(link).build().perform();
driver.findElement(By.xpath("//h1[text()='India Ka Furniture Store']")).click();
	}

}

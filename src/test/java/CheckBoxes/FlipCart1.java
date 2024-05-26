package CheckBoxes;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FlipCart1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();

		driver.navigate().to("https://www.flipkart.com/");
				driver.findElement(By.name("q")).sendKeys("samsung a50s");


	}
}

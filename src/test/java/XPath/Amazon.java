package XPath;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
	    driver.navigate().to("https://www.amazon.in/");
	    driver.findElement(By.xpath("//input[contains(@placeholder,'Email']"));
	}

}

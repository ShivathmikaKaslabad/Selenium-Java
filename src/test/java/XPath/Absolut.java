package XPath;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Absolut {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
	    driver.navigate().to("https://www.fb.com");
	    
	    ///html/body/div/div/div[2]
	    
        driver.findElement(By.xpath("/html/body/div/div/div[2]"));
	}

}

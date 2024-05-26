package Advance;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricket {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
	driver.navigate().to("https://www.espncricinfo.com");
System.out.println(driver.findElement(By.xpath("//p[text()='MI']//parent::div//parent::div//strong")).getText());	

	}

}

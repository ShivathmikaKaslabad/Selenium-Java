package XPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Normalize {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.fb.com");
		
		//Sytanx:- //div[text()[normalize-space() = 'buzz']]
		driver.findElement(By.xpath("//h2[text()[normalize-space() = 'Facebook helps you connect and share with the people in your life.']]"));

	}
}

package CheckBoxes;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	driver.navigate().to("https://demo.guru99.com/test/radio.html");

List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));

System.out.println(checkboxes.size());
for( int i=0;i<=checkboxes.size()-1;i++)
{
	System.out.println(checkboxes.get(i).getAttribute("value"));

	}
	}
}

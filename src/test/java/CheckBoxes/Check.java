package CheckBoxes;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Check {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	driver.navigate().to("https://www.ironspider.ca/forms/checkradio.htm");
	List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println(checkboxes.size());
    for( int i=0;i<=checkboxes.size()-1;i++)
	{
		System.out.println(checkboxes.get(i).getAttribute("value"));
	}
   }
	}
	

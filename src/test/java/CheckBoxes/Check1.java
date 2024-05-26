package CheckBoxes;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Check1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	driver.navigate().to("https://www.ironspider.ca/forms/checkradio.htm");

List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));

System.out.println(checkboxes.size());
for( int i=0;i<=checkboxes.size()-1;i++)
{
	System.out.println(checkboxes.get(i).getAttribute("value"));
	
	if((checkboxes.get(i).getAttribute("value").equals("red")) ||(checkboxes.get(i).getAttribute("value").equals("green")))
	{
		checkboxes.get(i).click();
	}
	
	}
}
}

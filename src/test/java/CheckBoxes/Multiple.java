package CheckBoxes;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Multiple {
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	driver.navigate().to("https://demo.guru99.com/test/radio.html");

List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));

System.out.println(checkboxes.size());
for( int i=0;i<=checkboxes.size()-1;i++)
{
	//System.out.println(checkboxes.get(i).getAttribute("value"));
	
	if((checkboxes.get(i).getAttribute("value").equals("checkbox3")) ||(checkboxes.get(i).getAttribute("value").equals("checkbox2")))
	{
		checkboxes.get(i).click();
	}
	
	}
}
}

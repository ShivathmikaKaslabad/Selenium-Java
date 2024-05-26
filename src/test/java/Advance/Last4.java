package Advance;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Last4 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	driver.navigate().to("http://testingmasters.weebly.com/webtables.html");

List<WebElement> checkboxes=driver.findElements(By.xpath("//td[1]"));

for(int i=checkboxes.size();i>=checkboxes.size()-4;i--)
{
	
	driver.findElement(By.xpath("(//td[1])[position()=" +i+   "]")).click();
}
}
}

package Frames;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Count {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
	driver.get("https://demo.guru99.com/test/guru99home/");
	Thread.sleep(5000);
	
List<WebElement>iframes=driver.findElements(By.tagName("iframe"));
System.out.println(iframes.size());
	
for(int i=0;i<=iframes.size()-1;i++)
{
	driver.switchTo().frame(i);
	
	if(driver.findElement(By.xpath("/cancl//")).isEnabled())
	{
		driver.findElement(By.xpath("///")).click();
	}
	else
	{
		driver.close();
	}
}
		}
}

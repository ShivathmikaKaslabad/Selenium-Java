package Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Act {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");

WebElement source=driver.findElement(By.xpath("//li[@data-id='5']/a"));
WebElement destination=driver.findElement(By.xpath("//ol[@id='bank']/li"));
WebElement source1=driver.findElement(By.xpath("//li[@id='fourth']"));
WebElement destination1=driver.findElement(By.xpath("//ol[@id='amt7']/li"));
Actions Act= new Actions(driver);
Act.dragAndDrop(source, destination).build().perform();
Act.dragAndDrop(source1, destination1).build().perform();
}
}

package Advance;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmpClick {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	driver.navigate().to("http://testingmasters.weebly.com/webtables.html");
	Thread.sleep(4000);
List<WebElement> allinks=driver.findElements(By.xpath("//td[7][text()>5]//preceding-sibling::td/input[@type='checkbox']"));

for(int i=0;i<=allinks.size()-1;i++)
{
allinks.get(i).click();
}
}
}

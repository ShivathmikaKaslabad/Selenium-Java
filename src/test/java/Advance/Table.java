package Advance;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	driver.navigate().to("http://testingmasters.weebly.com/webtables.html");
List<WebElement> header=driver.findElements(By.xpath("//table[@id='VisitingTable']/thead/tr/th"));


for(int i=0;i<=header.size()-1;i++)
{
	System.out.println(header.get(i).getText());
}

	}	
	

}

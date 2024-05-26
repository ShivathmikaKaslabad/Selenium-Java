package Advance;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	driver.navigate().to("http://testingmasters.weebly.com/webtables.html");
	Thread.sleep(4000);
List<WebElement> allinks=driver.findElements(By.xpath("//table[@id='VisitingTable']//tbody//tr//td[5][text()='Analyst']//preceding-sibling::td[3]"));

for(int i=0;i<=allinks.size()-1;i++)
{
	System.out.println(allinks.get(i).getText());
}


	}

}

package CheckBoxes;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check3 {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	driver.navigate().to("https://www.ironspider.ca/forms/checkradio.htm");

List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));

System.out.println(checkboxes.size());
for( int i=0;i<=checkboxes.size()-1;i++)
{
	//System.out.println(checkboxes.get(i).getAttribute("value"));
	
Thread.sleep(3000);
	if((checkboxes.get(i).getAttribute("value").equals("red")) )
	{
	      if(checkboxes.get(i).isSelected())
	      {
	    	  System.out.println("selected already");
	      }
	      else
	      {
	    	  checkboxes.get(i).click();
	      }
	}
	
	}
}
}

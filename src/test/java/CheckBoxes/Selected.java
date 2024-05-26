package CheckBoxes;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	driver.navigate().to("https://demo.guru99.com/test/radio.html");

List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));

System.out.println(checkboxes.size());
for( int i=0;i<=checkboxes.size()-1;i++)
{
	//System.out.println(checkboxes.get(i).getAttribute("value"));
	
Thread.sleep(3000);
	if((checkboxes.get(i).getAttribute("value").equals("checkbox2")) )
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



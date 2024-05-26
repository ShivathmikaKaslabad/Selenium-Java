package Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class CopyPaste1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	driver.navigate().to("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzE0MjkwMzM5LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Testing@gmail.com");

Actions action= new Actions(driver);

action.keyDown(Keys.CONTROL);
action.sendKeys("a");
action.keyUp(Keys.CONTROL);
action.build().perform();

action.keyDown(Keys.CONTROL);
action.sendKeys("c");
action.keyUp(Keys.CONTROL);
action.build().perform();

action.sendKeys(Keys.TAB);
action.build().perform();

action.keyDown(Keys.CONTROL);
action.sendKeys("v");
action.keyUp(Keys.CONTROL);
action.build().perform();
	}

}

package CheckBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GooglePrint {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("software testing");
		List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));

	}

}

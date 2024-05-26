package XPath;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetText {
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
	driver.navigate().to("https://www.fb.com");

String actualresult=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).getText();
	
String expectedresult="Facebook helps you connect and share with the people in your life.";

if(actualresult.equals(expectedresult))
{
	System.out.println("matching");
}
else
{	System.out.println("not matching");
	
}

	}
}

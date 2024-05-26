package XPath;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Text {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.fb.com");
		
		//Syntax:--//tagname[text()='value']
		driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		
		//Syntax:--//tagname[contains(text(),'value')]
		driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]"));
	
		//Syntax:--//tagname[starts-With(text(),'value')]
		driver.findElement(By.xpath("//h2[starts-with(text(),'Facebook helps you connect and share with the people in your life.')]"));
	}
}

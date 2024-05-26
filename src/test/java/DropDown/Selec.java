package DropDown;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selec {
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");

  //Syntax :- Select dropdownlist= new Select(WebElemnt);
	Select dropdownlist= new Select(driver.findElement(By.xpath("//select[@name='country']")));
	dropdownlist.selectByValue("INDIA");
}
}

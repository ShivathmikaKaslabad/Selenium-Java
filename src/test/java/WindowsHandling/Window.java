package WindowsHandling;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Set;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

    public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.naukri.com/");	
		
	String parentwindow=	driver.getWindowHandle();
	System.out.println(parentwindow);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[text()='Remote']")).click();
Set<String>allwindows	= driver.getWindowHandles();
System.out.println(allwindows);
//allwindow---naukuri and remotewindow

for(String currentwindow:allwindows)
	{
	if(!currentwindow.equals(parentwindow))
	{
		driver.switchTo().window(currentwindow);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Work from office']")).click();
		driver.close();
	}
}
driver.switchTo().window(parentwindow);	
driver.findElement(By.xpath("//span[text()='MNC']")).click();
driver.close();
	}

}

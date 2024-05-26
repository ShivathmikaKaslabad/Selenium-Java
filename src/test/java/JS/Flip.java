package JS;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flip {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
	driver.get("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_bff114ae-e494-4e50-861d-4feffb981d88_1_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=ZRQ4DKH28K8J");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,8000)");
	Thread.sleep(5000);
	}

}

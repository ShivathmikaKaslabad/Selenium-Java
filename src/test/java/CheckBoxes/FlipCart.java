package CheckBoxes;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FlipCart {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		driver.navigate().to("https://www.flipkart.com/clothing-and-accessories/pr?sid=clo&otracker=categorytree&p%5B%5D=facets.ideal_for%255B%255D%3DGirls&p%5B%5D=facets.ideal_for%255B%255D%3DBoys&p%5B%5D=facets.ideal_for%255B%255D%3DBoys%2B%2526%2BGirls&p%5B%5D=facets.ideal_for%255B%255D%3DBaby%2BBoys%2B%2526%2BBaby%2BGirls&p%5B%5D=facets.ideal_for%255B%255D%3DBaby%2BBoys&p%5B%5D=facets.ideal_for%255B%255D%3DBaby%2BGirls&otracker=nmenu_sub_Baby%20%26%20Kids_0_Kids%27%20Clothing&fm=neo%2Fmerchandising&iid=M_653d8f69-b6f0-4a6e-893d-09243ea067f1_1_372UD5BXDFYS_MC.0QYFBACHTZGW&otracker=hp_rich_navigation_9_1.navigationCard.RICH_NAVIGATION_Fashion~Kids_0QYFBACHTZGW&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_9_L1_view-all&cid=0QYFBACHTZGW");
        List<WebElement>checkboxes=driver.findElements(By.xpath("//div[text()='Brand']//parent::div//parent::section//input[@type='checkbox']//parent::label"));
		
		System.out.println(checkboxes.size());
	    for( int i=0;i<=checkboxes.size()-1;i++)
		{
			//System.out.println(checkboxes.get(i).getAttribute("value"));
	    	checkboxes.get(i).click();
	    	Thread.sleep(2000);
		}
	}
}
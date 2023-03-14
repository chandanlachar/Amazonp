package PageObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

	public SearchPage(WebDriver driver) {
		super(driver);
		}
	
@FindBy(xpath="//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]") 
WebElement lk_click;
  
public void clicklink() {
	lk_click.click();
}
}

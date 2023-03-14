/*amazon
Test case1--1)add to cart  
no of screen- 
1)Home page and seacrch item 
2)list page to select item
3)item description page and click to add cart
4)verify the item present on cart page or not

steps-1) search onepluse11r 
     2)click on onepluse 11r in list page
     3)add to cart in description page 
     4)check if item is in cart page  */
package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	//calling the constructor
	public  HomePage(WebDriver driver) {
		super(driver);
		}
	@FindBy(id="twotabsearchtextbox") WebElement srbox_search;	
	@FindBy(xpath="//span[normalize-space()='OnePlus 11R 5G (Galactic Silver, 16GB RAM, 256GB Storage)']") WebElement lk_link;	
		
	public void searchitem(String search) {
		srbox_search.sendKeys(search);
	}
	public void clicklinkitem() {
		lk_link.click();
	}
}

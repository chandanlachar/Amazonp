package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.SearchPage;
import testbase.BaseClass;

public class TastCase1 extends BaseClass{
@Test
     public void TastCase1() {
	
    	 HomePage h=new HomePage(driver);
        h.searchitem("onepluse");
        h.clicksubmit();
        
        
	
	
        
     }



}

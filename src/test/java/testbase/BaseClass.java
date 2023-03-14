package testbase;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
   public void setup(String br){
		if(br.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(br.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	
	   
	   
   }
	@AfterClass
   public void teardown() {
	   driver.close();
   }
   
}

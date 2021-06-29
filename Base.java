package pages;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver; import org.openqa.selenium.chrome.ChromeDriver; import org.testng.annotations.AfterClass; import org.testng.annotations.BeforeClass; import org.testng.annotations.Test;  @Test
public class Base { 	public static WebDriver driver; 
@BeforeClass 	public void setUp() { 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\paria\\eclipse-workspace\\java\\chromedriver_win32\\chromedriver.exe"); 
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	
	
	@AfterClass
	public void teardown() 
	{
	driver.close();	
	}
	
}


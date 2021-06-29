package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_hRM {
	public WebDriver driver; 
	public login_hRM (WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver,this); }
	@FindBy(id="txtUsername") WebElement username;
	@FindBy(id="txtPassword") WebElement pwd; 
	@FindBy(id="btnLogin") WebElement login;
	public void loginbutton() { 
		username.sendKeys("Admin"); 
		pwd.sendKeys("admin123");
		login.click(); 
		} }

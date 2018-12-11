package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LogInPage {
	
	WebDriver driver;
	
	public LogInPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
@FindBy(how = How.CSS, using = "#email") 
private WebElement txtbx_Email;

@FindBy(how = How.CSS, using = "#wachtwoord") 
private WebElement txtbx_password;

public void enter_Email(String Name) {
	txtbx_Email.sendKeys(Name);
	 }
public void enter_Password(String Name) {
	 txtbx_password.sendKeys(Name);
	 }
public void fill_LogIn_Details() throws InterruptedException {
	enter_Email("pavledimovic@gmail.com");
	enter_Password("12345678");
}
}

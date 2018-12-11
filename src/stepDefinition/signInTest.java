package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LogInPage;
import testZadatak.CreateCookie;

public class signInTest {
	
	WebDriver driver;
	
	@Given("^Open Chrome browser, go on a web page \"([^\"]*)\"$")
	public void Open_Chrome_browser_go_on_a_web_page(String arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Desktop\\Testiranje\\Selenium\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.rijksmuseum.nl/en");
	    driver.manage().window().maximize();
	}

	@Given("^navigate to Sign in option$")
	public void navigate_to_Sign_in_option() throws Throwable {
		driver.findElement(By.name("gdprChoice")).click();      
	    driver.findElement(By.className("mobp-hide")).click();
	    Thread.sleep(3000);	    
	}

	@When("^enter defined user credentials, name and password$")
	public void enter_defined_user_credentials_name_and_password() throws Throwable {
		
        LogInPage logIn = new LogInPage(driver);
	    logIn.fill_LogIn_Details();	 
	    Thread.sleep(3000);
	    
	}

	@When("^submit data$")
	public void submit_data() throws Throwable {
		WebElement logIn = driver.findElement(By.xpath("//input[@value='Log in']"));
        logIn.click();
        Thread.sleep(4000);
	    
	}

	@Then("^user should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
		 String elementFound = driver.findElement(By.xpath("//a[@href='/en/rijksstudio/my']"))
					.getText();       
	        if (elementFound.contains("P")) {
				System.out.println("Test 2 PASS");
			} else {
				System.out.println("Test 2 FAIL");
			}  
    
	        CreateCookie ucitavanje = new CreateCookie();
	        ucitavanje.createCookie1(driver);
			
	Thread.sleep(3000);
	driver.close(); 
	}
	
	@After
	public void tearDown2(Scenario scenario) throws InterruptedException {
		if (scenario.isFailed()) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				// now copy the screenshot to desired location using copyFile //method
				FileUtils.copyFile(src, new File("C:/selenium/Testing options Rijkmuseum/Tag3.png"));
			}

			catch (IOException e) {
				System.out.println(e.getMessage());

			}
			driver.close();
		}	
	}
	
}

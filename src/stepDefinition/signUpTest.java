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

public class signUpTest {

	static WebDriver driver;

	@Given("^Open Chrome browser$")
	public void Open_Chrome_browser() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Desktop\\Testiranje\\Selenium\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("^go on a web page \"([^\"]*)\"$")
	public void go_on_a_web_page(String arg1) throws Throwable {

		driver.get("https://www.rijksmuseum.nl/en");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("gdprChoice")).click();
		driver.findElement(By.className("mobp-hide")).click();
		Thread.sleep(2000);
		WebElement fb = driver.findElement(By.xpath("//button[@class = 'reset-button-all link-like']"));
		fb.click();
		Thread.sleep(2000);
		WebElement logIn = driver.findElement(By
				.xpath("//button[@class = 'button-primary button-like button-bold button-combo-end button-forward']"));
		logIn.click();
	}

	@When("^I enter user name and valid email$")
	public void I_enter_user_name_and_valid_email() throws Throwable {

		driver.findElement(By.id("register_name")).sendKeys("pavllvd");
		driver.findElement(By.id("register_email")).sendKeys("aon34065@ebbob.com");
		driver.findElement(By.id("register_password")).sendKeys("12345678");
		driver.findElement(By.id("register_password2")).sendKeys("12345678");
	}

	@When("^enter password and confirm it$")
	public void enter_password_and_confirm_it() throws Throwable {
		WebElement logIn1 = driver.findElement(By.xpath("//input[@value='Sign up']"));
		logIn1.click();
		Thread.sleep(3000);
	}

	@Then("^user should be able to log in with submited$")
	public void user_should_be_able_to_log_in_with_submited() throws Throwable {
		String elementFound = driver.findElement(By.xpath("//a[@href='/en/rijksstudio/my']")).getText();
		if (elementFound.contains("P")) {
			System.out.println("Test 1 PASS");
		} else {
			System.out.println("Test 1 FAIL");
		}
		Thread.sleep(3000);
		driver.close();

	}

	@After
	public void tearDown1(Scenario scenario) throws InterruptedException {
		if (scenario.isFailed()) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				// now copy the screenshot to desired location using copyFile //method
				FileUtils.copyFile(src, new File("C:/selenium/Testing options Rijkmuseum/Tag1.png"));
			} 
			catch (IOException e) {
				System.out.println(e.getMessage());
			}
			driver.close();
		}
	}
}

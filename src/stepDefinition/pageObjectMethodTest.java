package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AdvancedSearchPage;
import testZadatak.VerifyImageIsPresent;

public class pageObjectMethodTest {

	static WebDriver driver;

	@Given("^Name,Title,Image selector,start date,end date$")
	public void Name_Title_Image_selector_start_date_end_date() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Desktop\\Testiranje\\Selenium\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rijksmuseum.nl/en/search/advanced");

		AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
		advancedSearchPage.accept_GDPR();
		advancedSearchPage.fill_Details();
		Thread.sleep(3000);
	}

	@When("^user search with this tags$")
	public void user_search_with_this_tags() throws Throwable {
		AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
		advancedSearchPage.CollectionSearch();
		Thread.sleep(3000);
	}

	@Then("^we should get at least (\\d+) paintings$")
	public void we_should_get_at_least_paintings(int arg1) throws Throwable {
		VerifyImageIsPresent imageTest = new VerifyImageIsPresent();
		imageTest.VerifyImageIsPresent1(driver);
		
		Thread.sleep(3000);
		driver.close();
	}

	@After
	public void tearDown4(Scenario scenario) throws InterruptedException {
		if (scenario.isFailed()) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				// now copy the screenshot to desired location using copyFile //method
				FileUtils.copyFile(src, new File("C:/selenium/Testing options Rijkmuseum/Tag4.png"));
			}

			catch (IOException e) {
				System.out.println(e.getMessage());

			}
			driver.close();
		}		
	}
}

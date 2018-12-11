package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testZadatak.LoadCookie;

public class createCollectionTest {

	static WebDriver driver;

	@Given("^Open Chrome browser, go to collectons page$")
	public void Open_Chrome_browser_go_to_collectons_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Desktop\\Testiranje\\Selenium\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rijksmuseum.nl/en");
		Thread.sleep(3000);
		driver.findElement(By.name("gdprChoice")).click();
		LoadCookie ucitavanje = new LoadCookie();
		ucitavanje.loadCookie1(driver);
		driver.get("https://www.rijksmuseum.nl/en");
	}

	@When("^user go to explore Rijksstudio and choose artist Johannes Vermeer$")
	public void user_go_to_explore_Rijksstudio_and_choose_artist_Johannes_Vermeer() throws Throwable {

		driver.findElement(By.xpath("//a[@href='/en/rijksstudio/my']")).click();
		driver.findElement(By.xpath("//button[text()=\"Get started\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/en/rijksstudio']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Johannes Vermeer')]")).click();
		Thread.sleep(3000);
	}

	@When("^go to painting Milkmaid and add it to collection$")
	public void go_to_painting_Milkmaid_and_add_it_to_collection() throws Throwable {
		WebElement MainMenu = driver
				.findElement(By.xpath("//*[@id=\"infinite-scroll-page-results\"]/figure[1]/div/a[1]/img"));
		WebElement SubMenu = driver
				.findElement(By.xpath("//*[@id=\"infinite-scroll-page-results\"]/figure[1]/div/a[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(MainMenu).clickAndHold().build().perform();
		SubMenu.click();
		Thread.sleep(5000);
	}

	@When("^user choose my new collection as a destination$")
	public void user_choose_my_new_collection_as_a_destination() throws Throwable {
		driver.findElement(By.xpath("//a[@class='button-like button-primary button-big']")).click();
		Thread.sleep(4000);
	}

	@Then("^painting should be added to a created collection with message The work is added to the set My first collection' in your Rijksstudio$")
	public void painting_should_be_added_to_a_created_collection_with_message_The_work_is_added_to_the_set_My_first_collection_in_your_Rijksstudio()
			throws Throwable {
		driver.findElement(By.xpath("//a[@class='button-like button-avatar']")).click();
		Thread.sleep(2000);

		WebElement ImageFile = driver
				.findElement(By.xpath("//*[@id=\"infinite-scroll-page-results\"]/figure/a/span[1]/img"));
		Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript(
				"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
				ImageFile);
		if (!ImagePresent) {
			System.out.println("Image is not displayed.");
		} else {
			System.out.println("Image is displayed.");
		}
		Thread.sleep(3000);
		driver.close();

	}

	@After
	public void tearDown3(Scenario scenario) throws InterruptedException {
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

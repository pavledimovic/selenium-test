package testZadatak;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestZadatak1 {
	static WebDriver driver;

	@BeforeMethod
	// Testing Sign in option using given data
	// Testing that collection page is opened
	public void main() throws Exception {
		// System set-up
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Desktop\\Testiranje\\Selenium\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rijksmuseum.nl/en");

		// Navigation to the desired element

		driver.findElement(By.name("gdprChoice")).click();
		driver.findElement(By.className("mobp-hide")).click();
		Thread.sleep(6000);
	}

	@Test
	public void testiranje() throws InterruptedException {
		// Test Case 1 (Log in with given values, Email:"pavledimovic@gmail.com",
		// password: "12345678")
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("pavledimovic@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"wachtwoord\"]")).sendKeys("8");
		WebElement logIn = driver.findElement(By.xpath("//input[@value='Log in']"));
		logIn.click();
		Thread.sleep(5000);
		// Take screenshot and store as a file format
	
		// Create cookie for later use
		CreateCookie ucitavanje = new CreateCookie();
		ucitavanje.createCookie1(driver);
		// Verification that we are on correct web page
		String elementFound = driver.findElement(By.xpath("//a[@href='/en/rijksstudio/my']")).getText();
		if (elementFound.contains("P")) {
			System.out.println("Test 1 PASS");
		} else {
			System.out.println("Test 1 FAIL");
		}

		// Test Case 2 (Open my collection)
		driver.findElement(By.xpath("/html/body/header/div/nav/div/nav/a/span")).click();
		String ar = driver.getCurrentUrl();
		String er = "https://www.rijksmuseum.nl/en/rijksstudio/2307048--pavled/collections";
		if (ar.equalsIgnoreCase(er)) {
			System.out.println("Test 2 PASS");
		} else {
			System.out.println("Test 2 FAIL");
		}
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws InterruptedException
	{
         if(ITestResult.FAILURE==result.getStatus())
         {
		      Utility.captureScreenshot(driver, result.getName());
        	 
	}
    
         Thread.sleep(4000);
         driver.quit();
	}
}

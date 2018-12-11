package testZadatak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pageObjects.AdvancedSearchPage;

public class AdvancedSearchTest {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Desktop\\Testiranje\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage(driver);
		advancedSearchPage.navigateTo_AdvancedSearch();
		driver.findElement(By.name("gdprChoice")).click();
		advancedSearchPage.fill_Details();
		
		driver.findElement(By.xpath("//a[contains(@class,'search-view-button button-like button-big bg-lighter mobile-lg-1-2 mobile-lg-reset-margin-left')]"))
		.click();
		
		VerifyImageIsPresent imageTest = new VerifyImageIsPresent();
	    imageTest.VerifyImageIsPresent1(driver);	
	
		
		
		
	}
		
		
	}
		
	
package testZadatak;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestZadatak3 {
	

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Desktop\\Testiranje\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rijksmuseum.nl/en/search/advanced?q=utagawa+kuniyoshi&p=1&ps=12&st=Objects");	
		driver.findElement(By.name("gdprChoice")).click();
		Thread.sleep(4000);			
		driver.findElement(By.xpath("//input[@id='token-input-QueryDescriptor_AdvancedSearchOptions_ArtistCriteria_InvolvedMakerName']"))
		.sendKeys("Uta");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='list-roomy list-links']//li[3]//a[1]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='QueryDescriptor_AdvancedSearchOptions_ObjectCriteria_Title']"))
		.sendKeys("De CHofu Tama");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='QueryDescriptor_AdvancedSearchOptions_ObjectCriteria_ShowImage']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='QueryDescriptor_AdvancedSearchOptions_ObjectCriteria_DatingPeriod_StartDate']"))
		.sendKeys("1847");
		driver.findElement(By.xpath("//input[@id='QueryDescriptor_AdvancedSearchOptions_ObjectCriteria_DatingPeriod_EndDate']"))
		.sendKeys("1850");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Find']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[contains(@class,'search-view-button button-like button-big bg-lighter mobile-lg-1-2 mobile-lg-reset-margin-left')]"))
		.click();
		
		WebElement ImageFile = driver.findElement(By.xpath("//div[@id='infinite-scroll-page-results']//figure[3]//a[1]//span[1]//img[1]"));
		Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript
				("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
		if (!ImagePresent)
        {
             System.out.println("Image 1 is not displayed.");
        }
        else
        {
            System.out.println("Image 1 is displayed.");
        }
		WebElement ImageFile2 = driver.findElement(By.xpath("//div[@id='infinite-scroll-page-results']//figure[4]//a[1]//span[1]//img[1]"));
		Boolean ImagePresent2 = (Boolean) ((JavascriptExecutor)driver).executeScript
				("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile2);
		if (!ImagePresent)
        {
             System.out.println("Image 2 is not displayed.");
        }
        else
        {
            System.out.println("Image 2 is displayed.");
        }
		WebElement ImageFile3 = driver.findElement(By.xpath("//div[@id='infinite-scroll-page-results']//figure[5]//a[1]//span[1]//img[1]"));
		Boolean ImagePresent3 = (Boolean) ((JavascriptExecutor)driver).executeScript
				("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile3);
		if (!ImagePresent)
        {
             System.out.println("Image 3 is not displayed.");
        }
        else
        {
            System.out.println("Image 3 is displayed.");
        }
		
		Thread.sleep(5000);
		driver.close();
	}
		
		
	}



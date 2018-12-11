package testZadatak;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.AdvancedSearchPage;


public class TestZadatak2 {
	
	WebDriver driver;
	
	@Test
	    //Creating first collection test
	    
		public static void main(String[] args) throws InterruptedException {
			//System set-up
		   System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\PC\\Desktop\\Testiranje\\Selenium\\Firefox\\geckodriver.exe");		

		    WebDriver driver = new FirefoxDriver();        
	        driver.manage().window().maximize();
	        driver.get("https://www.rijksmuseum.nl/en");
	        Thread.sleep(3000);	        
	        driver.findElement(By.name("gdprChoice")).click();  
	        
	        LoadCookie ucitavanje = new LoadCookie();
	        ucitavanje.loadCookie1(driver);
	        driver.get("https://www.rijksmuseum.nl/en");
	        //driver.findElement(By.name("gdprChoice")).click();  
	        //driver.findElement(By.className("mobp-hide")).click();
	
	        
	        
//	        driver.findElement(By.cssSelector("input[name=email]")).sendKeys("pavledimovic@gmail.com");
//	        driver.findElement(By.xpath("//*[@id=\"wachtwoord\"]")).sendKeys("12345678");
//	        WebElement logIn = driver.findElement(By.xpath("//input[@value='Log in']"));
//	        logIn.click();
//	       Thread.sleep(3000);

	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//a[@class='button-like button-avatar']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[text()=\"Get started\"]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//a[@href='/en/rijksstudio']")).click();
	        Thread.sleep(3000);          
	        driver.findElement(By.xpath("//a[contains(text(),'Johannes Vermeer')]")).click();
	        Thread.sleep(3000);
	        
	        
	        WebElement MainMenu = driver.findElement(By.cssSelector("figure.brick:nth-child(1) > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)"));
	        WebElement SubMenu = driver.findElement(By.xpath("//div[@id='infinite-scroll-page-results']//figure[1]//div[1]//a[2]"));
	       
	        
	        Actions builder = new Actions(driver);
	        builder.moveToElement(MainMenu).perform();
	        driver.findElement(By.xpath("//div[@id='infinite-scroll-page-results']//figure[1]//div[1]//a[2]")).click();
	        Thread.sleep(3000);
	        
	        
	        driver.findElement(By.xpath("//a[@class='button-like button-primary button-big']")).click();
	        Thread.sleep(5000);
	        
	        
			driver.findElement(By.xpath("//a[@class='button-like button-avatar']")).click();
			Thread.sleep(2000);
			
			WebElement ImageFile = driver.findElement(By.xpath("//*[@id=\"infinite-scroll-page-results\"]/figure/a/span[1]/img"));
			Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript
					("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
			if (!ImagePresent)
	        {
	             System.out.println("Image is not displayed.");
	        }
	        else
	        {
	            System.out.println("Image is displayed.");
	        }
			Utility utility = new Utility();
			utility.captureScreenshot(driver, null);
			
			Thread.sleep(5000);
			driver.close();
		}

	}
	



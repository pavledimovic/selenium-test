package testZadatak;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestZadatak {
	
    @Test
    //Testing Sign up option using given data
    //Testing Title is correct
    //Testing URL is correct
    
	public static void main(String[] args) throws InterruptedException { 
		//System set-up
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Desktop\\Testiranje\\Selenium\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rijksmuseum.nl/en");
        driver.manage().window().maximize();  
        
        //Navigation to the desired element
        
        driver.findElement(By.name("gdprChoice")).click();      
        driver.findElement(By.className("mobp-hide")).click();
        Thread.sleep(6000);
        
        WebElement fb = driver.findElement(By.xpath("//button[@class = 'reset-button-all link-like']"));
        fb.click();
        Thread.sleep(6000);
      
        
        WebElement logIn = driver.findElement(By.xpath
        		("//button[@class = 'button-primary button-like button-bold button-combo-end button-forward']"));
        logIn.click();
        
        //Test Case 1 (Sign up)
        
        //Entering given values
        driver.findElement(By.id("register_name")).sendKeys("pavledqqqq");
        driver.findElement(By.id("register_email")).sendKeys("fbo90059@iencm.com");
        driver.findElement(By.id("register_password")).sendKeys("12345678");
        driver.findElement(By.id("register_password2")).sendKeys("12345678");
        
        //Click on Sign up button  button-primary button-big button-bold button-combo-end button-forward
        WebElement logIn1 = driver.findElement(By.xpath("//input[@value='Sign up']"));
        		
        logIn1.click();
        Thread.sleep(6000); 
        
        String elementFound = driver.findElement(By.xpath("//a[@href='/en/rijksstudio/my']"))
				.getText();       
        if (elementFound.contains("P")) {
			System.out.println("Test 1 PASS");
		} else {
			System.out.println("Test 1 FAIL");
		}   
        
        //Test Case 2 (Check that title is correct)
        
        String at = driver.getTitle();      
        String et = "Rijksmuseum – The Museum of the Netherlands - in Amsterdam";
        if(at.equalsIgnoreCase(et))
        {
            System.out.println("Test 2 PASS");  
	    }
        else
        {
            System.out.println("Test 2 FAIL");
        }        
        //Test Case 3 (Checks are we were redirected to correct web page with correct URL)
        
        String at1 = driver.getCurrentUrl();
        String et1 = "https://www.rijksmuseum.nl/en";
        if(at1.equalsIgnoreCase(et1))
        	
        {
            System.out.println("Test 3 PASS");  
	    }
        else
        {
            System.out.println("Test 3 FAIL");
        }
             
        Thread.sleep(5000);
        driver.close();        
        
	}

}


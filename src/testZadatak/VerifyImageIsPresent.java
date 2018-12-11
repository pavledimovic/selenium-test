package testZadatak;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyImageIsPresent {
	public static void VerifyImageIsPresent1(WebDriver driver) throws InterruptedException {
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
		
		
	}
		
	
	}



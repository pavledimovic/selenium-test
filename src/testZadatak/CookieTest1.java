package testZadatak;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieTest1 {
	static WebDriver driver;
//promeniti naziv klase , sve metode koje se koriste u vise drugih testova dodati u ovu klasu kao: public static void i sve promenljive izdodajem kao argumente
	// prosledjivanje parametara nauciti , svi parametri koji se razlikuju izmedju razlicitih poziva tih funkcija treba prosledidi kao argumente funkcije(user name, passwrs....)
	// statickim funkcijamaa pristupam kao npr IME KLASE.IME FUNKCIJE
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Desktop\\Testiranje\\Selenium\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
		Thread.sleep(6000);
// Input Email id and Password If you are already Register		
		driver.findElement(By.name("username")).sendKeys("abc123");
		driver.findElement(By.name("password")).sendKeys("123xyz");
		driver.findElement(By.name("submit")).click();
// create file named Cookie to store username Information
		File file = new File("Cookie.data");
		try { // Delete if any old file exists
			file.delete();
			file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferwrite = new BufferedWriter(fileWriter);
			for (Cookie cook : driver.manage().getCookies()) {
				String writeup = cook.getName() + ";" + cook.getValue() + ";" + cook.getDomain() + ";" + cook.getPath()
						+ "" + ";" + cook.getExpiry() + ";" + cook.isSecure();
				bufferwrite.write(writeup);
				System.out.println(writeup);
				bufferwrite.newLine();
			}
			bufferwrite.flush();
			bufferwrite.close();
			fileWriter.close();
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}
}

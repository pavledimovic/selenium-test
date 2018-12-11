package testZadatak;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.StringTokenizer;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieTest2 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Desktop\\Testiranje\\Selenium\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		try {
			File file = new File("Cookie.data");
			FileReader fileReader = new FileReader(file);
			BufferedReader Buffreader = new BufferedReader(fileReader);
			String strline;
			while ((strline = Buffreader.readLine()) != null) {
				StringTokenizer token = new StringTokenizer(strline, ";");
				while (token.hasMoreTokens()) {
					String name = token.nextToken();
					String value = token.nextToken();
					String domain = token.nextToken();
					String path = token.nextToken();
					Date expiry = null;
					String val;
					if (!(val = token.nextToken()).equals("null")) {
						expiry = java.text.SimpleDateFormat.getDateInstance().parse(val);
					}
					Boolean isSecure = new Boolean(token.nextToken()).booleanValue();
					Cookie ck = new Cookie(name, value, domain, path, expiry, isSecure);
					driver.manage().addCookie(ck); // This will add the stored cookie to our current session
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		driver.get("http://demo.guru99.com/test/cookie/selenium_cookie.php");
	}
}

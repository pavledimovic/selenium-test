package testZadatak;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import pageObjects.AdvancedSearchPage;

public class CreateCookie {
	public static void createCookie1(WebDriver driver) throws InterruptedException {
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


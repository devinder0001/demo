package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandlePopUp {

	public static void main(String[] args) {
		String st=System.getProperty("user.dir")+"\\src\\Browser\\chromedriver.exe";
		System.out.println(st);
		System.setProperty("webdriver.chrome.driver", st);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ilovepdf.com/jpg_to_pdf");
		driver.findElement(By.xpath([contains(text(),'Administration')])).sendkeys("path");
		
	}

}

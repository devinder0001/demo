package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1 {

	public static void main(String[] args) {
		//String st=System.getProperty("user.dir")+"\\src\\Browser\\chromedriver.exe";

		String st =System.getProperty("user.dir")+"\\src\\Browser\\chromedriver.exe";
		System.out.println(st);
		System.setProperty("webdriver.chrome.driver", st);
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

}

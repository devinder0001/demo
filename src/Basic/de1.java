package Basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class de1 {
	

	public static void main(String[] args) {
	WebDriver driver;
	Properties pro= new Properties();
	FileInputStream ip = new FileInputStream("C:\\Users\\Dev\\eclipse-workspace\\SeleniumBasic\\Config.properties");
	pro.load(ip);
	String s=System.getProperty("user.dir")+"\\src\\Browser\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", s);
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.youtube.com/channel/UCXJKOPxx4O1f63nnfsoiEug");
	driver.manage().window().maximize();

	}

}

package Basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class read_Pro {

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Dev\\eclipse-workspace\\SeleniumBasic\\Config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("browser"));
		
		String browserName = prop.getProperty("browser");
		
	if(browserName.equals("chrome")) {
		String st=	System.getProperty("user.dir")+"\\src\\Browser\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", st);
		 driver= new ChromeDriver();
		 

		 //s.get("https://www.facebook.com");
		
	}
	else if(browserName.equals("FF")) {
		String st=System.getProperty("user.dir")+"\\src\\browser\\geckodriver.exe";
		System.out.println(st);
		System.setProperty("webdriver.gecko.driver", st);
		 driver=new FirefoxDriver();
		//s.get("https://www.facebook.com");
	}
	else{
		System.out.println("no browser is given"); 
	}
	
	driver.get(prop.getProperty("url"));
	driver.findElement(By.id(prop.getProperty("User_name"))).sendKeys(prop.getProperty("txtUsername"));
	driver.findElement(By.id(prop.getProperty("Pass_name"))).sendKeys(prop.getProperty("txtPassword"));
	driver.findElement(By.id(prop.getProperty("login"))).click();


}
}
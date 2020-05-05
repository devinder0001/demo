package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB {

	public static void main(String[] args) throws InterruptedException {
		String st=System.getProperty("user.dir")+"\\src\\Browser\\chromedriver.exe";
		System.out.println(st);
		System.setProperty("webdriver.chrome.driver", st);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		//window maximize 
		driver.manage().window().maximize();
		//Increase time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// user name and password
		/*
		 * WebElement ab =driver.findElement(By.id("email"));
		 * ab.sendKeys("devinder1092");
		 */
		//driver.findElement(By.id("email")).sendKeys("deinder1092");
		
		//create new account 
		
		driver.findElement(By.name("firstname")).sendKeys("rahul");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		//driver.findElement(By.xpath(input[type="text" && aria-label="Mobile number or email address"]).sendKeys("kumar1231@gmail.com");
		driver.findElement(By.id("u_0_10")).sendKeys("demo123");
		
		
		Select s = new Select(driver.findElement(By.id("day")));
	    Thread.sleep(1000);
	    s.selectByVisibleText("1");

	    Select s1 = new Select(driver.findElement(By.id("month")));
	    Thread.sleep(1000);
	    s1.selectByValue("10");

	    Select s2 = new Select(driver.findElement(By.id("year")));
	    Thread.sleep(1000);
	    s2.selectByValue("1992");
	    //radio button
        driver.findElement(By.xpath("//input[@value='2']")).click();//for selecting male

    driver.findElement(By.name("websubmit")).click();
		

		

		

		
		
		
	}

}

package Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String st=System.getProperty("user.dir")+"\\src\\Browser\\chromedriver.exe";
		System.out.println(st);
		System.setProperty("webdriver.chrome.driver", st);
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Full screen window
		//driver.manage().window().maximize();
		
		driver.findElement(By.name("proceed")).click();
		
		//WAIT FOR FEW SECOND
		Thread.sleep(5000);
		
		// switch on alert page
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); //click on OK
	//	alert.dismiss();// CLICK ON CANCEL BTN
		
	}

}

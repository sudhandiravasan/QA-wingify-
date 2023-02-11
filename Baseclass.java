package internship;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public ChromeDriver driver; 
	@BeforeMethod

	public void StartBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("sudhan");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("Sudhan");
		driver.findElement(By.xpath("//*[@id=\'log-in\']")).click();
	}
	
	@AfterMethod
	
	public void CloseBrowser() {
		driver.close();
		
	}
	
	
}

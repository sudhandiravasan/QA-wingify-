package internship;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Demo extends Baseclass {
	
	@Test
	
	public void login() {
		

		
		driver.findElement(By.xpath("//*[@id=\'amount\']")).click();
		List<WebElement> amount = driver.findElements(By.xpath("//table[@class='table table-padded']//tr/td[5]"));
		List<String> lst=new ArrayList<String>();
		for (int i = 0; i < amount.size() ;i++) {
			System.out.println(amount.get(i).getText());
			 String text = amount.get(i).getText();
			lst.add(text);
		
		}
		
		if(lst.get(0).contains("- 320.00 USD")) {
			System.out.println("Amount in sorted order");
		}
		else {
			System.out.println("Amount is not sorted");
	
		}
		

	}

}

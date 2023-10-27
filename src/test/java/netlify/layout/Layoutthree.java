package netlify.layout;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import netlify.utility.Baseclass;

public class Layoutthree extends Baseclass {
	
	@Test
	private void test_layoutthree() throws InterruptedException {
		launchbrowser("chrome");
		loadurl("https://trytestingthis.netlify.app/");
		WebElement table = driver.findElement(By.xpath("//table[@style='width:100%']"));
		List<WebElement> theading = table.findElements(By.tagName("th"));
		for (int i = 0; i < theading.size(); i++) {
			WebElement heading = theading.get(i);
			System.out.println(heading.getText());
			
			}
		
		List<WebElement> trows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < trows.size(); i++) {
			WebElement row = trows.get(i);
			System.out.println(row.getText());
			
		}
		
		
	}
	
	

}

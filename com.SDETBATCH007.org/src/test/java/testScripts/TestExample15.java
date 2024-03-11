package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestExample15 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));
		Select select = new Select(multiSelectionBoxField);
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Hyundai");
		select.selectByVisibleText("Audi");
		Thread.sleep(3000);
		select.deselectByVisibleText("Volvo");
		driver.quit();

	}

}

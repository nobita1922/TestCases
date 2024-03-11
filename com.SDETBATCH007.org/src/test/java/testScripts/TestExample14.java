package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample14 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("(//p[contains(text(), 'Catalog')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[contains(text(), 'Products')])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("SearchCategoryId")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN,
				Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();

	}

}

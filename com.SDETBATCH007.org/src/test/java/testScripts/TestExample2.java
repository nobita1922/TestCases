package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample2 {

	public static void main(String[] args)throws Exception {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("Email"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		WebElement pws = driver.findElement(By.name("Password"));
		pws.clear();
		pws.sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		driver.quit();


	}

}

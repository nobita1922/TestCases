package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample6 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		String val = driver.getTitle();
		System.out.println(val);
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
		

	}

}

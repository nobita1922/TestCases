package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample23 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(35));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		boolean appear = driver.findElement(By.id("Email")).isDisplayed();

		if (appear == true) {
			System.out.println();
		} else if (appear == false) {
			driver.navigate().refresh();
		}

		else if (appear) {
			driver.findElement(By.tagName("button")).click();
		} else {
			System.out.println("please try again");
		}

	}

}

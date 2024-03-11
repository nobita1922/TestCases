package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample4 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		List<WebElement> allInputs = driver.findElements(By.xpath("//*[@class='form-fields']/descendant::input"));
		int count = allInputs.size();
		System.out.println("total input size is = " + count);
		Thread.sleep(5000);
		driver.quit();

	}

}

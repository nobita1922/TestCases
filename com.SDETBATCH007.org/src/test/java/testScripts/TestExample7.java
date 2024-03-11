package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample7 {

	public static void main(String[] args) throws Exception{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		String id = driver.getWindowHandle();
		System.out.println(id);
		String val = driver.getPageSource();
		System.out.println(val);
		driver.findElement(By.xpath("//*[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Help')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'Documentation')]")).click();
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		driver.close();
		driver.quit();
	}

}

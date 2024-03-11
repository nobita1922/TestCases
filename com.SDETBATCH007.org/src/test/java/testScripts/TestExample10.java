package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample10 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		String val = driver.findElement(By.id("Email")).getTagName();
		System.out.println(val);
		
		String id = driver.findElement(By.id("Email")).getClass().getSimpleName();
		System.out.println(id);
		
		String name = driver.findElement(By.tagName("button")).getTagName();
		System.out.println(name);
		
		String name1 = driver.findElement(By.xpath("//*[contains(text(),'Remember me?')]")).getClass().getSimpleName						();
		System.out.println(name1);
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		

		
		
		

	}

}

package testScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestExample8 {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("Email")).clear();
		String val = driver.findElement(By.tagName("button")).getText();
		System.out.println(val);
		String name = driver.findElement(By.id("Email")).getAttribute("name");
		System.out.println(name);
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com", Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);
		driver.quit();
	}

}

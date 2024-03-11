package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample9 {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		boolean val = driver.findElement(By.id("RememberMe")).isSelected();
		System.out.println("is selected the check box ? :" + val);
		boolean val2 = driver.findElement(By.tagName("button")).isEnabled();
		System.out.println("is loginbtn is enable ? : " + val2);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(100);
		boolean val3 = driver.findElement(By.xpath("//*[contains(text(),' Dashboard')]")).isDisplayed();
		System.out.println("is Dashboard page is Displayed ? :" + val3);
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[contains(text(),'Catalog')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Products')]")).click();
		boolean val4 = driver.findElement(By.xpath("//h1[contains(text(),'Products')]")).isDisplayed();
		System.out.println("is products page is Displayed ? :" + val4);
		Thread.sleep(12);
		driver.findElement(By.id("SearchProductName")).sendKeys("Build your own computer");
		boolean val5 = driver.findElement(By.id("SearchProductName")).isSelected();
		System.out.println("is Search input Box is selected ? : " + val5);
		boolean val6 = driver.findElement(By.id("search-products")).isEnabled();
		System.out.println("is searchbtn is Enabled ? :" + val6);
		Thread.sleep(12);
		boolean val7 = driver.findElement(By.xpath("//*[contains(text(),'Logout')]")).isEnabled();
		System.out.println("is logoutbtn is enabled ? :" + val7);
		driver.findElement(By.xpath("//*[contains(text(),'Logout')]")).click();
		boolean val8 = driver.findElement(By.xpath("//*[contains(text(),'Admin area demo')]")).isDisplayed();
		System.out.println("is login page is Displayed ? : " + val8);
		Thread.sleep(12);
		driver.quit();

	}

}

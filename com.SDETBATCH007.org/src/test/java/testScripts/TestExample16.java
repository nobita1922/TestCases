package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample16 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Alert pop = driver.switchTo().alert();
		Thread.sleep(9000);
		pop.accept();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(9000);
		Alert pop2 = driver.switchTo().alert();
		Thread.sleep(9000);
		pop2.dismiss();
		Thread.sleep(9000);
		driver.switchTo().defaultContent();
		Thread.sleep(9000);
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(9000);
		Alert pop3 = driver.switchTo().alert();
		Thread.sleep(9000);
		pop3.sendKeys("honey");
		Thread.sleep(9000);
		String val = pop3.getText();
		System.out.println(val);
		Thread.sleep(9000);
		driver.quit();

	}

}

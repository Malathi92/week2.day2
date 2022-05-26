package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		WebElement eleUserName=driver.findElement(By.id("email"));
		eleUserName.sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("the title is  "+driver.getTitle());
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();

	}

}

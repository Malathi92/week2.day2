package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/input[@id='yes']")).click();
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input[@name='news'])[1]")).click();
		

	}

}

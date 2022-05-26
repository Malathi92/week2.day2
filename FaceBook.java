package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class='_6ltg']/a[@role='button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Malathi");
		driver.findElement(By.name("lastname")).sendKeys("Malthi");
		driver.findElement(By.name("reg_email__")).sendKeys("9787972243");
		driver.findElement(By.id("password_step_input")).sendKeys("karu@123");
		WebElement ele=driver.findElement(By.id("day"));
		Select obj=new Select(ele);
		obj.selectByVisibleText("21");
		WebElement ele1=driver.findElement(By.id("month"));
		Select obj1=new Select(ele1);
		obj1.selectByVisibleText("Nov");
		WebElement ele2=driver.findElement(By.id("year"));
		Select obj2=new Select(ele2);
		obj2.selectByVisibleText("1997");
		driver.findElement(By.xpath("//Label[text()='Female']/following-sibling::input[@name='sex']")).click();		



	}


}




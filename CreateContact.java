package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement eleUserName=driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Malathi");
		driver.findElement(By.id("lastNameField")).sendKeys("E");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("local first");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("local last");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createContactForm_description")).sendKeys("GROW WITH TEST LEAF");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("emalathi21@gmail.com");
		driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")).sendKeys("New York");
		WebElement ele = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select obj=new Select(ele);
		obj.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("important notes");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println("the title is "+driver.getTitle());





	}

}

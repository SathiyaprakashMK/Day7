package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Ram");
		driver.findElement(By.id("lastNameField")).sendKeys("S");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ram");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("S");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Create a contact");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ramraj@gmail.com");
		WebElement ele1=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state=new Select(ele1);
		state.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement ele2=driver.findElement(By.id("updateContactForm_description"));
		ele2.clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Create a contact");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println("The title is : "+driver.getTitle());
		

	}

}

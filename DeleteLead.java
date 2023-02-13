package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String text=driver.findElement(By.xpath("//a[text()='10027']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//a[text()='10027']")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@class=' x-form-text x-form-field '])[1]")).sendKeys(text);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		driver.close();

	}

}

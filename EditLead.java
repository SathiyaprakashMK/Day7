package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Automation");
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		System.out.println("The title is : "+driver.getTitle());
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		WebElement ele=driver.findElement(By.id("updateLeadForm_companyName"));
		ele.clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Zoho");
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close();
		

	}

}

package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

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
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("deep");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text=driver.findElement(By.xpath("//a[text()='Deepika']")).getText();
		System.out.println(text);
		//WebElement ele=driver.findElement(By.xpath("(//a[@class='linktext'])[6]"));
		//ele.click();
		driver.findElement(By.xpath("//a[text()='Deepika']")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String text1=driver.getTitle();
		if(text1.equals("Duplicate Lead"));
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String text2=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		//System.out.println(text2);
		if(text.equals(text2)) {
			System.out.println("Confirm");
		}
		//driver.close();
		//System.out.println(text);

	}

}

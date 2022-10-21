package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {

	public static void main(String[] args) {
	
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("http://leaftaps.com/opentaps/control/main");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("username")).sendKeys("demosalesManager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 driver.findElement(By.className("decorativeSubmit")).click();
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 driver.findElement(By.linkText("Leads")).click();
	 driver.findElement(By.linkText("Create Lead")).click();
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tcs");
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sowmiya");
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");
	 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sowmi");
	 driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("computer software");
	 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sowmi.anu001@gmail.com");
	 driver.findElement(By.name("submitButton")).sendKeys("Create Lead");
	 String title = driver.getTitle();
	 System.out.println("the title is" +driver.getTitle());
	}
	}

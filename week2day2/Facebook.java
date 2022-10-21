package week2day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException{
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("Create New Account")).click();
		 driver.findElement(By.name("firstname")).sendKeys("Anu");
		 driver.findElement(By.name("lastname")).sendKeys("Thangaraj");
		 driver.findElement(By.xpath("//input[@label='mobilenumber']")).sendKeys("9965712584");
		 driver.findElement(By.xpath("//input[text()='password']")).sendKeys("sowmianu");
		 WebElement day = driver.findElement(By.id("day"));	
		 Select range = new Select(day);
		 range.selectByIndex(4);
		 Thread.sleep(4000);
		 WebElement month = driver.findElement(By.id("month"));
		 Select value = new Select(month);
		 value.selectByIndex(3);
		 Thread.sleep(4000);
		 WebElement year = driver.findElement(By.id("year"));
		 Select text = new Select(year);
		 text.selectByVisibleText("2018");
		 driver.findElement(By.xpath("//lable[text='Female']")).click();
		 driver.findElement(By.name("websubmit")).click();
		 driver.close();
		 
		 
		 
		 
		 
		 
}}

	
		 
		 
		 
		 


		 
		 
		 
		 
		 
		 
	
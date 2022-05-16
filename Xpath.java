package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

public static void main(String []args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.xpath("//a[text]()='Leads']")).click();
	driver.findElement(By.xpath("//a[text]()='Create Lead']")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Anitha");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("SP");
	driver.findElement(By.xpath("//input[@class=smallSubmit']")).click();
	String Text = driver.findElement(By.xpath("//span[@='viewLead_companyName_sp']")).getText();
	System.out.println("Company Name is: " +Text);
	driver.close();
	
}
}



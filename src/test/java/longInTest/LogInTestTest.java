package longInTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTestTest {
	
	static WebDriver driver;
	
	@Before
	public void logIn() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prof. Eben\\eclipse-Selenium\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id=\'username\']")).sendKeys("demo@techfios.com");
	driver.findElement(By.xpath("//input[@id=\'password\']")).sendKeys("abc123");
	driver.findElement(By.xpath("//button [@name='login']")).click();	
	driver.findElement(By.xpath("//*[@id=\'side-menu\']/li[10]/a/span[1]")).click();
	Thread.sleep(200);
	driver.findElement(By.xpath("//*[@id='side-menu']/li[10]/ul/li[1]/a")).click();	
	driver.findElement(By.xpath("//input[@id=\'account\']")).sendKeys("DemoAccount123");
	driver.findElement(By.xpath("//input[@id=\'description\']")).sendKeys("DemoAccountDescription");	
	driver.findElement(By.xpath("//input[@id=\'balance\']")).sendKeys("2000");	
	driver.findElement(By.xpath("//input[@id=\'account_number\']")).sendKeys("Demo12345");	
	driver.findElement(By.xpath("//input[@id=\'contact_person\']")).sendKeys("DemoPerson");	
	driver.findElement(By.xpath("//input[@id=\'contact_phone\']")).sendKeys("DemoPhone123");
	driver.findElement(By.xpath("//input[@id=\'ib_url\']")).sendKeys("https://www.bankofamerica.com/");
	Thread.sleep(300);
	driver.findElement(By.xpath("//*[@id=\'page-wrapper\']/div[3]/div[1]/div/div/div[2]/form/button")).click();
	//driver.findElement(By.xpath("//button [@type='submit']")).click();
	}
	//@Test
	//public void test() {
		
	//}
	//@Test
	//public void test() {
		
	//}

}

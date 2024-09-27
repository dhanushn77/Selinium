package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver d=new ChromeDriver();
    
    d.navigate().to("https://demowebshop.tricentis.com/");
    
   
    d.manage().window().maximize();
    Thread.sleep(2000);
    d.findElement(By.xpath("//a[text () =\"Register\"]")).click();
    
    d.findElement(By.name("Gender")).click();
    Thread.sleep(1000);
    d.findElement(By.name("FirstName")).sendKeys("Dhanush");
    Thread.sleep(1000);
    d.findElement(By.name("LastName")).sendKeys("Nanjegowda");
    Thread.sleep(1000);
    d.findElement(By.name("Email")).sendKeys("dhanu63603@gmail.com");
    Thread.sleep(1000);
    
    d.findElement(By.name("Password")).sendKeys("Dhanush@567");
    Thread.sleep(1000);
    d.findElement(By.name("ConfirmPassword")).sendKeys("Dhanush@567");
    Thread.sleep(1000);
	}

}

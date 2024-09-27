package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver d=new ChromeDriver();
    
    d.navigate().to("https://demowebshop.tricentis.com/");
    
   
    d.manage().window().maximize();
    Thread.sleep(2000);
    d.findElement(By.xpath("//a[text () =\"Register\"]")).click();
    
    d.findElement(By.id("gender-male")).click();
    d.findElement(By.id("FirstName")).sendKeys("Dhanush");
    d.findElement(By.id("LastName")).sendKeys("Nanjegowda");
    d.findElement(By.id("Email")).sendKeys("dhanu63603@gmail.com");
    d.findElement(By.id("FirstName")).sendKeys("Dhanush");
    d.findElement(By.id("Password")).sendKeys("Dhanush@567");
    d.findElement(By.id("ConfirmPassword")).sendKeys("Dhanush@567");
	}

}

package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Currenturl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver d=new ChromeDriver();
    
    d.navigate().to("https://demowebshop.tricentis.com/");
    String Url =d.getCurrentUrl();
    System.out.println(Url);
    if (Url.contains(Url)) {
    	System.out.println("Test case pass");
    	
    }else {
    	System.out.println("Test case failed");
    }
    d.findElement(By.xpath("//a[text () =\"Register\"]")).click();
    String Url1 =d.getCurrentUrl();
    System.out.println(Url1);
    if (Url1.contains(Url1)) {
    	System.out.println("Test case pass");
    	
    }else {
    	System.out.println("Test case failed");
    }
    
    
   
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
    d.close();
	}

}

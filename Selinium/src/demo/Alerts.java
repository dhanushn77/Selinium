package demo;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts { 
	public static void main(String args[]) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		d.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	Alert	alt=d.switchTo().alert();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		alt.dismiss();
		String s1=d.findElement(By.id("result")).getText();
		System.out.println(s1);
		
	}

}

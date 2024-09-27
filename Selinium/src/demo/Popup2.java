package demo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popup2{
	
	public static void main(String[] args) {
		ChromeOptions d=new ChromeOptions();
		d.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(d);
		driver.manage().window().maximize();
		 driver.get("https://www.easemytrip.com/");
		
	}
}
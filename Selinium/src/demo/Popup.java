package demo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popup{

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--diable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		
		
	
    driver.get("https://www.barbequenation.com/");
   
  
	}

}

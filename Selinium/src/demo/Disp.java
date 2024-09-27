package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Disp{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver d=new ChromeDriver();
    
    d.get("https://demowebshop.tricentis.com/");
    d.manage().window().maximize();
    Thread.sleep(2000);
    d.findElement(By.xpath("(//a[contains(text(),\"Books\")])[1]")).click();
    d.findElement(By.partialLinkText("Books")).click();
    WebElement s1=d.findElement(By.id("products-orderby"));
    Select s2=new Select(s1);
    s2.selectByValue("https://demowebshop.tricentis.com/books?orderby=10&pagesize=8");
    WebElement s3=d.findElement(By.id("products-pagesize"));
    Select s4=new Select(s3);
    s4.selectByIndex(0);
  
	}

}

package demo;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TakeScreenshort{

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
    WebDriver d=new ChromeDriver();
    
    d.get("https://demowebshop.tricentis.com/");
    d.manage().window().maximize();
    Thread.sleep(2000);
    d.findElement(By.xpath("(//a[contains(text(),\"Books\")])[1]")).click();
    d.findElement(By.partialLinkText("Books")).click();
    WebElement s1=d.findElement(By.id("products-orderby"));
    Select s2=new Select(s1);
    s2.selectByIndex(1);
    WebElement s3=d.findElement(By.id("products-pagesize"));
    Select s4=new Select(s3);
    s4.selectByIndex(0);
    TakesScreenshot ts=(TakesScreenshot)d;
    
    File src= ts.getScreenshotAs(OutputType.FILE);
   File trg =new File("./SS01/DEMOSC.png");
   org.openqa.selenium.io.FileHandler.copy(src, trg);
   
    
    
    
  
	}

}

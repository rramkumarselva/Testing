package Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Learn_SeleniumJava\\Handson_SeleniumJava\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://leafground.com/pages/Window.html");
        driver.findElement(By.id("home")).click();
        String parentID = driver.getWindowHandle();
        System.out.println(parentID);
        Set<String> allWindowID = driver.getWindowHandles();
        System.out.println(allWindowID);
        for(String x:allWindowID)
        {
        if(!x.equals(parentID))
        {
         driver.switchTo().window(x);
         }
        
        }
        
        driver.findElement(By.xpath("//img[@class='wp-categories-icon svg-image']")).click();
        driver.switchTo().window(parentID);
        driver.close();
        ;
	}
	

}

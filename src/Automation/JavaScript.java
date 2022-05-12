package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Learn_SeleniumJava\\Handson_SeleniumJava\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement user = driver.findElement(By.id("txtUsername"));
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value','admin')", user);
        WebElement pass = driver.findElement(By.id("txtPassword"));
        js.executeScript("arguments[0].setAttribute('value','admin123')", pass);
        WebElement login = driver.findElement(By.className("button"));
        js.executeScript("arguments[0].click()",login);
        
        
		

	}

}

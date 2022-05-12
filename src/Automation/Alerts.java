package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Learn_SeleniumJava\\Handson_SeleniumJava\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	    Alert alert2 = driver.switchTo().alert();
	    alert2.dismiss();
	    driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	    Alert alert3 = driver.switchTo().alert();
	    String text = alert3.getText();
	    System.out.println(text);
	    alert3.sendKeys("Ram");
	    alert3.accept();
	}

}

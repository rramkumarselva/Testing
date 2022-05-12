package Com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Learn_SeleniumJava\\Handson_SeleniumJava\\Selenium\\Driver\\chromedriver.exe");
	    WebDriver driver  = new ChromeDriver();
	    driver.get("http://leafground.com/pages/table.html");
	    WebElement table = driver.findElement(By.xpath("//div[@id='contentblock']//table"));
	    System.out.println(table.getText());
	    List<WebElement> row = table.findElements(By.tagName("tr"));
	    System.out.println(row.size());
	    List<WebElement> col = table.findElements(By.tagName("th"));
	    System.out.println(col.size());
	    for(WebElement x:col)
	    {
	    System.out.println(x.getText());	
	    }

	}

}

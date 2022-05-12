package Automation;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropJava {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Learn_SeleniumJava\\Handson_SeleniumJava\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Dropdown.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement dropdown = driver.findElement(By.xpath("(//div[@class='example']//select)[6]"));
        Select sc= new Select(dropdown);
        List<WebElement> options = sc.getOptions();
        //options.forEach(s->System.out.println(s.getText()));
        List<String> collect = options.stream().map(s->s.getText()).collect(Collectors.toList());
        List<String> collect2 = collect.stream().sorted().collect(Collectors.toList());
        System.out.println(collect2);
        System.out.println("thillai Project");
        
		

	}

}

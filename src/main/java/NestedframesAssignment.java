import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class NestedframesAssignment {
    public static void main(String[]args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\abi17\\Downloads\\DRIVERS\\\\\\\\\\\\\\\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        driver.manage().window().maximize();
driver.findElement(By.linkText("Nested Frames")).click();
driver.switchTo().frame(driver.findElement(By.name("frame-top")));
driver.switchTo().frame(driver.findElement(By.name("frame-left")));

driver.switchTo().frame(driver.findElement(By.name("frame-middle")));

        System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
        }





    }


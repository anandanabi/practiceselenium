import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ajaxMouseinteraction {
    public static void main(String[]args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\abi17\\Downloads\\DRIVERS\\\\\\\\\\\\\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();




        driver.get("https://amazon.com");
        WebElement over=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
       Actions a= new Actions(driver);
        a.moveToElement(over).contextClick().build().perform();



//code to type in capital letters

     a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

    }




}

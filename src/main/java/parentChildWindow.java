import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.PseudoType;

import java.util.Iterator;
import java.util.Set;

public class parentChildWindow {
    public static void main(String[]args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\abi17\\Downloads\\DRIVERS\\\\\\\\\\\\\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
driver.findElement(By.cssSelector(".blinkingText")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//find the id of pages open
Set<String> window= driver.getWindowHandles();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//to iterste through the ids
     Iterator<String> it=   window.iterator();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     //iterate to the psrent id

        String Parentid= it.next();

   String Childid= it.next();
   driver.switchTo().window(Childid);
   System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

  String email=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
System.out.println(email);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().window(Parentid);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("username")).sendKeys(email);

    }




}

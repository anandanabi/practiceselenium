import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowframesAssignment {
    public static void main(String[]args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\abi17\\Downloads\\DRIVERS\\\\\\\\\\\\\\\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        driver.manage().window().maximize();

driver.findElement(By.linkText("Multiple Windows")).click();
driver.findElement(By.linkText("Click Here")).click();

Set<String> win=driver.getWindowHandles();

Iterator<String> it=win.iterator();

String paarentid=it.next();

String Childid=it.next();

driver.switchTo().window(Childid);

System.out.println(driver.findElement(By.cssSelector(".example")).getText());
driver.switchTo().window(paarentid);
        System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
    }
}

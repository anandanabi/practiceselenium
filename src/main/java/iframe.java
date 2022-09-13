import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframe {
    public static void main(String[]args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\abi17\\Downloads\\DRIVERS\\\\\\\\\\\\\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        driver.findElement(By.id("draggable")).click();

        Actions a= new Actions(driver);
        WebElement sou=driver.findElement(By.id("draggable"));
        WebElement des=driver.findElement(By.id("droppable"));
         a.dragAndDrop(sou,des).build().perform();
         //to go bsck to the main sccreen
        driver.switchTo().defaultContent();

    }
}

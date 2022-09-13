import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abi17\\Downloads\\\\\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement element = driver.findElement(By.name("name"));
        element.sendKeys("Abi");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        element=driver.findElement(By.name("email"));
        element.sendKeys("abiramianandan28@gmail.com");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        element= driver.findElement(By.id("exampleInputPassword1"));
        element.sendKeys("Assignment21710");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        element=driver.findElement(By.id("exampleCheck1"));
        element.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement dropdown;
        dropdown=driver.findElement(By.id("exampleFormControlSelect1"));
        Select drop=new Select(dropdown);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        drop.selectByIndex(1);
        driver.findElement(By.xpath("//input[@value='option1']")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//input[@type='date']")).click();


driver.findElement(By.cssSelector(".btn.btn-success")).click();
        driver.close();

    }
}


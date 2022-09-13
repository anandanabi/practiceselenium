import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingalerts {
    public static void main(String[] args) {

String Text="Abi";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\abi17\\Downloads\\DRIVERS\\\\\\\\\\\\\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement element= driver.findElement(By.id("name"));
       element.sendKeys(Text);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("alertbtn")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        element= driver.findElement(By.id("name"));
        element.sendKeys(Text);

        driver.findElement(By.id("confirmbtn")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();




        driver.close();

    }
}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assignment1 {
    public static void main(String [] args)
    {

        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\abi17\\\\\\\\OneDrive\\\\\\\\Documents\\\\\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("input[id='checkBoxOption2']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption2']")).isSelected());

       System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
       WebElement element = driver.findElement(By.cssSelector("input[id='checkBoxOption2']"));
       element.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertFalse(element.isSelected());
      //  System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption2']")).isSelected());









        driver.close();




    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class work {


    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\abi17\\\\\\\\OneDrive\\\\\\\\Documents\\\\\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[@value='DEL']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        //driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
        Thread.sleep(10000);
       // driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();

        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

        {

            System.out.println("its disabled");

            Assert.assertTrue(true);

        }

        else

        {

            Assert.assertTrue(false);

        }


       driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

        driver.close();

    }
}
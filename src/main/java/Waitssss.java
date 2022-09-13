import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Waitssss {



    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abi17\\Downloads\\DRIVERS\\\\\\\\\\\\\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // WebDriverWait w= new WebDriverWait(driver,5);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String[] itemsNeeded = {"Brocolli", "Cucumber", "Beetroot"};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));

int j=0;

        for (int i = 0; i < product.size(); i++) {
            String[] productname = product.get(i).getText().split("-");
            {


                String formattedName = productname[0].trim();

                //converting array to array list
                List items = Arrays.asList(itemsNeeded);

                if (items.contains(formattedName)) {
                    j++;

                    driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

                    if (j == 3)
                        break;
                    try{
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                e.printStackTrace();
            }
                    driver.findElement(By.xpath("//img[@alt='Cart']")).click();
driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

 //w.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//input[@class='promoCode']"))));
driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");

                }

            }

        }
    }
}





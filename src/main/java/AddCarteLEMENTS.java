import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddCarteLEMENTS {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abi17\\Downloads\\DRIVERS\\\\\\\\\\\\\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String[] itemsNeeded = {"Brocolli", "Cucumber", "Beetroot"};
        int j = 0;
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < product.size(); i++) {
            String[] productname = product.get(i).getText().split("-");
            {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                String formattedName = productname[0].trim();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //converting array to array list
                List items = Arrays.asList(itemsNeeded);

                if (items.contains(formattedName)) {
                    j++;

                    driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

                    if (j == 3)
                        break;

                }

            }

        }
    }
}





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collections;
import java.util.List;

public class staticdropdown {

    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\abi17\\\\\\\\OneDrive\\\\\\\\Documents\\\\\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //checkbox

driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());


        driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//static drop down
        WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticdropdown);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dropdown.selectByIndex(2);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dropdown.selectByValue("USD");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        //dropdowns using parent child locators
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();


        //"ctl00_mainContent_ddl_originStation1_CTXTaction"
        ////a[@value='BLR']"
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//a[@value='BLR']")).click();



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value ='MAA']")).click();



        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Handling auto suggestive drop downs



        driver.findElement(By.id("autosuggest")).sendKeys("CAN");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }






                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }



        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']>a"));

        for(WebElement option :options)

        {

            System.out.println(option.getText());

            if(option.getText().equalsIgnoreCase("Canada"))

            {

                System.out.println(option.getText());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }



                option.click();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

            }

        }



       driver.close();
    }



}

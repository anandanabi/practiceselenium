import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

public class firstAssignmentselenium {
public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\abi17\\Downloads\\DRIVERS\\\\\\\\\\\\\\\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    int k=0;

    driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    WebElement element;
    element = driver.findElement(By.xpath("//input[@id='username']"));
    element.sendKeys("rahulshettyacademy");
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

element = driver.findElement(By.cssSelector("#password"));
element.sendKeys("learning");

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
element=driver.findElement(By.xpath("//body/div[@id='login']/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/label[2]/span[2]"));
element.click();
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
 driver.findElement(By.id("okayBtn")).click();
    WebElement staticDropdown;
    staticDropdown=driver.findElement(By.cssSelector("select[data-style='btn-info']"));
    Select dropdown= new Select(staticDropdown);
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
dropdown.selectByVisibleText("Student");
System.out.println(dropdown.getFirstSelectedOption().getText());
driver.findElement(By.xpath("//input[@type='checkbox']")).click();
driver.findElement(By.cssSelector("#signInBtn")).click();


        ///WebDriverWait w=new WebDriverWait(driver,3);

       // w.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText("/angularpractice")));


    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    String[] itemsSelected={"Nokia Edge","iphone X"};
int i;
int j=0;

 List<WebElement> product = driver.findElements(By.cssSelector("h4.card-title"));
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    for(i=0;i<product.size();i++)
    {
        String itemName=product.get(i).getText();

System.out.println(itemName);
        
        
        List items = Arrays.asList(itemsSelected);



        if (items.contains(itemName))
        {


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            {
                j++;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                driver.findElements(By.cssSelector("button.btn.btn-info")).get(i).click();


                if (j == itemsSelected.length) {
                    break;
                }
            }
        }

    }



    driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.cssSelector("button.btn.btn-success")).click();

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
driver.findElement(By.id("country")).sendKeys("Ind");
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    List<WebElement> places =driver.findElements(By.cssSelector("div.suggestions ul"));

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    for(WebElement place:places)
    {
        System.out.println(place.getText());
        if(place.getText().equalsIgnoreCase("India"))
        {
            System.out.println(place.getText());
            place.click();


        }


           break;

    }



    try {
        Thread.sleep(10000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.xpath("//a[text()='term & Conditions']")).click();
    try {
        Thread.sleep(10000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//button[text()='Close']")).click();

    driver.findElement(By.xpath("//input[@value='Purchase']")).click();

}
















}

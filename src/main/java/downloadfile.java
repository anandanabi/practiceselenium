import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class downloadfile {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abi17\\Downloads\\chrome\\\\\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/yahoo.html");
        WebElement element= driver.findElement(By.id("messenger-download"));
        String sourcelocation=element.getAttribute("href");
        String wget_command="cmd /c wget -P C: " + sourcelocation;

        try{
            Process exec=Runtime.getRuntime().exec(wget_command);

            int exitval=exec.waitFor();
            System.out.println("Exit value:"+exitval);

        } catch (InterruptedException | IOException ex) {
            System.out.println(ex.toString());

        }


    }
}

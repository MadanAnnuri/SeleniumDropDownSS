import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectList {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/sample");

        // 1. find the web element
        WebElement multiList = driver.findElement(By.id("multiSel"));

        // 2. create the object of the select class
        Select selMultiList = new Select(multiList);

        Thread.sleep(4000);

        // 3. select the option from list
        selMultiList.selectByIndex(1);

        Thread.sleep(4000);
        selMultiList.selectByIndex(3);

        Thread.sleep(4000);
        selMultiList.selectByIndex(4);

        Thread.sleep(4000);
        // selMultiList.deselectByIndex(3);
        selMultiList.deselectAll();

    }
}

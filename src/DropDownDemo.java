import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/sample");

        // 1. find the web element
        WebElement drpList = driver.findElement(By.id("seltext"));

        // 2. create the object of the select class
        Select selList = new Select(drpList);

        Thread.sleep(4000);

        // 3. select the option from dropdown

        //selList.selectByVisibleText("text 3");
         selList.selectByIndex(4);
       // selList.selectByValue("v12");
    }
}

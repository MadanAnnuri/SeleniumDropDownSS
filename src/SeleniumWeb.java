import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumWeb {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //driver.manage().window().maximize();

        driver.get("https://gmail.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().newWindow(WindowType.WINDOW);

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.get("http://facebook.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        //driver.close();
        driver.quit();
    }
}

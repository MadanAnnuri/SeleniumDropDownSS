import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/");
        Thread.sleep(5000);

        WebElement txtUsername = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        txtUsername.sendKeys("7658999801");
        Thread.sleep(5000);

//        WebElement txtPassword = driver.findElement(By.id("login-password"));
//        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
        btnLogin.click();

        //driver.findElement(By.linkText("Add Customer")).click();

//        driver.findElement(By.partialLinkText("Add Cus")).click();
//
//        driver.findElement(By.name("name")).sendKeys("Akshay");
//        driver.findElement(By.name("address")).sendKeys("xyz");
//        driver.findElement(By.name("contact1")).sendKeys("4545545");
//        driver.findElement(By.name("contact2")).sendKeys("1545545");
//        driver.findElement(By.name("Submit")).click();

    }
}

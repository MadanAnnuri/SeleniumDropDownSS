import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCustomer {

    @Test
    public void addCutomertTest1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        //driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.partialLinkText("Add Cus")).click();

        String name = "Akshay90";
        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys("xyz");
        driver.findElement(By.name("contact1")).sendKeys("4545545");
        driver.findElement(By.name("contact2")).sendKeys("1545545");
        driver.findElement(By.name("Submit")).click();

        String expected = "[ " + name + " ] Customer Details Added !";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();
        } catch (Exception ignored) {

        }

        System.out.println("expected=" + expected);
        System.out.println("actual=" + actual);

        Assert.assertEquals("wrong error message or error message absent",
                expected, actual);

    }


    @Test
    public void duplicateEntry() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        //driver.findElement(By.linkText("Add Customer")).click();

        driver.findElement(By.partialLinkText("Add Cus")).click();

        String name = "Akshay9";

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys("xyz");
        driver.findElement(By.name("contact1")).sendKeys("4545545");
        driver.findElement(By.name("contact2")).sendKeys("1545545");
        driver.findElement(By.name("Submit")).click();

        String expected = "Dublicat Entry. Please Verify";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        } catch (Exception e) {
        }
        System.out.println("expected=" + expected);
        System.out.println("actual=" + actual);
        Assert.assertEquals(" not duplicate data", expected, actual);


    }
}








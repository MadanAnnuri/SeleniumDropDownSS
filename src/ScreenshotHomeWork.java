import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotHomeWork  {

    @Test
    public void ScreenshotHw() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://linkedin.com/");

        TakesScreenshot ts = (TakesScreenshot) driver;
        File scrFile = ts.getScreenshotAs(OutputType.FILE);
        String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";
        FileUtils.copyFile(scrFile,new File("C:\\Output SS\\"+fileName));


//        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
//        txtUsername.sendKeys("admin");


//     driver.findElement(By.name("username")).sendKeys("tejasree118@gmail.com");
//     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Teja@118");
//    // driver.findElement(By.xpath("//body/div[@id='react-root']/div/div/section[contains(@class,'_9eogI E3X2T')]/main[contains(@role,'main')]/article[contains(@class,'_4_yKc')]/div[contains(@class,'')]/div[contains(@class,'')]/div[contains(@class,'EPjEi')]/form[@id='loginForm']/div[contains(@class,'')]/div[3]")).click();



    }



}

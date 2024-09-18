import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.tokens.Token;

import java.util.concurrent.TimeUnit;

public class orangeHRM {
    @Test

    public void seleniumdriverTest() throws InterruptedException {


       WebDriver driver= new ChromeDriver();
       driver.manage().deleteAllCookies();
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);


      WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
       username.sendKeys("Admin");
      WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
       password.sendKeys("admin123");

        WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
       submit.click();
       Thread.sleep(5000);



    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Mytestclass6 {
    @Test


    public void seleniumdriver() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.chase.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Mytestclass5 {
    @Test

    public void SeleniumDriver4 () {
       WebDriver driver= new FirefoxDriver();
       driver.get("https://healthfirst.org/");
       driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
       driver.manage().window().maximize();


    }
}

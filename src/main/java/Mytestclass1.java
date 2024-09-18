import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Mytestclass1 {
@Test
    public void seleniumtestdriver (){



    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.com");
        driver.manage().deleteAllCookies();


        Duration time;
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);

        driver.manage().window().maximize();


}
}
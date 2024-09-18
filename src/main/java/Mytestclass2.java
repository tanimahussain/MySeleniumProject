import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Mytestclass2{
    @Test

public void seleniumtestdriver1() {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.ebay.com/");
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);


    driver.manage().window().maximize();

}
}
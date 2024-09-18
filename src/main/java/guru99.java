import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.MonthDay;
import java.util.concurrent.TimeUnit;

public class guru99 {
    @Test

    public void Test() throws InterruptedException {

       WebDriver driver= new ChromeDriver();
       driver.get("https://demo.guru99.com/test/newtours/reservation.php ");

       driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
       driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
       driver.manage().window().maximize();
       WebElement flight= driver.findElement(By.xpath("//a[text()='Flights']"));
       flight.click();
       WebElement type= driver.findElement(By.xpath("//input[@value='roundtrip']"));;
       type.click();
       Select passenger= new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
       passenger.selectByVisibleText("4");
       Select departingfrom= new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
       departingfrom.selectByVisibleText("New York");
       Select onmonth= new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
       onmonth.selectByVisibleText("August");
       Select onDay= new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
       onDay.selectByVisibleText("10");

       Select arrivingin = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
       arrivingin.selectByVisibleText("New York");
       Select returningmonth= new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
       returningmonth.selectByVisibleText("August");
       Select returningday= new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
       returningday.selectByVisibleText("15");
       WebElement srvce= driver.findElement(By.xpath("//input[@value='First']"));
       srvce.click();
       Select airlne= new Select(driver.findElement(By.xpath("//select[@name='airline']")));
       airlne.selectByVisibleText("Blue Skies Airlines");
       WebElement enter= driver.findElement(By.xpath("//input[@name='findFlights']"));
       enter.click();







    }
}

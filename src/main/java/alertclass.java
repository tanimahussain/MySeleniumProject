
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class alertclass {
    WebDriver driver= null;
    @BeforeMethod
    public void setup () {
        driver= new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php ");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @AfterMethod
        public void closing(){
        driver.quit();
    }
    @Test
    public void accpt() {
    WebElement customid= driver.findElement(By.xpath("//input[@name='cusid']"));
    customid.sendKeys("123456");
    WebElement sbmt= driver.findElement(By.xpath("//input[@name='submit']"));
    sbmt.click();
    Alert acpt=driver.switchTo().alert();
    acpt.accept();
    Alert acpt2=driver.switchTo().alert();
    acpt2.accept();
    }

        @Test
        public void cncl() throws InterruptedException {
        WebElement custmid= driver.findElement(By.xpath("//input[@name='cusid']"));
        custmid.sendKeys("123456");
        WebElement sbmt2= driver.findElement(By.xpath("//input[@name='submit']"));
        sbmt2.click();
        Alert cancl= driver.switchTo().alert();
        Thread.sleep(2000);
        cancl.dismiss();


        }
        @Test
    public void Message () throws InterruptedException {
        WebElement Cancel = driver.findElement(By.xpath("//input[@name='cusid']"));
        Cancel.sendKeys("123456");
        WebElement Submit = driver.findElement(By.xpath("//input[@value='Submit']"));
        Submit.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        //@Test
       // public void message() throws InterruptedException {
      //  WebElement customerid= driver.findElement(By.xpath("//input[@name='cusid']"));
      //  customerid.sendKeys("123456");
      //  WebElement submit= driver.findElement(By.xpath("//input[@name='submit']"));
       // submit.submit();
     //   Alert ok= driver.switchTo().alert();
      //  Thread.sleep(2000);
      //  ok.accept();
     //   String ok2= driver.switchTo().alert().getText();

         //   System.out.println( ok2);
      //  String alertmessage= driver.switchTo().alert().getText();


       // System.out.println(alertmessage);
       // Thread.sleep(2000);




}
}
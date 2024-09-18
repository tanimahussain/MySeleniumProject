import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class nopcommerce {
    WebDriver driver=null;
       @BeforeMethod
         public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        }
        @AfterMethod
       public void teardown() {
            driver.close();
       }

        @Test(priority = 1)
        public void Test () throws InterruptedException {



            WebElement srchOption = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
            srchOption.sendKeys("Samsung Series 9 NP900X4C Premium Ultrabook");
            Thread.sleep(1000);

            WebElement srchbutton = driver.findElement(By.xpath("//button[@class='button-1 search-box-button']"));
            srchbutton.click();
            Thread.sleep(1000);
           // driver.close();
          }
        @Test(priority = 2)
        public void registerlinkTest () throws InterruptedException {

            WebElement register=driver.findElement(By.xpath("//a[text()='Register']"));
            register.click();
            Thread.sleep(1000);

            WebElement Gender=driver.findElement(By.xpath("//input[@id='gender-female']"));
            Gender.click();
            WebElement firstname=driver.findElement(By.xpath("//input[@id='FirstName']"));
            firstname.sendKeys("Tanima");

            Thread.sleep(1000);

            WebElement lastname= driver.findElement(By.xpath("//input[@id='LastName']"));
            lastname.sendKeys("Tanjima");

            Select day= new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
            day.selectByVisibleText("3");

            Select month= new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
            month.selectByIndex(10);

            Select year=new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
            year.selectByValue("1993");

            WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
            email.sendKeys("jaber5012009@gmail.com");

            WebElement newsletter=driver.findElement(By.xpath("//input[@id='Newsletter']"));
            newsletter.click();


            WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
            password.sendKeys("Tanima&1993");

            WebElement confirmpassword= driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
            confirmpassword.sendKeys("Tanima&1993");


            WebElement rgstr= driver.findElement(By.xpath("//button[@id='register-button']"));
            rgstr.click();
            WebElement nextpage= driver.findElement(By.xpath("//a[@class='button-1 register-continue-button']"));
            nextpage.click();
            //driver.close();
            }


       @Test(invocationCount = 3, priority = 0)
        public void mouseover() throws InterruptedException {

                Actions action = new Actions(driver);
                WebElement computers = driver.findElement(By.xpath("//a[text()='Computers '][1]"));
                action.moveToElement(computers).perform();
                WebElement selectcomputers = driver.findElement(By.xpath("//a[text()='Desktops '][1]"));
                selectcomputers.click();

                WebElement electronics = driver.findElement(By.xpath("//a[text()='Electronics '][1]"));
                action.moveToElement(electronics).perform();
                WebElement selectelectronics = driver.findElement(By.xpath("//a[text()='Camera & photo '][1]"));
                selectelectronics.click();
                Thread.sleep(2000);


                WebElement apparel = driver.findElement(By.xpath("//a[text()='Apparel '][1] "));
                action.moveToElement(apparel).perform();

                WebElement selectapparel = driver.findElement(By.xpath("//a[text()='Clothing '][1]"));
                selectapparel.click();
                Thread.sleep(2000);

                WebElement books = driver.findElement(By.xpath("//a[text()='Books '][1]"));
                action.moveToElement(books).perform();
                books.click();


                Thread.sleep(2000);
               // driver.close();
           //my second practice

            }

    }





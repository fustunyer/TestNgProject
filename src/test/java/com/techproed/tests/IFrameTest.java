package com.techproed.tests;

import com.sun.rowset.JdbcRowSetResourceBundle;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IFrameTest {
    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void iframeTest(){
        driver.get("https://the-internet.herokuapp.com/iframe");

        //EGER BIR IFRAME DE ISLEM YAPMAK ISTIYORSANIZ GECIS YAPMALISINIZ
        driver.switchTo().frame(0);//index ile
        //driver.switchTo().frame(paragraf);

        WebElement paragraf=driver.findElement(By.xpath("//p"));
        paragraf.clear();
        paragraf.sendKeys("selamlar...");
 }
 @Test
    public void iframeTest2(){
     driver.get("https://the-internet.herokuapp.com/iframe");
     driver.switchTo().frame("mce_0_ifr");
     WebElement paragraf=driver.findElement(By.xpath("//p"));
     paragraf.clear();
     paragraf.sendKeys("Selenium cok kolay...");
 }
    @Test
    public void iframeTest3(){
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement iframe=driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
        WebElement paragraf=driver.findElement(By.xpath("//p"));
        paragraf.clear();
        paragraf.sendKeys("Selenium cok kolay...");
    }
    @Test
    public void iframeTest4(){
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement iframe=driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
        WebElement paragraf=driver.findElement(By.xpath("//p"));
        paragraf.clear();
        paragraf.sendKeys("Selenium cok kolay...");

        driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();

        WebElement bilgi=driver.findElement(By.partialLinkText("Elemental Selenium"));
        bilgi.click();
    }

}

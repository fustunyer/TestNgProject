package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Ornek_WebTable extends TestBase {
    public void giris(){
        driver.get("http://www.fhctrip-qa.com/admin/HotelRoomAdmin");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!"+ Keys.ENTER);
    }
    @Test
    public void test(){
        giris();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> satirlar=driver.findElements(By.xpath("//tbody/tr"));
        System.out.println(satirlar.size()+" adet satir vardir.");
        List<WebElement> ucuncuSatir=driver.findElements(By.xpath("//tbody/tr[3]"));
        for (WebElement w:ucuncuSatir
             ) {
            System.out.println(w.getText());

        }

    }
}

package com.techproed.tests;

import com.techproed.pages.FhcTripHotelCreatePage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FhcTripHotelCreateTest extends TestBase {
    public void giris() {
        driver.get("http://fhctrip-qa.com/admin/HotelAdmin/Create");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!" + Keys.ENTER);
    }

    @Test
    public void createTest() {
        FhcTripHotelCreatePage fhcTripHotelPage = new FhcTripHotelCreatePage(driver);
        giris();
        fhcTripHotelPage.kodKutusu.sendKeys("15426");
        fhcTripHotelPage.nameKutusu.sendKeys("jack");
        fhcTripHotelPage.adresKutusu.sendKeys("15Rue");
        fhcTripHotelPage.emailKutusu.sendKeys("jack@mail");
        fhcTripHotelPage.telefonKutusu.sendKeys("02523552");
        Select select = new Select(fhcTripHotelPage.selectKutusu);
        select.selectByIndex(2);
        fhcTripHotelPage.saveButonu.click();


    }
}

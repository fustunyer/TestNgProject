package com.techproed.tests;

import com.techproed.pages.GooglePage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.List;

public class GoogleTest extends TestBase {
    @Test
    public void aramaTesti() {
        driver.get("http://google.com");
        // GooglePage class'ından bir tane nesne oluşturduk. Parametre
        // olarak şuan kullandığımız driver'ı gönderdik.
        GooglePage googlePage = new GooglePage(driver);
        googlePage.aramaKutusu.sendKeys("Selamlar..");
    }
}
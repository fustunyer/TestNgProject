package com.techproed.tests;

import com.techproed.pages.GlbTraderPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import com.techproed.utilities.TestBaseFinal;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GlbTraderTest extends TestBaseFinal {
    @Test
    public void urunIsmiveSayfaTitleKarsilastirmaTesti() throws InterruptedException {
        extentTest  = extentReports.createTest("Baslik karsilastirma","urun ismi ve sayfa basligini karsilastiralim");
        extentTest.info("Glb Trader adresine gidelim.");
        Driver.getDriver().get(ConfigurationReader.getProperty("glbSearchUrl"));
        extentTest.info("glbtraderPage objecti olusturalim");
        GlbTraderPage glbTraderPage=new GlbTraderPage();
        extentTest.info("arama kutusuna camera kelimesini gonderelim.");
        Select select=new Select(glbTraderPage.kategorilerDropDown);

        select.selectByIndex(6);

        extentTest.info("arama kutusuna camera yazisini gonderelim");
        glbTraderPage.aramaKutusu.sendKeys(ConfigurationReader.getProperty("glbKelime")+ Keys.ENTER);
        extentTest.info("urunun ismini alalim");
        String urunIsmi=glbTraderPage.urunler.get(1).getText();
        extentTest.info("urune tikladik.");
        glbTraderPage.urunler.get(1).click();
        extentTest.info("3 saniye bekledik");
        Thread.sleep(3000);
        extentTest.info("sayfanin title alalim ");
        String sayfaTitle=Driver.getDriver().getTitle();
        extentTest.info("Assert islemi alalim");
        Assert.assertEquals(sayfaTitle,urunIsmi);
        extentTest.pass("testimiz gecti");






    }



}

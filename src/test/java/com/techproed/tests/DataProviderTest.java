package com.techproed.tests;

import com.techproed.pages.AmazonNewPage;
import com.techproed.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {


    @Test(dataProvider = "urunler")
    public  void amazonAramaTesti(String kelime){
        Driver.getDriver().get("http://amazon.com");
        AmazonNewPage amazonNewPage= new AmazonNewPage();
        amazonNewPage.aramaKutusu.sendKeys(kelime+ Keys.ENTER);

    }
    @DataProvider(name = "urunler")
    public Object[] getUrunler(){
        Object[] urunler= {"java","selenium","mouse","keyboard"};
        return urunler;

    }

}

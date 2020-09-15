package com.techproed.smoketests;

import com.techproed.pages.GlbSignUpPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GlbSignUpTest {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("glbUrl"));
        GlbSignUpPage glbSignUpPage=new GlbSignUpPage();
        glbSignUpPage.emailKutusu.sendKeys(ConfigurationReader.getProperty("glbemail"));
        glbSignUpPage.name.sendKeys(ConfigurationReader.getProperty("glbname"));
        glbSignUpPage.mobile.sendKeys(ConfigurationReader.getProperty("glbmobile"));
        glbSignUpPage.password.sendKeys(ConfigurationReader.getProperty("glbpassword"));
        glbSignUpPage.re_password.sendKeys(ConfigurationReader.getProperty("glbrepassword"));
        glbSignUpPage.signUpButonu.click();
        //Thread.sleep(4000);
        System.out.println(glbSignUpPage.successYazisi);
    }
}
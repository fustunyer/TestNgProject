package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ornek_AmazonKayitSayfasi extends TestBase {//day14 6 eylul 2020 pazar

    @Test
    public void test01(){
    driver.get("http://www.amazon.com");
        WebElement accountButonu= driver.findElement(By.id("nav-link-accountList"));
        Actions actions=new Actions(driver);
        actions.moveToElement(accountButonu).perform();
        WebElement clickHere=driver.findElement(By.partialLinkText("Start here"));
        clickHere.click();
        String title=driver.getTitle();
        Assert.assertEquals("Amazon Registration",title);

}

@Test
       public void test2() {
        driver.get("http://www.amazon.com");
        WebElement accountButonu= driver.findElement(By.id("nav-link-accountList"));
        Actions actions=new Actions(driver);
        actions.moveToElement(accountButonu).perform();
        WebElement clickHere=driver.findElement(By.partialLinkText("Start here"));
        clickHere.click();
        WebElement yourName= driver.findElement(By.id("ap_customer_name"));
        yourName.sendKeys("Fatih Ustunyer");
        WebElement email= driver.findElement(By.id("ap_email"));
        email.sendKeys("fatihustunyer@yahoo.com");
        WebElement passWord= driver.findElement(By.id("ap_password"));
        passWord.sendKeys("77af816");
        driver.findElement(By.id("ap_password_check")).sendKeys("77af816");
        driver.findElement(By.id("continue")).click();
}



}

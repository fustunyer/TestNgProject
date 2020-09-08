package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ornek_HotelOlusturma extends TestBase {

//
    //a. Username : manager2
    //b. Password : Man1ager2!

    @BeforeMethod
    public void girisTest(){
        driver.get("http://www.fhctrip-qa.com/admin/HotelAdmin/Create");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!"+ Keys.ENTER);
   }
    @Test
    public void hotelCreate(){
        driver.findElement(By.id("Code")).sendKeys("1000");
        driver.findElement(By.id("Name")).sendKeys("Fatih");
        driver.findElement(By.id("Address")).sendKeys("Antalya");
        driver.findElement(By.id("Phone")).sendKeys("05552859596");
        driver.findElement(By.id("Email")).sendKeys("fatih@yahoo.com");
        WebElement element= driver.findElement(By.id("IDGroup"));
        Select select=new Select(element);
        select.selectByIndex(2);
        driver.findElement(By.id("btnSubmit")).click();
       // WebElement onayMesaji= driver.findElement(By.xpath("//div[@class='bootbox-body']"));
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement onayMesaji=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bootbox-body")));
        Assert.assertTrue(onayMesaji.isDisplayed());

    }






}

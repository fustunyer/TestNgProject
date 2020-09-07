package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WaitTest extends TestBase {
    @Test
    public void implicityWait(){
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement element = driver.findElement(By.xpath("//button[@type='button']"));
        element.click();
        WebElement element2 = driver.findElement(By.xpath("//*[.='Add']"));
        }
    }

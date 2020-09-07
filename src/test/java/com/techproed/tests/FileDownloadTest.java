package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDownloadTest extends TestBase {
    @Test
    public void dosyaVarMi(){
        System.out.println(System.getProperty("user.dir"));
        //System.out.println(System.getProperty("user.home"));
        String kullaniciDosyaYolu=System.getProperty("user.dir");
        String pomxmlDosyaYolu=kullaniciDosyaYolu+"/pom.xml";
        //C:\Users\Fatih USTUNYER\IdeaProjects\TestNgProject
        boolean varMi= Files.exists(Paths.get(pomxmlDosyaYolu));
        Assert.assertTrue(varMi);
    }
    @Test
    public void fileUpload(){//bilgisayardan websayfasina dosya yukleme
        driver.get("http://the-internet.herokuapp.com/upload");
        //C:\Users\Fatih USTUNYER\Downloads\logo.png
        WebElement chooseFile= driver.findElement(By.id("file-upload"));
        //dosyayi secmek icin asagidaki
        chooseFile.sendKeys("C:\\Users\\Fatih USTUNYER\\Downloads\\logo.png");
        driver.findElement(By.id("file-submit")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h3")).getText().equals("File Uploaded!"));
    }
    @Test
    public void filesDownload(){
        driver.get("http://the-internet.herokuapp.com/download");
        //C:\Users\Fatih USTUNYER\Downloads\Amsterdam.jpg
        WebElement amsterdamLinki=driver.findElement(By.partialLinkText("Amsterdam.jpg"));
        amsterdamLinki.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean varMi=Files.exists(Paths.get("C:\\Users\\Fatih USTUNYER\\Downloads\\Amsterdam.jpg"));
        Assert.assertTrue(varMi);


    }
}
